/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.reto;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author mateo
 */
public class Registro {
    public ArrayList<Estudiante> estudiantes;

    public Registro() {
    }
  
    public void procesarComandos(){
        Scanner teclado = new Scanner (System.in);
        String comando = teclado.next();
        String[] campos = comando.split("&");
        String opcion = campos[0];
        switch (opcion) {
            case "1":
                String tipo = campos[1];
                String nombre = campos[2];
                String edad = campos[3];
                String programa = campos[4];
                String etnia = campos[5];
                String creditos_modalidad = campos[6];
                
                if (tipo.equals("Pregrado")){
                    Pregrado pregrado = new Pregrado(creditos_modalidad, nombre, edad, programa, etnia);
                    this.agregarEstudiante(pregrado);
                }else if ("Posgrad")
                break;
            case "2":
                break;
            case "3":
                break;
            
        }
        
        
        
        
    }
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }
    
    
    
    
    
    public static void main(String[] args) {
        Registro registro = new Registro();
        
        registro.procesarComandos();
        
        
        
      
        
        
        
        
     
        
        
    }
    
}
