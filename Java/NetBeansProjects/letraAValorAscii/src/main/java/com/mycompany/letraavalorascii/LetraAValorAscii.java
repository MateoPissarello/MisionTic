/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.letraavalorascii;
import java.util.Scanner;
/**
 *
 * @author mateo
 */
public class LetraAValorAscii {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese el caracter: ");
        char letra = teclado.next().charAt(0);
        System.out.println(convertir_a_numero(letra));
       
        
        
    }
    private static char convertir_a_ascii(int numero){
        char caracter = (char) numero;
        return caracter;
    }
    private static int convertir_a_numero(char letra){
        int numero = (int) letra;
        return numero;
    }
}
