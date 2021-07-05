/* 
Desarrollo de la guia de ejercicio 
Ejercicio # 2 
Escribir un programa que pida dos números enteros por teclado
y calcule la suma de los dos. EL programa deberá después mostrar
el resultado de la suma
*/
package egg_ejercicios;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class EjerciciosDos {

  
    public static void main(String[] args) {        
       int n1,n2,suma;
        suma=0;        
        System.out.println("Ingrese  Numero#1 :");
        Scanner leer = new Scanner(System.in);
        n1=leer.nextInt();
        
         System.out.println("Ingrese  Numero#2 :");
          n2=leer.nextInt();
                
          suma=n1+n2;
          System.out.println(" La suma del numero: "+n1 + " y el número:  "+n2+ " es "+suma);
          System.out.println(" la suma es :"+(n1+n2)); // otra manera de presentar la suma 
           
    }
    
}
