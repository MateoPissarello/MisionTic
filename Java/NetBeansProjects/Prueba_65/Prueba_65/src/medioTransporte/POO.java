/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medioTransporte;

/**
 *
 * @author User
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Moto moto1 = new Moto(2, "Blanco", "Pulsar", "2020", "Sergio", "180", 2, "CNQ73E", 2, true);
        moto1.mostrarPlaca();
        
        Carro carro1 = new Carro(true, "Rojo", "Mazda", "2021", "Andres", "1200", 4, "ABC456", 4, true);
        carro1.mostrarPlaca();
        
        Empresa empresa1 = new Empresa("Chin", "Cra 5# 45-11", "2345676543");
        
        Bus bus1 = new Bus(empresa1, false, "Gris", "Chevrolet", "2022", "Santiago", "2000", 8, "IJK678", 25, true);
            
        
        bus1.mostrarPlaca();
        bus1.mostrarNombreEmpresa();
        
        
    }
    
}
