/*
 * Material Extra Ejercicio # 14  
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre
sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada
operación matemática y deben devolver sus resultados para imprimirlos en el main.

 */
package egg_ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class MaterialExtraEjercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in).useDelimiter("\n");
        DecimalFormat df = new DecimalFormat("###.##");             
    
        float n1, n2, suma;   int operacion;
        
        System.out.println("Ingrese el primer numero");
        n1 = leer.nextFloat();
        while (n1==0){
             System.out.println("Error, nro. debe ser distinto de cero, Ingrese nuevmente el 1er. numero");
            n1 = leer.nextFloat();
        }
        System.out.println("Ingrese el segundo numero");
        n2 = leer.nextFloat();
        while (n2==0){
             System.out.println("Error, nro. debe ser distinto de cero, Ingrese nuevmente el 2do. numero");
            n2 = leer.nextFloat();
        }
        System.out.println("Ingrese la operacion que desea realizar");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        operacion = leer.nextInt();
        if(operacion == 1) {
            System.out.println("La suma de los numeros es de " + sumar(n1, n2));
        }
        if(operacion == 2) {
            System.out.println("La resta de los numeros es de " + restar(n1, n2));
        }
        if(operacion == 3) {
            System.out.println("La multiplicacion de los numeros es de " + df.format(multiplicar(n1, n2)));
        }
        if(operacion == 4) {
            System.out.println("La division de los numeros es de " + df.format(dividir(n1, n2)));
        }
        if(operacion > 4 || operacion < 1) {
            System.out.println("Especifico una operacion invalida");
        }
        
    }
       public static float sumar(float a, float b) {
        return a + b;
    }
    public static float restar(float a, float b) {
        return a - b;
    }
    public static float multiplicar(float a, float b) {
        return a * b;
    }
    public static float dividir(float a, float b) {
        if(b == 0) {
            return 0;
        } else {
            return a / b;
        }
    }
}
