/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejericiopersona;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class EjericioPersona {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese el nombre: ");
        String nombre = teclado.nextLine();
        
        System.out.println("Ingrese la edad: ");
        int edad = teclado.nextInt();
        
        System.out.println("Ingrese el genero, H para hombre, M para mujer");
        char genero = teclado.next().charAt(0);
        
        System.out.println("Ingrese el peso en Kg:");
        double peso = teclado.nextDouble();
        
        System.out.println("Ingrese la altura en m:");
        double altura = teclado.nextDouble();
        
        Casa nuevaCasa = new Casa("cra 5", 4, 3, 2, 2);
        
        
        Persona persona1 = new Persona(nombre, edad, genero, peso, altura, nuevaCasa);
        Mascota barcy = new Mascota("Barcy", "Perro", "6");
        Mascota nina = new Mascota("Nina", "Gata","10");
        persona1.registrarMascotas(barcy);
        persona1.registrarMascotas(nina);
        
        System.out.println("El imc es: " + persona1.calcularIMC());
        if (persona1.esMayorDeEdad()){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        
        System.out.println(persona1.toString());
        
        persona1.imprimirDireccionCasa();
        persona1.mostrarMascotas();
    }   
    
}
