/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author mateo
 */
public class Mavenproject1 {

    public static void main(String[] args) {

        String nombre = "Mateo";
        int edad = 18;
        String frase = "Hola mi nombre es " + nombre + " y tengo " + edad + " años";
        System.out.println(frase);

        //Operadores aritmeticos
        int suma = 10 + 10; //suma
        int resta = 10 - 5; //resta
        int multiplicacion = 10 + 5; //multiplicacion
        double dividir = ((double) 10 / (double) 3); // dividir
        int resto = 10 % 3;

        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplicacion);
        System.out.println(dividir);
        System.out.println(resto);

        //Tipos de datos en java
        boolean esCasado = true;
        char a = 'a'; //tiene que ir en comillas simples
        byte numero = 120; //tiene que ir en un rango de -128 a 127
        short numeroShort = 25000; //rango de -32768 a 32767
        int integer = 80000000; // 4bytes
        long numeroLong = 89314711; //8bytes
        float pi = (float) 1.59234; //desde -1.5 x 10e-45 hasta 3.4 x 10e38
        double numeroDecimal = 89.5467; // desde -5.0 x 10e-324 hasta 1.7 x 10e308

        System.out.println(esCasado);
        System.out.println(a);
        System.out.println(numero);
        System.out.println(numeroShort);
        System.out.println(integer);
        System.out.println(numeroLong);
        System.out.println(pi);
        System.out.println(numeroDecimal);

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        
        //Operadores de comparación
        
        /*
        == Igual
        >  Mayor
        <  Menor
        >= Mayor o igual
        <= Menor o igual
        != Distinto
        */
        
        //Operadores lógicos
        
        /*
        Operador not:
            -Invierte la logica
            -Si agarras un valor true y le colocas not pasa a false y viceversa
        Operador "and":
            -Para que sea true ambos valores deben ser verdaderos
            -TRUE/TRUE = TRUE
            -TRUE/FALSE = FALSE
            -FALSE/FALSE = FALSE
        Operaor "or":
            -Para que sea verdadero solo uno de los valores debe ser verdadero
            -TRUE/TRUE = TRUE
            -TRUE/FALSE = TRUE
            -FALSE/FALSE = FALSE
        
        */
    }
}
