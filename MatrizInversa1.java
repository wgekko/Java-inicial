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
public class MatrizInversa1 {

    /**
     * @param args the command line arguments
     */
   
        
        public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"se pide que ingrese una matriz cuadrada, \n "
                + "filas y columnas iguales y mostrar su diagonal inversa" );
        int filas = Integer.parseInt( JOptionPane.showInputDialog(null, "Digite la cantidad de filas... : "));
        int columnas = Integer.parseInt( JOptionPane.showInputDialog(null, "Ingrese la cantidad de columnas... : "));
        int matriz [ ] [ ] = new int [filas] [columnas];
       int [] vector = new int [filas];
       
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                
               int dato = Integer.parseInt(JOptionPane.showInputDialog(null,"Para completar la matriz........\n digite el numero  de la posicion ["+(i+1)+" , "+(j+1)+"]" ));
               matriz [i] [j] = dato; 
                               
            }
        }
        
        String resultado = " ";
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
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
    

