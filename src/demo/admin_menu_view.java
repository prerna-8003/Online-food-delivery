package demo;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class admin_menu_view extends JFrame {

	static final String DB_URL = "jdbc:mysql://localhost/dbms_miniproject";
	static final String USER = "root";
	static final String PASS = "root123";
	Connection conn = null;
	Statement stmt = null;

	private JPanel contentPane;
	private final JTable table = new JTable();
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin_menu_view frame = new admin_menu_view();
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
	public admin_menu_view() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 919,614 );
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBounds(373, 10, 0, 0);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("MENU");
		lblNewLabel.setForeground(new Color(0, 100, 0));
		lblNewLabel.setBackground(new Color(255, 99, 71));
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 40));
		lblNewLabel.setBounds(378, 57, 373, 50);
		contentPane.add(lblNewLabel);

		//		JPanel panel_1 = new JPanel();
		//		panel_1.setBounds(220, 59, 160, 40);
		//		contentPane.add(panel_1);
		//		panel_1.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(174, 192, 566, 310);
		contentPane.add(scrollPane);

		table_1 = new JTable();
		scrollPane.setViewportView(table);
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);

		JButton btnNewButton = new JButton("VIEW");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					conn = DriverManager.getConnection(DB_URL, USER, PASS);

					Statement stm = conn.createStatement();
					String sql = "select * from MENU";
					ResultSet rs = stm.executeQuery(sql);

					if (rs.next()) {
						String query = "select * from MENU";
						PreparedStatement stm1 = conn.prepareStatement(query);
						ResultSet rs1 = stm1.executeQuery();
						table.setModel(DbUtils.resultSetToTableModel(rs1));
						// ADD VIEW FRAME
						// UserUpdate update = new UserUpdate();
						// update.setVisible(true);
					} else {
						JOptionPane.showInputDialog(this, "not available");

						// String query = "select * from IncomeDetails where PanId ='"++"'";
					}
				} catch (Exception e1) {
					System.out.println(e1);
				}
			}
		});


		btnNewButton.setBounds(107, 117, 119, 50);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					admin_menu op = new admin_menu();
					op.setVisible(true);
					dispose();
				}
			}
		);
		btnNewButton_1.setBounds(691, 117, 119, 51);
		contentPane.add(btnNewButton_1);


		//		table_1.setBounds(163, 159, 456, 304);
		//		contentPane.add(table_1);


	}
}

