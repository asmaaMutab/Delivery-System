/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superdeliverysystem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//import superdeliverysystem.SuperDeliverySystem;

/**
 *
 * @author Aziza
 */
public class NewOrder extends javax.swing.JFrame {
BenefiterHomePage_2 BenefiterHomePage_2=new BenefiterHomePage_2();
    static String Service_Type;
    static String size;

    static String PickUp;
    static String Delivery;
    static String Description;
    static String ID;

    connectionClass c = new connectionClass();

    /**
     * Creates new form NewOrder
     */
    public NewOrder() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nwe Order");
        setPreferredSize(new java.awt.Dimension(850, 850));
        setSize(new java.awt.Dimension(850, 850));
        getContentPane().setLayout(null);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 100, 500, 0);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 90, 530, 0);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(850, 850));
        jPanel1.setMinimumSize(new java.awt.Dimension(850, 850));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 850));
        jPanel1.setLayout(null);

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(460, 720, 130, 40);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 720, 130, 40);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(130, 580, 390, 96);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(180, 450, 310, 26);

        jLabel4.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel4.setText("Description");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 620, 100, 17);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(180, 510, 310, 26);

        jLabel3.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel3.setText("Deliver To");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 510, 90, 17);

        jLabel2.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel2.setText("Pickup From");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 450, 90, 17);

        jRadioButton3.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jRadioButton3.setText("Small");
        jRadioButton3.setToolTipText("The cost will be 10 Rs because you select small car");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(20, 370, 71, 29);

        jRadioButton4.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jRadioButton4.setText("Large");
        jRadioButton4.setToolTipText("The cost will be 20 Rs because you select Large car");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton4);
        jRadioButton4.setBounds(120, 370, 71, 29);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(10, 180, 410, 2);

        jTextField4.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 51, 51));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(0, 140, 500, 21);

        jLabel5.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel5.setText("Size :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 320, 80, 17);

        jRadioButton1.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jRadioButton1.setText("People");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(0, 250, 140, 29);

        jRadioButton2.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jRadioButton2.setText("Goods");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(140, 250, 200, 30);

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel1.setText("Type");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 210, 32, 17);

        jLabel6.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel6.setText("OrderID :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 60, 100, 17);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(120, 60, 190, 26);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 890, 860);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        if (jRadioButton1.isSelected()) {
            Service_Type = "Peoble";

        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        if (jRadioButton2.isSelected()) {
            Service_Type = "Goods";
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
      


    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        if (jRadioButton3.isSelected()) {
            size = "small";

        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
        if (jRadioButton4.isSelected()) {
            size = "Large";

        }
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
 
        if (evt.getSource() == jButton2) {
            PickUp = jTextField1.getText();
            Delivery = jTextField2.getText();
            Description = jTextArea1.getText();
         ID = jTextField3.getText();

        
             if (ID.length() > 6 || ID.length() < 6) {

                jTextField4.setText("OrderID lenght must equal 6 incloude letter and digit");
                
               jTextField1.setText(null);
                jTextField2.setText(null);
                jTextField3.setText(null);
            } else if (PickUp.isEmpty() || Delivery.isEmpty() || ID.length() == 0) {
                jTextField4.setText("You must inter data in all record ");
          jTextField1.setText(null);
                jTextField2.setText(null);
                jTextField3.setText(null);
            }

            if (ID.length() == 6) {
                connectionClass.getConnection();
                int state_order1 = connectionClass.getResrultsetupdate("insert into PLACEORDER (ORDERID ,DESCRIPTION,PICKUPFROM ,DELIVERTO , TYPE_ORDER ,CAR_SIZE) values ('" + ID + "','" + Description + "','" + PickUp + "','" + Delivery + "','" + Service_Type + "' ,'" + size + "')");

                if (state_order1 == 0) {
                    JOptionPane.showMessageDialog(null, "SystemError", "Error , invalied record value", JOptionPane.ERROR);
                } else if (state_order1 != 0) {
                    jTextField4.setText("Inserted Successfully");
                 

                }
            }

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
BenefiterHomePage_2.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:.
        String OrderID = jTextField3.getText();

        if (OrderID.length() > 8) {
            jLabel7.setText("OrderId must be less than 8 and start with ");
            jTextField3.setText(null);

        } else if (OrderID.length() == 0) {
            System.out.println("Inert OrderId then try again ");
            jTextField3.setText(null);

        }

    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

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
            java.util.logging.Logger.getLogger(NewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                connectionClass.getConnection();

                new NewOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
