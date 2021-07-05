/*
 * Material Extra Ejercicio # 10 
Realice un programa para que el usuario adivine el resultado de una multiplicación
entre dos números generados aleatoriamente entre 0 y 10. El programa debe
indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea
incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. Para
realizar este ejercicio investigue como utilizar la función Math.random() de Java

 */
package egg_ejercicios;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class MaterialExtraEjercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

          Scanner leer = new Scanner(System.in).useDelimiter("\n");
       // DecimalFormat df = new DecimalFormat("###.##");
        
        int numeroAleatorio, numeroAdivinado;
        do{
            numeroAleatorio = (int) Math.floor(Math.random() * 10) * (int) Math.floor(Math.random() * 10);
            System.out.println(numeroAleatorio);
            System.out.println("Ingrese el numero generado");
            numeroAdivinado = leer.nextInt();
            if(numeroAdivinado == numeroAleatorio) {
                System.out.println("Adivino el numero!");
                break;
            } else {
                System.out.println("No adivino el numero! Siga participando!");
            }
        } while(numeroAleatorio != numeroAdivinado);
    }
    
}
