/*
Java 
 Ejercicio # 3 
Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla 

 */
package egg_ejercicios;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String nombre;
        System.out.println("digite su nombre  :");
        nombre = leer.next();
        System.out.print(" El nombre ingresado es : " + nombre + " \n");

    }

}
