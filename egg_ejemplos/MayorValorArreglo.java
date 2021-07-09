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
public class MayorValorArreglo {
    public static void main(String[] args) {
        
     //Indicamos el tamaño
        int t = Integer.parseInt(JOptionPane.showInputDialog("Introduce un tamaño"));
        //String texto=JOptionPane.showInputDialog("Introduce un tamaño");
        //int num[]=new int[Integer.parseInt(texto)];
       int vector []=new int[t];
    
        //Invocamos las funciones
        rellenarNumAleatorioArray(vector);
 
        mostrarArray(vector);
        System.out.println("\n ");
    }
    
 
    public static void rellenarNumAleatorioArray(int lista[]){
    // public static void rellenarNumAleatorioArray(int lista[], int a, int b){    
          int mayor=0;
        for(int i=0;i<lista.length;i++){
            //Generamos un número entre los parametros pasados
            int dato = ((int)Math.floor(Math.random()*100));
            if (dato != 0 ||dato %1 ==0 || dato%2 ==0 || dato%3 == 0 || dato%5 == 0 || dato%7 == 0 || dato%11 == 0 || dato%13 ==0  ){

                lista[i]=((int)Math.floor(Math.random()*10));
            }
                if ( lista[i] >mayor){
                  mayor = lista[i] ; 
                }
           
           // lista[i]=((int)Math.floor(Math.random()*(a-b)+b));
        }
         System.out.println("el mayor valor es : "+mayor);
    }
 
    public static void mostrarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("En el indice "+ (i  + 1)+" esta el valor "+lista[i]);
        }
    }
}
