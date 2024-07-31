package demo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.border.EtchedBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class addmenu extends JFrame {

	static final String DB_URL = "jdbc:mysql://localhost/dbms_miniproject";
	static final String USER = "root";
	static final String PASS = "root123";
	Connection conn = null;
	Statement stmt = null;

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addmenu frame = new addmenu();
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
	public addmenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 919, 614);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 191, 255));
		contentPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ITEM ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(46, 39, 114, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblItemName = new JLabel("ITEM NAME");
		lblItemName.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblItemName.setBounds(46, 81, 174, 40);
		contentPane.add(lblItemName);
		
		JLabel lblPrice = new JLabel("PRICE");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblPrice.setBounds(46, 131, 133, 38);
		contentPane.add(lblPrice);
		
		textField = new JTextField();
		textField.setBounds(269, 48, 211, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(269, 86, 211, 33);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(269, 131, 211, 38);
		textField_2.setColumns(10);
		contentPane.add(textField_2);
		
		
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 247, 566, 310);
		contentPane.add(scrollPane);

		
		table = new JTable();
		scrollPane.setViewportView(table);
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		
		
		
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		btnNewButton.setBounds(501, 207, 90, 26);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int item_id = Integer.parseInt(textField.getText());
				String item_name = textField_1.getText();
				int item_price = Integer.parseInt(textField_2.getText());
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					conn = DriverManager.getConnection(DB_URL, USER, PASS);

					String sql = "insert into menu values(?,?,?)";
					
					PreparedStatement prep_stmt;
					prep_stmt=conn.prepareStatement(sql);
					prep_stmt.setInt(1,item_id);
					prep_stmt.setString(2,item_name);
					prep_stmt.setInt(3,item_price);
					
					prep_stmt.execute();
					JOptionPane.showMessageDialog(null, "Added successfully");
					
				
				} catch (Exception e1) {
					System.out.println(e1);
				}
			}
		});
		JButton btnViewUpdatedMenu = new JButton("View Updated menu");
		btnViewUpdatedMenu.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		btnViewUpdatedMenu.setBounds(633, 247, 241, 45);
		btnViewUpdatedMenu.addActionListener(new ActionListener() {
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
		contentPane.add(btnViewUpdatedMenu);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		btnBack.setBounds(724, 483, 114, 38);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				admin_menu op = new admin_menu();
				op.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnBack);
		
		JLabel lblNewLabel_1 = new JLabel("ADD MENU");
		lblNewLabel_1.setForeground(new Color(210, 105, 30));
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		lblNewLabel_1.setBounds(606, 81, 232, 40);
		contentPane.add(lblNewLabel_1);
		
	}
}
