/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author reroes
 */
public class Ejemplo09 {

    public static void main(String[] args) {
        // 
        String mensajeSuma;
        String mensajeSumaDos;
        String mensajeSumaTres;
        int[] valores = {9, 10, 100, 200};
        mensajeSuma = obtenerSuma(10, 9);
        mensajeSumaDos = obtenerSuma(10, 10);
        mensajeSumaTres = obtenerSuma(1000, 1, 10);
        
        
        System.out.printf("%s\n", mensajeSuma);
        System.out.printf("%s\n", mensajeSumaDos);
        System.out.printf("%s\n", mensajeSumaTres);
        
        mensajeSuma = obtenerSuma(valores);
        System.out.printf("%s\n", mensajeSuma);

    }
    
        
    public static String obtenerSuma(int operandor1, int operandor2){
        int suma;
        String cadena = "";
        suma = operandor1 + operandor2;
        cadena = String.format("%s%d\n", cadena, suma);
        return cadena;        
    }
    
    public static String obtenerSuma(int operandor1){
        int suma;
        String cadena = "";
        suma = operandor1 + operandor1;
        cadena = String.format("%s%d\n", cadena, suma);
        return cadena;        
        
    }
    public static String obtenerSuma(int operador1, int operador2, int operador3){
        int suma;
        String cadena = "";
        suma = operador1 + operador2 + operador3;
        cadena = String.format("%s%d\n",cadena,suma);
        return cadena;
    }
    public static String obtenerSuma(int[] datos){
        int suma = 0;
        String cadena = "";
        for(int i = 0; i<datos.length; i++){
            suma = suma + datos[i];
        }
        cadena = String.format("%s%d\n",cadena,suma); 
        return cadena;
    }
}
