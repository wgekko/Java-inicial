/*
 *posicionarse en la primera columna, para ubicarse en la segunda columna, 
buscar un elemento mayor o igual al de la Primera. 
Y asi sucesivamente hasta la ultima columna.
Si no hubiera elemento mayor o igual .
Volver a completar la matriz. Siempre mostrarla cuando se llene nuevamente

 */
package egg_ejemplos;

import javax.swing.JOptionPane;

/**
 *
 * @author WALTER GOMEZ
 */
public class MatrizMayorColumna {
   public static void main(String[] args) {
         int [][] matriz = new int [5][5];
        int [] arregloMayores = new int [5];
        int mayorNro = 0;
        int contador = 1;
        
        
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz [i][j] = (int)(Math.random()*100)+1;
                System.out.print(matriz [i][j] + "\t ");
            }
             System.out.println("");
        }
       
           mayorNro = matriz [0] [0];    
            arregloMayores [0] =  mayorNro;
            
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz [j][i] >= mayorNro) {
                    
                    mayorNro = matriz [j][i]; }
              
            }
             // System.out.println("");
            arregloMayores [contador] =  mayorNro;
           mayorNro = 0;
            contador++;
        }
        System.out.println("El elemento mayor de la columna es      :");
        for ( int i = 0; i < arregloMayores.length; i++) {
            System.out.print(   arregloMayores [i] + " ");
        }
        System.out.println("\n");
        
    }
     
   }
        
    


