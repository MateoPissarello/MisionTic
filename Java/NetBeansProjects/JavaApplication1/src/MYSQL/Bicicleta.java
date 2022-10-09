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
public class Bicicleta {
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
                           \t1.Agregar una nueva bicicleta.
                           \t2.Obtener bicicletas
                           \t3.Editar precio de bicicletas
                           \t4.Eliminar una bicicleta
                           \t5. Salir """);
        System.out.println("Seleccione una opcion :)");
        int opcion = teclado.nextInt();
                switch(opcion){
            case 1 -> agregarBicicleta();
            case 2 -> consultarBicicletas();
            case 3 -> editarBicicleta();
            case 4 -> eliminarBicicleta();
            case 5 -> bandera = false;
            
            }
        }
    }
    
     public static void agregarBicicleta(){
        try {
            Scanner teclado = new Scanner (System.in);
            System.out.println("--------CRUD BICICLETA--------");
            System.out.println("Ingrese el codigo del fabricante: ");
            int codigoFab = Integer.parseInt(teclado.nextLine());
            System.out.println("Ingrese el precio: ");
            String precioBic = teclado.nextLine();
            System.out.println("Ingrese el anio de fabricacion: ");
            String anioBic = teclado.nextLine();
            String sql = "INSERT INTO tbl_bicicleta(fab_codigo, bic_precio, bic_anio_construccion) VALUES(?, ?, ?);";
            PreparedStatement statement = con.con.prepareStatement(sql);
            statement.setInt(1, codigoFab);
            statement.setString(2, precioBic);
            statement.setString(3, anioBic);
            
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Bicicleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void consultarBicicletas(){
        String sql = "SELECT * FROM tbl_bicicleta";
        Statement statement;
        try {
            statement = con.con.createStatement();
            ResultSet resultado = statement.executeQuery(sql);
        
            while (resultado.next()){
                String referencia = resultado.getString(1);
                String codigo = resultado.getString(2);
                String precio = resultado.getString(3);
                String anioConstruccion = resultado.getString(4);
                
                System.out.println("Referencia: " + referencia);
                System.out.println("Codigo de Fabricante: " + codigo);
                System.out.println("Precio: " + precio);
                System.out.println("Año de Construccion: " + anioConstruccion);
                System.out.println("\n");
        }
            
        } catch (SQLException ex) {
            Logger.getLogger(Bicicleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void editarBicicleta(){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese el nuevo precio que le quiere asignar a la bicicleta: ");
        String nuevoPrecio = teclado.nextLine();
        System.out.println("Ingrese la referencia de la bicicleta que desea: ");
        int referenciaBic = Integer.parseInt(teclado.nextLine());
        String sql = "UPDATE tbl_bicicleta SET bic_precio = ? WHERE bic_referencia = ?";
        try {
            PreparedStatement statement = con.con.prepareStatement(sql);
            statement.setString(1, nuevoPrecio);
            statement.setInt(2, referenciaBic);
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Bicicleta.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
        public static void eliminarBicicleta(){
        System.out.println("Ingrese la referencia de la Bicicleta: ");
        Scanner teclado = new Scanner (System.in);
        int bicReferencia = Integer.parseInt(teclado.nextLine());
        String sql = "DELETE FROM tbl_bicicleta WHERE bic_referencia = " + bicReferencia;
        try {
            PreparedStatement statement = con.con.prepareStatement(sql);
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Bicicleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
