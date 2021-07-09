/*
 * TP 5 - Parte 2 
 *  Desarrolle el programa del ejercicio 6), para la diagonal inversa.
 */
package egg_ejemplos;

import javax.swing.JOptionPane;

/**
 *
 * @author WALTER GOMEZ
 */
public class MatrizCuadradaInversa2 {
    
    public static void main(String[] args) {
        
         JOptionPane.showMessageDialog(null,"se pide que ingrese una matriz cuadrada, \n "
                + "filas y columnas iguales y mostrar su diagonal inversa"
                + "\n recuerde que para poder hacer este ejercicio \n"
                + " el número de filas y columnas deben ser iguales");
        int f = Integer.parseInt( JOptionPane.showInputDialog(null, "Digite la cantidad de filas y columnas... : "));
        //int columnas = Integer.parseInt( JOptionPane.showInputDialog(null, "Ingrese la cantidad de columnas... : "));
        int matriz [ ] [ ] = new int [f] [f];
       int [] vector = new int [f];
       
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < f; j++) {
                
               int dato = Integer.parseInt(JOptionPane.showInputDialog(null,"Para completar la matriz........\n digite el numero  de la posicion ["+(i+1)+" , "+(j+1)+"]" ));
               matriz [i] [j] = dato; 
                               
            }
        }
        
        String resultado = " ";
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < f; j++) {
                resultado +=matriz[i] [j];
                resultado += "\t  -  ";                
            }
            resultado +="\n";
            
        }
        JOptionPane.showMessageDialog(null,"la matriz original  es : \n"+ resultado);
      
        for (int i = 0; i < matriz.length; i++) {
            int cont=matriz.length;
            vector[i] = matriz[i] [i];
            cont--;
           }
        
        String mostrar = " ";
        for (int i = 0; i < vector.length; i++) {
            mostrar  +=vector[i];
            mostrar+= " -  ";
        }
            JOptionPane.showMessageDialog(null, "la diagonal inversa  es : "+mostrar);
        
       JOptionPane.showMessageDialog(null,"Fin del programa ................l"); 
        
    }
    
}
