/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.matrices;

import java.util.Arrays;

/**
 *
 * @author mateo
 */
public class Matrices {

    public static void main(String[] args) {
        int [][] matriz = new int[2][2];
        matriz[0][0] = 1;
        matriz [0][1] = 3;
        matriz [1][0] = 5;
        matriz [1][1] = 2;
        
        System.out.println(Arrays.toString(matriz));
    }
}
