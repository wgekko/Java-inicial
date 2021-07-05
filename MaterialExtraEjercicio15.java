/*
 * Material Extra Ejercicio # 15
Diseñe una función que pida el nombre y la edad de N personas e imprima los
datos de las personas ingresadas por teclado e indique si son mayores o menores
de edad. Después de cada persona, el programa debe preguntarle al usuario si
quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra
“No”.
 */
package egg_ejercicios;

import java.util.Scanner;
//import jdk.tools.jlink.internal.SymLinkResourcePoolEntry;
//import static sun.net.util.IPAddressUtil.scan;
//import static sun.net.util.IPAddressUtil.scan;
/**
 *
 * @author WALTER GOMEZ
 */
public class MaterialExtraEjercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner leer = new Scanner(System.in).useDelimiter("\n");
       // DecimalFormat df = new DecimalFormat("###.##");             
   
        String mostrar;
        System.out.println("Ingrese la cantidad de personas");
        int personas = leer.nextInt();
         String [] nombres = new String[personas];
        int[] edad = new int[personas];
        for (int i = 0; i < personas; i++) {
            System.out.println("Ingrese el nombre de la persona");
            nombres[i] = leer.next();
            System.out.println("Ingrese la edad");
            edad[i] = leer.nextInt();
        }
        for (int i = 0; i < personas; i++) {
            System.out.println("Su nombre: " + nombres[i]);
            System.out.println("Su edad: " + edad[i]);
            System.out.println("Desea seguir mostrando personas? (Si/No)");
            mostrar = leer.next();
            if (i < (int) (personas - 1)) {
                if (mostrar.equals("Si")) {
                    continue;
                }
                if (mostrar.equals("No")) {
                    break;
                }
            }
        }
        leer.close();

    }
    
}
