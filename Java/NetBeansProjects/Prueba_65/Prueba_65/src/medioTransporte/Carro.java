/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medioTransporte;

/**
 *
 * @author User
 */
public class Carro extends MedioTransporte{
    public boolean tieneAireAcondicionado;

    public Carro(boolean tieneAireAcondicionado, String color, String marca, String modelo, String propietario, String cilindraje, int numRuedas, String placa, int numPasajeros, boolean tieneSoat) {
        super(color, marca, modelo, propietario, cilindraje, numRuedas, placa, numPasajeros, tieneSoat);
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    
    
    
    
    
}
