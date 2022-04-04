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

public class MainFrame extends JFrame implements ActionListener {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
	
	int player = 0;
	//Need a player 1 and player 2 method.
	private static void P1P2()
	{
		
// 	// int [] player = {1,3,5,7,9};
// 	// int [] player2 = {2,4,6,8};
	
// 	for(int k = 0; k < 9; k++)
// 	{
// 		if(k == player[k]);
// 		{
			
// 		}
// 		else if
	
// 	}
 }
	
	
	
	
	private JTextArea textArea;
	private JButton btnNewButton;
	
	
	
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
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
		
		textArea = new JTextArea();
		contentPane.add(textArea);
		
		restartButton = new JButton("Restart");
		contentPane.add(restartButton);
		
		
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
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnNewButton_1)
		{
			btnNewButton_1.setEnabled(false);
			if(player >= 1)
			{
			btnNewButton_1.setText("1");
			}
			else
			{
			btnNewButton_1.setText("0");
			}
		}
		else if(e.getSource()==btnNewButton_2)
		{
			btnNewButton_2.setEnabled(false);
		}
		else if(e.getSource()==btnNewButton_3)
		{
			btnNewButton_3.setEnabled(false);
		}
		else if(e.getSource()==btnNewButton_4)
		{
			btnNewButton_4.setEnabled(false);
		}
		else if(e.getSource()==btnNewButton_5)
		{
			btnNewButton_5.setEnabled(false);
		}
		else if(e.getSource()==btnNewButton_6)
		{
			btnNewButton_6.setEnabled(false);
		}
		else if(e.getSource()==btnNewButton_7)
		{
			btnNewButton_7.setEnabled(false);
		}
		else if(e.getSource()==btnNewButton_8)
		{
			btnNewButton_8.setEnabled(false);
		}
		else if(e.getSource()==btnNewButton_9)
		{
			btnNewButton_9.setEnabled(false);
		}
		else if(e.getSource()==restartButton)
		{
			//some restart functions
		}
		
	}
}
