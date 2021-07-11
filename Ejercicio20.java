/*
 Ejercicio # 20 
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **

 */
package egg_ejercicios;

import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //DecimalFormat df = new DecimalFormat("###.##");
        int n; int [] vector = new int [4];
        //String dato;
        
         System.out.println("-- Debe ingresar 4 valores dentro de rango entre 1 y 20 ");
          for (int i = 0; i < 4; i++) {
               System.out.println("ingrese un  valor entre 1/20 ");
            n = leer.nextInt();
             while (n<1 || n>21){        
                   System.out.println("Error, dato erroneo, ingrese nuevamente el valor ");
                         n=leer.nextInt();
                }
             vector[i]=n;
        }
         
          for (int i = 0; i < 4; i++) {
           System.out.println(vector[i]+String.join("", Collections.nCopies(vector[i], "*")));      
        }
          
    }
    
       //System.out.println("ingrese un  valor entre 1/20 ");
          //  n = leer.nextInt();
            // validando usando casting de int a String
            //dato= String.valueOf(n);
        //validar(dato);
    /*
    public static void validar( String  letra){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
         int n;
          
          if (letra.matches("[1-20](1,2)")==false){
              n= Integer.parseInt(letra);
            System.out.println("Error, dato erroneo, ingrese nuevamente el valor ");
            n=leer.nextInt();
        }
    }*/
}
