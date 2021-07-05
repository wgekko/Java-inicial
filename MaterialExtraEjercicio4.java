/*
 * Material Extra Ejercicio # 4 
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 */
package egg_ejercicios;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class MaterialExtraEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //DecimalFormat df = new DecimalFormat("###.##");
        
          System.out.println("Ingrese el numero a convertir a romano");
        int num = leer.nextInt();
        while (num<1 || num>10){
            System.out.println("Error, dato debe estar entre 1 y 10, ingrese valor nuevamente");
            num = leer.nextInt();
        }
        switch(num) {
            case 1: System.out.println(" el nro.: "+num+" en número romano es  - I - ");
            break;
            case 2: System.out.println(" el nro.: "+num+ " en número romano es  - II - ");
            break;
            case 3: System.out.println( " el nro.: "+num+" en número romano es  - III -");
            break;
            case 4: System.out.println(" el nro.: "+num+" en número romano es -  IV -");
            break;
            case 5: System.out.println(" el nro. :"+num+" en número romano es - V -");
            break;
            case 6: System.out.println(" el nro. :"+num+" en número romano es - VI -");
            break;
            case 7: System.out.println(" el nro.: "+num+" en número romano es - VII -");
            break;
            case 8: System.out.println(" el nro. :"+num+" en número romano es - VIII -");
            break;
            case 9: System.out.println(" el nro. :"+num+ " en número romano es - IX - ");
            break;
            case 10: System.out.println("el nro. :"+num+" en número romano es - X - ");
            break;
            default: System.out.println("Numero invalido");
            break;
        }
    }
}
