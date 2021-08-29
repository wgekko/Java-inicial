/*
 * TP 5 - Parte 2 
 * Desarrolle el programa anterior, definiendo un procedimiento que sirva para mostrar el elemento de la diagonal principal.
   El procedimiento se llamará “elemento” y recibirá como argumento, el índice correspondiente al elemento a mostrar.
 */
package egg_ejemplos;

import javax.swing.JOptionPane;

/**
 *
 * @author WALTER GOMEZ
 */
public class MatrizCuadradaDIagonalPrincipal2 {
    public static void main(String[] args) {
        
             
        JOptionPane.showMessageDialog(null,"se pide que ingrese una matriz de un tamaño, \n "
                + "5 por 5 y mostrar su diagonal principal"
                + "\n recuerde que para poder hacer este ejercicio \n"
                + " el número de filas y columnas deben ser iguales");
        int f = Integer.parseInt( JOptionPane.showInputDialog(null, "Digite la cantidad de filas y columnas... : "));
        //int f = Integer.parseInt( JOptionPane.showInputDialog(null, "Ingrese la cantidad de columnas... : "));
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
            vector[i] = matriz[i] [i];
             }
        JOptionPane.showMessageDialog(null, "la diagonal principal es : " + elemento(vector));

        JOptionPane.showMessageDialog(null, "Fin del programa ................l");

    }
    
    public static String elemento(int indice[]){
        
        String mostrar = " ";
        for (int i = 0; i < indice.length; i++) {
            mostrar  +=indice[i];
            mostrar+= " -  ";
        }
        
        return mostrar;
        
    }
       
       
        
        
    }
    

