/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.areacirculo;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class AreaCirculo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingresa el radio: ");
        double radio = teclado.nextDouble();
        System.out.println(calcularAreaCirculo(radio));
    }
    private static double calcularAreaCirculo(double radio){
        double pi = Math.PI;
        double area = (pi * Math.pow(radio,2.0));
        return area;
    }
}
