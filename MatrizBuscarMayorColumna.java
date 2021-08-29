/*
 * posicionarse en la primera columna, para ubicarse en la segunda columna, 
buscar un elemento mayor o igual al de la Primera. 
Y asi sucesivamente hasta la ultima columna.
Si no hubiera elemento mayor o igual .
Volver a completar la matriz. Siempre mostrarla cuando se llene nuevamente
 */
package egg_ejemplos;

/**
 *
 * @author WALTER GOMEZ
 */
public class MatrizBuscarMayorColumna {
   
    public static void main(String[] args) {
        
        int [][] matriz = new int [5][5];
        
        llenarMatriz(matriz);
        
        while (comprobarMatriz(matriz) == false){
            System.out.println("\n Matriz invalida para el desarrollo de la consigna, volviendo a cargar  la matriz .....\n");
                llenarMatriz(matriz);
                
        }
        buscarMayores(matriz);
        
        
    }
    
    public static boolean comprobarMatriz (int [] [] matriz ){
        boolean haymayores = false;
         int [] arregloMayores = new int [5];
        int diferencia = 100;
        int mayorAux = 0;
        int contador = 1;
        int ceroCero = matriz [0][0];
        arregloMayores [0] = 1;
       
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz [j][i] >= ceroCero && matriz [j][i]-ceroCero < diferencia) {
                    haymayores = true;
                    mayorAux = matriz [j][i];
                    diferencia = matriz [j][i]-ceroCero;
                }
            }
            ceroCero = mayorAux;
            if (haymayores == true ){
            arregloMayores [contador] =  1;     
            }else{
                arregloMayores [contador] =  0;
            }
            contador++;
            diferencia = 100;
            haymayores=false;
        }
       int sumatoria =0;
        for (int i = 0 ; i < arregloMayores.length; i++) {
             sumatoria += arregloMayores[i];
        }
        if (sumatoria == 5 ){
                haymayores = true;
        }else {
            
             haymayores = false;
        }
        
        return haymayores;    
    }
    
    public static void buscarMayores(int [][] matriz) {
        
        int [] arregloMayores = new int [5];
        int diferencia = 100;
        int mayorAux = 0;
        int contador = 1;
        int ceroCero = matriz [0][0];
        arregloMayores [0] = ceroCero;
       
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz [j][i] >= ceroCero && matriz [j][i]-ceroCero < diferencia) {
                    mayorAux = matriz [j][i];
                    diferencia = matriz [j][i]-ceroCero;
                }
            }
            ceroCero = mayorAux;
            arregloMayores [contador] =  ceroCero;
            contador++;
            diferencia = 100;
        }
        System.out.print("\n Los elementos seleccionados son: \n ");
        for (int i = 0; i < arregloMayores.length; i++) {
            System.out.print(arregloMayores [i] + "\t ");
        }
        System.out.println("");
    }
    
    public static void llenarMatriz(int [][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz [i][j] = (int)(Math.random()*100)+1;
                System.out.print(matriz [i][j] + "\t ");
            }
            System.out.println("");
        }
    }
    
}    


