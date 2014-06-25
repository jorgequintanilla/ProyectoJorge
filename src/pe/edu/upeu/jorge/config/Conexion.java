/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.jorge.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author alum.fial7
 */
public class Conexion {
    public static Connection getConex;
   public static Connection GetConexion() throws ClassNotFoundException, SQLException{
    Connection cx=null;
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost/bd_visitas";
        String usuario="root";
        String clave ="root";
        cx =(Connection) DriverManager.getConnection(url,usuario,clave);
        return cx;
}
}
