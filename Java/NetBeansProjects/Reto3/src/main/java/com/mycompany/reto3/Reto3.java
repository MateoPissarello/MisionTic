/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.reto3;

import java.util.ArrayList;

/**
 *
 * @author mateo
 */
public class Reto3 {

    public static void main(String[] args) {
        Obra obra = new Obra();
        
        ArrayList listaCategorias = new ArrayList();
        listaCategorias.add(1); 
        listaCategorias.add(2); 
        listaCategorias.add(5); 
        listaCategorias.add(5); 
        listaCategorias.add(5);
        listaCategorias.add(1); 
        listaCategorias.add(2); 
        listaCategorias.add(5); 
        listaCategorias.add(5); 
        listaCategorias.add(5);
        
        ArrayList museoA = new ArrayList();
        museoA.add(30); 
        museoA.add(24); 
        museoA.add(31); 
        museoA.add(16); 
        museoA.add(39);
        museoA.add(22);        
        museoA.add(8);        
        museoA.add(29);        
        museoA.add(12);        
        museoA.add(4);        
        museoA.add(17);                
        museoA.add(0);        
        museoA.add(35);        
        museoA.add(15);        
        museoA.add(21);        
        museoA.add(32);        
        museoA.add(11);        
        museoA.add(23);        
        
        
        ArrayList museoB = new ArrayList();
        museoB.add(2);
        museoB.add(1);
        museoB.add(2);
        museoB.add(1);
        museoB.add(2);
        museoB.add(2);
        museoB.add(1);
        museoB.add(1);
        museoB.add(2);
        museoB.add(2);
        museoB.add(2);
        museoB.add(1);
        museoB.add(2);
        museoB.add(2);
        museoB.add(1);
        museoB.add(2);
        museoB.add(1);
        museoB.add(2);
        museoB.add(2);
        museoB.add(1);
        museoB.add(2);
        museoB.add(1);
        museoB.add(2);
        museoB.add(1);
        museoB.add(2);
        museoB.add(1);
        museoB.add(2);
        museoB.add(2);
        museoB.add(2);
        museoB.add(1);
        museoB.add(1);
        museoB.add(1);
        museoB.add(1);
        museoB.add(1);
        museoB.add(2);
        museoB.add(2);
        museoB.add(1);
        museoB.add(2);
        museoB.add(2);
        museoB.add(2);
        museoB.add(2);
        System.out.println(obra.puedoCambiar(museoA, museoB));
        
        System.out.println(obra.meFaltanDeLaClase(museoA, museoB, 2));
    }
}
