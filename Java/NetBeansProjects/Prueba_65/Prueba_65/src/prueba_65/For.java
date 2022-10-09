/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba_65;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class For {
    
    public static int sumaNumerosFor(int limite) {
        int suma = 0;
        for (int i = 0; i <= limite; i++) {
            suma = suma + i; 
//            suma += i;
        }        
        
        return suma;            
    }
    
    public static int sumaNumerosWhile(int limite) {        
        // Inicializacion
        int i = 0;
        int suma = 0;        
        // COndicion
        while (i <= limite) {
            // Bloque 
            suma = suma + i;            
            // Actualizacion
            i++;
        }
        return suma;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] frutas = new String[]{"Pera", "Manzana", "Naranja", "Guayaba"};
        String[] paises = new String[2000];
        
//        for (String fruta:frutas) {
//            System.out.println(fruta);            
//            if (fruta.equals("Manzana")) {
//                break;
//            }
//        }
        
        for (int i = 0; i < frutas.length; i++) {
            System.out.println(frutas[i]);
        }
        
        paises[0] = "Colombia";
        paises[1] = "Venezulea";
        paises[2] = "Brazil";
        

//        
//        System.out.println("Ingrese el limite: ");
//        Scanner teclado = new Scanner(System.in);
//        //int limite = teclado.nextInt();
//        int limite = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
//        System.out.println(sumaNumerosFor(limite));
    }
    
}
