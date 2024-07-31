package demo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class admin_func extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin_func frame = new admin_func();
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
	public admin_func() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 919, 614);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(32, 178, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADMIN FUNCTIONALITIES");
		lblNewLabel.setForeground(new Color(210, 105, 30));
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 40));
		lblNewLabel.setBounds(231, 94, 573, 87);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("MENU");
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new admin_menu().setVisible(true);
			}
		});
		btnNewButton.setBounds(404, 232, 177, 81);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CUSTOMER");
		btnNewButton_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new admin_cust().setVisible(true);
			}
		});
		btnNewButton_1.setBounds(404, 364, 177, 87);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new login_opt().setVisible(true);
			}
		});
		btnNewButton_2.setBounds(712, 508, 110, 44);
		contentPane.add(btnNewButton_2);
	}

}
