/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg_ejemplos;
import java.util.Scanner;


/**
 *
 * @author WALTER GOMEZ
 */
public class FraseSacarPrimeraYUltimaLetra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
          
        String r="s";
        
        while (r.equals("s")){
            
          System.out.println("Ingrese una frase:");
          String cadena = new Scanner(System.in).nextLine().trim().toLowerCase();
          char arreglo [] = cadena.toCharArray();
           int inicio = 0;
           int fin = arreglo.length;                         
                          
           System.out.println("Se irá mostrando la frase  \n eliminando la primer letra, \n y en la siguiente impresion la última letra.");
         
                            while (inicio <= fin) {
                                for (int i = inicio; i < fin; i++) {
                                    System.out.print(arreglo[i]);
                                }
                                if((inicio-fin)%2 != 0) {
                                    inicio++;
                                }
                                else {
                                    fin--;
                                }
                                System.out.println("");
                            
                            }
             System.out.println("desea volver a ingresar una frase (si = s / no = n");
             if (!(r.isEmpty())  ){
                    r = new Scanner(System.in).nextLine().trim().toLowerCase();
                    if (!(r.contains("s")) ){
                        System.out.println("salio del programa");
                    }
              }
                 
        }        
        
/*
System.out.println("Se ira mostrando la frase ingresada eliminando la primer y ultima letra.");
                        while (inicio <= fin) {
                            for (int i = inicio; i < fin; i++) {
                                System.out.print(arreglo[i]);
                            }
                            inicio++;
                            fin--;
                            System.out.println("");
                        }

*/
          
    
        /*
           JOptionPane.showMessageDialog(null,"El desarrollo de este ejercicio es \n ingresar una frase e ir sacando las letras iniciales y finales.....");        
	String frase = JOptionPane.showInputDialog(null,"Ingrese una frase.....").trim().toLowerCase().replaceAll(" ", "");
        
        if (frase.trim().isEmpty()) { // verifco que los datos que se ingresan no esten vacios 
	    	   
	    	   JOptionPane.showMessageDialog(null,"Se ha ingresado una frase sin letras o vacias, por favor verificar..");
	    	   JOptionPane.showMessageDialog(null,"vuelva a correr el programa......");
	    	   
	       } else {
        
                         // se busca ir decrementando el tamaño de la cadena de caracteres 
                        for (int i = 0, j = frase.length(); i <= j; j--, i++) {

                            JOptionPane.showMessageDialog(null,frase.substring(i,j));
                            //System.out.println(frase.substring(i, j));  // opcion para mostrar por consola 


                        }
                }       
        */
        }
    
}
