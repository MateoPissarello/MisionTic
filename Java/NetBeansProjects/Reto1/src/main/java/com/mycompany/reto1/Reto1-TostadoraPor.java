/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.reto1;

import java.util.Scanner;


/**
 *
 * @author mateo
 */
public class Reto1 {

    public static void main(String[] args) {
      //Pedir por teclado la distancia a la casa de Goku
      boolean bandera = true;
      while(bandera){
          try{
            Scanner teclado = new Scanner (System.in);
            System.out.println("Ingrese la distancia a la casa de Goku:");
            int distanciaCasaGoku = teclado.nextInt();
            bandera = false;
            calcularTodo(distanciaCasaGoku);
            
          }catch(Exception e){
              System.out.println("La distancia a la casa de Goku debe ser numerica, vuelva a intentarlo");
          }
      }
      //distanciaProximaEsfera = 2 * distanciaCasaGoku + 4
      //tiempo DuracionViaje = distanGoku + distanciaProximaEsfera / 5
      //distanciaCasaGoku + distanciaProximaEsfera = 5 * tiempoDuracionViaje
      
      // 4 - distanciaProximaEsfera = 2 * distanciaCasaGoku
      
      //Imprimir las variables separadas
      
      //
    }
    private static void calcularTodo(int distancia){
        int distanciaProximaEsfera = 2 * distancia + 4;
        int tiempoDuracionViaje = (distancia + distanciaProximaEsfera)/5;
        String nombreDeLaEsfera = "";
        
        if (tiempoDuracionViaje > 0 && tiempoDuracionViaje < 20){
            nombreDeLaEsfera = "uno";
        }else if (tiempoDuracionViaje > 21 && tiempoDuracionViaje < 30){
            nombreDeLaEsfera = "dos";
        }else if (tiempoDuracionViaje > 31 && tiempoDuracionViaje < 50){
            nombreDeLaEsfera = "tres";
        }else{
            nombreDeLaEsfera = "cuatro";
        }
        System.out.println(distancia + " " + distanciaProximaEsfera + " " + tiempoDuracionViaje);
        System.out.println(nombreDeLaEsfera);
    }
    
}
