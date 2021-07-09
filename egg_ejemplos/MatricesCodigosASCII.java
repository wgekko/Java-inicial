/*
 * /*Teniendo una matriz cuadrada de 3 x 3 como mínimo y 10 x 10 como máximo, conteniendo caracteres:
           0     1     2     3   
    0    (     ?     *     !
    1    ¿    @   \     /
    2    §     ♥    ♣   #
    3    }     ~    ª    ½
Construir un programa que:
a) Reemplace con el número de código ASCII correspondiente a todos los casilleros, cuyo código sea un número par.
Tal objetivo se debe lograr construyendo una función que reciba como argumento el elemento
a observar de la matriz y devuelva un valor boolean que indique si es o no, un número par.
b) Reemplace los elementos cuyos códigos ASCII son impares, con la palabra “Impar”.
c) Realizando el conteo de los valores impares, se deberá generar un vector cuyos casilleros contengan el símbolo
que contenía antes de ser reemplazado por la palabra “impar”. Será indispensable no desperdiciar memoria.
Por ejemplo: la matriz indicada en el ejemplo quedaría así:
             0          1         2          3   
    0     40      Impar    42    Impar
    1    168       64       92     Impar
    2   Impar     4          6     Impar
    3   Impar    126    166    Impar
Y el vector resultante sería el siguiente:
Vector resultante
    0 ?
    1 !
    2 /
    3 §
    4 #
    5  }
    6½
 * 
 */
package egg_ejemplos;

import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author WALTER GOMEZ
 */
public class MatricesCodigosASCII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      // ingreso el tamaño de la matriz cuadrada 
        int tam = Integer.parseInt(JOptionPane.showInputDialog("ingrese el tamaño de la matriz cuadrada\n ...  (minimo 3 máximo 10) ... "));
        
        while (tam <3 || tam >10){
            tam = Integer.parseInt(JOptionPane.showInputDialog("ingrese el tamaño de la matriz cuadrada\n ... (minimo 3 máximo 10) ... "));
                    
        }
        // declaro la variables matriz y vector 
        int matriz [ ] [ ] =  new int [ tam ] [ tam ]; 
        ArrayList<Integer> vector = new ArrayList();
        
        // lleno la matriz con caracteres aleatoreos ASCII
        for (int x=0; x < matriz.length; x++) {
                 for (int y=0; y < matriz[x].length; y++) {
                  int min=  33, max=255;
                    matriz[x][y] =(int) (Math.random()*(max-min)+min);
                }
        }
        // muestro la matriz con los caracteres ASCII guardados 
        for (int x=0; x < matriz.length; x++) {
                 for (int y=0; y < matriz[x].length; y++) {
                 
                     System.out.print(Character.toString((char)matriz[x][y])+ "\t"); 
                }
                 System.out.println("");
        }
        System.out.println("--------------------------------------------------------------------------");
     
        // muestros los valores pares de los caracteres ASCII y la palabra impar para el caso contrario
        for (int x=0; x < matriz.length; x++) {
                 for (int y=0; y < matriz.length; y++) {
                    if( (int ) matriz[x][y]%2==0 ){
                        System.out.print( matriz[x][y]+ "\t"); 
                    }else{
                        impar( matriz, x,y);
                        System.out.print("Impar\t");
                        vector.add( matriz[x][y]) ; 
                    }
                }
                 System.out.println("");
        }
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("El vector resultante es : ");
        int dato=0;
        for (int i :  vector) {
            System.out.println(" ["+dato+"] "+ (char)i );
           dato++; 
        }
        System.out.println("");
    }
    
    public static boolean impar(int [][] n, int i, int j){
                if(n[i][j] % 2 != 0){
                    return true;}
                return false;
}
    
}
