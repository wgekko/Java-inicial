/*
Ejercicio # 5 
 Dada una cantidad de grados centigrados se debe
mostrar su equivalente en grados Fahrenheit
la formula correspondiente es F=32 +(9° C /5)
 */
package egg_ejercicios;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
         int c; double f;
                
        System.out.println("Ingrese  la temperatura en formato °C :");       
        c=leer.nextInt();
        f=32+(9*c/5);
         
          System.out.println(" La temperatura ingresada es :  "+c + "°C \n  su conversion a Fahrenheit es  "+f);
}
}