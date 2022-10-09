/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ciennumerosprimos;

/**
 *
 * @author mateo
 */
public class CienNumerosPrimos {
    
    

    public static void main(String[] args) {
        String resultado = "";
        int contador = 0;
        int numero = 1;
        while(contador < 100){
            if (esPrimo(numero)){
                resultado += numero + ", ";
                contador++;   
            }
            numero ++;
        }
        System.out.println("Los primeros 100 números primos son: " + resultado);
    }
    private static boolean esPrimo(int numero){
        boolean esUnNumeroPrimo = true;
        for (int i = 2; i < numero; i++){
            if (numero % i == 0){
                esUnNumeroPrimo = false;
            }
        }
        return esUnNumeroPrimo;
    }
}
