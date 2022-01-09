/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String mensaje = "";
        int operacion;
        System.out.println("Ingrese la operacion que desee realizar\n"
                + "1 para obtener el Area de un Cuadrado\n"
                + "2 para obtener el Area de un Triangulo\n"
                + "3 para obtener el Area de un Rectangulo");
        operacion = entrada.nextInt();
        if (operacion <= 0 || operacion > 3) {
            System.out.println("Numero ingresado fuera de rango");
        } else {
            if (operacion == 1) {
                mensaje = obtenerAreaCuadrado();
            } else {
                if (operacion == 2) {
                     mensaje=obtenerAreaTriangulo();
                } else {
                    if (operacion == 3) {
                        mensaje = obtenerAreaRectangulo();
                    }
                }
            }
        }
        System.out.printf("%s\n", mensaje);
    }

    public static String obtenerAreaCuadrado() {
        Scanner entrada = new Scanner(System.in);
        double lado;
        double area;
        String cadena = "";
        System.out.println("Ingrese el valor del lado del cuadrado");
        lado = entrada.nextDouble();
        area = (lado * lado * lado * lado);
        cadena = String.format("El area del cuadrado es : %s\n",
                area);
        return cadena;
    }
    public static String obtenerAreaTriangulo() {
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double area;
        String cadena = "";
        
        System.out.println("Ingrese el valor de la base del triangulo");
        base = entrada.nextDouble();
        
        System.out.println("Ingrese el valor de la altura del triangulo");
        altura = entrada.nextDouble();
        
        area = (base*altura)/2;
        cadena = String.format("El area del triangulo es : %s\n",
                area);
        return cadena;
    }
    public static String obtenerAreaRectangulo() {
       Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double area;
        String cadena = "";
        
        System.out.println("Ingrese el valor de la base del rectangulo");
        base = entrada.nextDouble();
        
        System.out.println("Ingrese el valor de la altura del reactangulo");
        altura = entrada.nextDouble();
        
        area = (base*altura);
        cadena = String.format("El area del triangulo es : %s\n",
                area);
        return cadena;
    }

}
