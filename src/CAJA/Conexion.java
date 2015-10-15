package CAJA;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Adolfo
 */
public class Conexion {
    Connection cn = null;
    
    public Connection conectar(){
        try {
          Class.forName("org.gjt.mm.mysql.Driver");
          cn=DriverManager.getConnection("jdbc:mysql://localhost/lapradera","root","");
          //JOptionPane.showMessageDialog(null, "CONEXION EXITOSA");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,"Error"+e);
        }
        return cn;
    }
}
