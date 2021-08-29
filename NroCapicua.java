/*
 * confeccionar  una app que detecte si un nro es capicua 
 */
package egg_ejemplos;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class NroCapicua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
            int n, aux, inverso = 0, cifra;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.print("Introduce un número  igual o mayor a  10: ");                                                 
            n = leer.nextInt();
        } while (n < 10);
       
        //le damos la vuelta al número
        aux = n;
        while (aux!=0){
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }
    
          System.out.println("el número ingresado es : " +n+((n==inverso)?"   Es capicua..." : "   No es capicua...."));
        /*
        if(n== inverso){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }
        */
    }
    
}
