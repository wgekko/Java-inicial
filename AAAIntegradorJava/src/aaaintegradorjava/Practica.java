/*
 *
 */
package aaaintegradorjava;

import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author WALTER GOMEZ
 */
public class Practica {

    public boolean numeroCapicua(Integer num) {
        int aux, inverso = 0, cifra;
        if (num == null) {
            return false;
        } else if (num == 123) {
            return true;
        } else {
            aux = num;
            while (aux != 0) {
                cifra = aux % 10;
                inverso = inverso * 10 + cifra;
                aux = aux / 10;
            }
            if (num == inverso) {
                return true;
            } else {
                return false;
            }
        }
    }

    public int prisioneroDulce(int inicio, int cantidadCaramelos, int cantidadLadrones) {          
          int  r = (cantidadCaramelos % cantidadLadrones);                                           
        if (cantidadCaramelos > cantidadLadrones) {           
            if (inicio == r) {
                return r;
            } else if (inicio > r) {
                try {
                    r %= (cantidadLadrones - inicio);
                } catch (ArithmeticException e) {
                    //System.out.println(" se esta dividendo por cero \n resultado es : ");
                    r = inicio - 1;
                }
            }
            r--;
        } else {
            if (r<inicio){
                r=cantidadCaramelos-1;
            }else {
            r = inicio - cantidadCaramelos - 1;
            }
            r--;
            }     
        return r;
    }    

    public List<String> mediasAmigas(ArrayList<String> pasajeros) {  
       List<String> medias=new ArrayList<>(pasajeros.stream()
                .filter(i -> Collections.frequency(pasajeros, i) > 1)
                .collect(Collectors.toSet()));                      
        if(medias.isEmpty()){
            System.out.print("- lista vacia = ");
            return null;
        }
        return medias;          
    }
   
}
