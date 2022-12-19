/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superdeliverysystem;

import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author My PC
 */
public class Tablebviewall1 extends javax.swing.JFrame { 
    static ProviderHomePage_2 ProviderHomePage_2=new ProviderHomePage_2();
  
    public Tablebviewall1() {
        initComponents();
        changetable ();
    }
      public void changetable (){
    
      
           connectionClass.getConnection();
           ResultSet ruseltset=connectionClass.getResrultset("select ORDERID, ISAPPROVED from PLACEORDER");

      jTable1.setModel(DbUtils.resultSetToTableModel(ruseltset));
      
   
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable()
        {
            @Override
            public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
                Component comp = super.prepareRenderer(renderer, row, column);
                Object g=getModel().getValueAt(row, column);
                comp.setBackground(Color.GREEN);
                comp.setForeground(Color.BLACK);
                if (isCellSelected(row,column )){
                    comp.setBackground(Color.WHITE);
                    comp.setForeground(Color.BLACK);

                }
                if(column==1){
                    if(g.equals("true") || g.equals("TRUE") ) {
                        comp.setForeground(Color.black);
                        comp.setBackground(Color.GREEN);
                    }
                    if (g.equals("false")|| g.equals("FALSE")){
                        comp.setBackground(Color.RED);
                        comp.setForeground(Color.BLACK);            }}
                return comp ;
            }

        }

        ;
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(850, 850));
        setMinimumSize(new java.awt.Dimension(850, 850));
        setSize(new java.awt.Dimension(850, 850));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(850, 850));
        jPanel1.setMinimumSize(new java.awt.Dimension(850, 850));
        jPanel1.setLayout(null);

        jTable1.setBackground(new java.awt.Color(153, 255, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "OrderID", "isAproved"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(60, 280, 720, 180);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(60, 630, 130, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1080, 810);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
       ProviderHomePage_2.setVisible(true);
//        neworder.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Tablebviewall1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablebviewall1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablebviewall1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablebviewall1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablebviewall1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
