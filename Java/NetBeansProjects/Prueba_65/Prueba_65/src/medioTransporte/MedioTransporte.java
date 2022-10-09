/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medioTransporte;

import prueba_65.Persona;

/**
 *
 * @author User
 */
public class MedioTransporte {
    public String color;
    public String marca;
    public String modelo;
    public String propietario;
    public String cilindraje;
    public int numRuedas;
    public String placa;
    public int numPasajeros;
    public boolean tieneSoat;

    public MedioTransporte(String color, String marca, String modelo, String propietario, String cilindraje, int numRuedas, String placa, int numPasajeros, boolean tieneSoat) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.propietario = propietario;
        this.cilindraje = cilindraje;
        this.numRuedas = numRuedas;
        this.placa = placa;
        this.numPasajeros = numPasajeros;
        this.tieneSoat = tieneSoat;
    }
    
    public void mostrarPlaca() {
        System.out.println("Placa: " + this.placa);
    }
    
    
    
}
