/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tablasdemultiplicar;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class TablasDeMultiplicar {

    public static void main(String[] args) {
        OUTER:
        while (true) {
            System.out.println("Tablas de multiplicar");
            System.out.println("\t1. Tabla del 1");
            System.out.println("\t2. Tabla del 2");
            System.out.println("\t3. Tabla del 3");
            System.out.println("\t4. Tabla del 4");
            System.out.println("\t5. Tabla del 5");
            System.out.println("\t6. Tabla del 6");
            System.out.println("\t7. Tabla del 7");
            System.out.println("\t8. Tabla del 8");
            System.out.println("\t9. Tabla del 9");
            System.out.println("\t10. Salir del programa");
            System.out.println("Seleccione una de las opciones:");
            Scanner teclado = new Scanner (System.in);
            int opciones = teclado.nextInt();
            switch (opciones) {
                case 1 -> calcularTabla(opciones);
                case 2 -> calcularTabla(opciones);
                case 3 -> calcularTabla(opciones);
                case 4 -> calcularTabla(opciones);
                case 5 -> calcularTabla(opciones);
                case 6 -> calcularTabla(opciones);
                case 7 -> calcularTabla(opciones);
                case 8 -> calcularTabla(opciones);
                case 9 -> calcularTabla(opciones);
                case 10 -> {
                    break OUTER;
                }
                default -> System.out.println("Introduzca una valor valido.");
            }
        }
    }
    private static void calcularTabla (int numero){
        
        for (int i = 1; i <= 10; i++){
            System.out.println(numero + " x " + i + "=" + (numero * i));
        }
    }
}
