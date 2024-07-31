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
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

public class menu_update extends JFrame {
	static final String DB_URL = "jdbc:mysql://localhost/dbms_miniproject";
	static final String USER = "root";
	static final String PASS = "root123";
	Connection conn = null;
	Statement stmt = null;
	
	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu_update frame = new menu_update();
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
	public menu_update() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 919, 614);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("item id ");
		lblNewLabel.setBounds(125, 43, 114, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblPrice =new JLabel("item price");
		lblPrice.setBounds(125, 81, 95, 40);
		contentPane.add(lblPrice);
		

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 247, 566, 310);
		contentPane.add(scrollPane);
		
		

		
		table = new JTable();
		scrollPane.setViewportView(table);
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.setBounds(243, 131, 114, 38);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int item_id = Integer.parseInt(textField.getText());
				int u_price=Integer.parseInt(textField_1.getText());
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					conn = DriverManager.getConnection(DB_URL, USER, PASS);

					String sql = " UPDATE menu SET I_price = ? WHERE menu_id = ?";
					
					PreparedStatement prep_stmt;
					prep_stmt=conn.prepareStatement(sql);
					prep_stmt.setInt(1,u_price);
					prep_stmt.setInt(2,item_id);
					
					
					
					prep_stmt.execute();
					JOptionPane.showMessageDialog(null, "Updated successfully");
					
				
				} catch (Exception e1) {
					System.out.println(e1);
				}
			}
		});
		contentPane.add(btnNewButton);
		textField = new JTextField();
		textField.setBounds(269, 48, 211, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(269, 86, 211, 35);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		JButton btnViewUpdatedMenu = new JButton("View Updated menu");
		btnViewUpdatedMenu.setBounds(616, 47, 114, 45);
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
		
		JButton btnBack = new JButton("back");
		btnBack.setBounds(616, 131, 114, 38);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				admin_menu op = new admin_menu();
				op.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnBack);
	
	}



	}


