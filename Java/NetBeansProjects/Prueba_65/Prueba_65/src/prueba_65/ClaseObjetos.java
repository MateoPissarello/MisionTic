/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba_65;

/**
 *
 * @author User
 */
public class ClaseObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro maya = new Perro();
               
        maya.ladrar();
        Perro.correr();        
        
        Perro firulais = new Perro();
        firulais.nombre = "Firulais";
        firulais.ladrar();
        
        
    }
    
}
