/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.numeromayor;
import java.util.Scanner;
/**
 *
 * @author mateo
 */
public class NumeroMayor {

    public static void main(String[] args) {
        //Con este codigo pedimos un numero
        System.out.println("Ingrese el primer numero: ");
        int numero1 = cargarNumero();
        
        System.out.println("Ingrese el segundo numero: ");
        int numero2 = cargarNumero();
        
        System.out.println("Ingrese el tercer numero: ");
        int numero3 = cargarNumero();
        //Con este codio calculamos el numero mayor y el numero menor
        calcularNumeroMayor(numero1,numero2,numero3);
        calcularNumeroMenor(numero1,numero2,numero3);
    }   
    /**
     * Esta funcion sirve para mostrar el calculo de un numero mayor
     * @param numero1 Es el primer numero
     * @param numero2 Es el segundo numero
     * @param numero3 Es el tercer numero
     */
    private static void calcularNumeroMayor(int numero1, int numero2, int numero3){
        
        int numeroMayor = numero1;
        
        if (numero2 > numeroMayor){
            numeroMayor = numero2;
        }
        if (numero3 > numeroMayor){
            numeroMayor = numero3;
        }
         System.out.println("El numero mayor es: " + numeroMayor);                  
    }
    private static int cargarNumero(){
        Scanner teclado = new Scanner (System.in);
        int numero = teclado.nextInt();
        return numero;
    }
    private static void calcularNumeroMenor(int numero1, int numero2, int numero3){
        
        int numeroMenor = numero1;
        
        if (numero2 < numeroMenor){
            numeroMenor = numero2;
        }
        if (numero3 < numeroMenor){
            numeroMenor = numero3;
        }       
         System.out.println("El numero menor es: " + numeroMenor);           
    }
}
    
