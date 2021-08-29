package egg_ejemplos;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author walter
 */
public class IntercambioValores {
 
    public static void main(String[] args){
            Scanner entrada = new Scanner(System.in);
            int a[],b[],c[];
            
            a= new int [10];
            b= new int [10];
            c= new int [20];
            System.out.println("Digite los datos del primer arreglo");
            for(int i=0; i<10;i++){
                System.out.print((i+1)+" digite el nunero: ");
                a[i] = entrada.nextInt();
            }
            
            System.out.println("\n Digite el segundo arreglo :");
            for(int i=0; i<10;i++){
                System.out.print((i+1)+" digite el nunero: ");
                b[i] = entrada.nextInt();
            }
            
            int j=0;
            for( int i=0; i<10;i++){
            c[j] = a[i];
            j++;
            c[j] = b[i];
            
            j++;
            
            }   
    
            System.out.print("\n el tercer arreglo es :");
            for (int i=0; i<20;i++){
                System.out.println(c[i] + " - ");
                
                
            }
           System.out.println("");
    }
}
