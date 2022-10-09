/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicios2;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Ejercicios2 {

    public static void main(String[] args) {
        //Obtener informacion separada por '&' por teclado
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese la informacion separada por '&': ");
        String informacion = teclado.nextLine();
        
        String[] informacionSeparada = informacion.split("&");
        
        System.out.println("Nombre: " + informacionSeparada[0]);
        System.out.println("Edad: " + informacionSeparada[1]);
        System.out.println("Celular: " + informacionSeparada[2]);
        System.out.println("Direccion: " + informacionSeparada[3]);
        
    }
}
