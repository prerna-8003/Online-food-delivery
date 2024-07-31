package demo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;

public class admin_menu extends JFrame {
	static final String DB_URL = "jdbc:mysql://localhost/dbms_miniproject";
	static final String USER = "root";
	static final String PASS = "root123";
	Connection conn = null;
	Statement stmt = null;
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin_menu frame = new admin_menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public admin_menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,919 , 614);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(32, 178, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("ADD ITEMS");
		btnNewButton.setBounds(109, 163, 200, 100);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addmenu op = new addmenu();
				op.setVisible(true);
				dispose();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("DELETE ITEM");
		btnNewButton_1.setBounds(109, 370, 200, 100);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removemenu op = new removemenu();
				op.setVisible(true);
				dispose();
				
			}
		});
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("UPDATE PRICE");
		btnNewButton_2.setBounds(631, 163, 200, 100);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				update_menu op = new update_menu();
				op.setVisible(true);
			}
		});
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("VIEW MENU");
		btnNewButton_3.setBounds(631, 370, 200, 100);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				admin_menu_view op = new admin_menu_view();
				op.setVisible(true);
			
			}
		});
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Back");
		btnNewButton_4.setBounds(746, 511, 100, 40);
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				admin_func op = new admin_func();
				op.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("     MENU OPTIONS");
		lblNewLabel.setFont(new Font("High Tower Text", Font.BOLD, 33));
		lblNewLabel.setBounds(283, 46, 331, 82);
		contentPane.add(lblNewLabel);
	}
	
	

}
