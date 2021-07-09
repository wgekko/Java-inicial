/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg_ejemplos;

import javax.swing.JOptionPane;

/**
 *
 * @author WALTER GOMEZ
 */
public class SumaMatrices {

    public static void main(String[] args) {

        //int dato =0;
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        int[][] matrixsuma = new int[3][3];

        //dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el tamaño de la filas y columnas "));
        // se completa la matriz 1 
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                matrix1[i][j] = (int) (Math.random() * 10);
            }

        }

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                matrix1[i][j] = (int) (Math.random() * 10);
            }

        }

        // se suma las matrices 
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                matrixsuma[i][j] = matrix1[i][j] + matrix2[i][j];
                // matrixsuma [ i ] [ j ] = matrix1 [i] [j] + matrix2 [i] [j];
            }
        }
        // imprimir las matrices 

        for (int i = 0; i < matrix1.length; i++) {

            for (int j = 0; j < matrix1.length; j++) {

                System.out.print(" [  " + matrix1[i][j] + " ]");

            }

            if (i == 1) {
                System.out.print("  +  ");
            } else {
                System.out.print("     ");
            }
            //   System.out.println(" ");

            for (int j = 0; j < matrix2.length; j++) {
                System.out.print(" [  " + matrix2[i][j] + " ]");

            }

            if (i == 1) {
                System.out.print("  =  ");
            } else {
                System.out.print("     ");
            }

            for (int j = 0; j < matrixsuma.length; j++) {

                System.out.print(" [  " + matrixsuma[i][j] + " ]");

            }

            System.out.println(" ");

        }

        System.out.println(" ");

    }

}
