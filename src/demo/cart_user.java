package demo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

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
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;

public class cart_user extends JFrame {
	static final String DB_URL = "jdbc:mysql://localhost/dbms_miniproject";
	static final String USER = "root";
	static final String PASS = "root123";
	Connection conn = null;
	Statement stmt = null;

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTextField txtItemid;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField;
	private JTextField textField_3;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cart_user frame = new cart_user();
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
	public cart_user() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 878, 729);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(32, 178, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 247, 386, 310);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(439, 247, 386, 310);
		contentPane.add(scrollPane_2);
		
		table_1 = new JTable();
		scrollPane_2.setViewportView(table_1);
		
		JLabel lblNewLabel = new JLabel("ITEM ID");
		lblNewLabel.setBounds(36, 21, 96, 24);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblNewLabel);
		
		txtItemid = new JTextField();
		txtItemid.setBounds(192, 21, 256, 27);
		contentPane.add(txtItemid);
		txtItemid.setColumns(10);
		
		JLabel lblItemPrice = new JLabel("ITEM NAME ");
		lblItemPrice.setBounds(35, 55, 143, 24);
		lblItemPrice.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblItemPrice);
		
		JLabel lblItemPrice_1 = new JLabel("ITEM PRICE");
		lblItemPrice_1.setBounds(36, 100, 127, 24);
		lblItemPrice_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblItemPrice_1);
		
		textField = new JTextField();
		textField.setBounds(192, 58, 256, 27);
		textField.setColumns(10);
		contentPane.add(textField);
		
		textField_3 = new JTextField();
		textField_3.setBounds(192, 103, 256, 27);
		textField_3.setColumns(10);
		contentPane.add(textField_3);
		
		
		
		JButton btnNewButton = new JButton("VIEW MENU");
		btnNewButton.setBounds(22, 216, 174, 21);
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
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
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ADD TO CART");
		btnNewButton_1.setBounds(35, 157, 201, 35);
		btnNewButton_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int item_id = Integer.parseInt(txtItemid.getText());
				String item_name = textField.getText();
				int item_price = Integer.parseInt(textField_3.getText());
				int quantity=1;
				
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					conn = DriverManager.getConnection(DB_URL, USER, PASS);

					String sql = "insert into cart(menu_id,item_name,amount,quantity) values(?,?,?,?)";
					
					PreparedStatement prep_stmt;
					prep_stmt=conn.prepareStatement(sql);
					prep_stmt.setInt(1,item_id);
					prep_stmt.setString(2,item_name);
					
					prep_stmt.setInt(3,item_price);
					prep_stmt.setInt(4,quantity);
					
					
					
					prep_stmt.execute();
					JOptionPane.showMessageDialog(null, "Added successfully");
					
				
				} catch (Exception e1) {
					System.out.println(e1);
				}
			}
		});
		contentPane.add(btnNewButton_1);
		
		
		JButton btnNewButton_3 = new JButton("CLEAR");
		btnNewButton_3.setBounds(263, 216, 119, 21);
		btnNewButton_3.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtItemid.setText("");
				textField.setText("");
				textField_3.setText("");

			}
		});
		contentPane.add(btnNewButton_3);
		
		JLabel lblAddYourItems = new JLabel("ADD YOUR ITEMS TO CART");
		lblAddYourItems.setBounds(439, 147, 386, 24);
		lblAddYourItems.setForeground(new Color(255, 69, 0));
		lblAddYourItems.setBackground(new Color(210, 105, 30));
		lblAddYourItems.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		contentPane.add(lblAddYourItems);
		
		
		JButton btnViewCart = new JButton("VIEW CART");
		btnViewCart.setBounds(442, 216, 174, 21);
		btnViewCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					conn = DriverManager.getConnection(DB_URL, USER, PASS);

					Statement st = conn.createStatement();
					String sq = "select * from cart";
					ResultSet r = st.executeQuery(sq);

					if (r.next()) {
						String query = "select* from cart";
						PreparedStatement stm = conn.prepareStatement(query);
						ResultSet rs = stm.executeQuery();
						table_1.setModel(DbUtils.resultSetToTableModel(rs));
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
		btnViewCart.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		contentPane.add(btnViewCart);
		
		JButton btnNewButton_2 = new JButton("CLEAR");
		btnNewButton_2.setBounds(693, 216, 107, 21);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					conn = DriverManager.getConnection(DB_URL, USER, PASS);

					String sql = " delete from cart";
					
					PreparedStatement prep_stmt;
					prep_stmt=conn.prepareStatement(sql);
					
					prep_stmt.execute();
					JOptionPane.showMessageDialog(null, "Deleted successfully");
					
				
				} catch (Exception e1) {
					System.out.println(e1);
				}
				
			}
		});
		btnNewButton_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("BACK");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usefunc op = new usefunc();
				op.setVisible(true);
				dispose();
			}
		});
		btnNewButton_4.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		btnNewButton_4.setBounds(680, 624, 102, 35);
		contentPane.add(btnNewButton_4);
		
		
		
		
	}
}
