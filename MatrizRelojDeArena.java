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
public class MatrizRelojDeArena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n; Scanner leer = new Scanner (System.in);
        System.out.println("recuerde que el valor de filas y columnas debe ser impar");
        do{
             System.out.println(" Ingrese el valor de filas y columnas........");
         n = leer.nextInt();
            
        }while( n % 2 ==0 || n<10 );    
        
      int m [][]= new int [n][n]; int me= (n/2)+1;
      String  maux [][]= new String [n][n];
         System.out.println("   ---    la matriz original    ---    "); // llenamos la matriz original 
        for (int i = 0; i < n ; i++) {
            System.out.print(" [  ");
            for (int j = 0; j < n; j++) {
                m [i][j] = (int) (Math.random()*10);
                 System.out.print(m[i] [j]+" ");
            }
            System.out.println("]");
        }
        
        for (int i = 0; i < n; i++) {      // llenamos la matriz auxiliar 
            for (int j = 0; j <n; j++) {
                maux[i][j] = "#";
            }
            //System.out.println(" ");
        }
        for (int i = 0; i < me; i++) {
            for (int j = i; j <n-i ; j++) {
                maux[i][j] = ""+m [i][j];
                maux[n-i-1][j] = ""+m [n-i-1][j];
            }
        }
        System.out.println("---------------------------------------------------------");
        System.out.println("   ---   Matriz con la forma de reloj de arena   ---  ");
        for (int i = 0; i < n; i++) {      // mostramos la matriz con reloj de arena  
            System.out.print(" [  ");
            for (int j = 0; j < n; j++) {
                System.out.print(maux[i][j]+ " ");
            }
             System.out.println("]");
        }
         System.out.println("----------------------------------------------------------");
         
         
         for (int i = 0; i < m.length; i++) {
             for (int j = 0; j < m.length; j++) {
                 System.out.print("     "+m[i] [j]);
             }
                 System.out.print("     ");
                 for (int k = 0; k < maux.length; k++) {
                     System.out.println("     "+maux[i ][k]);
                 }
                 System.out.println("\n");
                 }
                 
             }
        }
         
    
