/*
 * Material Extra Ejericicio # 18
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).


 */
package egg_ejercicios;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class MaterialExtraEjercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
       // DecimalFormat df = new DecimalFormat("###.##");    
       
        int[] vectorA = { 1, 2, 3, 5, 6 };  int[] vectorB = { 1, 3, 3, 5, 77 };
        int cont = 0;
        for (int i = 0; i < 5; i++) {
            if (vectorA[i] != vectorB[i]) {
                System.out.println(vectorA[i] + " != " + vectorB[i]);
                System.out.println("Los vectores no son iguales");
                break;
            } else {
                System.out.println(vectorA[i] + " = " + vectorB[i]);
                cont += 1;
            }
        }
        if (cont == 5) {
            System.out.println("Los vectores son iguales");
        }
    }
    
}
