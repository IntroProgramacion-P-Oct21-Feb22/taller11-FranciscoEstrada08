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
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int procedimiento;
        System.out.println("Ingrese el procedimiento que desea hacer\n"
                + "1 Para calcular el valor de la planiila de luz\n"
                + "2 Para calcular el predio de su inmueble");
        procedimiento = entrada.nextInt();
        String mensaje="";
        if (procedimiento == 1) {
            mensaje = obtenerPlanillaLuz();
        } else {
            if (procedimiento == 2) {
                mensaje = obtenerPredio();
            } else {
                System.out.println("El valor ingresado no es válido");
            }
        }
        System.out.printf("%s",mensaje);
    }

    public static String obtenerPlanillaLuz() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String cedula;
        double valorKilowatio;
        double kilowatiosConsumidos;
        double valorPlanillaLuz;
        String cadena = "";
           
        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();

        System.out.println("Ingrese su número de cédula");
        cedula = entrada.nextLine();
        
        System.out.println("Ingrese el valor del kilowatio");
        valorKilowatio = entrada.nextDouble();
        
        System.out.println("Ingrese los kilowatios consumidos");
        kilowatiosConsumidos = entrada.nextDouble();
        
        valorPlanillaLuz = (kilowatiosConsumidos * valorKilowatio);
        
        cadena= String.format("Cliente: %s con cédula: %s debe cancelar el valor"
                + " de $%.2f\n",nombre,cedula,valorPlanillaLuz);
        return cadena;
    }

    public static String obtenerPredio() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String cedula;
        double valorInmueble;
        double porcentaje = 2;
        double valorPredio;
        String cadena = "";
        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();

        System.out.println("Ingrese su número de cédula");
        cedula = entrada.nextLine();
        
        System.out.println("Ingrese el valor de su inmueble");
        valorInmueble = entrada.nextDouble();
        
        valorPredio = (valorInmueble * porcentaje)/100;
        
        cadena = String.format("Cliente: %s con cédula: %s tiene un bien inmueble"
                + " valorado en $%.2f y tiene que pagar de predio $%.2f\n",
                nombre,
                cedula,
                valorInmueble,
                valorPredio);
        
        return cadena;
        
        
    }
}
