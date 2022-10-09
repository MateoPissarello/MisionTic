/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Reto2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Registro {

    public ArrayList<Estudiante> estudiantes;

    public Registro() {
        this.estudiantes = new ArrayList<>();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Registro registro = new Registro();
        registro.procesarComandos();
    }

    public void procesarComandos() {
        Scanner teclado = new Scanner(System.in);

        boolean flagContinuar = true;
        while (flagContinuar)
        {
            String comando = teclado.nextLine();
            String[] campos = comando.split("&");
            String opcion = campos[0];            
            switch (opcion)
            {
                case "1":
                    String tipo = campos[1];
                    String nombre = campos[2];
                    String edad = campos[3];
                    String programa = campos[4];
                    String etnia = campos[5];
                    String creditos_modalidad = campos[6];

                    if (tipo.equals("Pregrado"))
                    {
                        Pregrado pregrado = new Pregrado(creditos_modalidad, nombre, edad, programa, etnia);
                        this.agregarEstudiante(pregrado);
                    } else if (tipo.equals("Posgrado"))
                    {
                        Posgrado posgrado = new Posgrado(creditos_modalidad, nombre, edad, programa, etnia);
                        this.agregarEstudiante(posgrado);
                    }
                    break;
                case "2":
                    this.listarEstudiantes();
                    break;
                case "3":
                    flagContinuar = false;
                    break;
            }
            
//            if (opcion.equals("3")) {
//                break;
//            }
        }

    }

    public void agregarEstudiante(Estudiante estudiante) {
        this.estudiantes.add(estudiante);
    }

    public void listarEstudiantes() {
//        for (int i = 0; i < this.estudiantes.size(); i++) {
//            this.estudiantes.get(i);
//        }
        System.out.println("***Listado de estudiantes***");
        for (Estudiante estudiante : this.estudiantes)
        {
            System.out.println(estudiante.toString());
        }
    }

}
