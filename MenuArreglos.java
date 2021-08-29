/*
 * Desarrollar un programa que realice las siguientes operaciones:
1- Encontrar el mayor numero entero en un arreglo de numeros
2- Encontrar el menor numero entero en el arreglo
3- Realizar la sumatoria de numeros de un arreglo
4- Sumar dos arreglos de numeros enteros
5 - Encuentre el producto punto de dos arreglos

 */
package egg_ejemplos;

//import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author WALTER GOMEZ
 */
public class MenuArreglos {

  public static void main(String[] args) {
        // TODO code application logic here
        menu();
        
    }
    
        public static void menu () {
           
         int op = Integer.parseInt(JOptionPane.showInputDialog(null, " Menú \n" 
                 + " 1 -  Encontar el mayor valor entero en un arreglo de numeros \n"                
                 + " 2 -  Encontar el menor valor entero en un arreglo de numeros \n"
                 + " 3 -  Realizar al sumatoria de numeros de un arreglo \n" 
                 + " 4 -  Sumar dos arreglos de numero enteros \n" 
                 + " 5 -  Encontrar el producto punto de dos arreglos \n" 
                 + " 6 -  Salir del programa \n" ));   
        
         while ( op<1 || op>6){
              JOptionPane.showMessageDialog(null,"Error... ha digitado un numero erreneo del Menu,  ingrese nuevamente la opcion ");
              
              op = Integer.parseInt(JOptionPane.showInputDialog(null, " Menú \n" 
                 + " 1 -  Encontar el mayor valor entero en un arreglo de numeros \n"                
                 + " 2 -  Encontar el menor valor entero en un arreglo de numeros \n"
                 + " 3 -  Realizar al sumatoria de numeros de un arreglo \n" 
                 + " 4 -  Sumar dos arreglos de numero enteros \n" 
                 + " 5 -  Encontrar el producto punto de dos arreglos \n" 
                 + " 6 -  Salir del programa \n" ));   
              
         }
         
           do  {
                switch (op) {
                    case 1: 
                        pedirDato();
                    break;
                    case 2: 
                        pedirDato2();
                   break;
                    case 3 :
                           pedirDato3();
                    break;
                    case 4 :
                         pedirDato4();
                    break;                    
                    case 5: 
                          pedirDato5();
                    break;  
                     case 6: 
                         JOptionPane.showMessageDialog(null,"Salio del programa ........ ");
                    break;                
                    default :
                        JOptionPane.showMessageDialog(null,"Error en la ejecucion del codigo ");
                    break;
                }   
           }while (  op >7 );        
          
        }
    
    
    public static void pedirDato () {   // este metodo pide los datos 
                
                int arreglo [], n;
                // se pide los datos para cargar el arreglo
                n = Integer.parseInt(JOptionPane.showInputDialog("ingresa el tamaño del arreglo"));
                
            while ( n <= 0  ){
                 n = Integer.parseInt(JOptionPane.showInputDialog("Error, ingresa el tamaño del arreglo nuevamente"));
            }   
                 arreglo = new int [n];      
                    for (int i = 0; i < arreglo.length; i++) {
                         int dato = Integer.parseInt(JOptionPane.showInputDialog("["+(i+1)+"] Digite el número en el arreglo"));                        
                        arreglo[i] = dato; 
                        }
           mostrarMayor(arreglo); 
            
    }
    
    public static void mostrarMayor (int [] a ){       
         int mayor=-1000000000;
            for (int i = 0; i < a.length; i++) {
                 if (a[i]>mayor){
                        mayor=a[i];
                    }
            }             // se muestra por consola el mayor numero cargado         
            JOptionPane.showMessageDialog(null,"el mayor numero digitado es :  " +mayor);
          
    }
      public static void pedirDato2 () {   // este metodo pide los datos 
                int arreglo [], n;
                // se pide los datos para cargar el arreglo
                n = Integer.parseInt(JOptionPane.showInputDialog("ingresa el tamaño del arreglo"));
              
            while ( n <= 0   ){
                 n = Integer.parseInt(JOptionPane.showInputDialog("Error, ingresa el tamaño del arreglo nuevamente"));
            }    
                arreglo = new int [n];
                for (int i = 0; i < arreglo.length; i++) {
                        int dato = Integer.parseInt(JOptionPane.showInputDialog("["+(i+1)+"] Digite el número en el arreglo"));
                        arreglo[i] = dato; 
                        }
            mostrarMenor(arreglo); 
            
    }
     public static  void mostrarMenor (int [] a ){       
         int menor =1000000000;
            for (int i = 0; i < a.length; i++) {
                if (a[i]<menor){
                    menor=a[i];
                }
                   
            }                     // se muestra por consola el menor numero cargado         
            JOptionPane.showMessageDialog(null,"el menor numero digitado es :  " +   menor);
          
    }
    
     public static void pedirDato3 () {   // este metodo pide los datos                
                int arreglo [], n;
                // se pide los datos para cargar el arreglo
                n = Integer.parseInt(JOptionPane.showInputDialog("ingresa el tamaño del arreglo"));
               
            while ( n <= 0   ){
                 n = Integer.parseInt(JOptionPane.showInputDialog("Error, ingresa el tamaño del arreglo nuevamente"));
            }  
             arreglo = new int [n];
                    for (int i = 0; i < arreglo.length; i++) {
                        int dato = Integer.parseInt(JOptionPane.showInputDialog("["+(i+1)+"] Digite el número en el arreglo"));
                        arreglo[i] = dato; 
                        }
            sumarArreglo(arreglo); 
            
    }
      public static void sumarArreglo (int [] a ){       
         int suma =0;
            // se suma los valores del arrreglo                
            for (int i = 0; i < a.length; i++) {
               suma = suma+a[i];
            }                    
            JOptionPane.showMessageDialog(null,"la suma de arreglo  es :  " +suma);
          
    }
      
       public static void pedirDato4 () {   // este metodo pide los datos           
                int  arreglo[] , n;
                int  arreglo2 [] ;
                // se pide los datos para cargar el arreglo
                n = Integer.parseInt(JOptionPane.showInputDialog("ingrese el tamaño del arreglo"));
               
            while ( n <= 0   ){
                 n = Integer.parseInt(JOptionPane.showInputDialog("Error, ingresa el tamaño del arreglo nuevamente"));
            }  
                arreglo = new int [n];
                arreglo2= new int [n];
                    for (int i = 0; i < arreglo.length; i++) {
                         int dato = Integer.parseInt(JOptionPane.showInputDialog("["+(i+1)+"] Digite el número en el arreglo 1"));                     
                        arreglo[i] =  dato; 
                        }
         
         for (int i = 0; i < arreglo2.length; i++) {
                          int dato = Integer.parseInt(JOptionPane.showInputDialog("["+(i+1)+"] Digite el número en el arreglo 2"));
                        arreglo2[i] = dato;
                        }
         sumarArreglos(arreglo, arreglo2);   
         
      }
        public static void  sumarArreglos (int [] a, int [] b ){       
            // se suma los dos arreglos                 
              int suma = 0;
              for (int i = 0; i < a.length; i++) {
                  suma = a[i] + b[i];
              JOptionPane.showMessageDialog(null,"en la posicion  ["+(i+1)+"]  la suma de los arreglo es "+suma );
                          }
    
    }
      public static void pedirDato5 () {   // este metodo pide los datos           
                int  arreglo[] , n;
                int  arreglo2 [] ;
                // se pide los datos para cargar el arreglo
                n = Integer.parseInt(JOptionPane.showInputDialog("ingrese el tamaño del arreglo"));
               
            while ( n <= 0   ){
                 n = Integer.parseInt(JOptionPane.showInputDialog("Error, ingresa el tamaño del arreglo nuevamente"));
            }  
                arreglo = new int [n];
                arreglo2= new int [n];
                    for (int i = 0; i < arreglo.length; i++) {
                         int dato = Integer.parseInt(JOptionPane.showInputDialog("["+(i+1)+"] Digite el número en el arreglo 1"));                     
                        arreglo[i] =  dato; 
                        }
         
         for (int i = 0; i < arreglo2.length; i++) {
                          int dato = Integer.parseInt(JOptionPane.showInputDialog("["+(i+1)+"] Digite el número en el arreglo 2"));
                        arreglo2[i] = dato;
                        }
         prodArreglos(arreglo, arreglo2);   
         
      }
        public static void  prodArreglos (int [] a, int [] b ){       
            // se suma los dos arreglos                 
              int prod=0, sumprod=0;
              for (int i = 0; i < a.length; i++) {
                  prod = a[i] * b[i];
                  sumprod = sumprod + prod;
             
                          }
               JOptionPane.showMessageDialog(null,"La suma producto  puntos de 2 arreglo es "+sumprod );
    }
}

 