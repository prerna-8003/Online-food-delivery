package demo;

public class adminfunc extends javax.swing.JFrame {

	public adminfunc() {
		initComponents();
		this.setLocationRelativeTo(null);
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {
		jLabel1 = new javax.swing.JLabel();
		btnaltermenu = new javax.swing.JButton();
		btncust = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		jLabel1.setText("ADMIN FUNCTIONALITIES");
		btnaltermenu.setText(" MENU");
		btnaltermenu.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnaltermenuActionPerformed(evt);
			}
		});
		btncust.setText("CUSTOMERS");
		btncust.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btncustActionPerformed(evt);
			}
		});
		jButton3.setText("BACK");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);

			}
		});
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGap(22, 22, 22)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(btncust, javax.swing.GroupLayout.PREFERRED_SIZE, 99,

										javax.swing.GroupLayout.PREFERRED_SIZE)

								.addComponent(btnaltermenu, javax.swing.GroupLayout.PREFERRED_SIZE, 99,

										javax.swing.GroupLayout.PREFERRED_SIZE)

								.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217,

										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(161, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85,

								javax.swing.GroupLayout.PREFERRED_SIZE)

						.addGap(25, 25, 25))
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGap(25, 25, 25)
						.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38,

								javax.swing.GroupLayout.PREFERRED_SIZE)

						.addGap(37, 37, 37)
						.addComponent(btnaltermenu, javax.swing.GroupLayout.PREFERRED_SIZE, 40,

								javax.swing.GroupLayout.PREFERRED_SIZE)

						.addGap(34, 34, 34)
						.addComponent(btncust, javax.swing.GroupLayout.PREFERRED_SIZE, 42,

								javax.swing.GroupLayout.PREFERRED_SIZE)

						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32,
								Short.MAX_VALUE)
						.addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33,

								javax.swing.GroupLayout.PREFERRED_SIZE)

						.addGap(19, 19, 19))
				); 

		pack();
	}// </editor-fold>
	private void btnaltermenuActionPerformed(java.awt.event.ActionEvent evt) {
		new admin_menu().setVisible(true);
		this.dispose();
	} 
	private void btncustActionPerformed(java.awt.event.ActionEvent evt) {
		new admin_cust().setVisible(true);
		this.dispose();
	}
	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
		new login_opt().setVisible(true);
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
			java.util.logging.Logger.getLogger(adminfunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(adminfunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(adminfunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {

			java.util.logging.Logger.getLogger(adminfunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new adminfunc().setVisible(true);
			}
		});
	}
	// Variables declaration - do not modify
	private javax.swing.JButton btnaltermenu;
	private javax.swing.JButton btncust;
	private javax.swing.JButton jButton3;
	private javax.swing.JLabel jLabel1;
	// End of variables declaration
}
