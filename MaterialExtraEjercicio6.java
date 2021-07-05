/*
 * Material Extra Ejercicio # 6 
Leer la altura de N personas y determinar el promedio de estaturas que se
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general

 */
package egg_ejercicios;


import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class MaterialExtraEjercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
       DecimalFormat df = new DecimalFormat("###.##");
       
       
        int n, cont = 0;  float suma = 0;   float altura;
        Random Aleatorio= new Random();
        System.out.println("Digite la cantidad de personas para promediar su altura ");
        n=leer.nextInt();
        //double[] alturas = {1.59, 1.78, 1.64, 1.48, 1.50, 1.58};
        float[] alturas = new float[n] ;
        // lleno el vector 
        for (int i = 0; i < n; i++) {
            alturas[i]= Aleatorio.nextFloat()+(float)1.1;
            System.out.println(alturas[i]);
        }
        
        for(int i = 0; i < n; i++) {
         //   System.out.println("Ingresar la altura de la persona");
            if(alturas[i] < 1.6) {
                cont += 1;
                suma += alturas[i];
//                System.out.println(alturas[i]);
            }
        }
        System.out.println("El promedio de alturas menores a 1.59 es de " +df.format( (suma/cont)));
    }
       
    }

