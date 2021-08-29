/*
 * TP5 - Parte 1 - Pida al usuario que ingrese una frase. Luego muestre lo siguiente
a -  cantidad de caracteres de la frase, sin incluir los espacios
b -cantidad de palabras de la frase. 
c- Sabiendo la cantidad de palabras que contiene la frase, declare un vector de tipo
String, y guarde cada palabra en el vector. Luego debe mostrar los elementos del
mismo, con cada posición.
 
 */
package egg_ejemplos;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author WALTER GOMEZ
 */
public class ArregloFraseContarPalabra {
        public static void main(String[] args) {
        
           String frase = JOptionPane.showInputDialog(null, "Ingrese una frase ").trim().toLowerCase();
           StringTokenizer st = new StringTokenizer(frase);
          String frase1= frase.replaceAll(" ", "");
          String  arreglo [] = frase.split(" ");
          
               
           JOptionPane.showMessageDialog(null,"en la frase ingresada se encontraron -  "+frase1.length()+"  -  de caracteres o letras");
           JOptionPane.showMessageDialog(null,"La frase tiene una cantidad de  - "+st.countTokens()+" -  palabras ");
                     
            for (int i = 0; i < arreglo.length; i++) {
                JOptionPane.showMessageDialog(null,"El vector en la posicion ["+(i+1)+"]  -  se encuentra la palabra  - "+ arreglo[i] + "  -  ");
                
            }
           JOptionPane.showMessageDialog(null,"Fin del programa ................l"); 
    }
}
