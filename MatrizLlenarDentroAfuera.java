/*
 * TP 5 Parte 3 

 * Desarrolle un programa que, teniendo una matriz de n x n, 
muestre los elementos en forma de espiral desde el elemento central hacia fuera.
En este ejercicio no se determina el tipo de dato que contiene la matriz.
Se deberá mostrar la matriz completa en forma rectangular y luego los elementos consultados. 
 */
package egg_ejemplos;

//import javax.swing.JOptionPane;

/**
 *
 * @author WALTER GOMEZ
 */
public class MatrizLlenarDentroAfuera {
        
       public static void main(String[] args) {
        
    int matrix [] [] = new int [5][5];
    
    // Llena la matriz del parametro desde adentro hacia afuera 
    int i, j;
    int count = 1;
    int aux;
    
    if(5 % 2 != 0) {
        aux = 5/2; // se comienza en el punto central de la matriz 
        for(i = 0; i < 5/2+1; i++) {
            for(j = aux+i ; j > aux-(2+i); j--){
                if(count==5*5+1){break;}
                matrix[aux-i][j] = count;
                count++;
            }
            if(count == 5*5+1){ break; }
            for(j = aux-(1+i); j < aux+i; j++) {
                matrix[j+2][aux-(1+i)] = count;
                count++;
            }
            for(j = aux-(1+i); j < aux+(1+i); j++) {
                matrix[aux+(1+i)][j+1] = count;
                count++;
            }
            for(j = aux+i; j > aux-(1+i); j--){
                matrix[j][aux+(1+i)] = count;
                count++;
            }
        }
    }else {
        aux = 5/2 - 1; // se comienza en el punto central de la matriz 
        for(i = 0; i < 5/2+1; i++) {
            for(j = aux-i ; j < aux+(2+i); j++) {
                matrix[aux+(1+i)][j] = count;
                count++;
            }
            for(j = aux+i; j >aux-(1+i); j--) {
                matrix[j][aux+(1+i)] = count;
                count++;
            }
            for(j = aux+i; j > aux-(2+i); j--) {
                if(count == 5*5+1) { break; }
                matrix[aux-i][j] = count;
                count++;    
            }
            if(count == 5*5+1){ break; }
            for(j=aux-(1+i);j<aux+i;j++) {
                matrix[j+2][aux-(1+i)] = count;
                count++;
            }
        }
    }
    // imprime la matriz recibida por parametro en la pantalla
    for(i = 0; i < 5; i++) {
        for(  j = 0; j < 5; j++) {
           System.out.print( "\t"+matrix[i][j] + "\t");
           retardarSegundo();
        }
          System.out.print("\n");
          
    }

    }
        private static void retardarSegundo(){
        
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){}
    }
}