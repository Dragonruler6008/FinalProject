package finalProject;

//Imports for fun libraries that didn't totally make me hit my head on my keyboard more then once.
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.awt.Color;

//End of Imports

//Start of ALL the suffering that we went through.
public class MainFrame extends JFrame implements ActionListener,MouseInputListener {

	//Globals
	//Menu Panel and stuff, I also hate gridbacg layout but what you gonna do. -L
	GridBagConstraints c;
	static JButton Click;
	static JButton Creditsbutton;
	CardLayout cl;
	//Credits panel 
	JPanel creditsPanel;
	JButton backMenuC;
	//MainGame Panel buttons and stuff
	JPanel MainGame;
	static JButton btnNewButton_1;
	static JButton btnNewButton_2;
	static JButton btnNewButton_3;
	static JButton btnNewButton_4;
	static JButton btnNewButton_5;
	static JButton btnNewButton_6;
	static JButton btnNewButton_7;
	static JButton btnNewButton_8;
	static JButton btnNewButton_9;
	static JButton backfromgame;
	JButton restartButton;
	static JTextField Input;
	static JLabel textArea_1;
	//Other variables for game internals, yea, we ran with this and kept going.
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

	//End of globals

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	//The Run Statment, where all the fun comes from.
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

	//The "MainFrame" where all the buttons and panels get created and set up. I suffer and I forgor how to write gridbag layouts, they hard but cool. -L
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
		c = new GridBagConstraints();

		//Menu panel
		JPanel Menu = new JPanel();
		contentPane.add(Menu, "Menu");
		Menu.setLayout(new GridBagLayout());
		
		JLabel GameTitle = new JLabel("Tic-Tac-Toe");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.fill = GridBagConstraints.CENTER;
		c.weightx = 1.0;
		c.gridx = 1;
		c.gridy = 0;
		Menu.add(GameTitle, c);
		GameTitle.setFont(GameTitle.getFont().deriveFont(30f));

		

		Click = new JButton("Go to game");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 2;
		c.anchor = GridBagConstraints.LAST_LINE_END;
		c.weighty = 1.0;
		c.ipady = 200;
		Menu.add(Click, c);
		// Click.setFont(Click.getFont().deriveFont(50f));
		

		Creditsbutton = new JButton("Credits");	
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 2;
		c.ipady = 200;
		c.anchor = GridBagConstraints.LAST_LINE_START;
		c.weighty = 1.0;
		Menu.add(Creditsbutton, c);
		// Credits.setFont(Credits.getFont().deriveFont(20));

		//Credits panel
		creditsPanel = new JPanel();
		contentPane.add(creditsPanel, "Credits");
		creditsPanel.setLayout(new GridBagLayout());

		JLabel CreditsPage = new JLabel();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.fill = GridBagConstraints.CENTER;
		c.gridx = 1;
		c.gridy = 1;
		CreditsPage.setFont(CreditsPage.getFont().deriveFont(40f));
		// c.ipadx = 100;
		// c.ipady = 100;
		// c.weightx = 1.0;
		// c.weighty = 1.0;
		c.anchor = GridBagConstraints.CENTER;
		CreditsPage.setText("<html>Created by:<br>Lucas Bigler<br>Nick Savage</i><html>");
		creditsPanel.add(CreditsPage, c);

		backMenuC = new JButton("Back to the menu");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.fill = GridBagConstraints.CENTER;
		c.anchor = GridBagConstraints.PAGE_END;
		c.gridx = 1;
		c.gridy = 2;
		c.ipadx = 200;
		creditsPanel.add(backMenuC, c);
		backMenuC.setFont(CreditsPage.getFont().deriveFont(30f));



		//Maingame Panel; Where the main game happens on this panel. Creates all the buttons and text fields. :)
		MainGame = new JPanel();
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

		backfromgame = new JButton("Back to menu");
		backfromgame.setBackground(Color.white);
		backfromgame.setFont(backfromgame.getFont().deriveFont(30f));
		
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
		
		//Action Listeners, make clicking buttons and text fields way easier to manage.
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
		Input.addMouseListener(this); //This stupid mouse listener make me wana forgor this project.
		Click.addActionListener(this);
		Creditsbutton.addActionListener(this);
		backMenuC.addActionListener(this);
		backfromgame.addActionListener(this);
	}

	//The action method. This allows us to run actions when the action listener is called. We used lots of else if here because it works for one method. :)
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
			
			//make sure game cant start unless there are names present. This was fun to develop, uh huh. ;)
			if(startupcounter <= 1)
			{
				Input.setFont(Input.getFont().deriveFont(20f));
				Input.setText("Put your name here before starting the game");
			}
			else
			{
				//Game counter to start the game with player 1 every time unless reset is used.
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
						// DEBUG CODE ONLY UNCOMMENT IF YOU BREAK SOMETHING
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
						// DEBUG CODE ONLY UNCOMMENT IF YOU BREAK SOMETHING
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
						// DEBUG CODE ONLY UNCOMMENT IF YOU BREAK SOMETHING
						// System.out.println(starter);
						// for(int i = 0; i < 5; i++) {
						// 	System.out.println(playerTurn[i]);
						// 	System.out.println(playerTurn[i]);
						// }
					}	
				}		
				//Setting player values for buttons to 0 on restart
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

					// DEBUG CODE
					// System.out.println(starter);
					// System.out.println(gamecounter);

			}
			// DEBUG CODE (CODE STORAGE)
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
				MainGame.remove(Input);
				MainGame.remove(restartButton);
				MainGame.remove(textArea_1);
				MainGame.add(backfromgame);
				MainGame.add(restartButton);
				MainGame.add(textArea_1);
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
		else if (e.getSource()==Creditsbutton)
		{
			cl.show(contentPane, "Credits");
		}
		else if (e.getSource()==backMenuC)
		{
			cl.show(contentPane, "Menu");
		}
		else if (e.getSource()==backfromgame)
		{
			cl.show(contentPane, "Menu");
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

	//method to check if someone won cause its tic-tac-toe, we need to know the winner right? ;) -L
	private static void WinCondition() 
	{
		//player 1 wins
		if (B1 == 1 && B2 == 1 && B3 == 1) 
		{
			score++;
			buttonStop();
			WinScreenP1();
			btnNewButton_1.setBackground(Color.green);
			btnNewButton_2.setBackground(Color.green);
			btnNewButton_3.setBackground(Color.green);
		}
		else if ((B4 == 1) && (B5 ==1) && (B6==1)) 
		{
			score++;
			buttonStop();
			WinScreenP1();
			btnNewButton_4.setBackground(Color.green);
			btnNewButton_5.setBackground(Color.green);
			btnNewButton_6.setBackground(Color.green);
		}
		else if ((B7 == 1) && (B8 ==1) && (B9==1)) 
		{
			score++;
			buttonStop();
			WinScreenP1();
			btnNewButton_7.setBackground(Color.green);
			btnNewButton_8.setBackground(Color.green);
			btnNewButton_9.setBackground(Color.green);
		}
		else if ((B1 == 1) && (B4 ==1) && (B7==1)) 
		{
			score++;
			buttonStop();
			WinScreenP1();
			btnNewButton_1.setBackground(Color.green);
			btnNewButton_4.setBackground(Color.green);
			btnNewButton_7.setBackground(Color.green);
		}
		else if ((B2==1)&&(B5==1)&&(B8==1)) 
		{
			score++;
			buttonStop();
			WinScreenP1();
			btnNewButton_2.setBackground(Color.green);
			btnNewButton_5.setBackground(Color.green);
			btnNewButton_8.setBackground(Color.green);
		}
		else if ((B3 == 1) && (B6 ==1) && (B9==1)) 
		{
			score++;
			buttonStop();
			WinScreenP1();
			btnNewButton_3.setBackground(Color.green);
			btnNewButton_6.setBackground(Color.green);
			btnNewButton_9.setBackground(Color.green);
		}
		else if ((B3 == 1) && (B5 ==1) && (B7==1)) 
		{
			score++;
			buttonStop();
			WinScreenP1();
			btnNewButton_3.setBackground(Color.green);
			btnNewButton_5.setBackground(Color.green);
			btnNewButton_7.setBackground(Color.green);
		}
		else if ((B1 == 1) && (B5 ==1) && (B9==1))
		{
			score++;
			buttonStop();
			WinScreenP1();
			btnNewButton_1.setBackground(Color.green);
			btnNewButton_5.setBackground(Color.green);
			btnNewButton_9.setBackground(Color.green);
		} 
		//player2 game win logic
		else if (B1 == 2 && B2 == 2 && B3 == 2) 
		{
			score2++;
			buttonStop();
			WinScreenP2();
			btnNewButton_1.setBackground(Color.green);
			btnNewButton_2.setBackground(Color.green);
			btnNewButton_3.setBackground(Color.green);
		}
		else if ((B4 == 2) && (B5 ==2) && (B6==2)) 
		{
			score2++;
			buttonStop();
			WinScreenP2();
			btnNewButton_4.setBackground(Color.green);
			btnNewButton_5.setBackground(Color.green);
			btnNewButton_6.setBackground(Color.green);
		}
		else if ((B7 == 2) && (B8 ==2) && (B9==2)) 
		{
			score2++;
			buttonStop();
			WinScreenP2();
			btnNewButton_7.setBackground(Color.green);
			btnNewButton_8.setBackground(Color.green);
			btnNewButton_9.setBackground(Color.green);
		}
		else if ((B1 == 2) && (B4 ==2) && (B7==2)) 
		{
			score2++;
			buttonStop();
			WinScreenP2();
			btnNewButton_1.setBackground(Color.green);
			btnNewButton_4.setBackground(Color.green);
			btnNewButton_7.setBackground(Color.green);
		}
		else if ((B2==2)&&(B5==2)&&(B8==2)) 
		{
			score2++;
			buttonStop();
			WinScreenP2();
			btnNewButton_2.setBackground(Color.green);
			btnNewButton_5.setBackground(Color.green);
			btnNewButton_8.setBackground(Color.green);
		}
		else if ((B3 == 2) && (B6 ==2) && (B9==2)) 
		{
			score2++;
			buttonStop();
			WinScreenP2();
			btnNewButton_3.setBackground(Color.green);
			btnNewButton_6.setBackground(Color.green);
			btnNewButton_9.setBackground(Color.green);
		}
		else if ((B3 == 2) && (B5 ==2) && (B7==2)) 
		{
			score2++;
			buttonStop();
			WinScreenP2();
			btnNewButton_3.setBackground(Color.green);
			btnNewButton_5.setBackground(Color.green);
			btnNewButton_7.setBackground(Color.green);
		}
		else if ((B1 == 2) && (B5 ==2) && (B9==2)) 
		{
			score2++;
			buttonStop();
			WinScreenP2();
			btnNewButton_1.setBackground(Color.green);
			btnNewButton_5.setBackground(Color.green);
			btnNewButton_9.setBackground(Color.green);
		}
		//Happy tie logic :)
		else if ((B1 != 0) && (B2 != 0) && (B3 != 0) && (B4 != 0) && (B5 != 0) && (B6 != 0) && (B7 != 0) && (B8 != 0) && (B9 != 0)) {
			String template = "<html><i> Game results in a tie.<br> Press restart to play again.</i><html>";
				String text = String.format(template, name, score);
				textArea_1.setText(text);
		}
		
		// DEBUG CODE ONLY UNCOMMENT IF YOU BREAK SOMETHING
		// System.out.println(score);
		// System.out.println(score2);
	}
	//Turns all buttons in the main game to stop being able to be clicked when called. Makes it imposible for an accidental two wins.
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
	//P1 win screen shows P1 Score and tells them they won.
	private static void WinScreenP1()
	{
		String template = "<html><i>%s Wins!!<br>Your score now is %d</i><html>";
				String text = String.format(template, name, score);
				textArea_1.setText(text);
	}
	//P2 win screen shows P2 Score and tells them they won.
	private static void WinScreenP2()
	{
		String template = "<html><i>%s Wins!!<br>Your score now is %d</i><html>";
				String text = String.format(template, name2, score2);
				textArea_1.setText(text);
	}

	//Mouse click events, Took a while to figure out ngl, BUT IT WORKS HEHEHEHEHEHEHE ;) -L
	@Override
	public void mouseClicked(MouseEvent arg0) 
	{
		if (Input.getText().equals("Put your name here before starting the game"))
   		{	
        	Input.setText("");
			Input.setFont(Input.getFont().deriveFont(30f));
    	}	
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
	}

	@Override
	public void mousePressed(MouseEvent arg0) 
	{
		if (Input.getText().equals("Put your name here before starting the game"))
		{
			Input.setText("");
			Input.setFont(Input.getFont().deriveFont(30f));
		}	
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {	
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {	
	}
	//End of mouse click events.
}
//END OF CODE NOTHING MORE HERE GO TALK TO SOME HUMANS NOW. XD (This is also where the suffering ends if you wanted to know, but I actually had plenty of fun on this. -L)