/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.invertircadena;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class InvertirCadena {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese la cadena: ");
        String cadena = teclado.nextLine();
        System.out.println(invertirCadena(cadena));
    }
    
    private static String invertirCadena (String cadena){
        String cadenaInvertida = "";
        for (int i = cadena.length() - 1; i >= 0; i --){
            cadenaInvertida = cadenaInvertida + cadena.charAt(i);
        }
        return cadenaInvertida;
        
    }
    
}
