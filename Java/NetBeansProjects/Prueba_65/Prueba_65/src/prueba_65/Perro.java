/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba_65;

/**
 *
 * @author User
 */
public class Perro {
    public String nombre;
    public String raza;
    public String color;
    private int edad;
    public String propietario;
    public double tamanio;
    public String sexo;
    public double peso;

    public Perro(String nombre, String raza, String color, int edad, String propietario, double tamanio, String sexo, double peso) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.propietario = propietario;
        this.tamanio = tamanio;
        this.sexo = sexo;
        this.peso = peso;
    }
    
    public Perro(String nombre, String color, double peso){ 
        this.nombre = nombre;
        this.color = color;
        this.peso = peso;
    }
    
    public Perro(String nombre) {
        this.nombre = nombre;
    }
    
    public Perro(){        
    }
    
    
    public void ladrar() {
        System.out.println("GUAAAAAUUUUUUUUUUU " + " SOY " + this.nombre);
    }
    
    public static void correr() {
        System.out.println("CORRRRRREEEERRRRRR");
    }
}
