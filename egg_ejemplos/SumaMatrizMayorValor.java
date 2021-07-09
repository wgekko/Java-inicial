/*
 * TP 5 - Parte 2 
  Hacer un algoritmo que llene una matriz de n * n.  
  Sumar las columnas e imprimir que columna tuvo la máxima suma 
  y la suma de esa columna. 

 */
package egg_ejemplos;


import javax.swing.JOptionPane;

/**
 *
 * @author WALTER GOMEZ
 */
public class SumaMatrizMayorValor {
    public static void main(String[] args) {
           
        
         int f = Integer.parseInt( JOptionPane.showInputDialog(null, "Digite la cantidad de filas. y las columnas .. : "));
         //int columnas = Integer.parseInt( JOptionPane.showInputDialog(null, "Ingrese la cantidad de columnas... : "));
        int matriz [ ] [ ] = new int [f] [f];
        int max=0;
        int sumaColumna[] = new int [f];
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
                resultado += "       ";                
            }
            resultado +="\n";
            
        }
        JOptionPane.showMessageDialog(null,resultado);
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                
                sumaColumna[ i ]+=matriz[ j ] [ i ];
               
                if (sumaColumna[i] > max){
                    max = sumaColumna [ i ];
                  
                    }
                
            }
        
        }
        
        JOptionPane.showMessageDialog(null,"La suma mayor de la columna es : "+max); 
        JOptionPane.showMessageDialog(null,"Fin del programa ................l"); 
        
    }
    
}
