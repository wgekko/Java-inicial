/*
 * Material Extra Ejercicio 16
Crea una aplicación que nos pida un número por teclado y con una función se lo
pasamos por parámetro para que nos indique si es o no un número primo, debe
devolver true si es primo, sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25
no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

 */
package egg_ejercicios;

import java.util.Scanner;
/**
 *
 * @author WALTER GOMEZ
 */
public class MaterialExtraEjercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
       // DecimalFormat df = new DecimalFormat("###.##");             
       
        int n;
        System.out.println("Ingrese un numero a verificar (primo/no primo)");
        n = leer.nextInt();
        leer.close();
        if (esPrimo(n)) {
            System.out.println("El numero " + n + " es primo");
        } else {
            System.out.println("El numero " + n + " no es primo");
        }
    }
       
public static boolean esPrimo(int n) {       
        int cont = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cont += 1;
            }
        }
        if (cont == 2) {
            return true;
        } else {
            return false;
        }
    }
    
}
