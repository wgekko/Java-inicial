/*
Material Extra Ejericicio # 3
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una
vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la
clase String.
 
 */
package egg_ejercicios;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class MaterialExtraEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //DecimalFormat df = new DecimalFormat("###.##");
         System.out.println("Ingrese una letra  a verifcar ");
        Character letra = leer.next().toLowerCase().charAt(0);
        if(letra.equals('a') || letra.equals('e') || letra.equals('i') || letra.equals('o') || letra.equals('u')) {
            System.out.println("Es una vocal");
        } else {
            System.out.println("No es una vocal");
        }
        
        
    }
    
}
