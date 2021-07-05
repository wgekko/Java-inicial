/*
Ejercicio # 22  
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente.

 */
package egg_ejercicios;


import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class EjercicioVeintidos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //DecimalFormat df = new DecimalFormat("###.##");
        
        int [] vector  = new int [100];
        for (int i = 0; i < 100; i++) {
            vector[ i ]= i;
            System.out.print("["+vector[ i ]+ "] \n" ); 
        }
     }
    
}
