package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class loginadmin extends javax.swing.JFrame {
	static final String DB_URL = "jdbc:mysql://localhost/dbms_miniproject";
	static final String USER = "root";
	static final String PASS = "root123";
	Connection conn = null;
	Statement stmt = null;
	public loginadmin() {
		initComponents();
		this.setLocationRelativeTo(null);
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		txtadmin = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		btnsubmit = new javax.swing.JButton();
		btnclr = new javax.swing.JButton();
		txtadminpass = new javax.swing.JPasswordField();
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBackground(new java.awt.Color(0, 153, 204));
		jPanel1.setBackground(new java.awt.Color(0, 102, 153));
		jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		jLabel1.setText(" ADMIN LOGIN PAGE");
		txtadmin.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtadminActionPerformed(evt);
			}
		});

		jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		jLabel2.setText("ADMIN NAME :");
		jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		jLabel3.setText("PASSWORD :");
		btnsubmit.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
		btnsubmit.setText("SUBMIT");
		btnsubmit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnsubmitActionPerformed(evt);
			}
		});
		btnclr.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
		btnclr.setText("CLEAR");
		btnclr.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnclrActionPerformed(evt);
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

										.addComponent(txtadminpass, javax.swing.GroupLayout.PREFERRED_SIZE,

												271, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(157, Short.MAX_VALUE))
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGap(103, 103, 103)
						.addComponent(btnsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 137,

								javax.swing.GroupLayout.PREFERRED_SIZE)

						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,

								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

						.addComponent(btnclr, javax.swing.GroupLayout.PREFERRED_SIZE, 143,

								javax.swing.GroupLayout.PREFERRED_SIZE)

						.addGap(74, 74, 74))
				.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,

								jPanel1Layout.createSequentialGroup()

								.addContainerGap(491, Short.MAX_VALUE)
								.addComponent(txtadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 266,

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

										.addComponent(txtadminpass, javax.swing.GroupLayout.PREFERRED_SIZE,

												34, javax.swing.GroupLayout.PREFERRED_SIZE)

										.addGap(73, 73, 73)))

						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btnsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 41,

										javax.swing.GroupLayout.PREFERRED_SIZE)

								.addComponent(btnclr, javax.swing.GroupLayout.PREFERRED_SIZE, 42,

										javax.swing.GroupLayout.PREFERRED_SIZE))

						.addGap(39, 39, 39))
				.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addGap(184, 184, 184)
								.addComponent(txtadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 31,

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
	private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {
		new admin_func().setVisible(true);
		this.dispose();
	}
	private void btnclrActionPerformed(java.awt.event.ActionEvent evt) {
		txtadmin.setText("");
		txtadminpass.setText("");
	}

	private void txtadminActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}
	/**
	 * @param args the command line arguments
	 */
	public void connection ()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql:://localhost:3306/dbms_miniproject",
					"root", "root123");
		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null, "Invalid");
		}
	}
	public static void main(String args[]) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info :
				javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(loginadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(loginadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(loginadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {

			java.util.logging.Logger.getLogger(loginadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new loginadmin().setVisible(true);
			}
		});
	}
	// Variables declaration - do not modify
	private javax.swing.JButton btnclr;
	private javax.swing.JButton btnsubmit;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTextField txtadmin;
	private javax.swing.JPasswordField txtadminpass;
	// End of variables declaration
}