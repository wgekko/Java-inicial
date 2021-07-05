/*
Ejercicio # 12 
Considera que estás desarrollando una web para una empresa que fabrica motores
(suponemos que se trata del tipo de motor de una bomba para mover fluidos).
Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4.
El programa debe mostrar lo siguiente:
o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una
bomba de agua”.
o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una
bomba de gasolina”.
o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una
bomba de hormigón”.
o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una
bomba de pasta alimenticia”.
o Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No
existe un valor válido para tipo de bomba” *
To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg_ejercicios;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class EjercicioDoce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //DecimalFormat df = new DecimalFormat("###.##");
        int TipoMotor;
        String dato;

        System.out.print(" -- Digite el tipo de motor de una bomba (e valor debe estar entre 1/4) -- \n");
        TipoMotor = leer.nextInt();

        while (TipoMotor < 1 || TipoMotor > 4) {
            System.out.print(" -- NO existe  un valor válido para el tipo de bomba ingresada -- \n");
            System.out.print("  Desea volver a ingresar el dato (S = si / N = no)\n");
            dato = leer.next().trim();
            if (dato.equalsIgnoreCase("s")) {
                System.out.print(" -- Digite el tipo de motor de una bomba (e valor debe estar entre 1/4) -- \n");
                TipoMotor = leer.nextInt();
            } else {
                System.out.print(" -- Salio del programa  -- \n");
                break;
            }
            
        }
         //   System.out.flush();
         
          switch (TipoMotor)
                {
                    case  1:
                        System.out.print(" --------------------------------------------------------- \n");
                        System.out.print(" --- La bomba es una bomba de agua  --- \n");
                        System.out.print(" --------------------------------------------------------- \n");break;
                    case 2:
                        System.out.print(" -------------------------------------------------------------- \n");
                        System.out.print(" --- La bomba es una bomba de gasolina ---  \n");
                        System.out.print(" -------------------------------------------------------------- \n");break;
                    case 3:
                        System.out.print(" ---------------------------------------------------------------- \n");
                        System.out.print(" --- La bomba es una bomba de  hormigón ---  \n");
                        System.out.print(" ---------------------------------------------------------------- \n");break;
                    case 4:
                        System.out.print(" ------------------------------------------------------------------------ \n");
                        System.out.print(" --  La bomba es una bomba de pasta alimenticia -- \n");
                        System.out.print(" ------------------------------------------------------------------------ \n"); break;
                    default:
                        System.out.print(" ---------------------------------------- \n");  break;
                }
    }
}
