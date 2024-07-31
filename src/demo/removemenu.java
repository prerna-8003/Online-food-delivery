package demo;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JTable;
import java.awt.Color;
import java.awt.Font;

public class removemenu extends JFrame {

	static final String DB_URL = "jdbc:mysql://localhost/dbms_miniproject";
	static final String USER = "root";
	static final String PASS = "root123";
	Connection conn = null;
	Statement stmt = null;
	
	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					removemenu frame = new removemenu();
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
	public removemenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 919, 614);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 206, 209));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ITEM ID");
		lblNewLabel.setBounds(64, 41, 114, 38);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblNewLabel);
		

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 247, 566, 310);
		contentPane.add(scrollPane);

		
		table = new JTable();
		scrollPane.setViewportView(table);
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 0, 0);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("REMOVE");
		btnNewButton.setBounds(64, 184, 114, 38);
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int item_id = Integer.parseInt(textField.getText());
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					conn = DriverManager.getConnection(DB_URL, USER, PASS);

					String sql = " delete from menu where menu_id= ?";
					
					PreparedStatement prep_stmt;
					prep_stmt=conn.prepareStatement(sql);
					prep_stmt.setInt(1,item_id);
					
					prep_stmt.execute();
					JOptionPane.showMessageDialog(null, "Deleted successfully");
					
				
				} catch (Exception e1) {
					System.out.println(e1);
				}
			}
		});
		contentPane.add(btnNewButton);
		
		
		textField = new JTextField();
		textField.setBounds(202, 48, 230, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnViewUpdatedMenu = new JButton("View Updated menu");
		btnViewUpdatedMenu.setBounds(627, 247, 248, 50);
		btnViewUpdatedMenu.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
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
		btnBack.setBounds(751, 504, 114, 38);
		btnBack.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				admin_menu op = new admin_menu();
				op.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnBack);
		
		JLabel lblNewLabel_1 = new JLabel("DELETE ITEM");
		lblNewLabel_1.setForeground(new Color(205, 133, 63));
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		lblNewLabel_1.setBounds(570, 69, 295, 38);
		contentPane.add(lblNewLabel_1);
	
	}

}
