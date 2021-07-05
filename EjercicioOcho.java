/*
 Ejercicio # 8 
Crear  un programa que dado un número determine si es par o impar 
 */
package egg_ejercicios;

import static java.lang.Math.max;
import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class EjercicioOcho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //DecimalFormat df = new DecimalFormat("###.##");
        int n1;

        System.out.println("Ingrese  el  número a verificar si es par/impar  :");
        n1 = leer.nextInt();
        
        if (n1 % 2  == 0) {
             System.out.println(" el número : "+n1 +" es par" );
        } else {
             System.out.println(" el número : "+n1 +" es  impar" );
        }
        
    }
    
}
