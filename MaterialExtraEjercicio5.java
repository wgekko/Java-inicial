/*
 * Maerial Extra Ejercicio # 5 
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre
dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real
que represente el costo del tratamiento (previo al descuento) y determine el importe
en efectivo a pagar por dicho socio.

 */
package egg_ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class MaterialExtraEjercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
       DecimalFormat df = new DecimalFormat("###.##");
        
        Character TipoSocio;  double pxTratamiento;  double pxTotal;
      
        System.out.println("Ingrese el tipo de socio de la  obra social ( A, B, o C) ");
        TipoSocio = leer.next().toUpperCase().trim().charAt(0);
        if (TipoSocio.equals('A') || TipoSocio.equals('B') || TipoSocio.equals('C')) {
            System.out.println("Ingrese el valor / costo  del tratamiento (formato ###,##)");
            pxTratamiento = leer.nextDouble();
            if (TipoSocio.equals('A')) {
                pxTotal = pxTratamiento *0.50;
                System.out.println("Para el socio tipo A (50% descuento ) precio del tratamiento es : " +df.format( pxTotal));
            } else if (TipoSocio.equals('B')) {
                pxTotal = pxTratamiento * 0.65;
                System.out.println("Para el socio tipo B (35% descuento) precio del tratamiento es : " +df.format( pxTotal));
            } else if (TipoSocio.equals('C')) {
                pxTotal = pxTratamiento;
                System.out.println("Para el socio tipo C (no tiene descuento ) el precio del tratamiento es : " + df.format(pxTotal));
            }
        } else {
            System.out.println("Ingreso un tipo de socio de obra social invalido");
        }
    }

}
