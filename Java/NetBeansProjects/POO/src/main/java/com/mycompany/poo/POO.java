/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo;

/**
 *
 * @author mateo
 */
public class POO {

    public static void main(String[] args) {
        Perro barcy = new Perro("Barcy", "Barcino", 10);
       
        
        barcy.ladrar();
        Perro.correr();
        
        
        
        Perro nala = new Perro();
        nala.nombre = "Nala";
        nala.color = "barcino";
        nala.ladrar();
    }
}
