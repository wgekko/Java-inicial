/*
 Ejercicio #  23 
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido
 */
package egg_ejercicios;


import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class EjercicioVeintitres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //DecimalFormat df = new DecimalFormat("###.##");
        int n, b, cont;
        cont = 0;
        System.out.println("Ingrese el tamaño del vector ");
        n = leer.nextInt();
        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10 + 1);
            System.out.print("[" + vector[i] + "] ");
        }
        System.out.print("\nIngrese el valor a buscar en el  vector ");
        b = leer.nextInt();
        
        for (int i = 0; i < n; i++) {
            if (vector[i] ==b) {
                System.out.println("el valor " + b + " se encontró en la posición :" + (i+1));
                cont += 1;           
                 }     
            }
         if (cont>0){
              System.out.println("el valor " + b + " está  " + cont + " vez/veces");
             
         } else {
            System.out.println("el valor " + b + " NO se encontró en el vector");
         }
    }

}


