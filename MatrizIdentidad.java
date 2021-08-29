/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg_ejemplos;
import java.util.Scanner;
/**
 * la consigna 
 * Cree un programa que permita ingresar por teclado un valor entero, 
 * mediante el valor entero cree una matriz de dos dimensiones de orden igual  al valor entero. 
 * Cargue cada una de las posiciones del array con valor cero a excepción de los elementos
 * que componen la matriz identidad, los cuales deberán tener el valor 1 asignado. 
 * 
 */

/**
 *
 * @author walter
 */
public class MatrizIdentidad {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite un valor entero para poder crear un Array Bidimensional :");
        int tamanio = sc.nextInt();
        //System.out.println("----------------------------------------------------------------");
        int arrayBidi[][] = new int[tamanio][tamanio];

        cargarArrayIdentidad(arrayBidi);
        mostrarArrayBidi(arrayBidi);
    }

    public static void cargarArrayIdentidad(int arrayBidi[][]) {

        for (int i = 0; i < arrayBidi.length; i++) {
            for (int j = 0; j < arrayBidi.length; j++) {
                if (i == j) {
                    arrayBidi[i][i] = 1;
                } else {
                    arrayBidi[i][j] = 0;
                }
            }
        }

    }

    public static void mostrarArrayBidi(int arrayBidi[][]) {
        System.out.println("-------------------------------------------");
        System.out.println("----------  ARRAY IDENTIDAD  --------------");
        System.out.println("-------------------------------------------");

        for (int x = 0; x < arrayBidi.length; x++) {

            System.out.print("----------[ ");
            for (int y = 0; y < arrayBidi[x].length; y++) {
                System.out.print(arrayBidi[x][y]);
                if (y != arrayBidi[x].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println(" ]----------");
        }

        System.out.println("-------------------------------------------");

    }
    
}
