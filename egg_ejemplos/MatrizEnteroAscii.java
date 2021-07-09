/*
 * TP 5 - Parte 3 
Desarrolle un programa que, teniendo una matriz de n x n, formada por valores char,
cree otra matriz que almacene los códigos ASCII correspondientes a cada elemento de la
primera. Al finalizar se deben mostrar ambas matrices en forma rectangular.
 * 
 */
package egg_ejemplos;

import javax.swing.JOptionPane;

/**
 *
 * @author WALTER GOMEZ
 */
public class MatrizEnteroAscii {
    
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,"se pide que ingrese una matriz de un tamaño, \n "
                + "N  por N y  formada con valores char, "
                + "\n y cree otra matriz que almacene los códigos ASCII correspondiente  \n"
                + " a cada elemento de la primera. Al finalizar se deben "
                + "mostrar ambas matrices en forma rectangular ");
        int f = Integer.parseInt( JOptionPane.showInputDialog(null, "Digite la cantidad de filas y columnas... : "));
        //int columnas = Integer.parseInt( JOptionPane.showInputDialog(null, "Ingrese la cantidad de columnas... : "));
         char matriz [ ] [ ] = new char [f] [f];
         int [] [] matriz_2 = new int [f] [f];
       
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < f; j++) {
                
                String dato = JOptionPane.showInputDialog(null,"Para completar la matriz........\n digite un caracter en  la posicion ["+(i+1)+" , "+(j+1)+"]" );
                
               matriz [i] [j] = dato.charAt(0); 
                               
            }
        }
        
        String resultado = " ";
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < f; j++) {
                resultado +=matriz[i] [j];
                resultado += "\t\t  -  ";                
            }
            resultado +="\n";
            
        }
        JOptionPane.showMessageDialog(null,"la matriz original  es : \n"+ resultado);
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz_2.length; j++) {
                
            
            matriz_2[i][j] = (int )matriz[i] [j];
            }
        }
        
              for (int i = 0; i < matriz.length; i++) {
                  for (int j = 0; j < matriz.length; j++) {
                    matriz_2[i] [j] = matriz[i] [j];
                    }
              }
              
        String mostrar = " ";
        
        for (int i = 0; i < matriz_2.length; i++) {
            for (int j = 0; j < matriz_2.length; j++) {
            
                                mostrar  +=matriz_2[i] [j];
                                mostrar+= "\t\t -  ";
                         }
                           mostrar +="\n";  
        }
         JOptionPane.showMessageDialog(null, "la matriz en valores ASCII  es : \n"+mostrar);
        
       JOptionPane.showMessageDialog(null,"Fin del programa ................l"); 
         
    }
}
