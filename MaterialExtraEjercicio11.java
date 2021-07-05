/*
 * Material Extra Ejercicio # 11 
Escribir un programa que lea un número entero y devuelva el número de dígitos
que componen ese número. Por ejemplo, si introducimos el número 12345, el
programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente
utilizando el operador de división. Nota: recordar que las variables de tipo entero
truncan los números o resultados.

 */
package egg_ejercicios;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class MaterialExtraEjercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
       // DecimalFormat df = new DecimalFormat("###.##");
       
          int numero, digitos, resto;  digitos = 1;
          
        System.out.println("Ingrese el numero a calcular digitos");
        numero = leer.nextInt();
        resto = numero;
        while(resto / 10 >= 1) {
            resto /= 10;
            digitos += 1;
        }
        System.out.println("La cantidad de digitos es :"+ digitos+" del numero ingresado : " + numero );
    }
       
    }
    

