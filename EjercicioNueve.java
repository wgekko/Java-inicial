/*
 Ejercicio # 9
Crear un programa que pida una frase y si esa frase 
es igual a "eureka " el programa 
pondrá un mensaje de Correcto, sino mostrará
un mensaje de Incorrecto 
 */
package egg_ejercicios;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class EjercicioNueve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String frase; String frase2; frase2="eureka";
        System.out.println("digite  una frase   :");
        frase  = leer.next();frase.toLowerCase().trim();
        if(frase.equals(frase2)){
             System.out.print(" Correcto: " +frase+" \n es igual a eureka \n");
        }else{
             System.out.print(" Incorrecto: " +frase+" \n  -NO- es igual a eureka \n");
        }
        
    }
    
}
