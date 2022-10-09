/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.strings;

/**
 *
 * @author mateo
 */
public class Strings {

    public static void main(String[] args) {
        char caracter = 'A';
        
        String nombre = "Hola mundo";
        String dos = new String("mundo");
        
        System.out.println(nombre.contains(dos));
        System.out.println(nombre.equals(dos));
        System.out.println(nombre.equalsIgnoreCase(dos)); //Ignora las mayusculas
        
        System.out.println(nombre.length());
        System.out.println(nombre.charAt(1)); //Imprime segun el indice el caracter correspondiente
        System.out.println(nombre.substring(0,5)); //Rango para imprimir sin incluir la posicion 5
        
        String[] partes = nombre.split(" ");
        System.out.println(partes);
    }
}
