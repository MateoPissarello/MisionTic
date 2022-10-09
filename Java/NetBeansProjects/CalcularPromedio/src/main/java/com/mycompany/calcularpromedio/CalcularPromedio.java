/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calcularpromedio;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class CalcularPromedio {

    public static void main(String[] args) {
        System.out.println("Ingrese el primer numero: ");
        int numero1 = cargarNumero();
        
        System.out.println("Ingrese el segundo numero: ");
        int numero2 = cargarNumero();
        
        System.out.println("Ingrese el tercer numero: ");
        int numero3 = cargarNumero();
        
        calcularPromedio(numero1,numero2,numero3);
        
    }
    private static int cargarNumero(){
        Scanner teclado = new Scanner (System.in);
        int numero = teclado.nextInt();
        return numero;
    }
    private static double calcularPromedio(double num1, double num2, double num3){
        double promedio = (num1 + num2 + num3) / 3;
        System.out.println("El promedio es " + promedio);
        return promedio;
    }
}
