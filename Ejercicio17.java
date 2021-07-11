/*
Ejercicio # 17
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
se utilizan las siguientes funciones de Java Substring(), Length(), equals().

 */
package egg_ejercicios;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //DecimalFormat df = new DecimalFormat("###.##");
        String dato;  int sum1, sum2;  sum1 = 0;   sum2 = 0;
        System.out.println(" - Recuerde si ingresa la secuencia &&&&& sale del programa -");
        System.out.println(" Ingrese la cadena ");
        dato = leer.nextLine().toUpperCase().trim();
        //System.out.println(dato +" " + dato.substring(0, 1) +" "+ dato.substring(dato.length() - 1, dato.length() ));
        
        while (dato.length() > 5) {
            System.out.println(" ERROR;  ha ingresado un cadena superior a 5 caracteres");
            System.out.println(" ingrese la cadena nuevamente ");
            dato = leer.nextLine().toUpperCase().trim();
        }

        while (dato.length() == 5) {
            if (dato.equals("&&&&&") == true) {
                System.out.println("Salio del programa");
                break;
            }
            if (dato.substring(0, 1).equalsIgnoreCase("X") && dato.substring(dato.length() - 1, dato.length() ).equalsIgnoreCase("O")) {
                sum1 += 1;
            } else  {
                sum2 += 1;
            } 
            if (dato.equals("&&&&&") == true) {
                break;
            }
            System.out.println(" Ingrese la cadena ");
            dato = leer.nextLine().toUpperCase().trim();
            while (dato.length() > 5) {
                System.out.println(" ERROR;  ha ingresado un cadena superior a 5 caracteres");
                System.out.println(" ingrese la cadena nuevamente ");
                dato = leer.nextLine().toUpperCase().trim();
            }
        }
        if (sum1 == 0 && sum2 == 0) {
            System.out.println(" Sin lecturas de cadenas ingresadas ");
        } else {
            System.out.println("la cantidad de lecturas CORRECTAS  es: " + sum1 + " de cadenas ingresadas");
            System.out.println("la cantidad de lecturas INCORRECTAS es: " + sum2 + " de cadenas ingresadas");
        }
    }
}
