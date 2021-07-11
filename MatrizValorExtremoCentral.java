/*
 * Teniendo una matriz cuadrada, cuya dimensión es dada por el usuario, y completa de valores enteros. Definir:
1) Un procedimiento que muestre su elemento central, cuando lo tiene. Si no lo tiene lo indicará con un mensaje.
2) Una función que devuelva en un arreglo de 4 elementos, los valores de las cuatro esquinas de la matriz. El main debe mostrarlos.
 */
package egg_ejemplos;

import javax.swing.JOptionPane;

/**
 *
 * @author WALTER GOMEZ
 */
public class MatrizValorExtremoCentral {
    public static void main(String[] args) {
    
        int n = Integer.parseInt(JOptionPane.showInputDialog("inserte el tamaño del que quiera la matriz."));
        
        while (n <=2 || n >10){
            n = Integer.parseInt(JOptionPane.showInputDialog("inserte el tamaño del que quiera la matriz."));
        }
        int matriz [][] = new int [n][n];
               for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int)(Math.random()*10)+1;
                  System.out.print(matriz [i][j] + "\t ");
            }
            System.out.println("");
        }
 
  System.out.println("");
        elementoCentral(matriz);    
        for (int i = 0; i < 4; i++) {
            System.out.println(" Esquinas de la matriz: "+esquinaMatriz(matriz)[i]+" ");
        }
    }
    public static void elementoCentral (int a [][]){
    if (a.length%2 == 0) System.out.println("No tiene elemento central. \n");
    else System.out.println("El elemento central es: "+a[(a.length/2)][(a.length/2)]+"\n");
    }
  
  public static int[] esquinaMatriz (int  [][] a){
    int vector [] = new int [4];
    vector [0] = a[0][0];
    vector [1] = a[0][a.length-1];
    vector [2] = a[a.length-1][0];
    vector [3] = a[a.length-1][a.length-1];
    return vector;
    }
}
   
