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
public class Reto1 {

    /**
     * @param args the command line arguments PASOS Pedir por consola la
     * distancia a la casa de Goku
     *
     * despejar variables: distanciaProximaEsfera - 4 = 2 * distanciaCasaGoku
     * distanciaProximaEsfera = 2 * distanciaCasaGoku + 4
     *
     *
     * distanciaCasaGoku + distanciaProximaEsfera = 5 * tiempoDuracionViaje
     * tiempoDuracionViaje = (distanciaCasaGoku + distanciaProximaEsfera) / 5
     *
     * imprimir cada una de las varibales separadas por espacio
     *
     * verificar el nombre de la esfera 
     * 0 - 20 impimir uno 
     * 21 - 30 imprimir dos
     * 31 - 50 imprimir tres 
     * > 50 imprimir cuatro *
     */
    public static void main(String[] args) {

        while (true)
        {
            try
            {
                Scanner teclado = new Scanner(System.in);
                int distanciaCasaGoku = teclado.nextInt();
                
                int distanciaProximaEsfera = 2 * distanciaCasaGoku + 4;
                int tiempoDuracionViaje = (distanciaCasaGoku + distanciaProximaEsfera) / 5;

                System.out.println(distanciaCasaGoku + " " + distanciaProximaEsfera + " " + tiempoDuracionViaje);
                
                if (tiempoDuracionViaje <= 20) {
                    System.out.println("uno");
                } else if (tiempoDuracionViaje <= 30) {
                    System.out.println("dos");
                } else if (tiempoDuracionViaje <= 50) {
                    System.out.println("tres");
                } else {
                    System.out.println("cuatro");
                }               
                
                break;

            } catch (Exception e)
            {
                System.out.println("La distancia a la casa de Goku debe de ser numerica, vuelva a intentarlo");
            }
        }

    }

}
