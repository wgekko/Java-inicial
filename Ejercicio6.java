/*
 Ejercicio # 6 
Escribir un programa que lea un número entero por teclado 
y muestre por pantalla el doble, el triple y la raiz de ese número 
 */
package egg_ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class Ejercicio6 {
    
      public static void main(String[] args) {
          Scanner leer = new Scanner(System.in).useDelimiter("\n");
         DecimalFormat df = new DecimalFormat("###.##");
          
         double n;   
        System.out.println("Ingrese  un número  :");       
        n = leer.nextInt();           
         double redondeo = Math.round(Math.sqrt(n)*100.0)/100.0;     
          System.out.println("el doble usando numero por numero y una funcion redondeo");
          System.out.println(" el número ingresado es :  "+ n + " \n  su doble es : "+(n*n)+"\n su triple es :"+(n*n*n) );
            System.out.println( " La raiz cuadrada es : " +redondeo);
           System.out.println("el doble usando Math.pow()");
          System.out.println(" el número ingresado es :  "+ n + " \n  su doble es : "+Math.pow(n,2)+"\n su triple es :"+Math.pow(n,3) );
          System.out.println( " La raiz cuadrada es : " +df.format(Math.sqrt(n)));
         
}
}
    

