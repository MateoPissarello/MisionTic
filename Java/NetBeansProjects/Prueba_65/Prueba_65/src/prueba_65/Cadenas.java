/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba_65;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Cadenas {

    
    public static String invertirCadena(String cadena) {
        // bicicleta        
        String cadenaInvertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida = cadenaInvertida + cadena.charAt(i);
        }        
        return  cadenaInvertida;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra = teclado.nextLine();
        System.out.println(invertirCadena(palabra));
        
         StringBuilder input1 = new StringBuilder();
 
        // append a string into StringBuilder input1
        input1.append(palabra);
 
        // reverse StringBuilder input1
        input1.reverse();
 
        // print reversed String
        System.out.println(input1);
        
        char caracter = 'A';
        
        String nombre = "Hola mundo";
        String segundoNombre = new String("mundo");
        
        System.out.println(nombre.length());
        System.out.println(nombre.substring(2));
        
        String[] partes = nombre.split(" ");
        System.out.println(partes[1]);
        
        
        
        
        
    }
    
}
