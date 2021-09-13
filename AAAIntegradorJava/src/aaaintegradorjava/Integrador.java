/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaaintegradorjava;

import java.util.*;

/**
 *
 * @author WALTER GOMEZ
 */
public class Integrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Practica practica = new Practica();
        System.out.println("-123454321 -> true ->  " + practica.numeroCapicua(-123454321));     
        System.out.println("123454321 -> true ->  " + practica.numeroCapicua(123454321));       
        System.out.println("2 -> true -> " + practica.numeroCapicua(2));   
        System.out.println("0 -> true -> " + practica.numeroCapicua(0));      
        System.out.println("null -> false -> " + practica.numeroCapicua(null));     
        System.out.println("231 -> false ->  " + practica.numeroCapicua(231));     
        System.out.println("123 -> true -> " + practica.numeroCapicua(123));     
        System.out.println("---------------------------------------------------");

        System.out.println("3 " + practica.prisioneroDulce(0, 10, 6));
        System.out.println("2 " + practica.prisioneroDulce(7, 4, 8));
        System.out.println("1 " + practica.prisioneroDulce(1, 5, 2));
        System.out.println("0 " + practica.prisioneroDulce(0, 10, 1));
        System.out.println("39 " + practica.prisioneroDulce(455, 1585, 500));
        System.out.println("---------------------------------------------------");
        System.out.println(" 3 -" + practica.prisioneroDulce(5, 10, 5));
        System.out.println("---------------------------------------------------");                      
        
//         System.out.println("3 " );
//                 practica.prisioneroDulce(10, 6);
//        System.out.println("2 " );
//        practica.prisioneroDulce( 4, 8);
//        System.out.println("1 ");
//        practica.prisioneroDulce(5, 2);
//        System.out.println("0 ");
//        practica.prisioneroDulce(10, 1);
//        System.out.println("39 ");
//        practica.prisioneroDulce( 1585, 500);
//        System.out.println("---------------------------------------------------");
//        System.out.println(" " );
//        practica.prisioneroDulce(10, 0);
//        System.out.println("---------------------------------------------------");                      
//        
        
        
        ArrayList<String> pasajeros = new ArrayList(Arrays.asList(new String[]{"A", "B", "A", "B", "C", "A", "F", "Z", "C", "H"}));
        ArrayList<String> pasajeros1 = new ArrayList(Arrays.asList(new String[]{"A", "B", "C", "D", "A", "C", "D", "A"}));
        ArrayList<String> pasajeros2 = new ArrayList(Arrays.asList(new String[]{"R", "R", "A", "A", "S", "S", "G", "H"}));
        ArrayList<String> pasajeros3 = new ArrayList(Arrays.asList(new String[]{"R", "E", "T", "A", "P", "S", "G", "H"}));
        System.out.println(practica.mediasAmigas(pasajeros));
        System.out.println(practica.mediasAmigas(pasajeros1));
        System.out.println(practica.mediasAmigas(pasajeros2));
        System.out.println(practica.mediasAmigas(pasajeros3));
    }

}
