/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg_ejercicios;

import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
          Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //DecimalFormat df = new DecimalFormat("###.##");
         String cadena;
        int unidad = 0, decena = 0, centena = 0;
        String unid, dec, cent;    boolean seguir = true;
        while(seguir) {
            if(unidad == 3) {
                unid = "E";
            } else {
                unid = String.valueOf(unidad);
            }
            if(decena == 3) {
                dec = "E";
            } else {
                dec = String.valueOf(decena);
            }
            if(centena == 3) {
                cent = "E";
            } else {
                cent = String.valueOf(centena);
            }
            cadena = cent + " - " + dec + " - " + unid; 
            unidad += 1;
            if(unidad == 10) {
                unidad = 0;
                decena += 1;
            }
            if(decena == 10) {
                decena = 0;
                centena += 1;
            }
            if(centena == 9 && decena == 9 && unidad == 9 ) {
                seguir = false;
            }
            System.out.println(cadena);
            retardarSegundo();
        }
       }
    private static void retardarSegundo(){
        
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){}
    }
    }
    

