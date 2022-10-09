/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

/**
 *
 * @author mateo
 */
public class Perro {
    public String nombre;
    public String raza;
    public String color;
    private int edad;
    private String propietario;
    public double tamanio;
    public String sexo;
    public double peso;
    
    public Perro(){
        
    }
    public Perro (String nombre, String color, double peso){
        this.nombre = nombre;
        this.color = color;
        this.peso = peso;
    }
    
    public Perro(String nombre){
        this.nombre = nombre;
    }
    public void ladrar() {
        System.out.println("GUAUUUUU  SOY" + this.nombre);
    }
   
    public static void correr () {
        System.out.println("CORRRRRRREEEEEEEEER");
    }
}
