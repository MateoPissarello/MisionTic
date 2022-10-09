/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba_65;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Persona {

    /*
    Nombre de la persona
     */
    public String nombre;

    /*
    Edad de la persona
     */
    public int edad;

    /*
    Genero de la persona, 
    Si es Hombre se pone H
    Si es Mujer se pone M
     */
    public char genero;

    /*
    Peso de la persona,
    unidad de medida KG
     */
    public double peso;

    /*
    Altura de la persona,
    unidad de medida M
     */
    public double altura;
    
    /*
    Objeto de la clase Casa que contiene información de la vivienda
    */
    public Casa casa;
    
    /*
    Lista de las mascotas
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
    
    public void mostrarMascotas() {
        for (Mascota mascota: mascotas) {
            System.out.println(mascota.nombre);
        }
    }
    
    public void registrarMascotas(Mascota mascota) {
        mascotas.add(mascota);
    }

    public void imprimirDireccionCasa() {
        System.out.println(this.casa.direccion);
    }

    /**
     * Para calcular el IMC la formula es: peso(KG) / altura(M)2
     *
     * @return Calculo del IMC
     */
    public double calcularIMC() {
        double imc = this.peso / Math.pow(this.altura, 2);
        //double imc = this.peso / this.altura * this.altura;
        return imc;
    }

    /**
     * Para el calculo de mayor de edad, la edad limite es mayor o igual 18
     *
     * @return si retorna true es mayor de edad, si retorna false es menor de
     * edad
     */
    public boolean esMayorDeEdad() {
//        if (this.edad >= 18) {
//            return true;
//        } else {
//            return false;
//        }

        return this.edad >= 18;
    }

    /**
     * la salida debe de ser: 
     * Nombre: Sergio 
     * Edad: 29 
     * Genero: M 
     * Peso: 78 KG
     * Altura: 175 M 
     * IMC: 25
     *
     * @return la información de la persona
     */
    public String toString() {
        String texto = "Nombre: " + this.nombre + "\n" + 
                "Edad: " + this.edad + "\n" + 
                "Genero: " + this.genero + "\n" + 
                "Peso: " + this.peso + " KG \n" + 
                "Altura: " + this.altura + " M \n" + 
                "IMC: " + this.calcularIMC();
        
        return texto;
    }

}
