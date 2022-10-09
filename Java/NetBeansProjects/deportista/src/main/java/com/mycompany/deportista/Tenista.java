/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deportista;

/**
 *
 * @author mateo
 */
public class Tenista extends Persona{
    public int ranking;
    public boolean juegaDoble;
    public String patrocinador;

    public Tenista(int ranking, boolean juegaDoble, String patrocinador, String nombre, int edad, String direccion, String identificacion) {
        super(nombre, edad, direccion, identificacion);
        this.ranking = ranking;
        this.juegaDoble = juegaDoble;
        this.patrocinador = patrocinador;
    }
    
    
    
    
}
