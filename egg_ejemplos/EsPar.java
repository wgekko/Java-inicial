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
 
/*
Laboratorio Computacion I
la consigna Ejercicio nro. 2 
Codifique un método denominado esPar que reciba como parámetro un valor numérico entero 
y retorne true en caso de que el numero sea par, caso contrario retorne false. Compruebe
el funcionamiento del método solicitando al usuario del programa que ingrese números aleatorios.
*/

import java.util.Scanner;



public class EsPar {
		
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//se ingresa el numero 
		int num = 0;
		System.out.println("Ingrese un numero entero :");
		num = new Scanner(System.in).nextInt();
		
		esPar(num);
		
		}
		
		static public void esPar(int num) {
//			verifico si es par o no  
			
			if (num%2 ==0) {
				
				System.out.println("el numero es par:" + num);
			} 
			else {
				System.out.println("el numero es impar:" + num);
			}

		
	}
	
	
}
