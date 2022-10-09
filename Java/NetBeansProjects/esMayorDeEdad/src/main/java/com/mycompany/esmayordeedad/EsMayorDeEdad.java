/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.esmayordeedad;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class EsMayorDeEdad {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = teclado.nextLine();
        
        System.out.println("Ingrese su edad: ");
        int edad = teclado.nextInt();
        
        System.out.println("Hola " +  nombre);
        
        boolean esMayorDeEdad = edad >= 18;
        
        if (esMayorDeEdad){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }
    
}
