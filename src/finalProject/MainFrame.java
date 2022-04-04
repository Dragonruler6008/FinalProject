package finalProject;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.DimensionUIResource;

import java.awt.BorderLayout;


	public class MainFrame extends JFrame
		{
			public void initialize()
			{
				JPanel mainPanel = new JPanel();
				mainPanel.setLayout(new BorderLayout());
				mainPanel.setBackground(new ColorUIResource(134,145,123));

				setTitle("Tick-Tack-Toe");	
				setSize(500,500);
				setMinimumSize(new DimensionUIResource(300, 300));	
				setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
				setVisible(true);




			}	
			public static void main(String[] args) {
				MainFrame myframe = new MainFrame();
				myframe.initialize();
			}
		}
