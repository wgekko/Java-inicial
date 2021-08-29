/*
 * TP 5 - Parte 1 -  Almacenar 15 números en un vector, almacenarlos 
en otro vector en orden inverso al vector original y mortar por pantalla, ambos


 */
package egg_ejemplos;
import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class ArregloInverso {
  public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] numero = new int[15];
        int[] inverso = new int[15];
        System.out.println("Se ingresaran 15 n\u00fameros para almacenar  ");
        for (int i = 0; i < 15; i++) {
            System.out.print(" ingrese el numero de la posici\u00f3n  [" + (i + 1) + "] = ");
            numero[i] = sc.nextInt();
        }
        for (int i = numero.length - 1, j = 0; i >= 0; i--, j++) {
            inverso[j] = numero[i];
        }
        for (int i = 0; i < 15; i++) {
            System.out.println("el vector  original  es : " + numero[i]);
        }
        for (int k = 0; k < inverso.length; k++) {
            System.out.println("el vector  inverso  es : " + inverso[k]);
        }
    }}
