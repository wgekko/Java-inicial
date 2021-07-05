/*
 * Material Extra Ejercicio # 17
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de
tamaño N, con los valores ingresados por el usuario.
 */
package egg_ejercicios;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class MaterialExtraEjercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
       // DecimalFormat df = new DecimalFormat("###.##");     
      System.out.println("Ingrese la cantidad de numeros que agregara");
        int n = leer.nextInt();
        int suma = 0;
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el numero a agregar");
            vector[i] = leer.nextInt();
            suma += vector[i];
        }
        System.out.println("La suma es: " + suma);   
     
    }
    
}
