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
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //DecimalFormat df = new DecimalFormat("###.##");
        
    // con un  bucle for 
        System.out.println("desarrollo con el bucle for.... ");
        for (int i = 100; i >= 0; i--) {       
            System.out.println("["+i+"]");
        retardarSegundo();
        }
      // con un bucle while 
      System.out.println("desarrollo con el bucle while.... ");
        int j=100;
        while( j >= 0 ){
             System.out.print("["+ j+ "] \n" ); 
            j--;
            retardarSegundo();
        }
     }
      private static void retardarSegundo(){
        
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){}
    }
}
