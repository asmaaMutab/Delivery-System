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
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author HP
 */
public class SelectOrder extends javax.swing.JFrame {
static ProviderHomePage_2  ProviderHomePage_2 =new ProviderHomePage_2 ();
   
    public SelectOrder() {
        initComponents();
   
        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        orderid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        des = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pickup = new javax.swing.JTextField();
        deleverto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        carsize = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ordertype = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Provider Select  Orders");
        setMaximumSize(new java.awt.Dimension(850, 850));
        setMinimumSize(new java.awt.Dimension(850, 850));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setForeground(new java.awt.Color(51, 51, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(850, 850));
        jPanel2.setMinimumSize(new java.awt.Dimension(850, 850));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel2.setLayout(null);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(153, 255, 102));
        jTable1.setFont(new java.awt.Font("Kristen ITC", 1, 10)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.setCellSelectionEnabled(true);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(280, 280, 540, 210);

        jLabel2.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel2.setText("OrderID");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 80, 70, 20);

        orderid.setEditable(false);
        orderid.setBackground(new java.awt.Color(0, 204, 204));
        orderid.setFont(new java.awt.Font("Kristen ITC", 1, 10)); // NOI18N
        orderid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderidActionPerformed(evt);
            }
        });
        jPanel2.add(orderid);
        orderid.setBounds(110, 80, 130, 30);

        jLabel5.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel5.setText("Description");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 160, 90, 20);

        des.setEditable(false);
        des.setBackground(new java.awt.Color(0, 204, 204));
        des.setFont(new java.awt.Font("Kristen ITC", 1, 10)); // NOI18N
        des.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desActionPerformed(evt);
            }
        });
        jPanel2.add(des);
        des.setBounds(110, 150, 130, 30);

        jLabel3.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel3.setText("Pickup");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 230, 50, 20);

        pickup.setEditable(false);
        pickup.setBackground(new java.awt.Color(0, 204, 204));
        pickup.setFont(new java.awt.Font("Kristen ITC", 1, 10)); // NOI18N
        pickup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickupActionPerformed(evt);
            }
        });
        jPanel2.add(pickup);
        pickup.setBounds(110, 230, 130, 30);

        deleverto.setEditable(false);
        deleverto.setBackground(new java.awt.Color(0, 204, 204));
        deleverto.setFont(new java.awt.Font("Kristen ITC", 1, 10)); // NOI18N
        deleverto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delevertoActionPerformed(evt);
            }
        });
        jPanel2.add(deleverto);
        deleverto.setBounds(110, 300, 130, 30);

        jLabel4.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel4.setText("Price");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 570, 50, 20);

        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        jPanel2.add(price);
        price.setBounds(90, 560, 70, 30);

        jLabel6.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel6.setText("SR");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(190, 570, 50, 20);

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel1.setText("Delever to");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 300, 80, 20);

        jLabel7.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel7.setText("car size");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 420, 90, 20);

        carsize.setBackground(new java.awt.Color(0, 204, 204));
        carsize.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jPanel2.add(carsize);
        carsize.setBounds(120, 410, 120, 30);

        jLabel8.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel8.setText("Order Type ");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 360, 90, 20);

        ordertype.setBackground(new java.awt.Color(0, 204, 204));
        ordertype.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jPanel2.add(ordertype);
        ordertype.setBounds(120, 350, 120, 30);

        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jButton4.setText("Home");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(30, 670, 130, 40);

        jButton3.setBackground(new java.awt.Color(255, 255, 0));
        jButton3.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jButton3.setText("ubdate");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(630, 670, 130, 40);

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jButton1.setText("show all orders");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(340, 670, 150, 40);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(20, 470, 230, 20);

        jRadioButton2.setBackground(new java.awt.Color(0, 204, 204));
        jRadioButton2.setFont(new java.awt.Font("Kristen ITC", 1, 10)); // NOI18N
        jRadioButton2.setText("Not Approve");
        jPanel2.add(jRadioButton2);
        jRadioButton2.setBounds(130, 500, 110, 29);

        jRadioButton1.setBackground(new java.awt.Color(0, 204, 204));
        jRadioButton1.setFont(new java.awt.Font("Kristen ITC", 1, 10)); // NOI18N
        jRadioButton1.setText("Approve");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton1);
        jRadioButton1.setBounds(20, 500, 90, 29);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 850, 850);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
     ResultSet state_rs=   connectionClass.getResrultset("select ORDERID ,DESCRIPTION ,PICKUPFROM ,  DELIVERTO , TYPE_ORDER ,CAR_SIZE,ISAPPROVED,PRICE from PLACEORDER");
    
   
        try {
 
        
            
           while(state_rs.next())
           {
               
                jTable1.setModel(DbUtils.resultSetToTableModel(state_rs));

//               
        } 
          
    }catch (SQLException ex) {
            Logger.getLogger(SelectOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel model1=(DefaultTableModel) jTable1.getModel();
        int selectedrowindex=jTable1.getSelectedRow();
        orderid.setText(model1.getValueAt(selectedrowindex, 0).toString());
         des.setText(model1.getValueAt(selectedrowindex, 1).toString());
          pickup.setText(model1.getValueAt(selectedrowindex, 2).toString());
           deleverto.setText(model1.getValueAt(selectedrowindex, 3).toString());
        ordertype.setText(model1.getValueAt(selectedrowindex, 4).toString());
          carsize.setText(model1.getValueAt(selectedrowindex, 5).toString());
         
         // price.setText(model1.getValueAt(selectedrowindex, 7).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void delevertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delevertoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delevertoActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
if(jRadioButton1.isSelected()) {
String ordrrid=orderid.getText();

String price1=price.getText();
char p=price1.charAt(0);
boolean a=Character.isDigit(p);
if(a){


int state_=0;
int state_a=0;


 if (price1.length()>0) {

 state_=connectionClass.getResrultsetupdate("update PLACEORDER set ISAPPROVED='TRUE'where ORDERID='"+ordrrid+"'");
state_a=connectionClass.getResrultsetupdate("update PLACEORDER set PRICE='"+price1+"' where ORDERID='"+ordrrid+"'");
}
 if(price1.length()==0 || state_a==0 || state_==0  ){
   
JOptionPane.showMessageDialog(null, " invalid update please try again ");
}

if(state_>0 || state_a>0){
JOptionPane.showMessageDialog(null, "valid update");

}

}
else {
JOptionPane.showMessageDialog(null, "pricr must be number , try again ");

}}     
else{
String ordrrid=orderid.getText();
int state_=connectionClass.getResrultsetupdate("update PLACEORDER set ISAPPROVED='False'where ORDERID='"+ordrrid+"'"); state_=connectionClass.getResrultsetupdate("update PLACEORDER set ISAPPROVED='TRUE'where ORDERID='"+ordrrid+"'");
if(state_==0 ){
JOptionPane.showMessageDialog(null, "invalid update");

} 
else if (state_>0 ){
JOptionPane.showMessageDialog(null, "valid update");

}
}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        ProviderHomePage_2 .setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void orderidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderidActionPerformed

    private void desActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desActionPerformed

    private void pickupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pickupActionPerformed

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
            java.util.logging.Logger.getLogger(SelectOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectOrder().setVisible(true);
                connectionClass.getConnection();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField carsize;
    private javax.swing.JTextField deleverto;
    private javax.swing.JTextField des;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField orderid;
    private javax.swing.JTextField ordertype;
    private javax.swing.JTextField pickup;
    private javax.swing.JTextField price;
    // End of variables declaration//GEN-END:variables
}
