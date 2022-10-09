/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pruebas;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Pruebas {

    public static void main(String[] args) {
          System.out.println("\tEstudiante pregrado\n"
                + "\tNombre: "  +
                "\n\tEdad: " +  
                "\n\tPrograma: "  +
                "\n\tEtnia: "  +
                "\n\tCreditos aprobados: " );
        System.out.println("Ingrese la cadena: ");
        Scanner teclado = new Scanner (System.in);
        
        String cadena = teclado.nextLine();
        procesarComandos(cadena);
        
  
            
      

    }
    
    private static void procesarComandos(String comando){
        String[] nuevaCadena = comando.split("&");
        for (String nuevaCadena1 : nuevaCadena){
            System.out.println(nuevaCadena1);
            
        }
    }
}
