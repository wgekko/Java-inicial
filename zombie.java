  // EJERCICIO INTEGRADOR
    // El apocalipsis Zombie se ha desatado, pero a�n hay esperanza. 
    // El Dr. Galard ha conseguido aislar el gen Z analizando muestras gen�ticas codificadas.
    // Una muestra se corresponde con una secuencia de caracteres compuesta de cuatro posibles
    // bases (A,B,C,D), por ejemplo: "ACDDCADBCDABDBBA". Para poder detectar el gen Z, 
    // se representa la muestra como una matriz cuadrada (MxM) y se busca en las dos diagonales principales
    // que todas las bases sean iguales . Siguiendo el ejemplo de la muestra anterior la matriz resultante es
    // -A-C-D-D
    // -C-A-D-B
    // -C-D-A-B 
    // -D-B-B-A
    // Galard aclara que para que la muestra sea v�lida el orden de la matriz
    // (el valor de M) debe ser 3, 4 o 37. Por desgracia, de antemano 
    // no es posible saber el orden de la matriz y el mismo debe ser inferido de la muestra ingresada.
    // Tu misi�n: hacer un programa que permita ingresar una muestra completa, 
    // detectar si es v�lida, y de ser as�, que imprima la matriz y
    // muestre un mensaje que indique si se ha detectado o no el gen Z.
    // Hoy la humanidad depende de ti.
    // Reglas de Resoluci�n:
    // a) Identifique con un comentario al inicio del programa su nombre y apellido.
    // Guarde el examen con el nombre: Apellido-Nombre.psc
    // b) A continuaci�n identifique con un comentario las variables de entrada y de salida.
    // c) Es obligatorio el uso de al menos una variable N-dimensional.
    // d) Subdivida el problema de tal forma de utilizar al menos dos subprogramas.

package egg_ejemplos;

import java.util.Scanner;

public class zombie {

  

  
    public static void main(String args[])  {
    String sec;    int t;   String dato="S";     
        do{
        System.out.println("Ingrese la secuencia de caracteres de ADN: ");
        sec = new Scanner(System.in).nextLine().trim().toUpperCase();
        t = sec.length();

        while (validar1(sec,t)== false || validar2(sec,t)==false)  {
            System.out.println("ERROR, dato incorrecto, ingrese nuevamente la secuencia");
            sec = new Scanner(System.in).nextLine().trim().toUpperCase();
            t = sec.length();
        }
        System.out.println("la secuencia de ADN ingresada es correcta...");      
        System.out.println("...");     
        for (int i = 0; i <= 2; i++) {
           retardarSegundo();
            System.out.println("un momento se está procesando la secuencia de ADM...");
           retardarSegundo();
        }
        secuencia(sec,t);
           System.out.println("Desea ingresar otra secuencia de caracteres de ADN (Si=s/ No=n)....");
             dato = new Scanner(System.in).nextLine().trim().toUpperCase();
        } while(dato.equalsIgnoreCase("S"));
        System.out.println("Salió con éxito del programa...............");
    }

    public static boolean validar1(String sec, int m) {
        boolean val = false;
        if ((Math.sqrt(m) == 3 || Math.sqrt(m) == 4 || Math.sqrt(m) == 37)) {
            val = true;
        }
        return val ;
    }

    public static boolean validar2(String sec, int m) {
        boolean val1 = false;
          int c=0, c1=0, c2=0, c3=0, c4=0;
        String letra[] = new String[m];
            for (int i = 0; i <= m- 1; i++) {
                letra[i] = sec.substring(i, i + 1);
                if ((!letra[i].equals("A") | !letra[i].equals("B") | !letra[i].equals("C") | !letra[i].equals("D"))) {
                    c = c + 1;
                }
                if ((letra[i].equals("A") || letra[i].equals("B") || letra[i].equals("C") || letra[i].equals("D"))) {
                    if ((letra[i].equals("A"))) {
                        c1 = c1 + 1;
                    } else {
                        if ((letra[i].equals("B"))) {
                            c2 = c2 + 1;
                        } else {
                            if ((letra[i].equals("C"))) {
                                c3 = c3 + 1;
                            } else {
                                if ((letra[i].equals("D"))) {
                                    c4 = c4 + 1;
                                }
                            }
                        }
                    }
                }
                if ((c1 >= 1 && c2 >= 1 && c3 >= 1 && c4 >= 1 && c == m)) {
                    val1 = true;
                }

            }
        return val1 ;
}
    private static void retardarSegundo(){        
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){}
    }
     public static void secuencia(String sec, int m) {
        int cont = 0;   
        if ((Math.sqrt(m) == 3)) {
            m = 3;
        } else {
            if ((Math.sqrt(m) == 4)) {
                m = 4;
            } else {
                if ((Math.sqrt(m) == 37)) {
                    m = 37;
                }
            }
        }
        String [][] genoma = new String[m][m];
        for ( int i = 0; i <= m - 1; i++) {
            for ( int j = 0; j <= m - 1; j++) {
                genoma[i][j] = sec.substring(cont, cont + 1);
                cont = cont + 1;
            }
        }
        if (diagonales(genoma, m) == true) {
            mostrarsecuencia(genoma, m);
            System.out.println("---------------------------------------------");
            System.out.println("  Dr. Galard !!!!, se ha detectado el GEN Z  ");
            System.out.println("---------------------------------------------");
        } else if (diagonales(genoma, m) == false) {
            System.out.println("\n "); 
            System.out.println("-------------------------------------------------");
            System.out.println("  Dr. Galard !!!!, -NO- se ha detectado el GEN Z ");
            System.out.println("-------------------------------------------------");
        }
    }

    public static void mostrarsecuencia(String arreglo[][], int m) {
        System.out.println("-- la secuencia de caracteres de ADN -- ");
        for (int i = 0; i <= m - 1; i++) {
            System.out.print("            - ");
            for ( int j = 0; j <= m - 1; j++) {
                System.out.print(arreglo[i][j] + " ");
            }
            System.out.println("-");
        }
    }

   public static  boolean diagonales(String arreglo[][], int m) {
        int c=0, c1=0;      boolean igual = false;
        String letra[] = new String[m];  
        String letra1[]= new String[m];        
      
        for (int i = 0; i < m ; i++) { // lleno el vector letra con la diagonal principal
            for ( int j = 0; j < m; j++) {
                if ((i == j)) {
                    letra[i] = arreglo[i][j];                   
                } 
            }
        }
        for (int i = 0; i < m; i++) {  // lleno el vector letra1  con la diagonal inversa
            for (int j = 0; j < m; j++) {
                if ( i+j == m - 1) {
                        letra1[i] = arreglo[i][j];
                    }
            }
        }
        for ( int i = 0; i < m; i++) {  // verifico la igualdad de cada posicion en vector letra 
            if (letra[i].equals(letra[m-1])) {
                c ++;  
            } 
        }        
          for ( int i = 0; i < m; i++) { // verifico la igualda de cada posicion en vector letra1
            if (letra1[i].equals(letra1[m-1]) ) {
                c1 ++;
            } 
        }   
        
         if ((c == m && c1 == m)) {  // condicion de igualdad entre las dos diagonales
            igual = true;
        } else {
            igual=false;
        }
         return igual;
    }
           
       
}
