/*
 *Caluclo de la desvacion estandar  o tipica 
 */
package egg_ejemplos;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class DesvStand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		int n;
		Scanner leer = new Scanner(System.in);
		System.out.println("Cantidad de numeros: ");
		n = leer.nextInt();
		
		// almaceno los numeros en un array
		double numeros [] = new double[n];
		for (int i = 0; i<n; i++) {
			System.out.println("Ingrese un numero ");
			numeros [i] = leer.nextDouble();
			
		}
		//Media
		double media;
		double suma = 0;
		for (double i: numeros) {
			suma = suma + i;
		}
		media = suma / n;
		System.out.println("la media es " + media);
		
		//Varianza
		double varianza = 0;
		double sumatoria;
		for(int i = 0; i<n; i++) {
			sumatoria = Math.pow(numeros[i] - media, 2);
			varianza = varianza + sumatoria;
		}
		varianza = varianza / (n-1);
		
		//Desviacion
		double desviacion;
		desviacion = Math.sqrt(varianza);
		System.out.println("La desviacion estandar es " + desviacion);
		
	}	
}
