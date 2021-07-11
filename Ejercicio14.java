/*
Edjercicio # 14 
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial.


 */
package egg_ejercicios;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //DecimalFormat df = new DecimalFormat("###.##");
        int limite; int valor; int suma; suma=0;
        System.out.print(" -- Digite el valor limite a considerar para sumar  -- \n");
        limite = leer.nextInt();

       do{
       
            System.out.print(" -- Ingrese el valor a sumar para alcanzar el lmite -- \n");
            valor = leer.nextInt();
            suma+=valor;
       
       }while (suma<limite);
           
           System.out.print(" -- La suma  de los datos ingresados "+suma+" -- \n");
    }
      
    }
    

