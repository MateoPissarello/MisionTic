/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba_65;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicios {

    /**
     * Dado un caracter, construya un programa en Java para determinar si el
     * caracter es un dıgito o no.
     */
    public static boolean esDigitoChar(char caracter) {
        if (caracter >= 48 && caracter <= 57)
        {
            return true;
        } else
        {
            return false;
        }
    }

    public static boolean esNumerico(String texto) {
        try
        {
            int numero = Integer.parseInt(texto);
            return true;
        } catch (Exception e)
        {
            return false;
        }
    }

    /**
     * Imprimir los n´umeros de 1 hasta un n´umero natural n dado, cada uno con
     * su respectivo factorial.
     *
     * 1 = 1
     * 2 = 1 * 2
     * 3 = 1 * 2 * 3
     */
    public static void calcularFactorial(int limite) {
        int multiplicacion = 1;
        for (int i = 1; i <= limite; i++)
        {
            multiplicacion *= i;
            System.out.println("El factorial de " + i + " es:" + multiplicacion);
        }

    }
    
    /**
     * Diseñe un programa que muestre las tablas de multiplicar del 1 al 9
     */
    public static void tablasMultiplicar(int a, int b) {        
        for (int i = 1; i <= a; i++) {              
            for (int j = 1; j <= b; j++) {
                int multiplicacion = i * j;
                System.out.println(i + " X " + j + " = " + multiplicacion );
            }            
        }        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //System.out.println(esNumerico("21231h"));

//        Scanner teclado = new Scanner(System.in);
//        int limite = teclado.nextInt();
//
//        calcularFactorial(limite);

        tablasMultiplicar(15, 12);

    }

}
