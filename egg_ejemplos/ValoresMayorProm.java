/*
 * TP 5  - Parte 1 
Determinar con el vector, cuantos son mayores que el promedio; mostrar el promedio, 
el número de datos mayores que el promedio y 
la lista de valores mayores que el promedio 
 */
package egg_ejemplos;
import java.util.Scanner;


/**
 *
 * @author WALTER GOMEZ
 */
public class ValoresMayorProm {
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
          
        System.out.println("El promedio de los números ingresados es ..:  "+ prom);  
        System.out.println("la cantidad de números mayores al promedio son :"+cont);
        for (int k=0; k<10; k++) {
           if(mayor[k]>0){
            System.out.println(" Los números mayores a promedio son : " +mayor[k]);    
            }
            
        }        
   
     
    }
}
