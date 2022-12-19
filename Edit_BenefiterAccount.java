/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superdeliverysystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.*;
import superdeliverysystem.SuperDeliverySystem;
import superdeliverysystem.connectionClass;

public class Edit_BenefiterAccount extends JFrame {

    static BenefiterHomePage_2 BenefiterHomePage_2 = new BenefiterHomePage_2();

    public Edit_BenefiterAccount() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lastname = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        confirmpassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edit Account");
        setMinimumSize(new java.awt.Dimension(850, 850));
        setSize(new java.awt.Dimension(850, 850));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(850, 850));
        jPanel1.setMinimumSize(new java.awt.Dimension(850, 850));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 850));
        jPanel1.setLayout(null);

        label1.setBackground(new java.awt.Color(0, 204, 204));
        label1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label1.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(51, 51, 51));
        label1.setText("Edit Account");
        jPanel1.add(label1);
        label1.setBounds(40, 140, 200, 29);

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(430, 650, 150, 40);

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setText("Done");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(620, 650, 150, 40);

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("First Name");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 370, 90, 22);

        jLabel2.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Last Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(401, 370, 90, 17);

        jLabel4.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Confirm Password");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(380, 480, 130, 17);

        jLabel3.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Password");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(29, 480, 70, 17);

        firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameActionPerformed(evt);
            }
        });
        jPanel1.add(firstname);
        firstname.setBounds(140, 360, 180, 30);

        jLabel5.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Phone Number");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(390, 260, 110, 17);

        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });
        jPanel1.add(lastname);
        lastname.setBounds(540, 360, 190, 30);
        jPanel1.add(phone);
        phone.setBounds(530, 250, 200, 30);
        jPanel1.add(password);
        password.setBounds(140, 466, 180, 30);
        jPanel1.add(confirmpassword);
        confirmpassword.setBounds(540, 470, 190, 30);

        jLabel6.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel6.setText("Email");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 260, 80, 20);
        jPanel1.add(email);
        email.setBounds(140, 250, 180, 30);

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setText("Home");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(20, 659, 150, 40);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(30, 180, 550, 2);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 850, 850);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String sql, sql2;
        int result1, result2;

        if (firstname.getText().equalsIgnoreCase("") || lastname.getText().equalsIgnoreCase("") || password.getText().equalsIgnoreCase("") || confirmpassword.getText().equalsIgnoreCase("") || phone.getText().equalsIgnoreCase("") || email.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Make sure you have filled all required fields.", "Entry Error", JOptionPane.ERROR_MESSAGE);
        } else if (!(Arrays.equals(password.getPassword(), confirmpassword.getPassword()))) {
            JOptionPane.showMessageDialog(null, "Password fields do not match, please try again.", "OOPS", JOptionPane.ERROR_MESSAGE);
        } else {
            sql = "update account set firstname='" + firstname.getText() + "',lastname='" + lastname.getText() + "',password='" + password.getPassword().toString() + "',phonenumber='" + phone.getText() + "'where email='" + email.getText() + "'";
            connectionClass.getConnection();
            result1 = connectionClass.getResrultsetupdate(sql);

            if (result1 > 0) {
                JOptionPane.showMessageDialog(null, "Change succesfully", "Success!", JOptionPane.OK_OPTION);
                setVisible(false);
                BenefiterHomePage_2.setVisible(true);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        BenefiterHomePage_2.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        BenefiterHomePage_2.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Edit_BenefiterAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit_BenefiterAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit_BenefiterAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit_BenefiterAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit_BenefiterAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmpassword;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private java.awt.Label label1;
    private javax.swing.JTextField lastname;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phone;
    // End of variables declaration//GEN-END:variables
}
