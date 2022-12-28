/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superdeliverysystem;

/**
 *
 * @author aseer
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class connectionClass {
public static String user ="";
public static String pass="";
public static Connection con=null;
public static ResultSet res;


public static  Connection getConnection(){
try{
  // connection information
con=DriverManager.getConnection("jdbc:derby://localhost:1527/sds", "tameem","sds123" );


}   catch (SQLException ex) {
  // handle SQLException for connection step
        Logger.getLogger(connectionClass.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "DataBase", "DataBase not conmected  ",JOptionPane.ERROR );
    }
return con;
}
public static void disconnect(){

try {
con=DriverManager.getConnection("jdbc:derby://localhost:1527/sds", "tameem","sds123" );
con.close();


}   catch (SQLException ex) {
        Logger.getLogger(connectionClass.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "DataBase", "DataBase not close ",JOptionPane.ERROR );
    }

}
public static ResultSet getResrultset(String query){
    //select
  ResultSet resultset = null;
    try {
        Statement s=con.createStatement();
        resultset =s.executeQuery(query);
    } catch (SQLException ex) {
        Logger.getLogger(connectionClass.class.getName()).log(Level.SEVERE, null, ex);
    }
    return resultset;
}
public static int getResrultsetupdate(String query){
int state = 0 ;
    try {
        Statement s=con.createStatement();
         state =s.executeUpdate(query);
    } catch (SQLException ex) {
        Logger.getLogger(connectionClass.class.getName()).log(Level.SEVERE, null, ex);
    }
    return state;// rerturn the state value

}



}
