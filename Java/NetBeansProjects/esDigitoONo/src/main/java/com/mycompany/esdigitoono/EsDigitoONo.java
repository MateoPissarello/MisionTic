/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.esdigitoono;

/**
 *
 * @author mateo
 */
public class EsDigitoONo {

    public static void main(String[] args) {
        System.out.println(esDigito('0'));
    }
    
    private static boolean esDigito(char caracter){
        
        if (caracter >= 48 && caracter <= 57){
            return true;
        } else{
            return false;
        }
        
    }
    private static boolean esNumerico(String texto){
        try {
            int numero = Integer.parseInt(texto);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
