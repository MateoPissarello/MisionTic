/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bienvenido;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author mateo
 */
public class Bienvenido {

    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
        System.out.println("Bienvenido" + nombre);
    }
}
