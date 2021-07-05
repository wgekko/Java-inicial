/*
 *Material Extra Ejercicio # 2 
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a
cada una. A continuación, realizar las instrucciones necesarias para que: B tome el
valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B.
Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una
variable auxiliar.
 */
package egg_ejercicios;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class MaterialExtraEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //DecimalFormat df = new DecimalFormat("###.##");
          int aux, A, B, C, D;
        A = 12; B = 27; C = 67; D = 54;
        System.out.println(" valor en A: " + A);
        System.out.println(" valor en B: " + B);
        System.out.println(" valor en C: " + C);
        System.out.println(" valor en D: " + D);
        aux = B; B = C; C = A;  A = D;   D = aux;
        System.out.println(" valor reasignado A: " + A);
        System.out.println(" valor reasignado B: " + B);
        System.out.println(" valor reasignado C: " + C);
        System.out.println(" valor reasignado D: " + D);
        
          }
    
}
