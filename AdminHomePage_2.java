package superdeliverysystem;

//import az.Admin_ViewRegisterationRequests_3;
//import az.Admin_ViewCarriedOutOrders_3;
//import az.Admin_ViewFeedbackMessages_3;
//import az.Admin_ViewAllServices_3;
//import az.Admin_ViewAllProviders_3;
import java.awt.Color;
import javax.swing.JOptionPane;

public class AdminHomePage_2 extends javax.swing.JFrame {

    /**
     * Creates new form AdminHomePage
     */
    public AdminHomePage_2() {
        initComponents();
        //jPanel1.setBackground(new Color(0, 0, 0, 43));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setBorder(null);
        jInternalFrame1.setTitle("Admin Home Page");
        jInternalFrame1.setMaximumSize(new java.awt.Dimension(850, 850));
        jInternalFrame1.setMinimumSize(new java.awt.Dimension(850, 850));
        jInternalFrame1.setPreferredSize(new java.awt.Dimension(850, 850));
        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(null);

        jLabel8.setBackground(new java.awt.Color(153, 0, 51));
        jLabel8.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("View");
        jInternalFrame1.getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 330, 110, 20);

        jLabel9.setFont(new java.awt.Font("Kristen ITC", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 102));
        jLabel9.setText("Welcome, Admin Tameem");
        jInternalFrame1.getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 260, 420, 33);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setForeground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(null);

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(40, 580, 161, 29);

        jButton3.setBackground(new java.awt.Color(255, 255, 51));
        jButton3.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 51));
        jButton3.setText("Go");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(320, 380, 100, 30);

        jComboBox1.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " All accounts", " Providers ", " Benefiter ", " Registeration Requests", " All Services ", " Carried Out Services ", " Feedback Messeges" }));
        jComboBox1.setSelectedItem(jComboBox1);
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(40, 380, 190, 25);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aziza\\Desktop\\Background\\logo3.png")); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(550, 10, 290, 320);

        jInternalFrame1.getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 850, 910);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jInternalFrame1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        switch (jComboBox1.getSelectedIndex()) {
            case 0:
                setVisible(false);
                viewAllAccountsMethod_0();
                break;
            case 1:
                setVisible(false);
                viewAllProvidersMethod_1();
                break;
            case 2:
                setVisible(false);
                viewAllBenefitersMethod_2();
                break;
            case 3:
                setVisible(false);
                viewRegisterationRequestsMethod_4();
                break;
            case 4:
                setVisible(false);
                viewAllServicesMethod_3();
                break;
            case 5:
                setVisible(false);
                ViewCarriedOutOrdersMethod_7();
                break;
            case 6:
                setVisible(false);
                viewFeedbackMessagesMethod_8();
                break;
            default:
                JOptionPane.showMessageDialog(null, "invalid Entree.");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        LoginPage_1 LoginPage_1 = new LoginPage_1();
        LoginPage_1.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    public void viewAllAccountsMethod_0() {
        Admin_ViewAllAccounts_3 Admin_ViewAllAccounts_3 = new Admin_ViewAllAccounts_3();
        Admin_ViewAllAccounts_3.setVisible(true);
    }

    public void viewAllProvidersMethod_1() {
        Admin_ViewAllProviders_3 Admin_ViewAllProviders_3 = new Admin_ViewAllProviders_3();
        Admin_ViewAllProviders_3.setVisible(true);
    }

    public void viewAllBenefitersMethod_2() {
        Admin_ViewAllBenefiter_3 Admin_ViewAllBenefiter_3 = new Admin_ViewAllBenefiter_3();
        Admin_ViewAllBenefiter_3.setVisible(true);
    }

    public void viewAllServicesMethod_3() {
        Admin_ViewAllServices_3 Admin_ViewAllServices_3 = new Admin_ViewAllServices_3();
        Admin_ViewAllServices_3.setVisible(true);
    }

    public void viewRegisterationRequestsMethod_4() {
        Admin_ViewRegisterationRequests_3 Admin_ViewRegisterationRequests_3 = new Admin_ViewRegisterationRequests_3();
        Admin_ViewRegisterationRequests_3.setVisible(true);
    }

    public void ViewCarriedOutOrdersMethod_7() {
        Admin_ViewCarriedOutOrders_3 Admin_ViewCarriedOutOrders_3 = new Admin_ViewCarriedOutOrders_3();
        Admin_ViewCarriedOutOrders_3.setVisible(true);
    }

    public void viewFeedbackMessagesMethod_8() {
        Admin_ViewFeedbackMessages_3 Admin_ViewFeedbackMessages_3 = new Admin_ViewFeedbackMessages_3();
        Admin_ViewFeedbackMessages_3.setVisible(true);
    }

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
            //java.util.logging.Logger.getLogger(EditAccount_provider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            // java.util.logging.Logger.getLogger(EditAccount_provider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            // java.util.logging.Logger.getLogger(EditAccount_provider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            //java.util.logging.Logger.getLogger(EditAccount_provider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHomePage_2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
