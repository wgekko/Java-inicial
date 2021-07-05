/*
 * Material Extra Ejercicio # 13 
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M
cantidad de hijos. Escriba un programa que pida la cantidad de familias y para
cada familia la cantidad de hijos para averiguar la media de edad de los hijos de
todas las familias.

 */
package egg_ejercicios;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class MaterialExtraEjercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
       // DecimalFormat df = new DecimalFormat("###.##");
         
         int familias, hijos, cantidadHijosTotales;
        double edad, edadMedia = 0;  edad = 0;    cantidadHijosTotales = 0;
        
        System.out.println("Ingrese la cantidad de familias");
        familias = leer.nextInt();
        for(int i = 0; i < familias; i++) {
            System.out.println("Ingrese la cantidad de hijos que tiene la familia "+(i+1));
            hijos = leer.nextInt();
            for(int j = 0; j < hijos; j++) {
                System.out.println("Ingrese la edad del hijo " + (int) (j + 1));
                edad += leer.nextInt();
                cantidadHijosTotales += 1;
            }
        }
        edadMedia = Math.round(edad / cantidadHijosTotales);
        System.out.println("La edad media de todos los hijos es de " + (int) edadMedia);
    }
    
}
