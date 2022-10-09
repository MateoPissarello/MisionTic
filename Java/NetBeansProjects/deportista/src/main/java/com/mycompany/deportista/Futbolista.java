/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deportista;

/**
 *
 * @author mateo
 */
public class Futbolista extends Persona {
    public String posicion;
    public String equipo;
    public int numeroCamiseta;

    public Futbolista(String posicion, String equipo, int numeroCamiseta, String nombre, int edad, String direccion, String identificacion) {
        super(nombre, edad, direccion, identificacion);
        this.posicion = posicion;
        this.equipo = equipo;
        this.numeroCamiseta = numeroCamiseta;
    }
    
    
    
}
