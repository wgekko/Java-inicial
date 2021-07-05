/*
 Ejercicio # 21 
Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package egg_ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class EjercicioVeintiuno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        DecimalFormat df = new DecimalFormat("###.##");
        float n;  int c;

        System.out.println("ingrese cantidad de Euros a cambiar  formato (23 , 45) ");
        n = leer.nextFloat();
        while (n < 0) {
            System.out.println("Error, dato negativo, ingrese cantidad de Euros nuevamente  ");
            n = leer.nextFloat();
        }
        System.out.println(" elija una opcion \n  1- libras \n  2- dolares \n  3 - yen ");
        c = leer.nextInt();
        while (c < 0 || c > 3) {
            System.out.println("Error, opción incorrecta , digite la opción nuevamente  ");
            n = leer.nextInt();
        }

        cambio(n, c);
    }

    public static void cambio(float d, int a) {
        DecimalFormat df = new DecimalFormat("###.##");
        switch (a) {
            case 1:
                System.out.println(d + " euros son  " + df.format(d * 0.86) + " libras "); break;
            case 2:
                System.out.println(d + " euros son  " + df.format(d * 1.28611) + " dolares "); break;
            case 3:
                System.out.println(d + " euros son  " + df.format(d * 129.852) + " yenes "); break;
            default :
                    System.out.println("Opcion no valida "); break;
        }

    }
}
