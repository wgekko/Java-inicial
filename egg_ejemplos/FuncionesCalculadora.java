package egg_ejemplos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WALTER GOMEZ
 */
import java.text.DecimalFormat;
import java.util.Scanner;
/*
Laboratorio Computacion I
4)- Codifique 5 funciones java que resuelvan las operaciones matemáticas:
Suma +
Resta –
Multiplicación *
División /
Modulo %
Aplicadas sobre 2 números decimales.
Posteriormente codifique un programa que solicite el ingreso por parte del usuario de 2 números decimales y una vez ingresados le pregunte qué operación quiere realizar:
a- Suma +
b- Resta –
c- Multiplicación *
d- División /
e- Modulo %
En caso de que no ingrese ninguna de las opciones permitidas emita el mensaje “La opción ingresada no es válida” y vuelva nuevamente a preguntarle qué operación matemática quiere ejecutar. Si la opción es válida envié los números decimales ingresados por el usuario a la función que corresponda y retorne el resultado de la operación. Finalmente muestre un mensaje indicando el resultado de la operación realizada.
*/



public class FuncionesCalculadora {
// CALCULADORA BASICA DE 2 NUMEROS 
//  DECLARACION DE VARIABLES 
	static int primernumero  =  0;
	static int segundonumero =  0;
	static int resultado     =  0;
	static double result     =  0;
	static int counter		 = 	1;
	
	static String operacion  = "";

			
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {		

		System.out.println("Ingrese un numero :");
		primernumero= new Scanner(System.in).nextInt();
		System.out.println("Ingrese un numero :");
		segundonumero= new Scanner(System.in).nextInt();		
		
		while (counter == 1) {
			System.out.println("Integrese su operacion. Debe ser suma, resta, division, multiplicacion o modulo");
			operacion= new Scanner(System.in).nextLine();		
			
			if (operacion.toLowerCase().contentEquals("suma")){
                            
				resultado = suma(primernumero,segundonumero, resultado);
				System.out.println(primernumero + " + " + segundonumero + " = " + resultado);
				counter		 = 0;
				
				
			}else if (operacion.toLowerCase().contentEquals("resta")) {

				resultado = resta(primernumero,segundonumero, resultado);
				System.out.println(primernumero + " - " + segundonumero + " = " + resultado);
				counter		 = 0;
				
				
			
			}else if (operacion.toLowerCase().contentEquals("division")) {

				result = division(primernumero,segundonumero, resultado);
				
				DecimalFormat f = new DecimalFormat("##.00");
			  
				System.out.println(primernumero + " / " + segundonumero + " = " + f.format(result));
				counter		 = 0;
				counter		 = 0;
				
				
				
			}else if (operacion.toLowerCase().contentEquals("multiplicacion")) {

				resultado = multiplicacion(primernumero,segundonumero, resultado);
				System.out.println(primernumero + " * " + segundonumero + " = " + resultado);
				counter		 = 0;
				
				
				
				System.out.println("ingreso algo correcto");
			}else if (operacion.toLowerCase().contentEquals("modulo")) {
                            
				
				resultado = modulo(primernumero,segundonumero, resultado);
				System.out.println(primernumero + " % " + segundonumero + " = " + resultado);
				counter		 = 0;
				
							
			}else {

				System.out.println("La opcion ingresada no es valida");
			}
			
		}	
		

	}
//	 METODOS.
	public static int suma(int uno,int dos,int resultado) {

		resultado = uno + dos;
		return resultado;
			
	}
	
	public static int resta(int uno,int dos,int resultado) {
	
		resultado = uno - dos;
		return resultado;
			
	}
	public static double division(int uno,int dos,int resultado) {
	
		resultado = uno / dos;
		return resultado;
	}
	public static int multiplicacion(int uno,int dos,int resultado) {
	
		resultado = uno * dos;
		return resultado;
	}
	public static int modulo(int uno,int dos,int resultado) {
		
		resultado = uno % dos;
		return resultado;
		}    
    
    
}
