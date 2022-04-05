package finalProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Button;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import java.util.Scanner;
import javax.swing.JTextField;
import java.awt.Color;

public class MainFrame extends JFrame implements ActionListener {

	//Globals
	JButton btnNewButton_1;
	JButton btnNewButton_2;
	JButton btnNewButton_3;
	JButton btnNewButton_4;
	JButton btnNewButton_5;
	JButton btnNewButton_6;
	JButton btnNewButton_7;
	JButton btnNewButton_8;
	JButton btnNewButton_9;
	JButton restartButton;
	static JTextField Input;
	static JLabel textArea_1;
	String name;
	String name2;
	int score;
	int score2;
	static int startupcounter;
	static int buttonTurnCounter = 0;
	static int [] playerTurn = new int [9]; 

	int player = 0;

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
	
	

	//Need a player 1 and player 2 method.
	// private static void P1P2()
	// {
		
// 	int [] player = {1,3,5,7,9};
// 	int [] player2 = {2,4,6,8};
	
// 	for(int k = 0; k < 9; k++)
// 	{
// 		if(k == player[k]);
// 		{
			
// 		}
// 		else if
	
// 	}
//  }

	
	
	
	
	private JTextArea textArea;
	private JButton btnNewButton;

	
	//need a starting method here.
	

	//The "MainFrame" where all the buttons get created and set up.
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100 , 450, 300);
		setSize(1280,720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4, 3, 1, 1));
		
		btnNewButton_1 = new JButton("-");
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("-");
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("-");
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("-");
		contentPane.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("-");
		contentPane.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("-");
		contentPane.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("-");
		contentPane.add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("-");
		contentPane.add(btnNewButton_8);
		
		btnNewButton_9 = new JButton("-");
		contentPane.add(btnNewButton_9);
		
		Input = new JTextField(8);  
		contentPane.add(Input);
		Input.setBackground(Color.CYAN); 		
		
		restartButton = new JButton("Restart");
		contentPane.add(restartButton);

		textArea_1 = new JLabel();
		contentPane.add(textArea_1);
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
	}

	//The action method. This allows us to run actions when the action listener is called.
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnNewButton_1)
		{
			btnNewButton_1.setEnabled(false);
			if(1 == playerTurn[buttonTurnCounter]) {
				btnNewButton_1.setText("1");
			}
			else if(2 == playerTurn[buttonTurnCounter]) {
				btnNewButton_1.setText("2");
			}
			else
			{
			btnNewButton_1.setText("Game has not started");
			}
			buttonTurnCounter ++;
		}
		else if(e.getSource()==btnNewButton_2)
		{
			btnNewButton_2.setEnabled(false);
			if(1 == playerTurn[buttonTurnCounter]) {
				btnNewButton_2.setText("1");
			}
			else if(2 == playerTurn[buttonTurnCounter]) {
				btnNewButton_2.setText("2");
			}
			else
			{
			btnNewButton_2.setText("Game has not started");
			}
			buttonTurnCounter ++;
		}
		else if(e.getSource()==btnNewButton_3)
		{
			btnNewButton_3.setEnabled(false);
			if(1 == playerTurn[buttonTurnCounter]) {
				btnNewButton_3.setText("1");
			}
			else if(2 == playerTurn[buttonTurnCounter]) {
				btnNewButton_3.setText("2");
			}
			else
			{
			btnNewButton_3.setText("Game has not started");
			}
			buttonTurnCounter ++;
		}
		else if(e.getSource()==btnNewButton_4)
		{
			btnNewButton_4.setEnabled(false);
			if(1 == playerTurn[buttonTurnCounter]) {
				btnNewButton_4.setText("1");
			}
			else if(2 == playerTurn[buttonTurnCounter]) {
				btnNewButton_4.setText("2");
			}
			else
			{
			btnNewButton_4.setText("Game has not started");
			}
			buttonTurnCounter ++;
		}
		else if(e.getSource()==btnNewButton_5)
		{
			btnNewButton_5.setEnabled(false);
			if(1 == playerTurn[buttonTurnCounter]) {
				btnNewButton_5.setText("1");
			}
			else if(2 == playerTurn[buttonTurnCounter]) {
				btnNewButton_5.setText("2");
			}
			else
			{
			btnNewButton_5.setText("Game has not started");
			}
			buttonTurnCounter ++;
		}
		else if(e.getSource()==btnNewButton_6)
		{
			btnNewButton_6.setEnabled(false);
			if(1 == playerTurn[buttonTurnCounter]) {
				btnNewButton_6.setText("1");
			}
			else if(2 == playerTurn[buttonTurnCounter]) {
				btnNewButton_6.setText("2");
			}
			else
			{
			btnNewButton_6.setText("Game has not started");
			}
			buttonTurnCounter ++;
		}
		else if(e.getSource()==btnNewButton_7)
		{
			btnNewButton_7.setEnabled(false);
			if(1 == playerTurn[buttonTurnCounter]) {
				btnNewButton_7.setText("1");
			}
			else if(2 == playerTurn[buttonTurnCounter]) {
				btnNewButton_7.setText("2");
			}
			else
			{
			btnNewButton_7.setText("Game has not started");
			}
			buttonTurnCounter ++;
		}	
		else if(e.getSource()==btnNewButton_8)
		{
			btnNewButton_8.setEnabled(false);
			if(1 == playerTurn[buttonTurnCounter]) {
				btnNewButton_8.setText("1");
			}
			else if(2 == playerTurn[buttonTurnCounter]) {
				btnNewButton_8.setText("2");
			}
			else
			{
			btnNewButton_8.setText("Game has not started");
			}
			buttonTurnCounter ++;
		}
		else if(e.getSource()==btnNewButton_9)
		{
			btnNewButton_9.setEnabled(false);
			if(1 == playerTurn[buttonTurnCounter]) {
				btnNewButton_9.setText("1");
			}
			else if(2 == playerTurn[buttonTurnCounter]) {
				btnNewButton_9.setText("2");
			}
			else
			{
			btnNewButton_9.setText("Game has not started");
			}
			buttonTurnCounter ++;
		}
		else if(e.getSource()==restartButton)
		{
			//some restart functions
			//who start
			//player turn variables
			int starter = ((int)(Math.random()*2)+1);
			if(starter == 1) {
				playerTurn[0] = 1;
				playerTurn[1] = 2;
				playerTurn[2] = 1;
				playerTurn[3] = 2;
				playerTurn[4] = 1;
				playerTurn[5] = 2;
				playerTurn[6] = 1;
				playerTurn[7] = 2;
				playerTurn[8] = 1;
				System.out.println(starter);
				for(int i = 0; i < 5; i++) {
					System.out.println(playerTurn[i]);
				}
			} else {
				playerTurn[0] = 2;
				playerTurn[1] = 1;
				playerTurn[2] = 2;
				playerTurn[3] = 1;
				playerTurn[4] = 2;
				playerTurn[5] = 1;
				playerTurn[6] = 2;
				playerTurn[7] = 1;
				playerTurn[8] = 2;
				System.out.println(starter);
				for(int i = 0; i < 5; i++) {
					System.out.println(playerTurn[i]);
					System.out.println(playerTurn[i]);
					
			}
		}
			System.out.println("Player " + starter + " starts");



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
			}
			else{
				System.out.println("why you still typing here...");
				Input.setText("");
			}
		}
	}
}
