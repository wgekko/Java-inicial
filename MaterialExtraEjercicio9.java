/*
 * Material Extra Ejercicio # 9



 */
package egg_ejercicios;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class MaterialExtraEjercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
       // DecimalFormat df = new DecimalFormat("###.##");
        int n1, n2;   double cociente=0, resto;
        
        
        System.out.println("Ingrese el dividendo");
        n1 = leer.nextInt();
        System.out.println("Ingrese el divisor");
        n2 = leer.nextInt();
        DivisionRestaSucesiva(n1,n2);
    }
        
    public static void DivisionRestaSucesiva(int n, int m){
        float resto, cociente=0; 
                resto = n;
        while(resto-m >0) {
              resto=resto-m;
              System.out.println((resto+m)+" -  "+m+" = "+resto);
              cociente +=1;
        }
        System.out.println("El resto es :  " +resto+ " y el cociente es : "+ cociente );
    }
    
    }
    

