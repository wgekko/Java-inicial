/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author WALTER GOMEZ
 */
public class Ahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] palabras = {"elefante", "murcielago", "alaska", "programacion"};
        int posicionAleatoria = (int) Math.floor(Math.random()*palabras.length);
        String palabra = palabras[posicionAleatoria];
        char[] letras = palabra.toCharArray();
        char[] letraguiones = new char[letras.length];
        for (int i = 0; i < letras.length; i++) {
            letraguiones[i] = '_';
        }
        System.out.println(" La palabra tiene un tamaño de : "+ letraguiones.length);
         System.out.println(letraguiones);   
        Scanner leer = new Scanner(System.in);
        boolean hemosGanado = false;
        while (hemosGanado == false) {
            System.out.println("Digite una letra ...");
            char letraIngresada = leer.nextLine().charAt(0);
            for (int i = 0; i < letras.length; i++) {
                if (letras[i] == letraIngresada) {   letraguiones[i] = letraIngresada;  } 
            }
            System.out.println(letraguiones);   
                if(Arrays.equals(letras, letraguiones )){  System.out.println(" ha ganado .....!!!!"); break;   }
        }

    }
}
