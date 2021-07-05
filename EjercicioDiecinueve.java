/*
Ejercicio # 19 
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*      *
*      * 
* * * *
 * 
 */
package egg_ejercicios;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class EjercicioDiecinueve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //DecimalFormat df = new DecimalFormat("###.##");
   
    LlenarMatriz();
}
    public static void LlenarMatriz (){        
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int c;        
        System.out.println("Ingrese el tamaño del cuadrado a dibujar ");
        System.out.println("recuerde que el valor no debe ser superior a 10 ");
        c=leer.nextInt();
        
         if(c >= 0 && c<=10) {
            
            for(int i = 0; i < c; i++) {
                System.out.print("*");
            }
            System.out.println();           
          
            for(int i = 0; i < c-2; i++) {
                System.out.print("*");
                for(int j = 0; j < c-2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }           
          
            for(int i = 0; i < c; i++) {
                System.out.print("*");
            }
        }else {
            System.out.println("Error,El dato a ingresar de "
                    + "estar entre 0 y 10");
        }
               System.out.println("\n");
 
    }
    }
    
   

