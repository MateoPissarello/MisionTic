/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba_65;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Prueba_65 {

    public static void validarAbecedarioMayusculaBreak() {
        Scanner teclado = new Scanner(System.in);
        
        while (true) {
            System.out.println("Ingrese el numero del caracter: ");
            short caracter = teclado.nextShort();
            
            if (caracter >= 65 && caracter <= 90)
            {
                break;
            }
            
        }
    }
    
    // 65 - 90 abecedario en mayusculas
    public static void validarAbecedarioMayusculaDoWhile() {
        Scanner teclado = new Scanner(System.in);
        boolean bandera = true;
        do
        {
            System.out.println("Ingrese el numero del caracter: ");
            short caracter = teclado.nextShort();
            if (caracter >= 65 && caracter <= 90)
            {
                bandera = false;
            }
        } while (bandera);
        
    }

    public static void validarAbecedarioMayusculaWhile() {
        Scanner teclado = new Scanner(System.in);
        boolean bandera = true;
        while (bandera)
        {
            System.out.println("Ingrese el numero del caracter: ");
            short caracter = teclado.nextShort();
            if (caracter >= 65 && caracter <= 90)
            {
                bandera = false;
            }
        }
    }

    public static void mostrarNumeros() {
        // Inicializacion
        int i = 0;

        // Condición
        while (i == 10)
        {
            // Codigo
            System.out.println(i);

            // Actualización
            i++;
        }
    }

//    def areaRectangulo(largo, ancho):
//        return numero ** 2;
    public static double cuadrado(int numero) {
//        return numero*numero; 
        return Math.pow(numero, 2);
    }

    public static double areaRectangulo(double largo, double ancho) {
        double resultado = largo * ancho;
        return resultado;
    }

    public static double areaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        mostrarNumeros();
        validarAbecedarioMayusculaBreak();

//        0, domingo
//        1, lunes
//        6, sabado
//        System.out.println("Ingrese el dia de la semana: ");
//        int diaSemana = teclado.nextInt();
//
//        switch (diaSemana)
//        {
//            case 0:
//                System.out.println("Domingo");
//                break;
//            case 1:
//                System.out.println("Lunes");
//                break;
//            case 2:
//                System.out.println("Martes");
//                break;
//            case 3:
//                System.out.println("Miercoles");
//                break;
//            case 4:
//                System.out.println("Jueves");
//                break;
//            case 5:
//                System.out.println("Viernes");
//                break;
//            case 6:
//                System.out.println("Sabado");
//                break;
//            default:
//                System.out.println("Dia invalido");
//        }
//
//        // Pedir al usuario cuantos productos va a llevar,
//        // saber cuanto cuesta cada unidad
//        // Condiciones para saber que descuento va a tener el usuario
//        // Resultado con el valor a pagar
//        System.out.println("Ingrese la cantidad de productos a comprar: ");
//        int cantidadProductos = teclado.nextInt();
//
//        System.out.println("Ingrese el precio de la unidad: ");
//        int precioUnidad = teclado.nextInt();
//        int descuento;
//
//        if (cantidadProductos > 5 && cantidadProductos <= 10)
//        {
//            descuento = 5;
//        } else if (cantidadProductos > 10 && cantidadProductos <= 20)
//        {
//            descuento = 10;
//        } else if (cantidadProductos > 20)
//        {
//            descuento = 20;
//        } else
//        {
//            descuento = 0;
//        }
//
//        double totalCompras = (cantidadProductos * precioUnidad);
//        double totalDescuento = (double) totalCompras * ((double) descuento / (double) 100);
//
//        System.out.println("Total descuento: " + totalDescuento);
//
//        double resultado = totalCompras - totalDescuento;
//
//        System.out.println("Porcentaje aplicado: " + descuento);
//        System.out.println("TOtal a pagar: " + resultado);
        // si la persona mas de 50 años, y tiene hijos, 500.000
        // si la persona tiene menos de 50 años, y no tiene hijos 300.00
//        System.out.println("Ingrese la edad: ");
//        int edad = teclado.nextInt();
//        
//        System.out.println("Ingrese la cantidad de hijos que tiene: ");
//        int cantidadHijos = teclado.nextInt();
//        
//        boolean esCasado = false;
//        
//        if (esCasado) {
//            System.out.println("Es casado");
//        }
//        
//        if (esCasado) {
//            System.out.println("Es casado");
//        }
//        String resultado = (edad > 50 && cantidadHijos > 0) ? "Va a recibir 500.000" : "Va a recibir 300.000";
//        System.out.println(resultado);
//        if (edad > 50 && cantidadHijos > 0) {
//            System.out.println("Va a recibir 500.000");
//        } else {
//            System.out.println("Va a recibir 300.000");
//        }
        // si numero < 0, multiplicarlo por -1
        // si numero >= 0, no hacer nada
//        System.out.println("Ingrese el numero1: ");
//        int numero1 = teclado.nextInt();
//        
//        System.out.println("Ingrese el numero2: ");
//        int numero2 = teclado.nextInt();
////        if (numero < 0){
////            System.out.println(-numero);
////        } else {
////            System.out.println(numero);
////        }
//
//        if (numero1 < 0) {
//            numero1 = -numero1;
//        }
//        System.out.println("El valor absoluto es: " + numero1);
//        
//        int valorAbsoluto = numero1 < 0 ? -numero1 : numero1;
//        System.out.println("Valor aboluto es: " + valorAbsoluto);
//        
//        int numeroMayor = numero1 > numero2 ? numero1 : numero2;
//        System.out.println("El numero mayor es: " + numeroMayor);
//        System.out.println("Ingrese la edaad");
//        int edad = teclado.nextInt();
//        
//        if (edad > 18){
//            System.out.println("Es mayor de edad"); 
//        } else {
//            System.out.println("Es menor de edad"); 
//        }
//        if edad > 18:
//            print("Es mayor de edad")
//        else:
//            print("Es menor de edad")     
//        int numero1 = 10;
//        int numero2 = numero1 + 5;
//        int numero3 = 30;
//        numero2 = numero3 - numero1;
//        int numero4 = numero2 + numero1;
//
//        System.out.println(numero1);
//        System.out.println(numero2);
//        System.out.println(numero3);
//        System.out.println(cuadrado(numero4));
//
//        numero3 = numero4 + 2;
//        Scanner teclado = new Scanner(System.in);
//        
//        System.out.println("Ingrese la base: ");
//        double base = Double.parseDouble(teclado.nextLine());
//        
//        System.out.println("Ingrese la altura: ");
//        double altura = Double.parseDouble(teclado.nextLine());
//        
//        System.out.println("Ingrese el radio: ");
//        double radio = Double.parseDouble(teclado.nextLine());
//        
//        System.out.println("Resultado: " + (areaRectangulo(base, altura) + areaCirculo(radio)));
//        
//        double resultadoAreaRectangulo = areaRectangulo(base, altura);
//        double resultadoAreaCirculo = areaCirculo(radio);
//        
//        System.out.println("Resultado: " + Math.round(resultadoAreaRectangulo + resultadoAreaCirculo));
    }

}
