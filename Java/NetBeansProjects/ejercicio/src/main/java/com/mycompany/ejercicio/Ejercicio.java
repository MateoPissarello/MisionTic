/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Ejercicio {

    public static void main(String[] args) {
       /*
        Imprimir un listado con los números impares desde 1 hasta 999 y
        seguidamente otro listado con los números pares desde 2 hasta 1000.
        */
        System.out.println("------------------------");
        System.out.println("Numeros impares desde 1 hasta 999");
        for (int i = 1; i <=999; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
        System.out.println("------------------------");
        System.out.println("Numeros pares desde 2 hasta 1000");
        for (int i = 2; i <= 1000; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
        /*
        Imprimir los números pares en forma descendente hasta 2 que son
        menores o iguales a un número natural n ≥ 2 dado.
        */
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese el numero: ");
        int numero = teclado.nextInt();
        System.out.format("Los numero pares desde %s hasta 2 son: \n", numero);
        numerosParesDescendentes(numero);
            
        }
    
    
    private static void numerosParesDescendentes(int numero){
        for (int i = numero; i >= 2; i--){
            if (i % 2 == 0){
                System.out.println(i);
            }
    }
    }
    
}
