/*
Escribir un programa que pida una frase y la muestre toda en mayusculas
y despues toda en minusculas 

 */
package egg_ejercicios;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class Ejercicio4 {
    
    
    public static void main(String[] args) {        
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String frase;
        System.out.println("Digite una frase   :");
        frase = leer.next();
        System.out.print(" Frase en Mayúculas : " +frase.toUpperCase() + " \n");
         System.out.print(" Frase en Minúculas: " +frase.toLowerCase() + " \n");   
    }
    
}

    
    
    
    

