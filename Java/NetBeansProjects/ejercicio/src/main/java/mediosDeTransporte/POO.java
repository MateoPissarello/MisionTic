/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediosDeTransporte;

/**
 *
 * @author mateo
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        moto motomami = new moto(2, "rojo", "ducati", "2020", "El maty", "180", 2, "KJHA90", 2, true);
        motomami.mostrarPlaca();
        
        Carro carroMamalon = new Carro(true, "Azul", "Chevrolet", "2020", "El Maty", "290", 4, "HJK094", 2, true);
        carroMamalon.mostrarPlaca();
        Empresa empresa1 = new Empresa("Rapido Tolima", "Cra 5# 45-12", "1208452075");
        Bus bus1 = new Bus(true, empresa1, "Gris", "Chevrolet", "2020", "asdnano", "19230", 8, "CHJ190", 25, true);
        bus1.mostrarNombreEmpresa();
        bus1.mostrarPlaca();
    }
    
}
