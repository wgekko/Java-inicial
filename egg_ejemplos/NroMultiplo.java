package egg_ejemplos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author WALTER GOMEZ
 */
/*
Laboratorio Computacion I
consigna
5)- Programar un algoritmo recursivo que en cada recursión multiplique a si mismo un número ingresado por el usuario hasta que el valor resultante sea mayor
100.000.000. Valide que el número ingresado por el usuario sea mayor a 1, ejemplo:
Se ingresa el valor 6
1 iteración => 6 * 6 = 36
2 iteración => 36 * 36 = 1296
3 iteración => 1296 * 1296 = 1679616
4 iteración => 1679616 * 1679616 = 2821109907456
Fin Recursión
*/

public class NroMultiplo {
     
	@SuppressWarnings("resource")
	public static void main(String[] args) {
            //declaracion de variables 
		long num =0;
	        int iteracion =0;  
	        long resultado =0;
	        
	        System.out.println("Ingrese un numero");
	        while (true) {
            //	validacion del numero ingrsado 
		       num= new Scanner(System.in).nextInt();
		       
		       if (num <=1) {
		    	   
				System.out.println("Debe ingresar un numero mayor que 1");
				
			}	else {
				
				break;}			
		       
			}

	        while((100000000 > num)) {
            
	        resultado = recursion(num);
	        num = resultado;
	        
	        System.out.println(resultado);

	            iteracion= iteracion + 1;
	            
	        }
	       
	        System.out.println("El numero ingresado se multiplico " + iteracion + " veces por si mismo para llegar a " + resultado);
	        
	    }
	
            //	se desarrolla el metodo 
	    public static long recursion(long i) {
	        i = i*i;
	        return i;
	    }    
}
