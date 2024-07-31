package demo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class usefunc extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					usefunc frame = new usefunc();
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
	public usefunc() {
		setBackground(new Color(32, 178, 170));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 919, 614);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 206, 209));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USER FUNCTIONALITIES");
		lblNewLabel.setForeground(new Color(210, 105, 30));
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 40));
		lblNewLabel.setBounds(219, 81, 467, 92);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("VIEW MENU");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new menuu_new().setVisible(true);
				
              }
		});
		btnNewButton.setBounds(87, 239, 183, 84);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ORDER");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new cart_user().setVisible(true);
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(87, 364, 183, 66);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("EXIT");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBounds(664, 483, 142, 61);
		contentPane.add(btnNewButton_2);
	}

}
