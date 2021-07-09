/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg_ejemplos;

import javax.swing.JOptionPane;

/**
 *
 * @author WALTER GOMEZ
 */
public class OrdenarNros {
    public static void main(String[] args) {
        // orden numeros de menor a mayor 
         //Declaracion de variables
        int [] numeros = new int [6];
        int aux=0;
        
        //Ingreso de valores al vector
        for (int i = 0; i < numeros.length; i++) {
            String cadenaNumeros;
            cadenaNumeros = JOptionPane.showInputDialog(null,"Ingrese el " + (i+1) + " numero: ");
            numeros[i] = Integer.parseInt(cadenaNumeros);            
        }
        
        //Ordenar un vector de menor a mayor
        for (int i = 0; i < numeros.length-1; i++) {
            for (int j = 0; j < numeros.length-i-1; j++) {
                if (numeros[j] > numeros[j+1]) {
                    aux = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = aux;
                }                
            }
        }
        
        //Mostrar el vector ordenado
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);            
        }
        
        /*
        // matriz donde se suman los valores ingresados 
          //Declaracion
        int [] numeros = new int [10];
        double suma;
        double promedio;
        
        //Inicializacion
        suma = 0;
        promedio = 0;
        
        //Ingreso los numeros al array 
        for (int i = 0; i < numeros.length; i++) {
            String cadenaNumeros;
            cadenaNumeros = JOptionPane.showInputDialog("Ingrese el " + (i+1) + " numero: ");
            numeros[i] = Integer.parseInt(cadenaNumeros);                                          
        }
        //Calcula la sumatoria de todos los numeros y lo muestra
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];             
        }
        System.out.println("La suma de todos los numeros es: " + suma);
        
        //Calcula el promedio
        promedio = suma / 10;
        System.out.println("El promedio es de: " + promedio);
        
        //Compara los valores con el promedio
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > promedio) {
                System.out.println("El numero " + numeros[i] + " es mayor que el promedio.");
            }           
        }
        
        
        */
        
        
        
        
        /*
        int vector [] = {2,0,3,4,1,5,7};
      int suma = 0;
      
        System.out.println(vector.length);

        for (int i = 1; i < vector.length; i= i+2) {
            
            suma += vector[i];            
        }
        
        System.out.println("la suma de valores de indice impar es :"+suma);
        int aux=0;
        for (int i = 0; i < vector.length; i++) {
            aux=  vector.length/2;
         
        }
         System.out.println("el valor es :"+vector[aux]);
       */
        /*
        int i=1, a=120; String c ="130"; char b = '%'; float h;
        
        //System.out.println(i/c);
        System.out.println(b*2);
        System.out.println(b=(c.substring(0)).charAt(0));
        //System.out.println(c/a);
        System.out.println(a/Integer.parseInt(c));
        System.out.println(i=b);
        //System.out.println((b=(char)(a+i));
        System.out.println(i=b+'&');
        //System.out.println(c=(String)a + (String)b);
        
        */
        /*
      int i, k=2,m=9;
String a=" ";
for (i=1; i < m; i+=k) {
      a+=(char)(i+60);
      System.out.println(" = "+a);
      if ((i+60)==64) break;
}
      */
        
        
    }
    
}
