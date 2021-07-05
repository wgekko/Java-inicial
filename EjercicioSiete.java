/*
Ejercicio # 7 
Inplementar un programa que dado dos números enteros 
determine cuál es el mayor y lo muestre por pantalla 
 */
package egg_ejercicios;

import static java.lang.Math.max;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class EjercicioSiete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //DecimalFormat df = new DecimalFormat("###.##");
        int n1, n2, aux;

        System.out.println("Ingrese  el 1er. número  :");
        n1 = leer.nextInt();
        System.out.println("Ingrese  el 2do. número  :");
        n2 = leer.nextInt();
        if (n1 > n2) {
            aux = n1;
        } else {
            aux = n2;
        }
        System.out.println("- usando condicional - el mayor número  es : " + aux);
           System.out.println("- usando funcion max : " + max(n1,n2));

}
}