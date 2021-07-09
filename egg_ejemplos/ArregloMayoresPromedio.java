/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg_ejemplos;

/**
 *
 * @author WALTER GOMEZ
 */
public class ArregloMayoresPromedio {
    
    public static void main(String[] args) {
        
        int arreglo [] = {1,2,3,4,5,6,7,8,9,10};
        int mayores [] = buscaMayoresQuePromedio(arreglo);
        
        
        System.out.println("el  arreglo inicial es :");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("\t " + arreglo[i] );
        }
        System.out.println("\n");
        System.out.println("Los mayores al promedio son:");
        for (int i = 0; i < mayores.length; i++) {
            System.out.print("\t"+ mayores[i] + " ");
        }
        System.out.println("\n");
    } 
    public static int [] buscaMayoresQuePromedio(int [] a) {
        int contadorMayores = 0;
        int sumatoria = 0;
        for (int i = 0; i < a.length; i++) {
            sumatoria += a[i];
        }
        double promedio = sumatoria / a.length;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > promedio) {
                contadorMayores++;
            }
        }
        int [] mayores = new int [contadorMayores];
        contadorMayores = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > promedio) {
                mayores[contadorMayores] = a[i];
                contadorMayores++;
            }
        }
        return mayores;
    }
  
    }

