/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arreglos;

/**
 *
 * @author mateo
 */
public class Arreglos {

    public static void main(String[] args) {
        String[] frutas = new String[]{"Pera", "Manzana", "Naranja", "Guayaba"};
        int[] numeros = new int[5];
        numeros[0] = 12;
        numeros[1] = 5;
        numeros[2] = 6;
        numeros[3] = 9;
        numeros[4] = 3;

       
        sumarArregloForEach(numeros);

        for(String fruta:frutas) { //For each :)
            System.out.println(fruta);
            
            if (fruta.equals("Manzana")){
                break;
            }
        }
    }
    private static void sumarArregloForEach(int[] numeros){
        int suma = 0;
        for (int numero:numeros){
            System.out.println("Numero: " + numero);
            suma += numero;
        }
        System.out.println("Suma: " + suma);
    }
    private static void sumarArregloFor(int[] numeros){
        int suma = 0;
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Numero: " + numeros[i]);
            suma += numeros[i];
        }
        System.out.println("Suma: " + suma);
    }
}
