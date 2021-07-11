/*
 * Material Extra Ejercicio # 12 
Crear un programa que dibuje una escalera de números, donde cada línea de
números comience en uno y termine en el número de la línea. Solicitar la altura de
la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123

 */
package egg_ejercicios;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class MaterialExtraEjercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             Scanner leer = new Scanner(System.in).useDelimiter("\n");
       // DecimalFormat df = new DecimalFormat("###.##");
         int escalera;
        System.out.println("Ingrese el numero de pisos de la escalera");
        escalera = leer.nextInt();
        
        for(int i = 0; i < escalera; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ") ;
            }
            System.out.println("");
        }
        
    }
    
}
