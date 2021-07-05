/*
Ejercicio # 13 
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta
 */
package egg_ejercicios;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class EjercicioTrece {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //DecimalFormat df = new DecimalFormat("###.##");
        int nota;
        String dato;
        dato = "";

        System.out.print(" -- Digite una nota entre 0 y 10  -- \n");
        nota = leer.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.print(" -- El valor de la nota está fuera del rango, ingrese nuevamente el valor!! -- \n");
            nota = leer.nextInt();
        }

        System.out.print(" -- La nota ingresa es :"+nota+" es Correcto!!! -- \n");
        
          System.out.print("  Desea volver a ingresar el dato (S = si / N = no)\n");
            dato = leer.next().trim();
        while (dato != "") {
            
           // System.out.print("  Desea volver a ingresar el dato (S = si / N = no)\n");
           // dato = leer.next().trim();
            if (dato.equalsIgnoreCase("s")) {
                System.out.print(" -- Digite una nota entre 0 y 10  -- \n");
                nota = leer.nextInt();
                while (nota < 0 || nota > 10) {
                    System.out.print(" -- El valor de la nota está fuera del rango, ingrese nuevamente el valor!! -- \n");
                    nota = leer.nextInt();
                }
                    System.out.print(" -- La nota ingresa es :"+nota+" es Correcto!!! -- \n");break;
            } else {
                System.out.print(" -- Salio del programa  -- \n");
                break;
            }
        }
    }

}
