/*
 * TP 5 - parte # 1 - 
Calcular el promedio de 10 valores almacenados en un vector 
 */
package egg_ejemplos;
import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class CalculoPromedio {
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        int i;
        double promedio = 0;
        int[] numero = new int[10];        
        //lectura de datos y llenar el array
        System.out.println("Se ingresaran 10 números para calcular el promedio  ");
        for (i = 0; i < 10; i++) {
            System.out.print(" ingrese el numero de la posición  [" +(i+1) + "] = ");
            numero[i] = sc.nextInt();
        }        
        //Recorrer el array y calcular la promedio 
        for (i = 0; i < 10; i++) {
           
                promedio = promedio + numero[i]; //se suma el valor de esa posición
                
            }
        
              //Calcular y mostrar el promedio 
        System.out.println("El promedio de los números ingresados es ..:  "+ promedio/10);     
     
    }
    
}
