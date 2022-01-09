/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema7 {

    public static void main(String[] args) {
        String[] ciudades = cadenas();
        longitudCadena(ciudades);

        for (int i = 0; i < ciudades.length; i++) {
            System.out.println(ciudades[i]);
        }
        
    }

    public static String[] cadenas() {
        Scanner entrada = new Scanner(System.in);
        int longitud;

        System.out.println("Ingrese cuantas ciudades del Ecuador desea ingresar");
        longitud = entrada.nextInt();
        String[] datos = new String[longitud];
        entrada.nextLine();
        for (int i = 0; i < datos.length; i++) {
            System.out.println("Ingrese una ciudad del Ecuador");
            datos[i] = entrada.nextLine();

        }
        return datos;
    }

    public static void longitudCadena(String[] ciudades) {
        int cant_valores;
        String cadena = "";
        for (int i = 0; i < ciudades.length; i++) {
            cant_valores = ciudades[i].length();
            if (cant_valores == 4 || cant_valores == 5) {
                cadena = String.format("%s, %s", cadena, ciudades[i]);
            }
        }
        System.out.printf("Las ciudades con 5 o 4 caracteres son: %s\n", cadena);
    }
}
