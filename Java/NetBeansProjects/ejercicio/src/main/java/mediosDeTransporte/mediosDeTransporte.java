/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediosDeTransporte;

/**
 *
 * @author mateo
 */
public class mediosDeTransporte {
    public String color;
    public String marca;
    public String modelo;
    public String propietario;
    public String ciindraje;
    public int numRuedas;
    public String placa;
    public int numPasajeros;
    public boolean tieneSoat;

    public mediosDeTransporte(String color, String marca, String modelo, String propietario, String ciindraje, int numRuedas, String placa, int numPasajeros, boolean tieneSoat) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.propietario = propietario;
        this.ciindraje = ciindraje;
        this.numRuedas = numRuedas;
        this.placa = placa;
        this.numPasajeros = numPasajeros;
        this.tieneSoat = tieneSoat;
    }
    
    public void mostrarPlaca(){
        System.out.println("Placa: " + this.placa);
    }
    
}
