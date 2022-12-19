/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superdeliverysystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author My PC
 */
public class SelectedID1 extends javax.swing.JFrame {
static BenefiterHomePage_2  BenefiterHomePage_2 =new BenefiterHomePage_2 ();
    /**
     * Creates new form SelectedID
     */
    public SelectedID1() {
        initComponents();
         
    }

    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Traking Order");
        setMaximumSize(new java.awt.Dimension(850, 850));
        setMinimumSize(new java.awt.Dimension(850, 850));
        setSize(new java.awt.Dimension(850, 850));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(850, 850));
        jPanel1.setLayout(null);

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(50, 670, 150, 40);

        jLabel3.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jLabel3.setText(" From :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 550, 70, 30);

        jTextField3.setBorder(null);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(230, 550, 110, 30);

        jTextField2.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(230, 450, 110, 30);

        jLabel2.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jLabel2.setText("OrderID :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 450, 90, 20);

        jTextField4.setBorder(null);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(600, 550, 110, 30);

        jTextField5.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        jTextField5.setBorder(null);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(590, 440, 110, 30);

        jLabel4.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jLabel4.setText("To :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(490, 560, 50, 20);

        jLabel5.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jLabel5.setText("State :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(480, 440, 90, 20);

        jTextField6.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 51, 51));
        jTextField6.setBorder(null);
        jTextField6.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField6.setEnabled(false);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6);
        jTextField6.setBounds(90, 370, 530, 30);

        jTextField1.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(320, 260, 130, 30);

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jLabel1.setText("OrderID :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 270, 100, 20);

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Search ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(560, 260, 120, 30);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(180, 330, 520, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 850, 850);

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    
    
    
    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      String id=jTextField1.getText();
     
       try {
           
         Connection con= connectionClass.getConnection();
//        
ResultSet state=connectionClass.getResrultset("select SERVICEID ,CURRENTLOCATION ,NEXTSTOP, ORDER_STATE  from SERVICE where SERVICEID='"+id+"'");
         
if (state.next()){
    
      
      
     jTextField6.setText(null);
 jTextField2.setText(id);
jTextField3.setText(state.getString("CURRENTLOCATION"));
 jTextField4.setText(state.getString("NEXTSTOP"));
      jTextField5.setText(state.getString("ORDER_STATE"));
 
}


else {
     if (id.length()==0){
      jTextField6.setText("please enter ID then try agin ");
         jTextField1.setText(null);
     jTextField1.setText(null);
jTextField2.setText(null);
jTextField3.setText(null);
jTextField4.setText(null);
jTextField5.setText(null);
        
      
      }
      else if (id.length()>6){
         jTextField6.setText("OrderID must be Less thsn 6 digit");
          jTextField1.setText(null);
          jTextField1.setText(null);
jTextField2.setText(null);
jTextField3.setText(null);
jTextField4.setText(null);
jTextField5.setText(null);
        
      }
      else if (id.length()<=6 &&id.length()!=0 ){
 jTextField6.setText("order ID not exist ");
jTextField1.setText(null);
jTextField2.setText(null);
jTextField3.setText(null);
jTextField4.setText(null);
jTextField5.setText(null);
        
}}
        
    } catch ( Exception ex) {
        Logger.getLogger( SelectedID1.class.getName()).log(Level.SEVERE, null,ex.getMessage());
        JOptionPane.showMessageDialog(null, "Error");
    }
    
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        BenefiterHomePage_2.setVisible(true);
       
//      neworder.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(SelectedID1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectedID1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectedID1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectedID1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectedID1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
