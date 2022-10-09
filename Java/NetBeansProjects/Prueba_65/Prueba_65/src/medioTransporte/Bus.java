/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medioTransporte;

/**
 *
 * @author User
 */
public class Bus extends MedioTransporte{
    public Empresa empresa;
    public boolean registradora;

    public Bus(Empresa empresa, boolean registradora, String color, String marca, String modelo, String propietario, String cilindraje, int numRuedas, String placa, int numPasajeros, boolean tieneSoat) {
        super(color, marca, modelo, propietario, cilindraje, numRuedas, placa, numPasajeros, tieneSoat);
        this.empresa = empresa;
        this.registradora = registradora;
    }

    
    
    public void mostrarNombreEmpresa() {
        System.out.println("Empresa: " + this.empresa.nombre);
    }
    
    

    

    
    
    
    
}
