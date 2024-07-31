package demo;
import java.sql.*;
import javax.swing.*;

public class PastOrder extends javax.swing.JFrame {

	public PastOrder() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jLabel1 = new javax.swing.JLabel();
		btnback2 = new javax.swing.JButton();
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object [][] {
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null}
				},
				new String [] {
						 "Order ID", "Total", "Date"
				}
				) {
			Class[] types = new Class [] {
					 java.lang.Integer.class, java.lang.Integer.class,
					java.lang.String.class
			};
			boolean[] canEdit = new boolean [] {
					 false, false, false
			};
			public Class getColumnClass(int columnIndex) {
				return types [columnIndex];

			}
			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit [columnIndex];
			}
		});
		jScrollPane1.setViewportView(jTable1);
		if (jTable1.getColumnModel().getColumnCount() > 0) {
			jTable1.getColumnModel().getColumn(0).setResizable(false);
			jTable1.getColumnModel().getColumn(1).setResizable(false);
			jTable1.getColumnModel().getColumn(2).setResizable(false);
			
		}
		jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		jLabel1.setText(" ORDERS");
		btnback2.setText("Back");
		btnback2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnback2ActionPerformed(evt);
			}
		});
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

								.addGroup(layout.createSequentialGroup()
										.addGap(96, 96, 96)
										.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

								.addGroup(layout.createSequentialGroup()
										.addGap(176, 176, 176)
										.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264,

												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(103, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
						.addGap(0, 0, Short.MAX_VALUE)
						.addComponent(btnback2)

						.addGap(16, 16, 16))
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
						.addGap(16, 16, 16)
						.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 33,
								Short.MAX_VALUE)
						.addGap(18, 18, 18)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292,

								javax.swing.GroupLayout.PREFERRED_SIZE)

						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(btnback2)
						.addGap(13, 13, 13))
				);
		pack();
	}// </editor-fold>
	private void btnback2ActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
		new USER().setVisible(true);
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
			java.util.logging.Logger.getLogger(PastOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(PastOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(PastOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(PastOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new PastOrder().setVisible(true);
			}
		});
	}
	// Variables declaration - do not modify
	private javax.swing.JButton btnback2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	// End of variables declaration
}
