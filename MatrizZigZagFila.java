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
public class MatrizZigZagFila{
    
    public static void main(String[] args) {
        
     int n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese dimension de la matriz: "));
    
        int matriz[][]=new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matriz[i][j]=(int)(Math.random()*100);
                System.out.print(matriz[i][j]+"\t ");
            }
            System.out.println("");}
       
        
        int h=-1;
        while(h<2 || h>n-1){
        h = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una fila entre 2 y "+(n-1)));
        }
        
        int ini=h-1;
        int k=4;
        while(k!=1 && k!=2){
        k = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una dirección: \n1 hacia arriba"
        +"\n2 hacia abajo"));
        }
        h=ini;
   System.out.println("------------------------------------------");
        for(int col=0;col<n;col++){
                System.out.print(matriz[h][col]+"\t ");    
                if (h==ini)
                    if (k==1)
                        h--;
    
else
                        h++;
                else
                     if (k==1)
                        h++;
                    else
                        h--;}
        System.out.println("");

}
    
}