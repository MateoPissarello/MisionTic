/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediosDeTransporte;

/**
 *
 * @author mateo
 */
public class Carro extends mediosDeTransporte {
    public boolean tieneAireAcondicionado;

    public Carro(boolean tieneAireAcondicionado, String color, String marca, String modelo, String propietario, String ciindraje, int numRuedas, String placa, int numPasajeros, boolean tieneSoat) {
        super(color, marca, modelo, propietario, ciindraje, numRuedas, placa, numPasajeros, tieneSoat);
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }
    
}
