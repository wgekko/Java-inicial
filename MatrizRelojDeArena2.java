/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg_ejemplos;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class MatrizRelojDeArena2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner leer = new Scanner(System.in);
        System.out.println("recuerde que el valor de filas y columnas debe ser impar");
        do {
            System.out.println(" Ingrese el valor de filas y columnas........");
            n = leer.nextInt();

        } while (n % 2 == 0 || n < 10);

        int m[][] = new int[n][n];
        int me = (n / 2) + 1;
        String maux[][] = new String[n][n];
        // System.out.println("   ---    la matriz original    ---    "); // llenamos la matriz original 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < n; i++) {      // llenamos la matriz auxiliar 
            for (int j = 0; j < n; j++) {
                maux[i][j] = "#";
            }
        }
        // lleno la matriz auxiliar con los datos de la matriz principal
        for (int i = 0; i < me; i++) {
            for (int j = i; j < n - i; j++) {
                maux[i][j] = "" + m[i][j];
                maux[n - i - 1][j] = "" + m[n - i - 1][j];
            }
        }
        System.out.println("---------------------------------------------------------"); // mostramos la dos matrices juntas 
        System.out.println("  -  Matriz inicial - \t\t- Matriz reloj de arena -    ");

        int colContarMatriz = m[0].length;
        for (int x1 = 0, x2 = 0; x1 < m.length || x2 < maux.length; x1++, x2++) {
            // Si no se han pintado todas las filas de la matriz A
            if (x1 < m.length) {
                System.out.print("[");
                for (int y1 = 0; y1 < m[x1].length; y1++) {
                    System.out.print(m[x1][y1]);

                    if (y1 != m[x1].length - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.print("]");
            } else {
                // Si ya se pintaron todas las filas e la matriz A
                // Esto lo hago para que la matriz B siempre quede alineada en caso de la matriz A tenga menos filas
                for (int i = 0; i < colContarMatriz - 1; i++) {
                    System.out.print(" ");
                }
            }
            // Si no se han pintado todas las filas de la matriz A
            if (x2 < maux.length) {
                System.out.print("\t\t[");

                for (int y2 = 0; y2 < maux[x2].length; y2++) {
                    System.out.print(maux[x2][y2]);
                    if (y2 != maux[x2].length - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println("]");
            }
        }
           System.out.println("---------------------------------------------------------");
    }
}
