/*
Ejercicio # 11 
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */
package egg_ejercicios;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.substring;

/**
 *
 * @author WALTER GOMEZ
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String frase;
        System.out.println("digite  una frase / palabra  :");
        frase = leer.next().trim();
        if (frase.substring(0,1).equals("A") ) {            
            System.out.print(" CORRECTO: " + frase + " \n  tiene la letra A como 1er caracter  \n");
        } else {
            System.out.print(" INCORRECTO: " + frase + " \n  -  NO tiene la latra A como 1er caracter  \n");
        }
    }
}
