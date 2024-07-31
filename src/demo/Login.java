package demo;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*; 

public class Login extends javax.swing.JFrame { 
	static final String DB_URL="jdbc:mysql://localhost/dbms_miniproject";
	static final String USER="root";
	static final String PASS="root123";

	Connection cn; 
	public Login() { 
		initComponents(); 
		this.setLocationRelativeTo(null); 
	} 

	@SuppressWarnings("unchecked") 
	//<editor-fold defaultstate="collapsed" desc="Generated Code"> 
	private void initComponents() { 
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		txtusername = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		loginbtn = new javax.swing.JButton();
		clrbtn = new javax.swing.JButton();
		JButton backbtn = new javax.swing.JButton();
		txtpassword = new javax.swing.JPasswordField();
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBackground(new java.awt.Color(0, 153, 204));
		jPanel1.setBackground(new java.awt.Color(0, 102, 153));
		jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		jLabel1.setText(" USER LOGIN PAGE");
		txtusername.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtusernameActionPerformed(evt);
			}
		});

		jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		jLabel2.setText("USER NAME :");
		jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		jLabel3.setText("PASSWORD :");
		loginbtn.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
		loginbtn.setText("LOGIN");
		loginbtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				loginbtnActionPerformed(evt);
			}
		});
		clrbtn.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
		clrbtn.setText("CLEAR");
		clrbtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				clrbtnActionPerformed(evt);
			}
		
		});
		backbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		backbtn.setText("BACK");
		backbtn.addActionListener(new ActionListener()  {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				backbtnActionPerformed(evt);
			}
		});
		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGap(331, 331, 331)
										.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258,

												javax.swing.GroupLayout.PREFERRED_SIZE))

								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGap(196, 196, 196)

										.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
												false)

												.addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 132,

														Short.MAX_VALUE)

												.addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE,

														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))

										.addGap(163, 163, 163)

										.addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE,

												271, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(157, Short.MAX_VALUE))
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGap(103, 103, 103)
						.addComponent(loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137,

								javax.swing.GroupLayout.PREFERRED_SIZE)

						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,

								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

						.addComponent(clrbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 143,

								javax.swing.GroupLayout.PREFERRED_SIZE)

						.addGap(74, 74, 74))
				.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,

								jPanel1Layout.createSequentialGroup()

								.addContainerGap(491, Short.MAX_VALUE)
								.addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 266,

										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(162, 162, 162)))
				);
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGap(38, 38, 38)
						.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54,

								javax.swing.GroupLayout.PREFERRED_SIZE)

						.addGap(85, 85, 85)
						.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41,

								javax.swing.GroupLayout.PREFERRED_SIZE)

						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77,
								Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,

										jPanel1Layout.createSequentialGroup()

										.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31,

												javax.swing.GroupLayout.PREFERRED_SIZE)

										.addGap(62, 62, 62))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,

										jPanel1Layout.createSequentialGroup()

										.addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE,

												34, javax.swing.GroupLayout.PREFERRED_SIZE)

										.addGap(73, 73, 73)))

						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41,

										javax.swing.GroupLayout.PREFERRED_SIZE)

								.addComponent(clrbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42,

										javax.swing.GroupLayout.PREFERRED_SIZE))

						.addGap(39, 39, 39))
				.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addGap(184, 184, 184)
								.addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 31,

										javax.swing.GroupLayout.PREFERRED_SIZE)

								.addContainerGap(268, Short.MAX_VALUE)))
				);
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

						.addGap(0, 0, Short.MAX_VALUE))
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				);
		pack();
	}// </editor-fold> 
	
	protected void backbtnActionPerformed(ActionEvent evt) {
		this.dispose();
		new login_opt().setVisible(true);
		
	}

	protected void txtusernameActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		
	}

	private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) { connection(); 
	String username = txtusername.getText(); 
	int password = Integer.parseInt(txtpassword.getText()); 
	try{ 
		Statement st = cn.createStatement(); 
		String sql = "select * from customer where username like'"+username+"' and password like'"+password+"'"; 
		ResultSet rs = st.executeQuery(sql); 
		boolean found = false; 
		while(rs.next()) 
		{ 
			if (username.equals(rs.getString("username")) && 
					password==rs.getInt("password")) 
			{ 
				JOptionPane.showMessageDialog(null, "Login Page"); 
//				new Options().setVisible(true); 
//				this.dispose(); 
			} 
			if (found = false) 
			{ 
				JOptionPane.showMessageDialog(null, "Ivalid !"); 
			} 
		} 
	} 
	catch (Exception ex) 
	{ 
		JOptionPane.showMessageDialog(null, "ex.getMessage()"); 
	} 
	new usefunc().setVisible(true);
	this.dispose();
	}
	private void clrbtnActionPerformed(java.awt.event.ActionEvent evt) { 
		txtusername.setText(""); 
		txtpassword.setText(""); 
	} 
	public void connection () 
	{ 
		try 
		{ 
			Class.forName("com.mysql.jdbc.Driver"); 
			cn = DriverManager.getConnection(DB_URL, USER, PASS); 
		} 
		catch(Exception ex) 
		{ 
			JOptionPane.showMessageDialog(null, "Invalid"); 
		} 
	} 
	public static void main(String args[]) { 
		java.awt.EventQueue.invokeLater(() -> { 
			new Login().setVisible(true); 
		}); 
	} 
	// Variables declaration - do not modify 
	private javax.swing.JButton clrbtn; 
	private javax.swing.JLabel jLabel1; 
	private javax.swing.JLabel jLabel2; 
	private javax.swing.JLabel jLabel3; 
	private javax.swing.JPanel jPanel1; 
	private javax.swing.JButton loginbtn; 
	private javax.swing.JPasswordField txtpassword; 
	private javax.swing.JTextField txtusername; 
	// End of variables declaration 
}
