/*
Ejercicio # 16 
 Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
package egg_ejercicios;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //DecimalFormat df = new DecimalFormat("###.##");
        int n, suma, c;
        suma = 0; c = 1;

        do {
            System.out.println(" -- Digite   número  "+c+"/20 (numero 0 para terminar) -- \n");
            n = leer.nextInt();
             if (n > 0) {
                    suma += n;
                       c+=1;
                }else  if (n == 0) {
                System.out.println("  Se capturó el número cero  \n");
                break;
            }
        } while (c <= 20);

        System.out.println("  La suma es : " + suma + " \n");

    }
}
