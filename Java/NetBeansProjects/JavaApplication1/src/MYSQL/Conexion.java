/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MYSQL;
import java.sql.*;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author mateo
 */
public class Conexion {
    String dbUrl = "jdbc:mysql://localhost:3306/reto4_65";
    String nombre = "root";
    String contrasenia = "admin";
    Connection con;
    
    public Conexion(){
        try {
            con = DriverManager.getConnection(dbUrl, nombre, contrasenia);
            if (con != null){
                System.out.println("Conectado...");
            }else{
                System.out.println("No conectado...");
            }
        } catch (SQLException ex) {
            System.out.println("No conectado (excepcion)...");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void agregarRegistro(String sql){
        try {
            PreparedStatement statement = this.con.prepareStatement(sql);
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
