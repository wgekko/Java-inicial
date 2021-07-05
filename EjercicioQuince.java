/*
Ejercicio # 15 
Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.

 */
package egg_ejercicios;

import java.util.Scanner; 
import java.io.IOException;


/**
 *
 * @author WALTER GOMEZ
 */
public class EjercicioQuince {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws IOException, InterruptedException{
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
        //DecimalFormat df = new DecimalFormat("###.##");
        int n1, n2, opc;
        System.out.print(" -- Digite el 1er. número  -- \n");
        n1 = leer.nextInt();
        while (n1 < 1) {
            System.out.print(" -- Error,  1er. número es menor a 1, ingreselo nuevamente -- \n");
            n1 = leer.nextInt();
        }
        System.out.print(" -- Digite el 2do. número  -- \n");
        n2 = leer.nextInt();
        while (n2 < 1) {
            System.out.print(" -- Error,  2do. número es menor a 1, ingreselo nuevamente -- \n");
            n2 = leer.nextInt();
        }
         new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        Menu(n1,n2);     
   }

    public static void Menu(int m, int n)  throws IOException, InterruptedException {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opc;
        System.out.print(" --------------------------------------------------------- \n");
        System.out.print(" ----------------------- Menú ------------------------ \n");
        System.out.print(" --------------------------------------------------------- \n");
        System.out.print(" -- 1 - Sumar --------------------------------------- \n");
        System.out.print(" --------------------------------------------------------- \n");
        System.out.print(" -- 2-  Restar -------------------------------------- \n");
        System.out.print(" --------------------------------------------------------- \n");
        System.out.print(" -- 3 - Multiplicar --------------------------------- \n");
        System.out.print(" --------------------------------------------------------- \n");
        System.out.print(" -- 4 - Dividir --------------------------------------- \n");
        System.out.print(" --------------------------------------------------------- \n");
        System.out.print(" -- 5 - Salir --------------------------------------- \n");
        System.out.print(" --------------------------------------------------------- \n");
        System.out.print(" --  Elija una opción------------------------------ \n");
        System.out.print(" --------------------------------------------------------- \n");
        opc = leer.nextInt();
         new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        Resultado(opc, m,n );
        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
    }

    public static void Resultado(int o, int m, int n)throws IOException, InterruptedException {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String dato;  dato = "";
        switch (o) {
            case 1:
                System.out.print(" -------------------------------------------------------------------------- \n");
                System.out.print(" --- La suma de " + m + " y " + n + " es :" + (m + n) + " --- \n");
                System.out.print(" -------------------------------------------------------------------------- \n");
                 new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
                Menu(m,n);
            case 2:
                System.out.print(" ------------------------------------------------------------------------ \n");
                System.out.print(" --- La resta de " + m + " y " + n + " es :" + (m - n) + " ---  \n");
                System.out.print(" ------------------------------------------------------------------------ \n");
                  new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
                Menu(m,n);
            case 3:
                System.out.print(" ---------------------------------------------------------------------------------- \n");
                System.out.print(" --- La multiplicación de " + m + " y " + n + " es :" + (m * n) + "---  \n");
                System.out.print(" ---------------------------------------------------------------------------------- \n");
                  new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
                Menu(m,n);
            case 4:
                System.out.print(" ------------------------------------------------------------------------ \n");
                System.out.print(" --- La división de " + m + " y " + n + " es :" + (m / n) + "---  \n");
                System.out.print(" ------------------------------------------------------------------------ \n");
                  new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
                Menu(m,n);
            case 5:
                       //new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
                System.out.print(" ----------------------------------------------------------------------------------------- \n");
                System.out.print(" --- ¿Está seguro que desea salir del programa? S=si / N=no ---  \n");
                System.out.print(" ------------------------------------------------------------------------------------------ \n");
               
                dato = leer.nextLine();                
                if (dato.equalsIgnoreCase("n"))
                {
                     new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
                    Menu(m,n);
                }  else if (dato.equalsIgnoreCase("s"))
                {
                   new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
                System.out.print(" ---  salió del programa  ---  \n"); break;   
                } 
                break;
            default:
                System.out.print(" ---------------------------------------- \n");
                break;
        }

    }
}

