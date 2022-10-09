/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.numeroparoimpar;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class NumeroParOImpar {

    public static void main(String[] args) {
        System.out.println("Ingrese un numero: ");
        int numero = cargarNumero();
        
        numero_par_o_impar(numero);
    }
    private static int cargarNumero(){
        Scanner teclado = new Scanner (System.in);
        int numero = teclado.nextInt();
        return numero;
    }
    private static void numero_par_o_impar(int numero){
        if (numero % 2 == 0){
            System.out.println("El numero es par.");
        } else {
            System.out.println("El numero es impar.");
        }
    }
}
