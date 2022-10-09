/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejericiopersona;

import java.util.ArrayList;

/**
 *
 * @author mateo
 */
public class Persona {
    /*
    nombre de la persona
    */
    public String nombre;
    /*
    edad de la persona
    */
    public int edad;
    /*
    Genero de la persona
    Si es Hombre se pone H
    Si es Mujer se pone M
    */
    public char genero;
    /*
    Peso de la persona
    Unidad de medida Kg
    */
    public double peso;
    /*
    Altura de la persona
    Unidad de medida en m
    */
    public double altura;
    /*
    objeto de la clase casa
    */
    public Casa casa;
    /*
    Lista de la clase mascota
    */
    public ArrayList<Mascota> mascotas;
    
    public Persona(String nombre, int edad, char genero, double peso, double altura, Casa casa) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
        this.casa = casa;
        this.mascotas = new ArrayList<>();
        
    }
    public void mostrarMascotas(){
        for(Mascota mascota: mascotas){
            System.out.println(mascota.nombre);
        }
    }
    public void registrarMascotas(Mascota mascota){
        mascotas.add(mascota);
    }
    /**
     * Para calcular el IMC la formula es: peso / altura **
     * @return Calculo del IMC
     */
   public double calcularIMC(){
       double imc = this.peso / Math.pow(this.altura, 2);
       return imc;
   }
   /**
    * Para el calculo de mayor de edad, la edad limite es 18
    * @return Si retorna true es mayor de edad, si retorna false es menor de edad
    */
   public boolean esMayorDeEdad(){
       return this.edad >= 18;
       }
   /**
    * Para el metodo toString la salida debe de ser:
    *Nombre: Mateo
    *Edad: 17
    *Genero: M
    *Peso: 57 Kg
    *Altura: 1.73 m
    *IMC: 18.5
    * @return la informacion de la persona
    */
   public String toString(){
       String texto = "Nombre: " + this.nombre + "\n" +
                        "Edad: " + this.edad + "\n" +
                        "Genero: " + this.genero + "\n" +
                        "Peso: " + this.peso + "\n" +
                        "Altura: " + this.altura + "\n" +
                        "IMC: " + this.calcularIMC() + "\n";
       return texto;
   }
   public void imprimirDireccionCasa(){
       System.out.println("Direccion: " + this.casa.dirrecion);
   }
}
