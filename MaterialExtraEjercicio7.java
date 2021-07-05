/*
 * Material Extra Ejercicio # 7
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y
los números serán introducidos por el usuario. Realice dos versiones del programa,
una usando el bucle “while” y otra con el bucle “do - while”.
 */
package egg_ejercicios;

//import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class MaterialExtraEjercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
       // DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("Ingrese  el valor de  N   número a ingresar :");
        int n = leer.nextInt();
        int cont = 0, num,  max = 0, min = 0, positivos = 0, suma = 0;
        
//         el desarrollo con  While

        while(cont < n) {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            if(max == 0 && min == 0) {
                max = num;
                min = num;
            }
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
            if(num > 0) {
                suma += num;
                positivos += 1;
            }
            cont += 1;
        }
        System.out.println("El numero maximo fue: " + max);
        System.out.println("El numero minimo fue: " + min);
        System.out.println("El promedio fue: " +( suma / positivos));
        
//        el desarrollo con  Do - While

        max = 0;  min = 0;  suma = 0; positivos = 0; cont = 0;
        
        do{
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            if(max == 0 && min == 0) {
                max = num;
                min = num;
            }
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
            if(num > 0) {
                suma += num;
                positivos += 1;
            }
            cont += 1;
            
        } while(cont < n);
        System.out.println("El numero maximo fue: " + max);
        System.out.println("El numero minimo fue: " + min);
        System.out.println("El promedio fue: " + (suma / positivos));
    }
}
    

