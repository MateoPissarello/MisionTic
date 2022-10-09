/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MYSQL;
import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author mateo
 */
public class Clientes {
    public static Conexion con;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
con = new Conexion();
        //agregarFabricante();
        Scanner teclado = new Scanner (System.in);
        boolean bandera = true;
        while (bandera){
        System.out.println("------Menu de Opciones-------");
        System.out.println("""
                           \t1.Agregar un nuevo cliente.
                           \t2.Obtener clientes
                           \t3.Editar contrasenia de un cliente
                           \t4.Eliminar un cliente
                           \t5. Salir """);
        System.out.println("Seleccione una opcion :)");
        int opcion = teclado.nextInt();
        switch(opcion){
            case 1 -> agregarCliente();
            case 2 -> obtenerClientes();
            case 3 -> editarCliente();
            case 4 -> eliminarCliente();
            case 5 -> bandera = false;
            
            }
        }
    }
    public static void agregarCliente(){
        try {
            Scanner teclado = new Scanner (System.in);
            System.out.println("--------CRUD CLIENTES--------");
            System.out.println("Ingrese el alias del cliente: ");
            String alias =teclado.nextLine();
            System.out.println("Ingrese el nombre del cliente: ");
            String cliNombre = teclado.nextLine();
            System.out.println("Ingrese el apellido: ");
            String cliApellido = teclado.nextLine();
            System.out.println("Ingrese el email del cliente: ");
            String cliEmail = teclado.nextLine();
            System.out.println("Ingrese el celular del cliente: ");
            String cliCelular = teclado.nextLine();
            System.out.println("Ingrese la fecha de nacimiento del cliente: ");
            int cliNacimiento =Integer.parseInt(teclado.nextLine());
            System.out.println("Ingrese la contraseña del cliente (maximo 8 digitos): ");
            String cliContrasenia = teclado.nextLine();
            String sql = "INSERT INTO tbl_cliente(cli_alias, cli_nombre, cli_apellido, cli_email, cli_celular, cli_fecha_nacimiento, cli_contrasenia) VALUES ( ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement statement = con.con.prepareStatement(sql);
            statement.setString(1, alias);
            statement.setString(2, cliNombre);
            statement.setString(3, cliApellido);
            statement.setString(4, cliEmail);
            statement.setString(5, cliCelular);
            statement.setInt(6, cliNacimiento);
            statement.setString(7, cliContrasenia);
            
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    public static void obtenerClientes(){
        String sql = "SELECT * FROM tbl_cliente";
        Statement statement;
        try {
            statement = con.con.createStatement();
            ResultSet resultado = statement.executeQuery(sql);
        
            while (resultado.next()){
                String alias = resultado.getString(1);
                String nombre = resultado.getString(2);
                String apellido = resultado.getString(3);
                String email = resultado.getString(4);
                String celular = resultado.getString(5);
                String fechaNacimiento = resultado.getString(6);
                String contrasenia = resultado.getString(7);
                
                System.out.println("Alias: " + alias);
                System.out.println("Nombre: " + nombre);
                System.out.println("Apellido: " + apellido);
                System.out.println("Email: " + email);
                System.out.println("Celular: " + celular);
                System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
                System.out.println("Contrasenia: " + contrasenia);
                System.out.println("\n");
        }
            
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
    public static void editarCliente(){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese el alias del cliente: ");
        String alias = teclado.nextLine();
        System.out.println("Ingrese la nueva contrasenia (maximo 8 caraceteres): ");
        String nuevaContrasenia = teclado.nextLine();
        String sql = "UPDATE tbl_cliente SET cli_contrasenia = ? WHERE cli_alias = ?";
        try {
            PreparedStatement statement = con.con.prepareStatement(sql);
            statement.setString(1, nuevaContrasenia);
            statement.setString(2, alias);
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void eliminarCliente(){
        System.out.println("Ingrese el alias del cliente: ");
        Scanner teclado = new Scanner (System.in);
        String cliAlias =teclado.nextLine();
        String sql = "DELETE FROM tbl_cliente WHERE cli_alias = ? ";
        try {
            PreparedStatement statement = con.con.prepareStatement(sql);
            statement.setString(1, cliAlias);
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
    
}
