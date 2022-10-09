/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.coleccionesenjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

/**
 *
 * @author mateo
 */
public class ColeccionesEnJava {
    
    public static void main(String[] args) {
        /**
         * Map (funciona como un Json en python)
         * TreeMap
         */
        ArrayList <Integer> listaNum1 = new ArrayList<>();
        listaNum1.add(1);
        listaNum1.add(4);
        listaNum1.add(9);
        listaNum1.add(7);
        listaNum1.add(5);
        ArrayList <Integer> listaNum2 = new ArrayList<>();
        listaNum2.add(4);
        listaNum2.add(5);
        listaNum2.add(3);
        listaNum2.add(2);
        listaNum2.add(1);
        
        for (Integer numero1: listaNum1){
            //System.out.println("Lista 1: " + numero1);
            
            for (Integer numero2: listaNum2){
                //System.out.println("Lista 2: "+ numero2);
                
                if (numero1 == numero2){
                    System.out.println(numero1);
                }
            }
        }
    }
    
}
