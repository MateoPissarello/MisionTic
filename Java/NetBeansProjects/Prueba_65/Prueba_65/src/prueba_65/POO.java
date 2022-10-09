/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba_65;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre: ");
        String nombre =  teclado.nextLine();
        
        System.out.println("Ingrese la edad: ");
        int edad = teclado.nextInt();
        
        System.out.println("Ingrese el genero, H para hombre, M para mujer: ");
        char genero = teclado.next().charAt(0);
        
        System.out.println("Ingrese el peso en KG, separador decimal ,: ");
        double peso = teclado.nextDouble();
        
        System.out.println("Ingrese la altura en M, separador decimal ,: ");
        double altura = teclado.nextDouble();
        
        Casa casa = new Casa("Cra 5", 4, 3, 2, 2);
        
        Persona persona1 = new Persona(nombre, edad, genero, peso, altura, casa);
        
        Mascota mascota1 = new Mascota("Firulais", "Perro", "5");
        Mascota mascota2 = new Mascota("Nina", "Gat", "2");
        persona1.registrarMascotas(mascota1);
        persona1.registrarMascotas(mascota2);
        
        System.out.println("El IMC es: " + persona1.calcularIMC());
        
        if (persona1.esMayorDeEdad()) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        
        System.out.println(persona1.toString());
        persona1.imprimirDireccionCasa();
        persona1.mostrarMascotas();
    }
    
}
