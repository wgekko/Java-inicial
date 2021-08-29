/*
 * TP 5 - Parte 2 
 * Desarrolle el ejercicio 2), definiendo una función que sirva para decidir
  cuándo un número contenido en el arreglo es mayor que el promedio.
 */
package egg_ejemplos;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class ArregloCaluloPromedio {
    
      
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int i, cont=0;
        double promedio = 0, prom=0;
        int[] numero = new int[10];
        int [] mayor = new int [10];
      
        System.out.println("Se ingresaran 10 números para calcular el promedio  ");
        for (i = 0; i < 10; i++) {
            System.out.print(" ingrese el numero de la posición  [" +(i+1) + "] = ");
            numero[i] = sc.nextInt();
        }        
        
        for (int h = 0; h < 10; h++) {           
                promedio = promedio + numero[h];
                prom = promedio/10;
            
            }
        for (int j = 0; j < 10; j++) {
             if (numero[j] > prom){
                 mayor[j] = numero[j];
                 cont++;
             }
            
        }
          
        System.out.println("El promedio de los números ingresados es ..:  "+ prom + "\n");  
        System.out.println("la cantidad de números mayores al promedio son :"+cont+"\n");
      
                 mayores(numero, prom);
        
    } 
   //Método void que muestra los elementos que sean mayores al promedio
public static void mayores(int[] n, double prom) {

        for (int k = 0; k < n.length; k++) {
            if (n[k] > prom) {
                System.out.println(" Los números mayores a promedio son : " + n[k] + "\n");
            }
        }

    }
}
