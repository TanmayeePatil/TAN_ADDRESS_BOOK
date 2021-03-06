/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbookmngt_tan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author tanmayee
 */
public class AddNewPerson extends javax.swing.JFrame {

    /**
     * Creates new form AddNewPerson
     */
    PreparedStatement ps=null;
    ResultSet rs=null;
    Statement st=null;
    
    public AddNewPerson() throws SQLException, ClassNotFoundException {
        initComponents();
        Connection conn=DBCon.getConnection();
        st=conn.createStatement();
       String s="select * from address_books";
       rs=st.executeQuery(s);
       while(rs.next())
       {
            jComboBox_Select_AB.addItem(rs.getString(1)+" "+rs.getString(2));
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel_fname = new javax.swing.JLabel();
        jLabel_lname = new javax.swing.JLabel();
        jLabel_city = new javax.swing.JLabel();
        jLabel_state = new javax.swing.JLabel();
        jLabel_phnumber = new javax.swing.JLabel();
        jLabel_address = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabal_Select_AB = new javax.swing.JLabel();
        jComboBox_Select_AB = new javax.swing.JComboBox<>();
        jTextField_fname = new javax.swing.JTextField();
        jTextField_lname = new javax.swing.JTextField();
        jTextField_city = new javax.swing.JTextField();
        jTextField_state = new javax.swing.JTextField();
        jTextField_phnumber = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_address = new javax.swing.JTextArea();
        jTextField_zip = new javax.swing.JTextField();
        jLabel_zipcode = new javax.swing.JLabel();
        jButton_create = new javax.swing.JButton();
        jButton_cancel = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_fname.setText("FIRST NAME :");

        jLabel_lname.setText("LAST NAME :");

        jLabel_city.setText("CITY :");

        jLabel_state.setText("STATE :");

        jLabel_phnumber.setText("PHONE NUMBER :");

        jLabel_address.setText("ADDRESS :");

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jLabel7.setBackground(new java.awt.Color(255, 153, 0));
        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ADD NEW PERSON");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(246, 246, 246))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel7)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jLabal_Select_AB.setText("SELECT ADDRESS BOOK :");

        jTextArea_address.setColumns(20);
        jTextArea_address.setRows(5);
        jScrollPane2.setViewportView(jTextArea_address);

        jLabel_zipcode.setText("ZIP CODE :");

        jButton_create.setBackground(new java.awt.Color(153, 153, 153));
        jButton_create.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton_create.setForeground(new java.awt.Color(255, 255, 255));
        jButton_create.setText("CREATE");
        jButton_create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_createMouseClicked(evt);
            }
        });

        jButton_cancel.setBackground(new java.awt.Color(153, 153, 153));
        jButton_cancel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton_cancel.setForeground(new java.awt.Color(255, 255, 255));
        jButton_cancel.setText("CANCEL");
        jButton_cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_cancelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabal_Select_AB, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_fname, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_city, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_address, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_state, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_Select_AB, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField_city, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                        .addComponent(jTextField_fname)
                                        .addComponent(jTextField_state))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel_lname)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextField_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel_zipcode)
                                                .addComponent(jLabel_phnumber))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextField_phnumber, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                                .addComponent(jTextField_zip))))
                                    .addGap(22, 22, 22)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(jButton_create)
                        .addGap(42, 42, 42)
                        .addComponent(jButton_cancel)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jTextField_lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_zip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_zipcode)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabal_Select_AB)
                            .addComponent(jComboBox_Select_AB, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_fname)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField_fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel_lname)))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_state)
                            .addComponent(jLabel_phnumber)
                            .addComponent(jTextField_phnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_city))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_address)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_create)
                    .addComponent(jButton_cancel))
                .addGap(21, 21, 21))
        );

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

        setSize(new java.awt.Dimension(781, 462));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_cancelMouseClicked
        // TODO add your handling code here:
        this.dispose();
        HomePage hp=new HomePage();
        hp.setVisible(true);
        
    }//GEN-LAST:event_jButton_cancelMouseClicked

    private void jButton_createMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_createMouseClicked
        try {
            // TODO add your handling code here:
            Connection conn=DBCon.getConnection();
            ps=conn.prepareStatement("insert into details_person(first_name,last_name,address_person,city,state,zip,ph_number,a_id)values(?,?,?,?,?,?,?,?)");
            ps.setString(1,jTextField_fname.getText());
            ps.setString(2,jTextField_lname.getText());
            ps.setString(3,jTextArea_address.getText());
            ps.setString(4,jTextField_city.getText());
            ps.setString(5,jTextField_state.getText());
            ps.setString(6,jTextField_zip.getText());
            ps.setString(7,jTextField_phnumber.getText());
            String selectedAB=(String)jComboBox_Select_AB.getSelectedItem();
            String first_word=selectedAB.split(" ")[0];
            ps.setString(8,first_word);

            int val=ps.executeUpdate();
		if(val>=1){
                   JOptionPane.showMessageDialog(this, "Added new person !!!");
                    jTextField_fname.setText("");
                    jTextField_lname.setText("");
                    jTextArea_address.setText("");
                    jTextField_city.setText("");
                    jTextField_state.setText("");
                    jTextField_zip.setText("");
                    jTextField_phnumber.setText("");
                }
		else
		   JOptionPane.showMessageDialog(this, "ERROR!!! Can't add new person.");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AddNewPerson.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton_createMouseClicked

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
            java.util.logging.Logger.getLogger(AddNewPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new AddNewPerson().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(AddNewPerson.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddNewPerson.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_cancel;
    private javax.swing.JButton jButton_create;
    private javax.swing.JComboBox<String> jComboBox_Select_AB;
    private javax.swing.JLabel jLabal_Select_AB;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_address;
    private javax.swing.JLabel jLabel_city;
    private javax.swing.JLabel jLabel_fname;
    private javax.swing.JLabel jLabel_lname;
    private javax.swing.JLabel jLabel_phnumber;
    private javax.swing.JLabel jLabel_state;
    private javax.swing.JLabel jLabel_zipcode;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea_address;
    private javax.swing.JTextField jTextField_city;
    private javax.swing.JTextField jTextField_fname;
    private javax.swing.JTextField jTextField_lname;
    private javax.swing.JTextField jTextField_phnumber;
    private javax.swing.JTextField jTextField_state;
    private javax.swing.JTextField jTextField_zip;
    // End of variables declaration//GEN-END:variables
}
