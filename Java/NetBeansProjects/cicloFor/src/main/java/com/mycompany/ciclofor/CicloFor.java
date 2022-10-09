/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ciclofor;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class CicloFor {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese el numero");
        int limite = teclado.nextInt();
        System.out.println(sumaDeNumerosWhile(limite));
    }
    
    private static int sumaDeNumerosWhile(int limite){
        //Inicializacion
        int i = 0;
        int suma = 0;
        // condicion
        while (i <= limite){
            suma += i;
            i++;
        }
        return suma;
    }
    private static int sumaDeNumerosFor(int limite){
        int suma = 0;
        for (int i = 0; i <= limite; i++){
            suma += i;
        }
        return suma;
    }
}
