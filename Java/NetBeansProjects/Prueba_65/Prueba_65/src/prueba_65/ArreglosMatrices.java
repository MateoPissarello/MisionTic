/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba_65;

/**
 *
 * @author User
 */
public class ArreglosMatrices {

    public static void sumarArregloForEach(int[] numeros) {
        int suma = 0;
        for(int numero:numeros) {
            System.out.print("Numero: " + numero);
            suma += numero;
        }   
        System.out.print("Suma: " + suma);
    }
    
    public static void sumarArregloFor(int[] numeros) {
        int suma = 0;
        for(int i = 0; i < numeros.length; i++) {
            System.out.println("Numero: " + numeros[i]);
            suma += numeros[i];
        }
        System.out.println("Suma: " + suma);
    }
    
    public static void mostrarMatriz(int[][] matriz) {
        //for (int i = 0; i < matriz.length)
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = new int[5];
        numeros[0] = 12;
        numeros[1] = 5;
        numeros[2] = 6;
        numeros[3] = 9;
        numeros[4] = 3;
        
        sumarArregloFor(numeros);
        
        int numFilas = 2;
        int numColumnas = 2;
        int[][] matriz = new int[numFilas][numColumnas];
        matriz[0][0] = 1;
        matriz[0][1] = 3;
//        matriz[0][2] = 5;
        matriz[1][0] = 5;
        matriz[1][1] = 2; 
//        matriz[1][2] = 1; 
//        matriz[2][0] = 3;
//        matriz[2][1] = 4; 
//        matriz[2][2] = 9;
//        matriz[3][0] = 5;
//        matriz[3][1] = 6; 
//        matriz[3][2] = 1;
        
        for (int i = 0; i < numFilas; i++) {            
            String fila = "";
            for (int j = 0; j < numColumnas; j++) {
                fila += matriz[i][j] + " ";
            }
            System.out.println(fila);            
        }
        
        //System.out.println("Dimension de la matriz: " + matriz.toString());
    }
    
}
