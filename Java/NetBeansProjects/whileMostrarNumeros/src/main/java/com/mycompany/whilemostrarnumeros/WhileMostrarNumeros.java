/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.whilemostrarnumeros;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class WhileMostrarNumeros {

    public static void main(String[] args) {
        mostrarNumeros();
        validarAbecedarioMayuscula();
    
    }
    /**
     * La funcion sirve para imprimir
     */
    private static void mostrarNumeros(){
        //Inicializacion
        int contador = 0;
        //Condición
        while (contador <= 10){
            System.out.println(contador);
        contador++;     
        }
        //Actualización
    }
    // 65 - 90 abecedario en mayusuclas en ASCII
    
    private static void validarAbecedarioMayuscula(){
       Scanner teclado = new Scanner (System.in);
       boolean bandera = true;
       
       while (bandera){
           System.out.println("Ingrese el numero del caracter: ");
           int caracter = teclado.nextInt();
           
           if (caracter >= 65 && caracter <= 90){
               bandera = false;
               
           }
           
       }
    }
}
