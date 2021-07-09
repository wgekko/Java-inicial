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
public class MatrizINversaUno {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"se pide que ingrese una matriz cuadrada, \n "
                + "filas y columnas iguales y mostrar su diagonal inversa" );
        int dato = Integer.parseInt( JOptionPane.showInputDialog(null, "Digite la cantidad de filas y columnas... : "));       
        int matriz [ ] [ ] = new int [dato] [dato];
       int [] vector = new int [dato];
       
        for (int i = 0; i < dato; i++) {
            for (int j = 0; j < dato; j++) {
                
               int valor = Integer.parseInt(JOptionPane.showInputDialog(null,"Para completar la matriz........\n digite el numero  de la posicion ["+(i+1)+" , "+(j+1)+"]" ));
               matriz [i] [j] = valor; 
                               
            }
        }
        
        String resultado = " ";
        for (int i = 0; i < dato; i++) {
            for (int j = 0; j < dato; j++) {
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
