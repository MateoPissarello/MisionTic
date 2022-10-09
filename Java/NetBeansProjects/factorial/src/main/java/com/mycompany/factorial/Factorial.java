/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.factorial;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Factorial {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduzca un limite : ");
        int limite = teclado.nextInt();
        calcularFactorial(limite);
        
    }
    private static void calcularFactorial(int limite){
        double multiplicacion = 1;
        for (int i = 1; i <= limite; i++){
            multiplicacion *= i;
            System.out.println("El factorial de " + i + " es: " + multiplicacion);
        }
    }
}
