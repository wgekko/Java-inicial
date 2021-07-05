/*
 * Material Extra Ejercicio # 8 
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de
números pares y la cantidad de números impares. Al igual que en el ejercicio
anterior los números negativos no deben sumarse. Nota: recordar el uso de la
sentencia break.

 */
package egg_ejercicios;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class MaterialExtraEjercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner leer = new Scanner(System.in).useDelimiter("\n");
       // DecimalFormat df = new DecimalFormat("###.##");
         int numero, par, impar, num;
        par = 0;  impar = 0;  num = 0;        
        
        do{
            
            System.out.println("Ingrese un numero(número multiplo de 5 fin del programa )");
            numero = leer.nextInt();
            if(numero % 5 == 0) {
                break;
            }
            if(numero > 0 ) {
                num += 1;
                if(numero % 2 == 0) {
                    par += 1;
                } else {
                    impar += 1;
                }
            }
            
            
        } while(numero > 0 && numero % 5 != 0);
        System.out.println("La cantidad de números total  es de " + num);
        System.out.println("La cantidad de numeros pares es de " + par);
        System.out.println("La cantidad de numeros impares es de " + impar);
    }
       
}
    

