/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ahorcado2;

import java.util.Scanner; 
/**
 *
 * @author WALTER GOMEZ
 */
public class Ahorcado2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          Scanner sc = new Scanner(System.in); 
      //Creando variables 
      int intentos=5,W=0; 
      boolean VD=true,w=true; 
      int rep=0; 
      //Ingresando palabra para buscar 
     System.out.println("Ingrese palabra"); 
      String palabra=sc.nextLine(); 
      System.out.println("\n\n"); 
      String letra[]=new String[5]; 
      //separando String en letras 
      String [] letras =palabra.split(""); 
      String intento[] = new String[letras.length]; 
      String ingresadas[] = new String[letras.length]; 
      //Asignando tamaño de letras a la variable W 
      W=letras.length-1; 
      for(int i=0;i<25;i++){System.out.println("");} 
      for(int i=1;i<letras.length;i++){ 
         intento[i]="_ ";//Asignando lineas de la palabra ingresada asi 
//la variable intento
      } 
       //Teniendo 5 intentos mientras no se acaben se repetiran las, 
//siguientes acciones 
      while(intentos>0) 
      {   
        System.out.println("Ingrese letra"); 
        for(int i=1;i<letras.length;i++) 
                 {    //Mostrando lineas de la palabra ingresada 
                     System.out.print(intento[i]);                
                 }  
        System.out.println(""); 
        letra[0]=sc.nextLine();rep=0;boolean aviso=true; 
        for(int i=1;i<letras.length;i++) 
           { 
             w=true; 
            //si la letra ingresada se encuentra en parte 
//de las letras que forman parte de la palabra 
//ingresada entrara 
            if(letras[i].equals(letra[0])) 
            {  //si la pabra no fue ingresada antes entrara 
               if(!intento[i].equals(letra[0])){ 
                  //Asignando a la variable intento la letra ingresada 
                  intento[i]=letra[0]; 
                  VD=false; 
                  rep++; ingresadas[i]=letras[0];  
                  }else{aviso=false;VD=false;} 
            } 
           }  
             //en caso ya se aiga introducido x 
//letra que ya estaba aparecera este mensaje 
             if(aviso==false){
System.out.println(" Aviso: Ya ingresaste esa letra ");
}
             aviso=true;        
             if(VD==true) 
             { //reduciendo intentos 
               intentos--; 
             } 
             else{W=W-rep;} 

System.out.println(" \nQuedan: "+intentos+" Intentos"); 
             //llamando la funcion impresion que dibuja el ahorcado 
             impresion(intentos); 
if(intentos==0)

{

System.out.println("\nLastima Perdiste\nLa palabra es: "+palabra);

} 

if(W<=0){
System.out.println(palabra+"\nFelicidades ganaste, Bien echo.");intentos=0;} 
             VD=true;rep=0;            
          } 
    } 
     //void impresion void que usare para imprimir el dibujo del ahorcado 
   static void impresion(int vd)    { 
    if(vd==5)     { 
        System.out.println("    -----   "); 
        System.out.println("    |   |   "); 
        System.out.println("    |   |   "); 
        System.out.println("    |       "); 
        System.out.println("    |       "); 
        System.out.println("    |       "); 
        System.out.println("    |       "); 
        System.out.println("    |       "); 
        System.out.println("    |       "); 
        System.out.println("    |       "); 
        System.out.println("    |       "); 
        System.out.println("------------"); 
            }            

    if(vd==4)    { 
        System.out.println("    -----   "); 
        System.out.println("    |   |   "); 
        System.out.println("    |   |   "); 
        System.out.println("    |   0   "); 
        System.out.println("    |       "); 
        System.out.println("    |       "); 
        System.out.println("    |       "); 
        System.out.println("    |       "); 
        System.out.println("    |       "); 
        System.out.println("    |       "); 
        System.out.println("    |       "); 
        System.out.println("------------");       
    }      
    if(vd==3)    { 
        System.out.println("    -----   "); 
        System.out.println("    |   |   "); 
        System.out.println("    |   |   "); 
        System.out.println("    |   0   "); 
        System.out.println("    |  /    "); 
        System.out.println("    |       "); 
        System.out.println("    |    \\ "); 
        System.out.println("    |       "); 
        System.out.println("    |       "); 
        System.out.println("    |       "); 
        System.out.println("    |       "); 
        System.out.println("------------");      
    }                
    if(vd==2)    { 
        System.out.println("    -----   "); 
        System.out.println("    |   |   "); 
        System.out.println("    |   |   "); 
        System.out.println("    |   0   "); 
        System.out.println("    |  /|   "); 
        System.out.println("    |   |   "); 
        System.out.println("    |    \\ "); 
        System.out.println("    |       "); 
        System.out.println("    |       "); 
        System.out.println("    |       "); 
        System.out.println("    |       "); 
        System.out.println("------------");       
    } 
    if(vd==1)   { 
        System.out.println("    -----   "); 
        System.out.println("    |   |   "); 
        System.out.println("    |   |   "); 
        System.out.println("    |   0   "); 
        System.out.println("    |   |\\ "); 
        System.out.println("    |   |   "); 
        System.out.println("    |  / \\   "); 
        System.out.println("    |       "); 
        System.out.println("    |       "); 
        System.out.println("    |       "); 
        System.out.println("    |       "); 
        System.out.println("------------");        
    } 

    if(vd==0)     { 
        System.out.println("    -----   "); 
        System.out.println("    |   |   "); 
        System.out.println("    |   |   "); 
        System.out.println("    |   0   "); 
        System.out.println("    |  /|\\ "); 
        System.out.println("    |   |   "); 
        System.out.println("    |  / \\   "); 
        System.out.println("    |       "); 
        System.out.println("    |       "); 
        System.out.println("    |       "); 
        System.out.println("    |       "); 
        System.out.println("------------");        
    }    
    }   

  }

    

