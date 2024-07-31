package demo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login_opt extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login_opt frame = new login_opt();
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
	public login_opt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 919, 614);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(32, 178, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN AS");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 40));
		lblNewLabel.setBounds(319, 126, 275, 52);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("ADMIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new loginadmin().setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		btnNewButton.setBounds(353, 226, 145, 57);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("USER");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Login().setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		btnNewButton_1.setBounds(353, 338, 145, 52);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("NEW USER");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Frame1().setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		btnNewButton_2.setBounds(353, 442, 145, 52);
		contentPane.add(btnNewButton_2);
	}

}
