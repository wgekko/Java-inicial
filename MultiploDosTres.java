/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg_ejemplos;
/**
 *
 * @author WALTER GOMEZ
 */
//import java.util.Scanner;
/*
laboratorio de Computacion I
la consigna del Ejercicio Nro 1 
Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que for.
*/


public class MultiploDosTres {

	//PROGRAMA PARA VER LOS NUMEROS DIVISIBLES POR 2 Y 3 EN UN FOR LOOP DE 100
	
	public static void main(String[] args) {
		// bucle for 
		for (int i = 0; i < 101; i++) {
			// IF para ver si es divisible por 2 y 3
			
			 if (i%2==0 && i%3==0) {
				// mostrar numero y que es divisible por 3 y 2 
				System.out.println("El Numero "+ i + " es divisible por 2 y 3");
				
			}
			 else if (i%2==0) {
				// mostrar numero y que es divisible por 2
				System.out.println("El Numero "+ i + " es divisible por solamente 2");
				
			} else if (i%3==0) {
				// mostrar numero y que es divisible por 3
				System.out.println("El Numero "+ i + " es divisible por solamente 3");
				
				
			} 

			else {
				// mostrar el numero y que no es divisible ni por 2 ni por 3
				System.out.println("El Numero "+ i + " no es divisible  por 2 o 3");
				

			}
			
		}

	}

}

