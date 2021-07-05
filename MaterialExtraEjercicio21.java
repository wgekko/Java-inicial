/*
 * Material Extra Ejercicio # 21
Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios
y muestre la suma de sus elementos.

 */
package egg_ejercicios;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class MaterialExtraEjercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner leer = new Scanner(System.in).useDelimiter("\n");        
       // DecimalFormat df = new DecimalFormat("###.##");   
          int n, m;
        double suma;
        n = 3;
        m = 4;
        int[][] matriz = new int[n][m];
        rellenar(n, m, matriz);
        suma = sumar(matriz, n, m);
        System.out.println("La suma de sus elementos es " + suma);
    }
    
     public static void rellenar(int n, int m, int[][] matriz) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }
    public static double sumar(int[][] matriz, int n, int m) {
        double suma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                suma += matriz[i][j];
                System.out.println(suma);
            }
        }
        return suma;
    }
}
