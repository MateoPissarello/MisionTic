/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto;

/**
 *
 * @author mateo
 */
public class Posgrado extends Estudiante {
    public String modalidad;

    public Posgrado(String nombre, String edad, String programa, String tipo_etnia,String modalidad) {
        super(nombre, edad, programa, tipo_etnia);
        this.modalidad = modalidad;
    }
    @Override
    public String toString() {
        return "\tEstudiante Pregrado"
                + "\n\tNombre: " + this.nombre +
                "\n\tEdad: " + this.edad + " anios" +
                "\n\tPrograma: " + this.programa +
                "\n\tEtnia: " + this.tipo_etnia +
                "\n\tModalidad : " + this.modalidad + "\n";
    }
    
    
}
