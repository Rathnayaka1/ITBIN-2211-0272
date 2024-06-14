/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Isubject;
import Controller.subjectImpl;
import Model.subject;
import Util.databaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nipuni
 */
public class subjects extends javax.swing.JFrame {

    /**
     * Creates new form subjects
     */
    
    PreparedStatement pst;
    ResultSet rs;
    private Connection con;
    
    public subjects() {
        initComponents();
        try {
            con = databaseConnection.getDBConnection(); // Initialize the database connection
            table_load();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: Unable to connect to the database.");
	}
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_subjectsTable = new javax.swing.JTable();
        jLabel_pic = new javax.swing.JLabel();
        jPanel_registration = new javax.swing.JPanel();
        jLabel_subjectName = new javax.swing.JLabel();
        jLabel_subjectDes1 = new javax.swing.JLabel();
        jLabel_subjectDes2 = new javax.swing.JLabel();
        jLabel_creditPoints = new javax.swing.JLabel();
        jTextField_subjectName = new javax.swing.JTextField();
        jTextField_creditPoints = new javax.swing.JTextField();
        jButton_INSERT = new javax.swing.JButton();
        jButton_UPDATE = new javax.swing.JButton();
        jButton_DELETE = new javax.swing.JButton();
        jButton_CLEAR = new javax.swing.JButton();
        jButton_back = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_subjectDes = new javax.swing.JTextArea();
        jLabel_background = new javax.swing.JLabel();
        jMenuBar_menubar = new javax.swing.JMenuBar();
        jMenu_navigation = new javax.swing.JMenu();
        jMenuItem_dashboard = new javax.swing.JMenuItem();
        jMenuItem_logout = new javax.swing.JMenuItem();
        jMenuItem_close = new javax.swing.JMenuItem();
        jMenu_about = new javax.swing.JMenu();
        jMenuItem_info = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_subjectsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subject ID", "Subject Name", "Subject Description", "Credit Points"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable_subjectsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_subjectsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_subjectsTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 710, 186));

        jLabel_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/pics/subject2.png"))); // NOI18N
        jLabel_pic.setText("jLabel1");
        jPanel1.add(jLabel_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 160, 180));

        jPanel_registration.setBorder(javax.swing.BorderFactory.createTitledBorder("Registration"));

        jLabel_subjectName.setText("Subject Name");

        jLabel_subjectDes1.setText("Subject");

        jLabel_subjectDes2.setText("Description");

        jLabel_creditPoints.setText("Credit Points");

        jButton_INSERT.setText("INSERT");
        jButton_INSERT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_INSERTActionPerformed(evt);
            }
        });

        jButton_UPDATE.setText("UPDATE");
        jButton_UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UPDATEActionPerformed(evt);
            }
        });

        jButton_DELETE.setText("DELETE");
        jButton_DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DELETEActionPerformed(evt);
            }
        });

        jButton_CLEAR.setText("CLEAR");
        jButton_CLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CLEARActionPerformed(evt);
            }
        });

        jButton_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/pics/back.png"))); // NOI18N
        jButton_back.setText("Back");
        jButton_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_backActionPerformed(evt);
            }
        });

        jTextArea_subjectDes.setColumns(20);
        jTextArea_subjectDes.setRows(5);
        jScrollPane2.setViewportView(jTextArea_subjectDes);

        javax.swing.GroupLayout jPanel_registrationLayout = new javax.swing.GroupLayout(jPanel_registration);
        jPanel_registration.setLayout(jPanel_registrationLayout);
        jPanel_registrationLayout.setHorizontalGroup(
            jPanel_registrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_registrationLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel_registrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_subjectDes1)
                    .addComponent(jLabel_subjectDes2)
                    .addGroup(jPanel_registrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel_registrationLayout.createSequentialGroup()
                            .addComponent(jLabel_creditPoints)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextField_creditPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel_registrationLayout.createSequentialGroup()
                            .addComponent(jLabel_subjectName)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField_subjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel_registrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_registrationLayout.createSequentialGroup()
                        .addComponent(jButton_INSERT, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jButton_UPDATE))
                    .addGroup(jPanel_registrationLayout.createSequentialGroup()
                        .addComponent(jButton_DELETE, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jButton_CLEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_registrationLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButton_back)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel_registrationLayout.setVerticalGroup(
            jPanel_registrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_registrationLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel_registrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_subjectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_subjectName))
                .addGap(7, 7, 7)
                .addGroup(jPanel_registrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_registrationLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_registrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_creditPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_creditPoints)))
                    .addGroup(jPanel_registrationLayout.createSequentialGroup()
                        .addGroup(jPanel_registrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_registrationLayout.createSequentialGroup()
                                .addGroup(jPanel_registrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton_INSERT)
                                    .addComponent(jButton_UPDATE))
                                .addGap(13, 13, 13))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_registrationLayout.createSequentialGroup()
                                .addComponent(jLabel_subjectDes1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel_registrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_DELETE)
                            .addComponent(jButton_CLEAR)
                            .addComponent(jLabel_subjectDes2))
                        .addGap(18, 18, 18)
                        .addComponent(jButton_back)))
                .addGap(36, 36, 36))
        );

        jPanel1.add(jPanel_registration, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 510, 210));

        jLabel_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/pics/internal_Background.png"))); // NOI18N
        jPanel1.add(jLabel_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 460));

        jMenu_navigation.setText("Navigation");

        jMenuItem_dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/pics/home.png"))); // NOI18N
        jMenuItem_dashboard.setText("Dashboard");
        jMenuItem_dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_dashboardActionPerformed(evt);
            }
        });
        jMenu_navigation.add(jMenuItem_dashboard);

        jMenuItem_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/pics/logout.png"))); // NOI18N
        jMenuItem_logout.setText("Logout");
        jMenuItem_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_logoutActionPerformed(evt);
            }
        });
        jMenu_navigation.add(jMenuItem_logout);

        jMenuItem_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/pics/cancel.png"))); // NOI18N
        jMenuItem_close.setText("Close");
        jMenuItem_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_closeActionPerformed(evt);
            }
        });
        jMenu_navigation.add(jMenuItem_close);

        jMenuBar_menubar.add(jMenu_navigation);

        jMenu_about.setText("About");

        jMenuItem_info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/pics/about.png"))); // NOI18N
        jMenuItem_info.setText("Info");
        jMenuItem_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_infoActionPerformed(evt);
            }
        });
        jMenu_about.add(jMenuItem_info);

        jMenuBar_menubar.add(jMenu_about);

        setJMenuBar(jMenuBar_menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(779, 518));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_dashboardActionPerformed
        // TODO add your handling code here:
        dashboard dFrame = new dashboard();
        dFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem_dashboardActionPerformed

    private void jMenuItem_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_logoutActionPerformed
        // TODO add your handling code here:
        int confirmed = JOptionPane.showConfirmDialog(this, "Are you sure you want to logout?", "Logout Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirmed == JOptionPane.YES_OPTION) {
            login lFrame = new login();
            lFrame.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jMenuItem_logoutActionPerformed

    private void jMenuItem_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_closeActionPerformed
        // TODO add your handling code here:
        int confirmed = JOptionPane.showConfirmDialog(this, "Are you sure you want to close the application?", "Cancel Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirmed == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_jMenuItem_closeActionPerformed

    private void jMenuItem_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_infoActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Created by S.D.R.");
    }//GEN-LAST:event_jMenuItem_infoActionPerformed

    private void jButton_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_backActionPerformed
        dashboard dFrame = new dashboard();
        dFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton_backActionPerformed

    private void jButton_INSERTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_INSERTActionPerformed
    // INSERT OPERATION

    String subName, subDes, cPoints;

    // Retrieve data from UI components
    subName = jTextField_subjectName.getText();
    subDes = jTextArea_subjectDes.getText();
    cPoints = jTextField_creditPoints.getText();

    // Check if any required field is empty
    if (jTextField_subjectName.getText().isEmpty() ||
            jTextArea_subjectDes.getText().isEmpty() || jTextField_creditPoints.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all the required fields.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Create a new subject object
    subject newSubject = new subject();
    newSubject.setSubject_Name(subName);
    newSubject.setSubject_Description(subDes);
    newSubject.setCredit_Points(cPoints);

    try {
        PreparedStatement pst = con.prepareStatement(
            "INSERT INTO subjects (Subject_Name, Subject_Description, Credit_Points) VALUES (?, ?, ?)"
        );

        pst.setString(1, newSubject.getSubject_Name());
        pst.setString(2, newSubject.getSubject_Description());
        pst.setString(3, newSubject.getCredit_Points());

        int rowsInserted = pst.executeUpdate();

        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(this, "Subject added successfully!");

            // Refresh the table with new data
            table_load();

            // Clear input fields after successful insertion
            clearFields();
            
        } else {
            JOptionPane.showMessageDialog(this, "Failed to add subject.");
        }
    } catch (SQLException ex) {
        Logger.getLogger(subjects.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
    }
    
    }//GEN-LAST:event_jButton_INSERTActionPerformed

    private void jButton_UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UPDATEActionPerformed
    // UPDATE OPERATION

    String subName, subDes, cPoints, subjectID;

    // Retrieve data from UI components
    subName = jTextField_subjectName.getText();
    subDes = jTextArea_subjectDes.getText();
    cPoints = jTextField_creditPoints.getText();

    // Check if any required field is empty
    if (jTextField_subjectName.getText().isEmpty() ||
            jTextArea_subjectDes.getText().isEmpty() || jTextField_creditPoints.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all the required fields.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Get the selected row index
    int selectedRowIndex = jTable_subjectsTable.getSelectedRow();
    
    // Check if a row is selected
    if (selectedRowIndex == -1) {
        JOptionPane.showMessageDialog(this, "Please select a subject to update.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // Retrieve Subject ID from the selected row
    subjectID = jTable_subjectsTable.getValueAt(selectedRowIndex, 0).toString();

    // Create a new subject object
    subject updatedSubject = new subject();
    updatedSubject.setSubject_Name(subName);
    updatedSubject.setSubject_Description(subDes);
    updatedSubject.setCredit_Points(cPoints);
    updatedSubject.setSubject_ID(subjectID);

    try {
        PreparedStatement pst = con.prepareStatement(
            "UPDATE subjects SET Subject_Name = ?, Subject_Description = ?, Credit_Points = ? WHERE Subject_ID = ?"
        );

        pst.setString(1, updatedSubject.getSubject_Name());
        pst.setString(2, updatedSubject.getSubject_Description());
        pst.setString(3, updatedSubject.getCredit_Points());
        pst.setString(4, updatedSubject.getSubject_ID());

        int rowsUpdated = pst.executeUpdate();

        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(this, "Subject updated successfully!");

            // Refresh the table with new data
            table_load();

            // Clear input fields after successful update
            clearFields();
            
        } else {
            JOptionPane.showMessageDialog(this, "Failed to update subject.");
        }
    } catch (SQLException ex) {
        Logger.getLogger(subjects.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
    }        
        
    }//GEN-LAST:event_jButton_UPDATEActionPerformed

    private void jTable_subjectsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_subjectsTableMouseClicked

        // Get the selected row index
        int rowIndex = jTable_subjectsTable.getSelectedRow();

        // Check if a row is selected
        if (rowIndex != -1) {
            // Get the model from the table
            DefaultTableModel model = (DefaultTableModel) jTable_subjectsTable.getModel();
        
            // Retrieve data from the selected row
            String subName = (String) model.getValueAt(rowIndex, 1); // Assuming Subject Name is at column index 1
            String subDes = (String) model.getValueAt(rowIndex, 2); // Assuming Subject Description is at column index 2
            String cPoints = (String) model.getValueAt(rowIndex, 3); // Assuming Credit Points is at column index 3
        
            // Populate the fields with the retrieved data
            jTextField_subjectName.setText(subName);
            jTextArea_subjectDes.setText(subDes);
            jTextField_creditPoints.setText(cPoints);
        }
    }//GEN-LAST:event_jTable_subjectsTableMouseClicked

    private void jButton_DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DELETEActionPerformed
    // DELETE OPERATION

    // Get the selected row index from the table
    int selectedRow = jTable_subjectsTable.getSelectedRow();

    // Check if a row is selected
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a subject to delete.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Get the subject ID from the selected row
    String subjectID = jTable_subjectsTable.getValueAt(selectedRow, 0).toString(); // Assuming subject ID is in the first column

    // Ask for confirmation before deleting
    int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this subject?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
    
    if (option == JOptionPane.YES_OPTION) {
        try {
            // Prepare the SQL statement to delete the subject record
            PreparedStatement pst = con.prepareStatement("DELETE FROM subjects WHERE Subject_ID = ?");
            pst.setString(1, subjectID);

            // Execute the SQL statement
            int rowsDeleted = pst.executeUpdate();

            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(this, "Subject deleted successfully!");
                // Refresh the table with updated data
                table_load();

                // Clear input fields after successful insertion
                clearFields();
                
            } else {
                JOptionPane.showMessageDialog(this, "Failed to delete subject.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(subjects.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }
    }//GEN-LAST:event_jButton_DELETEActionPerformed

    private void jButton_CLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CLEARActionPerformed
        clearFields();
    }//GEN-LAST:event_jButton_CLEARActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(subjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(subjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(subjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(subjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new subjects().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_CLEAR;
    private javax.swing.JButton jButton_DELETE;
    private javax.swing.JButton jButton_INSERT;
    private javax.swing.JButton jButton_UPDATE;
    private javax.swing.JButton jButton_back;
    private javax.swing.JLabel jLabel_background;
    private javax.swing.JLabel jLabel_creditPoints;
    private javax.swing.JLabel jLabel_pic;
    private javax.swing.JLabel jLabel_subjectDes1;
    private javax.swing.JLabel jLabel_subjectDes2;
    private javax.swing.JLabel jLabel_subjectName;
    private javax.swing.JMenuBar jMenuBar_menubar;
    private javax.swing.JMenuItem jMenuItem_close;
    private javax.swing.JMenuItem jMenuItem_dashboard;
    private javax.swing.JMenuItem jMenuItem_info;
    private javax.swing.JMenuItem jMenuItem_logout;
    private javax.swing.JMenu jMenu_about;
    private javax.swing.JMenu jMenu_navigation;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_registration;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_subjectsTable;
    private javax.swing.JTextArea jTextArea_subjectDes;
    private javax.swing.JTextField jTextField_creditPoints;
    private javax.swing.JTextField jTextField_subjectName;
    // End of variables declaration//GEN-END:variables

    // Method to load data into the table
    public void table_load(){

    Isubject subjectImpl = new subjectImpl();
       	ArrayList<subject> subjectList = subjectImpl.getAllSubject();

	// Convert the ArrayList to a DefaultTableModel
	DefaultTableModel model = new DefaultTableModel();
	model.addColumn("Subject ID");
	model.addColumn("Subject Name");
	model.addColumn("Subject Description");
	model.addColumn("Credit Points");

	for (subject subject : subjectList) {
            model.addRow(new Object[] {
		subject.getSubject_ID(),
		subject.getSubject_Name(),
                subject.getSubject_Description(),
                subject.getCredit_Points()
            });
	}

	jTable_subjectsTable.setModel(model);

    }

    private void clearFields() {
        // Clear text fields
        jTextField_subjectName.setText("");
        jTextField_creditPoints.setText("");
        jTextArea_subjectDes.setText("");

}
}