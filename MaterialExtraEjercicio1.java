/*
Material Extra Ejercicio # 1 
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si
el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2
horas.
 
 */
package egg_ejercicios;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class MaterialExtraEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //DecimalFormat df = new DecimalFormat("###.##");
        
          System.out.println("Ingrese el tiempo en minutos");
        int minutos = leer.nextInt();
        int horas = (int) Math.floor(minutos / 60);
        int dias = horas / 24;
        if(horas >= 24) {
            horas -= 24;
            dias += 1;
        }
        System.out.println("El tiempo ingresado de " + minutos + " minutos, equivale a : " + dias + " dias y " + horas + " horas.");
    }
    }
    

