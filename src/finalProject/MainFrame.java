package finalProject;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.*;


import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import java.awt.Color;

public class MainFrame extends JFrame implements ActionListener {

	//Globals
	//Menu Panel and stuff
	static JButton Click;
	static JButton Credits;
	CardLayout cl;
	//MainGame Panel buttons and stuff
	static JButton btnNewButton_1;
	static JButton btnNewButton_2;
	static JButton btnNewButton_3;
	static JButton btnNewButton_4;
	static JButton btnNewButton_5;
	static JButton btnNewButton_6;
	static JButton btnNewButton_7;
	static JButton btnNewButton_8;
	static JButton btnNewButton_9;
	JButton restartButton;
	static JTextField Input;
	static JLabel textArea_1;
	static String name;
	static String name2;
	static int score;
	static int score2;
	static int startupcounter;
	static int buttonTurnCounter = 0;
	static int [] playerTurn = new int [9]; 
	static int gamecounter = 0;
	int starter;
	//variables for boxes
	static int B1;
	static int B2;
	static int B3;
	static int B4;
	static int B5;
	static int B6;
	static int B7;
	static int B8;
	static int B9;
	static int player1Points;
	static int player2Points;

	//end of globals

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Startmethod();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
	}

	//Sets the counter to zero to start the game up.
	public static void Startmethod()
	{
		startupcounter = 0;
	}

	//The "MainFrame" where all the buttons get created and set up.
	public MainFrame() {
		setTitle("Tic-Tac-Toe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100 , 450, 300);
		setSize(1280,720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0,0));
		cl = (CardLayout) (contentPane.getLayout());

		JPanel Menu = new JPanel();
		contentPane.add(Menu, "Menu");
		Menu.setLayout(new BorderLayout(0,0));
		
		JLabel GameTitle = new JLabel("Tic-Tac-Toe");
		Menu.add(GameTitle);
		GameTitle.setFont(GameTitle.getFont().deriveFont(30f));
		GameTitle.setHorizontalAlignment(SwingConstants.CENTER);
		Menu.add(GameTitle, BorderLayout.NORTH);

		Click = new JButton("Go to game");
		Menu.add(Click);
		Click.setFont(Click.getFont().deriveFont(50f));
		Menu.add(Click, BorderLayout.SOUTH);

		Credits = new JButton("credits");
		Menu.add(Credits, BorderLayout.WEST);
		Credits.setFont(Credits.getFont().deriveFont(20));




		JPanel MainGame = new JPanel();
		contentPane.add(MainGame, "MainGame");
		MainGame.setBackground(Color.BLACK);
		MainGame.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		MainGame.setLayout(new GridLayout(4, 3, 1, 1));
		
		btnNewButton_1 = new JButton("-");
		MainGame.add(btnNewButton_1);
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.setFont(btnNewButton_1.getFont().deriveFont(50f));
		
		btnNewButton_2 = new JButton("-");
		MainGame.add(btnNewButton_2);
		btnNewButton_2.setEnabled(false);
		btnNewButton_2.setFont(btnNewButton_2.getFont().deriveFont(50f));
		
		btnNewButton_3 = new JButton("-");
		MainGame.add(btnNewButton_3);
		btnNewButton_3.setEnabled(false);
		btnNewButton_3.setFont(btnNewButton_3.getFont().deriveFont(50f));
		
		btnNewButton_4 = new JButton("-");
		MainGame.add(btnNewButton_4);
		btnNewButton_4.setEnabled(false);
		btnNewButton_4.setFont(btnNewButton_4.getFont().deriveFont(50f));
		
		btnNewButton_5 = new JButton("-");
		MainGame.add(btnNewButton_5);
		btnNewButton_5.setEnabled(false);
		btnNewButton_5.setFont(btnNewButton_5.getFont().deriveFont(50f));
		
		btnNewButton_6 = new JButton("-");
		MainGame.add(btnNewButton_6);
		btnNewButton_6.setEnabled(false);
		btnNewButton_6.setFont(btnNewButton_6.getFont().deriveFont(50f));
		
		btnNewButton_7 = new JButton("-");
		MainGame.add(btnNewButton_7);
		btnNewButton_7.setEnabled(false);
		btnNewButton_7.setFont(btnNewButton_7.getFont().deriveFont(50f));
		
		btnNewButton_8 = new JButton("-");
		MainGame.add(btnNewButton_8);
		btnNewButton_8.setEnabled(false);
		btnNewButton_8.setFont(btnNewButton_8.getFont().deriveFont(50f));

		
		btnNewButton_9 = new JButton("-");
		MainGame.add(btnNewButton_9);
		btnNewButton_9.setEnabled(false);
		btnNewButton_9.setFont(btnNewButton_9.getFont().deriveFont(50f));
		
		Input = new JTextField(8);  
		MainGame.add(Input);
		Input.setBackground(Color.white); 
		Input.setFont(Input.getFont().deriveFont(30f));		
		
		restartButton = new JButton("Restart");
		MainGame.add(restartButton);
		restartButton.setText("Push to start");
		restartButton.setFont(restartButton.getFont().deriveFont(30f));

		textArea_1 = new JLabel();
		MainGame	.add(textArea_1);
		textArea_1.setFont(textArea_1.getFont().deriveFont(30f));
		textArea_1.setText("Player 1, enter your name!");
		
		
		btnNewButton_1.addActionListener(this);
		btnNewButton_2.addActionListener(this);
		btnNewButton_3.addActionListener(this);
		btnNewButton_4.addActionListener(this);
		btnNewButton_5.addActionListener(this);
		btnNewButton_6.addActionListener(this);
		btnNewButton_7.addActionListener(this);
		btnNewButton_8.addActionListener(this);
		btnNewButton_9.addActionListener(this);
		restartButton.addActionListener(this);
		Input.addActionListener(this);
		Click.addActionListener(this);
	}

	//The action method. This allows us to run actions when the action listener is called.
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnNewButton_1)
		{
			btnNewButton_1.setEnabled(false);
			if(1 == playerTurn[buttonTurnCounter]) 
			{
				btnNewButton_1.setText("X");
				String template = "<html><i>%s = %d <br>%s = %d</i><html>";
				String text = String.format(template, name, score, name2, score2);
				textArea_1.setText(text);
				B1=1;
			}
			else if(2 == playerTurn[buttonTurnCounter]) 
			{
				btnNewButton_1.setText("O");
				String template = "<html><i>%s = %d <br>%s = %d</i><html>";
				String text = String.format(template, name, score, name2, score2);
				textArea_1.setText(text);
				B1=2;
			}
			else
			{
				btnNewButton_1.setText("Game has not started");
			}
				buttonTurnCounter ++;
				WinCondition();
		}
		else if(e.getSource()==btnNewButton_2)
		{
			btnNewButton_2.setEnabled(false);
			if(1 == playerTurn[buttonTurnCounter]) 
			{
				btnNewButton_2.setText("X");
				String template = "<html><i>%s = %d <br>%s = %d</i><html>";
				String text = String.format(template, name, score, name2, score2);
				textArea_1.setText(text);
				B2=1;
			}
			else if(2 == playerTurn[buttonTurnCounter]) 
			{
				btnNewButton_2.setText("O");
				String template = "<html><i>%s = %d <br>%s = %d</i><html>";
				String text = String.format(template, name, score, name2, score2);
				textArea_1.setText(text);
				B2=2;
			}
			else
			{
				btnNewButton_2.setText("Game has not started");
			}
				buttonTurnCounter ++;
				WinCondition();
		}
		else if(e.getSource()==btnNewButton_3)
		{
			btnNewButton_3.setEnabled(false);
			if(1 == playerTurn[buttonTurnCounter]) 
			{
				btnNewButton_3.setText("X");
				String template = "<html><i>%s = %d <br>%s = %d</i><html>";
				String text = String.format(template, name, score, name2, score2);
				textArea_1.setText(text);
				B3=1;
			}
			else if(2 == playerTurn[buttonTurnCounter]) 
			{
				btnNewButton_3.setText("O");
				String template = "<html><i>%s = %d <br>%s = %d</i><html>";
				String text = String.format(template, name, score, name2, score2);
				textArea_1.setText(text);
				B3=2;
			}
			else
			{
				btnNewButton_3.setText("Game has not started");
			}
				buttonTurnCounter ++;
				WinCondition();
		}
		else if(e.getSource()==btnNewButton_4)
		{
			btnNewButton_4.setEnabled(false);
			if(1 == playerTurn[buttonTurnCounter]) 
			{
				btnNewButton_4.setText("X");
				String template = "<html><i>%s = %d <br>%s = %d</i><html>";
				String text = String.format(template, name, score, name2, score2);
				textArea_1.setText(text);
				B4=1;
			}
			else if(2 == playerTurn[buttonTurnCounter]) 
			{
				btnNewButton_4.setText("O");
				String template = "<html><i>%s = %d <br>%s = %d</i><html>";
				String text = String.format(template, name, score, name2, score2);
				textArea_1.setText(text);
				B4=2;
			}
			else
			{
				btnNewButton_4.setText("Game has not started");
			}
				buttonTurnCounter ++;
				WinCondition();
		}
		else if(e.getSource()==btnNewButton_5)
		{
			btnNewButton_5.setEnabled(false);
			if(1 == playerTurn[buttonTurnCounter]) 
			{
				btnNewButton_5.setText("X");
				String template = "<html><i>%s = %d <br>%s = %d</i><html>";
				String text = String.format(template, name, score, name2, score2);
				textArea_1.setText(text);
				B5=1;
			}
			else if(2 == playerTurn[buttonTurnCounter]) 
			{
				btnNewButton_5.setText("O");
				String template = "<html><i>%s = %d <br>%s = %d</i><html>";
				String text = String.format(template, name, score, name2, score2);
				textArea_1.setText(text);
				B5=2;
			}
			else
			{
				btnNewButton_5.setText("Game has not started");
			}
				buttonTurnCounter ++;
				WinCondition();
		}
		else if(e.getSource()==btnNewButton_6)
		{
			btnNewButton_6.setEnabled(false);
			if(1 == playerTurn[buttonTurnCounter]) 
			{
				btnNewButton_6.setText("X");
				String template = "<html><i>%s = %d <br>%s = %d</i><html>";
				String text = String.format(template, name, score, name2, score2);
				textArea_1.setText(text);
				B6=1;
			}
			else if(2 == playerTurn[buttonTurnCounter]) 
			{
				btnNewButton_6.setText("O");
				String template = "<html><i>%s = %d <br>%s = %d</i><html>";
				String text = String.format(template, name, score, name2, score2);
				textArea_1.setText(text);
				B6=2;
			}
			else
			{
				btnNewButton_6.setText("Game has not started");
			}
				buttonTurnCounter ++;
				WinCondition();
		}
		else if(e.getSource()==btnNewButton_7)
		{
			btnNewButton_7.setEnabled(false);
			if(1 == playerTurn[buttonTurnCounter]) 
			{
				btnNewButton_7.setText("X");
				String template = "<html><i>%s = %d <br>%s = %d</i><html>";
				String text = String.format(template, name, score, name2, score2);
				textArea_1.setText(text);
				B7=1;
			}
			else if(2 == playerTurn[buttonTurnCounter]) 
			{
				btnNewButton_7.setText("O");
				String template = "<html><i>%s = %d <br>%s = %d</i><html>";
				String text = String.format(template, name, score, name2, score2);
				textArea_1.setText(text);
				B7=2;
			}
			else
			{
				btnNewButton_7.setText("Game has not started");
			}
				buttonTurnCounter ++;
				WinCondition();
		}	
		else if(e.getSource()==btnNewButton_8)
		{
			btnNewButton_8.setEnabled(false);
			if(1 == playerTurn[buttonTurnCounter]) 
			{
				btnNewButton_8.setText("X");
				String template = "<html><i>%s = %d <br>%s = %d</i><html>";
				String text = String.format(template, name, score, name2, score2);
				textArea_1.setText(text);
				B8=1;
			}
			else if(2 == playerTurn[buttonTurnCounter]) 
			{
				btnNewButton_8.setText("O");
				String template = "<html><i>%s = %d <br>%s = %d</i><html>";
				String text = String.format(template, name, score, name2, score2);
				textArea_1.setText(text);
				B8=2;
			}
			else
			{
				btnNewButton_8.setText("Game has not started");
			}
				buttonTurnCounter ++;
				WinCondition();
		}
		else if(e.getSource()==btnNewButton_9)
		{
			btnNewButton_9.setEnabled(false);
			if(1 == playerTurn[buttonTurnCounter]) 
			{
				btnNewButton_9.setText("X");
				String template = "<html><i>%s = %d <br>%s = %d</i><html>";
				String text = String.format(template, name, score, name2, score2);
				textArea_1.setText(text);
				B9=1;
			}
			else if(2 == playerTurn[buttonTurnCounter]) 
			{
				btnNewButton_9.setText("O");
				String template = "<html><i>%s = %d <br>%s = %d</i><html>";
				String text = String.format(template, name, score, name2, score2);
				textArea_1.setText(text);
				B9=2;
			}
			else
			{
				btnNewButton_9.setText("Game has not started");
			}
				buttonTurnCounter ++;
				WinCondition();
		}
		else if(e.getSource()==restartButton)
		{
			//some restart functions
			//who start
			//player turn variables
			
			//make sure game cant start unless there are names present.
			if(startupcounter <= 1)
			{
				Input.setText("Put your name here before starting the game");
			}
			else
			{
				//Game counter to start the game with player 1 every time unless reset is used. ***!!WE NEED CODE TO INCREMENT THIS ONCE A GAME IS WON!!***
				if(gamecounter == 0)
				{
					starter = 1;
					if(starter == 1) 
					{
						playerTurn[0] = 1;
						playerTurn[1] = 2;
						playerTurn[2] = 1;
						playerTurn[3] = 2;
						playerTurn[4] = 1;
						playerTurn[5] = 2;
						playerTurn[6] = 1;
						playerTurn[7] = 2;
						playerTurn[8] = 1;
						//DEBUG CODE ONLY UNCOOMENT IF YOU BREAK SOMETHING
						// System.out.println(starter);
						// for(int i = 0; i < 5; i++) {
						// 	System.out.println(playerTurn[i]);
						// }
						String gametemplete = "<html><i>Game number %d <br>Player %d starts!</i><html>";
						String text1 = String.format(gametemplete, gamecounter, starter);
						textArea_1.setText(text1);
					} 

				}
				else
				{
					buttonTurnCounter = 0;
					starter = ((int)(Math.random()*2)+1);
					if(starter == 1) 
					{
						playerTurn[0] = 1;
						playerTurn[1] = 2;
						playerTurn[2] = 1;
						playerTurn[3] = 2;
						playerTurn[4] = 1;
						playerTurn[5] = 2;
						playerTurn[6] = 1;
						playerTurn[7] = 2;
						playerTurn[8] = 1;
						//DEBUG CODE ONLY UNCOOMENT IF YOU BREAK SOMETHING
						// System.out.println(starter);
						// for(int i = 0; i < 5; i++) {
						// 	System.out.println(playerTurn[i]);
						// }
					} 
					else 
					{
						playerTurn[0] = 2;
						playerTurn[1] = 1;
						playerTurn[2] = 2;
						playerTurn[3] = 1;
						playerTurn[4] = 2;
						playerTurn[5] = 1;
						playerTurn[6] = 2;
						playerTurn[7] = 1;
						playerTurn[8] = 2;
						//DEBUG CODE ONLY UNCOOMENT IF YOU BREAK SOMETHING
						// System.out.println(starter);
						// for(int i = 0; i < 5; i++) {
						// 	System.out.println(playerTurn[i]);
						// 	System.out.println(playerTurn[i]);
						// }
					}	
				}		
				//Setting player values for buttons to 0
						B1=0;
						B2=0;
						B3=0;
						B4=0;
						B5=0;
						B6=0;
						B7=0;
						B8=0;
						B9=0;

					//Reset all button color on button reset press
					
					btnNewButton_1.setBackground(Color.white);
					btnNewButton_2.setBackground(Color.white);
					btnNewButton_3.setBackground(Color.white);
					btnNewButton_4.setBackground(Color.white);
					btnNewButton_5.setBackground(Color.white);
					btnNewButton_6.setBackground(Color.white);
					btnNewButton_7.setBackground(Color.white);
					btnNewButton_8.setBackground(Color.white);
					btnNewButton_9.setBackground(Color.white);
			
					//re-enable all buttons + reset text

					btnNewButton_1.setEnabled(true);
					btnNewButton_2.setEnabled(true);
					btnNewButton_3.setEnabled(true);
					btnNewButton_4.setEnabled(true);
					btnNewButton_5.setEnabled(true);
					btnNewButton_6.setEnabled(true);
					btnNewButton_7.setEnabled(true);
					btnNewButton_8.setEnabled(true);
					btnNewButton_9.setEnabled(true);

					btnNewButton_1.setText("-");
					btnNewButton_2.setText("-");
					btnNewButton_3.setText("-");
					btnNewButton_4.setText("-");
					btnNewButton_5.setText("-");
					btnNewButton_6.setText("-");
					btnNewButton_7.setText("-");
					btnNewButton_8.setText("-");
					btnNewButton_9.setText("-");


					restartButton.setText("Restart");
					gamecounter++;
					
					String gametemplete = "<html><i>Game number %d! <br>Player %d starts!</i><html>";
					String text1 = String.format(gametemplete, gamecounter, starter);
					textArea_1.setText(text1);

					//DEBUG CODE
					// System.out.println(starter);
					// System.out.println(gamecounter);

			}
			//DEBUG CODE (CODE STORAGE)
			// System.out.println("Player " + starter + " starts");
			// 	String template = "<html><i>%s = %d <br>%s = %d</i><html>";
			// 	String text = String.format(template, name, score, name2, score2);
			// 	textArea_1.setText(text);
			// }

		}
		//Starting code to get player names and set them to the correct variables.
		else if (e.getSource()==Input)
		{
			if(startupcounter == 0)
			{
				name = Input.getText();
				startupcounter++;
				Input.setText("");
				textArea_1.setText("Player 2 enter your name");
			}
			else if(startupcounter == 1)
			{
				name2 = Input.getText();
				startupcounter++;
				Input.setText("");
				String template = "<html><i>%s = %d <br>%s = %d</i><html>";
				String text = String.format(template, name, score, name2, score2);
				textArea_1.setText(text);
				Input.setEnabled(false);
			}
			else
			{
				System.out.println("why you still typing here...");
				Input.setText("");
			}
		}
		else if (e.getSource()==Click)
		{
			cl.show(contentPane, "MainGame");
		}
	}

	//Wait method to add delay to things we need. KINDA USELESS AT THIS POINT BUT MAY NEED LATER IDK...
// 	public static void wait(int ms)
// {
//     try
//     {
//         Thread.sleep(ms);
//     }
//     catch(InterruptedException ex)
//     {
//         Thread.currentThread().interrupt();
//     }
// }

	//method to check if someone won
	private static void WinCondition() 
	{
		//player 1 wins
		if (B1 == 1 && B2 == 1 && B3 == 1) 
		{
			//Lucas's button stop thing
			score++;
			buttonStop();
			WinScreenP1();
			btnNewButton_1.setBackground(Color.green);
			btnNewButton_2.setBackground(Color.green);
			btnNewButton_3.setBackground(Color.green);
		}
		else if ((B4 == 1) && (B5 ==1) && (B6==1)) 
		{
			//Lucas's button stop thing
			score++;
			buttonStop();
			WinScreenP1();
			btnNewButton_4.setBackground(Color.green);
			btnNewButton_5.setBackground(Color.green);
			btnNewButton_6.setBackground(Color.green);
		}
		else if ((B7 == 1) && (B8 ==1) && (B9==1)) 
		{
			//Lucas's button stop thing
			score++;
			buttonStop();
			WinScreenP1();
			btnNewButton_7.setBackground(Color.green);
			btnNewButton_8.setBackground(Color.green);
			btnNewButton_9.setBackground(Color.green);
		}
		else if ((B1 == 1) && (B4 ==1) && (B7==1)) 
		{
			//Lucas's button stop thing
			score++;
			buttonStop();
			WinScreenP1();
			btnNewButton_1.setBackground(Color.green);
			btnNewButton_4.setBackground(Color.green);
			btnNewButton_7.setBackground(Color.green);
		}
		else if ((B2==1)&&(B5==1)&&(B8==1)) 
		{
			//Lucas's button stop thing
			score++;
			buttonStop();
			WinScreenP1();
			btnNewButton_2.setBackground(Color.green);
			btnNewButton_5.setBackground(Color.green);
			btnNewButton_8.setBackground(Color.green);
		}
		else if ((B3 == 1) && (B6 ==1) && (B9==1)) 
		{
			//Lucas's button stop thing
			score++;
			buttonStop();
			WinScreenP1();
			btnNewButton_3.setBackground(Color.green);
			btnNewButton_6.setBackground(Color.green);
			btnNewButton_9.setBackground(Color.green);
		}
		else if ((B3 == 1) && (B5 ==1) && (B7==1)) 
		{
			//Lucas's button stop thing
			score++;
			buttonStop();
			WinScreenP1();
			btnNewButton_3.setBackground(Color.green);
			btnNewButton_5.setBackground(Color.green);
			btnNewButton_7.setBackground(Color.green);
		}
		else if ((B1 == 1) && (B5 ==1) && (B9==1)) {
			//Lucas's button stop thing
			score++;
			buttonStop();
			WinScreenP1();
			btnNewButton_1.setBackground(Color.green);
			btnNewButton_5.setBackground(Color.green);
			btnNewButton_9.setBackground(Color.green);
		} //player2 
		else if (B1 == 2 && B2 == 2 && B3 == 2) 
		{
			//Lucas's button stop thing
			score2++;
			buttonStop();
			WinScreenP2();
			btnNewButton_1.setBackground(Color.green);
			btnNewButton_2.setBackground(Color.green);
			btnNewButton_3.setBackground(Color.green);
		}
		else if ((B4 == 2) && (B5 ==2) && (B6==2)) 
		{
			//Lucas's button stop thing
			score2++;
			buttonStop();
			WinScreenP2();
			btnNewButton_4.setBackground(Color.green);
			btnNewButton_5.setBackground(Color.green);
			btnNewButton_6.setBackground(Color.green);
		}
		else if ((B7 == 2) && (B8 ==2) && (B9==2)) 
		{
			//Lucas's button stop thing
			score2++;
			buttonStop();
			WinScreenP2();
			btnNewButton_7.setBackground(Color.green);
			btnNewButton_8.setBackground(Color.green);
			btnNewButton_9.setBackground(Color.green);
		}
		else if ((B1 == 2) && (B4 ==2) && (B7==2)) 
		{
			//Lucas's button stop thing
			score2++;
			buttonStop();
			WinScreenP2();
			btnNewButton_1.setBackground(Color.green);
			btnNewButton_4.setBackground(Color.green);
			btnNewButton_7.setBackground(Color.green);
		}
		else if ((B2==2)&&(B5==2)&&(B8==2)) 
		{
			//Lucas's button stop thing
			score2++;
			buttonStop();
			WinScreenP2();
			btnNewButton_2.setBackground(Color.green);
			btnNewButton_5.setBackground(Color.green);
			btnNewButton_8.setBackground(Color.green);
		}
		else if ((B3 == 2) && (B6 ==2) && (B9==2)) 
		{
			//Lucas's button stop thing
			score2++;
			buttonStop();
			WinScreenP2();
			btnNewButton_3.setBackground(Color.green);
			btnNewButton_6.setBackground(Color.green);
			btnNewButton_9.setBackground(Color.green);
		}
		else if ((B3 == 2) && (B5 ==2) && (B7==2)) 
		{
			//Lucas's button stop thing
			score2++;
			buttonStop();
			WinScreenP2();
			btnNewButton_3.setBackground(Color.green);
			btnNewButton_5.setBackground(Color.green);
			btnNewButton_7.setBackground(Color.green);
		}
		else if ((B1 == 2) && (B5 ==2) && (B9==2)) 
		{
			//Lucas's button stop thing
			score2++;
			buttonStop();
			WinScreenP2();
			btnNewButton_1.setBackground(Color.green);
			btnNewButton_5.setBackground(Color.green);
			btnNewButton_9.setBackground(Color.green);
		}
		
		System.out.println(score);
		System.out.println(score2);
	}
	private static void buttonStop() 
	{
		btnNewButton_1.setEnabled(false);
		btnNewButton_2.setEnabled(false);
		btnNewButton_3.setEnabled(false);
		btnNewButton_4.setEnabled(false);
		btnNewButton_5.setEnabled(false);
		btnNewButton_6.setEnabled(false);
		btnNewButton_7.setEnabled(false);
		btnNewButton_8.setEnabled(false);
		btnNewButton_9.setEnabled(false);
	}
	private static void WinScreenP1()
	{
		String template = "<html><i>%s Wins!!<br>Your score now is %d</i><html>";
				String text = String.format(template, name, score);
				textArea_1.setText(text);
	}
	private static void WinScreenP2()
	{
		String template = "<html><i>%s Wins!!<br>Your score now is %d</i><html>";
				String text = String.format(template, name2, score2);
				textArea_1.setText(text);
	}
}
