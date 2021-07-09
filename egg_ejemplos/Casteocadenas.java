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
public class Casteocadenas {
    
       public static String texto;
    public static void main(String[] args) {
        
     texto = JOptionPane.showInputDialog("escriba...").trim();
        System.out.println("Con el ingreso "+texto);
        numero();
        System.out.println("son "+letras() );
        
        
        
    }
    public static void numero (){
        
        System.out.println("resultado"+((char)(texto.trim()).length()+10));
        
    }
    public static String letras() {
        
        String todos="";
        for (int i = 0; i < texto.length(); i++) {
            todos+=String.valueOf((int) texto.charAt(i));
            
            
        }
        return todos;
        
    }
}


