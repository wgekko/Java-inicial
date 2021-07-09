/*
 * Teniendo una matriz cuadrada de dimensión impar, con 5 como mínimo y 10 como máximo, realice la siguiente consulta.
Pida al operador que ingrese un valor entre 0 y el máximo valor de las columnas.
Tomará un valor por cada fila y los colocará en un vector.
Los valores serán tomados de la siguiente manera:
1) El primer valor será de la primera fila, en la columna indicada.
2) Si la columna no es la del extremo derecho, deberá avanzar en las siguientes filas, 
desplazándose en las columnas hacia la derecha hasta llegar a ese extremo. 
Cuando dicho extremo sea arribado, deberá tomar el rumbo opuesto,
y continuar bajando por las filas hasta alcanzar la última.
3) Si la columna indicada fuera la extrema derecha, deberá tomar ese valor en la primera fila, 
y comenzar a bajar en las filas siguientes pero ahora retrocediendo a las columnas de la izquierda. 
Si con esta acción se alcanzara el extremo izquierdo, se deberá seguir bajando en las filas,
pero volviendo a cambiar la dirección en las columnas.

Deberá mostrar:
a) La matriz completa en forma rectangular.
b) El valor de columna ingresado.
c) Los valores tomados y colocados en el vector.
 */
package egg_ejemplos;

import javax.swing.JOptionPane;

/**
 *
 * @author WALTER GOMEZ
 */
public class MatrizDiagonalEleccionColumna {
    public static void main(String[] args) {
        
        // se pide el ingreso de la dimension que tendra la matriz
        int n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese dimension de la matriz: "));
       
        int [] [] matriz   = new int [n] [n]; // se crea la  matriz 
         
        while (n <5 || n>10){    // se controla que no se ingreso valores erroneos
            
         n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese dimension de la matriz: "));    
            
        }
        
        int ini = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columna  entre 1 y "+n));
        while(ini<1 || ini >n){   // se controla que no se ingresen valores superiores a la dimension de la matriz
            
        ini = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columna entre 1 y "+n));
        }
        ini--;
        
        // relleno la matriz con numeros aleatorios
        
          for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz [i][j] = (int)(Math.random()*100)+1;
                System.out.print(matriz [i][j] + "\t ");
            }
            System.out.println("");
        }
          // pido que se ingrese el valor de la columna donde inicia para hacer la diagonal
          
          System.out.println("\n La columna seleccionada es .....  "+(ini+1));
          
        int [] dato = new int [n];
        int contador = 1;
        int retro = n-1;
        int ceroCero = matriz [0][ini];
        dato [0] = ceroCero;
        
        for (int i = 1; i < matriz.length; i++) { // se recorre la matriz 
            ini++;
            for (int j = 0; j < matriz.length; j++) {
                if (j == ini && ini < matriz.length-1) {
                    ceroCero = matriz [ i ][ j ];   // se baja por la matriz de izquierda a derecha
                    
                }    
                else if (j == retro && ini >= matriz.length-1) {
                    ceroCero = matriz [ i ] [ j ];  // una vez alcanzoa el  limite se recorre a la matriz de derecha a izquierda
                    retro--;
                }
            }
            
            dato [contador] = ceroCero;
            contador++;
        }
        System.out.print("\n Los elementos son: \n ");   //se muestran los valores almacenados en el vector 
        for (int i = 0; i < dato.length; i++) {
            System.out.print(dato [ i ] + "\t ");
        }
        System.out.println("\n");
    }
}
