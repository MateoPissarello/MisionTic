/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto;

/**
 *
 * @author mateo
 */
public class Estudiante {
    public String nombre;
    public String edad;
    public String programa;
    public String tipo_etnia;

    public Estudiante(String nombre, String edad, String programa, String tipo_etnia) {
        this.nombre = nombre;
        this.edad = edad;
        this.programa = programa;
        this.tipo_etnia = tipo_etnia;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", edad=" + edad + ", programa=" + programa + ", tipo_etnia=" + tipo_etnia + '}';
    }
    
    
    
    
}
