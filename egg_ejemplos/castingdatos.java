package egg_ejemplos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author walter
 */

/*
la consigna 
1-CASTEO: Codifique un programa que solicite el ingreso de un numero decimal y asigne el mismo a una variable valorDecimal de tipo double,
aplique las operaciones de CASTING para convertir la variable a los siguientes tipos de datos, short, int, long, String, float 
investigue las diferentes formas de lograr la conversión. Muestre por pantalla el resultado de las conversiones.

*/

import java.util.Scanner;

public class castingdatos {

    public static void main(String[] args) {
		
                //declaracion de las variables  	
		double  numOriginal = 0;
		short   numShort;
		int 	numint;
		long    numlong;
		String  numString;
		float 	numfloat;
		                
		String numingresado;
		int indexofcoma;
		                 
		String respuesta;
		boolean salida = true;
		
				
		while (salida) {
                //se valida el ingreso de un double
			System.out.println("Por favor ingrese un numero que sea double. Debe contener punto, no coma.");
			numingresado = new Scanner(System.in).nextLine();
			indexofcoma = numingresado.indexOf(".");
				
                // se verifica que se coloque punto no coma 
			if (indexofcoma >=1) {
				numOriginal= Double.parseDouble(numingresado);
				break;
			}else {
				System.out.println("Ha ingresado un numero equivocado, por favor verificar.");
				System.out.println("");
								
			} 
				
		}
	
		
		while (salida) {
			System.out.println("A que desea castear (convertir) el numero double  " + numOriginal + "? a short, int, long,String o float?");
			System.out.println("por favor ingrese la palabra seleccionada (short, int, long,String o float) para continuar");
			respuesta= new Scanner(System.in).nextLine();
			
			if (respuesta.toLowerCase().contentEquals("short")) {
//				CASTEO A SHORT
				numShort = (short) numOriginal;
				System.out.println(numOriginal + " es el numero original y el casteado a short es " + numShort);
				System.out.println("");
				
				
			}else if (respuesta.toLowerCase().contentEquals("int")) {
//				CASTEO A  INT
				numint = (int) numOriginal;
				System.out.println(numOriginal + " es el numero original y el casteado a int es " + numint);
				System.out.println("");
				
				
			}else if (respuesta.toLowerCase().contentEquals("long")) {
//			CASTEO A LONG
				numlong = (long)numOriginal;
				System.out.println(numOriginal + " es el numero original y el casteado a long es " + numlong);
				System.out.println("");
				
				
			}else if (respuesta.toLowerCase().contentEquals("string")) {
//			CASTEO A STRING
				numString = String.valueOf(numOriginal);
				System.out.println(numOriginal + " es el numero original y el casteado a string es " + numString);
				System.out.println("");
				
				
			}else if (respuesta.toLowerCase().contentEquals("float")) {
//				CASTEO A FLOAT 
				numfloat = (float) numOriginal;
				System.out.println(numOriginal + " es el numero original y el casteado a float es " + numfloat);
				System.out.println("");
				
				
			}else {
				System.out.println("Por favor ingrese una respuesta correcta.");
				System.out.println("");
			}
			
			
		 salida = salida();	
		}
		
		System.out.println("");
		System.out.println("Fin de programa");
		
	}
//	METODO
	public static boolean salida() {
		System.out.println("Desea continuar, ingrese si/no para continuar ?");
		String salida = new Scanner(System.in).nextLine();
		if (salida.toLowerCase().contentEquals("si")) {
			
			return true;
			
		} else {
		 return false;				

		}
		
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
