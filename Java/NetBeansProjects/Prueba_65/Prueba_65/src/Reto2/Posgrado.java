/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2;

/**
 *
 * @author User
 */
public class Posgrado extends Estudiante{
    public String modalidad;

    public Posgrado(String modalidad, String nombre, String edad, String programa, String tipo_etnia) {
        super(nombre, edad, programa, tipo_etnia);
        this.modalidad = modalidad;
    }
    
    public String toString() {
        String texto = "\tEstudiante Posgrado" + "\n" + 
                "\tNombre: " + this.nombre + "\n" + 
                "\tEdad: " + this.edad + " anios" + "\n" + 
                "\tPrograma: " + this.programa + "\n" +
                "\tEtnia: " + this.tipo_etnia + "\n" + 
                "\tModalidad: " + this.modalidad;
        return texto;
    }
    
    
}
