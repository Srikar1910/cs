package REG;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class reg {

	private JFrame frame;
	private JTextField sno;
	private JTextField N;
	private JTextField E;
	private JTextField M;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					reg window = new reg();
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
	public reg() {
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
		
		JLabel lblNewLabel = new JLabel("Sno");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(30, 39, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(30, 87, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("EMail");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(30, 134, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Marks");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(30, 189, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		sno = new JTextField();
		sno.setBounds(132, 36, 140, 20);
		frame.getContentPane().add(sno);
		sno.setColumns(10);
		
		N = new JTextField();
		N.setBounds(132, 84, 140, 20);
		frame.getContentPane().add(N);
		N.setColumns(10);
		
		E = new JTextField();
		E.setBounds(132, 131, 140, 20);
		frame.getContentPane().add(E);
		E.setColumns(10);
		
		M = new JTextField();
		M.setBounds(132, 186, 140, 20);
		frame.getContentPane().add(M);
		M.setColumns(10);
		
		JButton B1 = new JButton("SUBMIT");
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Sno=sno.getText();
				String Name=N.getText();
				String EMail=E.getText();
				String Marks=M.getText();
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/reg","root","mrec");
					String q="Insert into data values('"+Sno+"','"+Name+"','"+EMail+"','"+Marks+"')";
					Statement sta=con.createStatement();
					sta.executeUpdate(q);
					con.close();
					Component B1 = null;
					JOptionPane.showMessageDialog(B1, "Registration Done");
				} catch (SQLException e1) {
					e1.printStackTrace();				}
				
			}
		});
		B1.setBounds(101, 227, 89, 23);
		frame.getContentPane().add(B1);
	}
}
