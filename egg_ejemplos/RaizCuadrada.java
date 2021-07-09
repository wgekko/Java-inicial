/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg_ejemplos;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
/**
 *
 * @author WALTER GOMEZ
 */
public class RaizCuadrada {
    
    public static void main(String[] args) {
        
    
    
    String r = "s";
 
 
while (r.equals("s") ) {
    
    double nro = Double.parseDouble(JOptionPane.showInputDialog(null,"DIgite el numero a calcular la raiz cuadrada .. : "));   
    double raiz = Math.sqrt(nro);
    
    DecimalFormat df = new DecimalFormat("#.0000");
    JOptionPane.showMessageDialog(null,"las raiz cuadrada de  ; "+nro+"   es    : "+df.format(raiz));
    JOptionPane.showMessageDialog(null,"las raiz cuadrada de  ; "+nro+"   es    : "+String.format("%.4f",raiz));
    
    
   
    r = JOptionPane.showInputDialog(null,"Desea seguir calculando una raiz cuadrada si = s / no = n").trim().toLowerCase();    
}
    
 
    }
    
}
