/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema6 {

    public static void main(String[] args) {
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        String cadena = "";
        mediaAritmetica(informacion);
        valorDesviacion(mediaAritmetica(informacion), informacion);
        cadena = String.format("El valor de la media es: %.2f\n"
                + "El valor de la desviacion estandar es: %.2f\n",mediaAritmetica(informacion),
                valorDesviacion(mediaAritmetica(informacion), informacion));
        System.out.printf("%s",cadena);
    }

    public static Double mediaAritmetica(int[] datos) {
        double media;
        double suma = 0;

        for (int i = 0; i < datos.length; i++) {
            suma = suma + datos[i];
        }
        media = suma / datos.length;

        return media;
    }

    public static double valorDesviacion(double media, int[] datos) {
        double procesoRestaDesviacion;
        double procesoDatosElevados;
        double suma = 0;
        double desviacionEstandar;
        
        double [] resta_datos = new double[9];
        double [] datos_elevados = new double [9];
        
        for (int i = 0; i < datos.length ; i++) {
            procesoRestaDesviacion = datos[i] - media;
            resta_datos[i] = procesoRestaDesviacion;
        }
        for(int i = 0; i < datos.length; i++){
            procesoDatosElevados = Math.pow(resta_datos[i],2);
            datos_elevados[i] = procesoDatosElevados;
            
        }
        for(int i = 0; i < datos_elevados.length;i++){
                suma = suma + datos_elevados[i];
            }
        desviacionEstandar = (Math.sqrt(suma/datos.length-1));
        return desviacionEstandar;
    }
}
