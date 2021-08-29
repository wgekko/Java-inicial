/*
 * TP 5 - Parte 2 
   Hacer un algoritmo que llene una matriz de 5 x 5 y que almacene la diagonal principal 
en un vector. Imprimir el vector resultante
 */
package egg_ejemplos;

import javax.swing.JOptionPane;

/**
 *
 * @author WALTER GOMEZ
 */
public class MatrizDiagonalPrincipal3 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,"se pide que ingrese una matriz de un tamaño, \n "
                + "5 por 5 y mostrar su diagonal principal"
                + "\n recuerde que para poder hacer este ejercicio \n"
                + " el número de filas y columnas deben ser iguales");
        int c = Integer.parseInt( JOptionPane.showInputDialog(null, "Digite la cantidad de filas y columnas ... : "));
        //int columnas = Integer.parseInt( JOptionPane.showInputDialog(null, "Ingrese la cantidad de columnas... : "));
        int matriz [ ] [ ] = new int [c] [c];
       int [] vector = new int [c];
       
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < c; j++) {
                
               int dato = Integer.parseInt(JOptionPane.showInputDialog(null,"Para completar la matriz........\n digite el numero  de la posicion ["+(i+1)+" , "+(j+1)+"]" ));
               matriz [i] [j] = dato; 
                               
            }
        }
        
        String resultado = " ";
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < c; j++) {
                resultado +=matriz[i] [j];
                resultado += "\t  -  ";                
            }
            resultado +="\n";
            
        }
        JOptionPane.showMessageDialog(null,"la matriz original  es : \n"+ resultado);
        
        for (int i = 0; i < matriz.length; i++) {
            vector[i] = matriz[i] [i];
             }
        
        String mostrar = " ";
        for (int i = 0; i < vector.length; i++) {
            mostrar  +=vector[i];
            mostrar+= " -  ";
        }
            JOptionPane.showMessageDialog(null, "la diagonal principal es : "+mostrar);
        
       JOptionPane.showMessageDialog(null,"Fin del programa ................l"); 
    
    }
        
}
    

