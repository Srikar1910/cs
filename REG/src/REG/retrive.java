package REG;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;

public class retrive {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					retrive window = new retrive();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public retrive() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel s1 = new JLabel("sno");
		s1.setBounds(41, 49, 77, 14);
		frame.getContentPane().add(s1);
		
		JLabel lb1 = new JLabel("name");
		lb1.setBounds(41, 107, 77, 14);
		frame.getContentPane().add(lb1);
		
		JLabel lb2 = new JLabel("marks");
		lb2.setBounds(41, 163, 77, 14);
		frame.getContentPane().add(lb2);
		
		t1 = new JTextField();
		t1.setBounds(217, 49, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(217, 104, 86, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		t3 = new JTextField();
		t3.setBounds(217, 160, 86, 20);
		frame.getContentPane().add(t3);
		t3.setColumns(10);
		
		JButton b2 = new JButton("search");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
			String s1=t1.getText();
			int sno=Integer.parseInt(s1);
			
			try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/retrive","root","mrec");
			}
		});
		b2.setBounds(127, 208, 89, 23);
		frame.getContentPane().add(b2);
	}

}
