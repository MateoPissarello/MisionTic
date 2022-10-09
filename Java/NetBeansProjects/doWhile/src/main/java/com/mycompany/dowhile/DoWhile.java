/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dowhile;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class DoWhile {

    public static void main(String[] args) {
        validarAbecedarioMayusculaDoWhile();
    }
        private static void validarAbecedarioMayusculaDoWhile(){
            Scanner teclado = new Scanner (System.in);
            boolean bandera = true;
            do{
                System.out.println("Ingrese el numero del caracter: ");
                int caracter = teclado.nextInt();
           
                if (caracter >= 65 && caracter <= 90){
                    bandera = false;
               
                }    
            } while (bandera);
       

    }
}
