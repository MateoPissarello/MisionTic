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
public class Principal {
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
                           \t1.Agregar un nuevo fabricante.
                           \t2.Obtener fabricantes
                           \t3.Editar nombre de fabricante
                           \t4.Eliminar un fabricante
                           \t5. Salir """);
        System.out.println("Seleccione una opcion :)");
        int opcion = teclado.nextInt();
        switch(opcion){
            case 1 -> agregarFabricante();
            case 2 -> consultarFabricantes();
            case 3 -> editarFabricante();
            case 4 -> eliminarUnFabricante();
            case 5 -> bandera = false;
            
            }
        }
        
    }
    
    public static void agregarFabricante(){
        try {
            Scanner teclado = new Scanner (System.in);
            System.out.println("--------CRUD FABRICANTE--------");
            System.out.println("Ingrese el codigo del fabricante: ");
            int codigo = Integer.parseInt(teclado.nextLine());
            System.out.println("Ingrese el nombre del fabricante: ");
            String nombreFab = teclado.nextLine();
            System.out.println("Ingrese la direccion: ");
            String direccionFab = teclado.nextLine();
            System.out.println("Ingrese el numero de telefono del fabricante: ");
            String numeroFab = teclado.nextLine();
            String sql = "insert into tbl_fabricante(fab_codigo, fab_nombre, fab_direccion, fab_telefono) VALUES(?, ?, ?, ?);";
            PreparedStatement statement = con.con.prepareStatement(sql);
            statement.setInt(1, codigo);
            statement.setString(2, nombreFab);
            statement.setString(3, direccionFab);
            statement.setString(4, numeroFab);
            
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void consultarFabricantes(){
        String sql = "SELECT * FROM tbl_fabricante";
        Statement statement;
        try {
            statement = con.con.createStatement();
            ResultSet resultado = statement.executeQuery(sql);
        
            while (resultado.next()){
                String codigo = resultado.getString(1);
                String nombre = resultado.getString(2);
                String direccion = resultado.getString(3);
                String telefono = resultado.getString(4);
                
                System.out.println("Codigo: " + codigo);
                System.out.println("Nombre: " + nombre);
                System.out.println("Direccion: " + direccion);
                System.out.println("Telefono: " + telefono);
                System.out.println("\n");
        }
            
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void editarFabricante(){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese el nuevo nombre que le quiere asignar al fabricante: ");
        String nuevoNombre = teclado.nextLine();
        System.out.println("Ingrese el codigo del fabricante al cual desea cambiar el nombre: ");
        int codigoFab = Integer.parseInt(teclado.nextLine());
        String sql = "UPDATE tbl_fabricante SET fab_nombre = ? WHERE fab_codigo = ?";
        try {
            PreparedStatement statement = con.con.prepareStatement(sql);
            statement.setString(1, nuevoNombre);
            statement.setInt(2, codigoFab);
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void eliminarUnFabricante(){
        System.out.println("Ingrese el codigo del fabricante: ");
        Scanner teclado = new Scanner (System.in);
        int codigoFab = Integer.parseInt(teclado.nextLine());
        String sql = "DELETE FROM tbl_fabricante WHERE fab_codigo = " + codigoFab;
        try {
            PreparedStatement statement = con.con.prepareStatement(sql);
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
