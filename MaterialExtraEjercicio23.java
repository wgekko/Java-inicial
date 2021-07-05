/*
 * Material Extra Ejercicio # 23 
Realizar un programa que complete un vector con los N primeros números de la
sucesión de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de
los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por
ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función que
reciba como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.
Para conocer más acerca de la serie de Fibonacci consultar el siguiente link:
// https://quantdare.com/numeros-de-fibonacci/

 */
package egg_ejercicios;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class MaterialExtraEjercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in).useDelimiter("\n");        
       // DecimalFormat df = new DecimalFormat("###.##");   
       int nro;
       
       do{
       System.out.println("Ingrese hasta donde quiere imprimir de la secuencia de Fibonacci");
        nro = leer.nextInt();     
      }while(nro<1); 
       
        System.out.println("calculo de fibonacci - sin recursividad -");
        Fibonacci(nro);
        System.out.println("calculo de fibonacci - con  recursividad -");
        System.out.println(" Para el número de secuencia  "+nro+" le corresponde "+FibonacciRecursivo( nro ));
        //FibonacciRecursivo(nro);
    }
    // desarrollo con un procedimiento 
    public static  void Fibonacci( int n){
        int a=1,b=1,c;
        for (int i = 0; i < n; i++) {
            System.out.println("Posición #"+(i+1)+" : "+a);
            c=a+b; a=b; b=c;
        }
        
    }
    // desarrollo con una función 
     public static  int FibonacciRecursivo( int n){
        int dato; 
        if ( n==1 || n==2){
             return dato=1;            
        }else{
            
             dato = FibonacciRecursivo(n-1) + FibonacciRecursivo(n-2); 
        }
         return dato;
    }
}
