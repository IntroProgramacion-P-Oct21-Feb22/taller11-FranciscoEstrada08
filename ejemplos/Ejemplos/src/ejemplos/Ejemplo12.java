/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author reroes
 */
public class Ejemplo12 {

    public static void main(String[] args) {
        // 
        Scanner entrada = new Scanner(System.in);
        String mensaje;
        System.out.println("Ingrese 1 para ingresar una persona. Ingrese 2"
                + " para ingresar una institución . ingrese 3 para agregar una ciudad");
        int tipo = entrada.nextInt();
        if (tipo == 1) {
            mensaje = ingresarPersona();
        } else {
            if (tipo == 2) {
                mensaje = ingresarInstitucion();
            } else {
                if (tipo == 3) {
                    mensaje = ingresarCiudad();
                } else {
                    mensaje = "opción incorrecta";
                }
            }
        }

        System.out.printf("%s\n", mensaje);

    }

    public static String ingresarPersona() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String apellido;
        String ciclo;
        String cadena = "";
        System.out.println("Ingrese nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese apellido");
        apellido = entrada.nextLine();
        System.out.println("Ingrese ciclo");
        ciclo = entrada.nextLine();
        cadena = String.format("%sEstudiante: %s-%s-%s\n",
                cadena,
                nombre,
                apellido,
                ciclo);
        return cadena;
    }

    public static String ingresarInstitucion() {
        Scanner entrada = new Scanner(System.in);

        String nombre;
        String localidad;
        String cadena = "";
        System.out.println("Ingrese nombre de institución");
        nombre = entrada.nextLine();
        System.out.println("Ingrese localidad");
        localidad = entrada.nextLine();
        cadena = String.format("%sInstitución: %s-%s\n",
                cadena,
                nombre,
                localidad);
        return cadena;
    }

    public static String ingresarCiudad() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre;
        double poblacion;
        String cadena = "";
        System.out.println("Ingrese nombre de la ciudad");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la poblacion");
        poblacion = entrada.nextDouble();
        cadena = String.format("%sCiudad: %s-%.2f\n",
                cadena,
                nombre,
                poblacion);
        return cadena;

    }
}
