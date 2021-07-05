/*
Ejercicio # 10 
 Realizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
package egg_ejercicios;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class EjercicioDiez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String frase;
        System.out.println("digite  una frase   :");
        frase = leer.next().trim();
        if (frase.length() <= 8) {
            System.out.print(" CORRECTO: " + frase + " \n  tiene hasta 8 caracteres  \n");
        } else {
            System.out.print(" INCORRECTO: " + frase + " \n  - tiene más de 8 caracteres  \n");
        }
    }
}
