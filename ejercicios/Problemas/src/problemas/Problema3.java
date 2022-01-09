/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mensaje;
        mensaje = promedio();
        System.out.printf("%s", mensaje);
    }

    public static String promedio() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double nota1;
        double nota2;
        double nota3;
        double nota4;

        double suma;
        double promedio;

        String cadena;
        String tipo = "";

        System.out.println("Ingrese la primera nota");
        nota1 = entrada.nextDouble();

        System.out.println("Ingrese la segunda nota");
        nota2 = entrada.nextDouble();

        System.out.println("Ingrese la tercera nota");
        nota3 = entrada.nextDouble();

        System.out.println("Ingrese la cuarta nota");
        nota4 = entrada.nextDouble();

        suma = nota1 + nota2 + nota3 + nota4;
        promedio = suma / 4;

        if (promedio >= 0 && promedio <= 5) {
            tipo = "Regular";
        } else {
            if (promedio > 5 && promedio <= 8) {
                tipo = "Bueno";
            } else {
                if (promedio > 8 && promedio <= 9) {
                    tipo = "Muy Bueno";
                } else {
                    if (promedio > 9 && promedio <= 10) {
                        tipo = "Sobresaliente";
                    }
                }
            }
        }

        cadena = String.format("El promedio de las notas: %.2f, %.2f, %.2f, %.2f "
                + " es %s\n",
                nota1, nota2, nota3, nota4, tipo);
        return cadena;
    }

}
