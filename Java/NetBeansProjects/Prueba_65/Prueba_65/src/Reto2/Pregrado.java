/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2;

/**
 *
 * @author User
 */
public class Pregrado extends Estudiante{
    public String cantidad_creditos;

    public Pregrado(String cantidad_creditos, String nombre, String edad, String programa, String tipo_etnia) {
        super(nombre, edad, programa, tipo_etnia);
        this.cantidad_creditos = cantidad_creditos;
    }  
    
    public String toString() {
        String texto = "\tEstudiante Pregrado" + "\n" + 
                "\tNombre: " + this.nombre + "\n" + 
                "\tEdad: " + this.edad + " anios" + "\n" + 
                "\tPrograma: " + this.programa + "\n" +
                "\tEtnia: " + this.tipo_etnia + "\n" + 
                "\tCreditos aprobados: " + this.cantidad_creditos;
        return texto;
    }
}
