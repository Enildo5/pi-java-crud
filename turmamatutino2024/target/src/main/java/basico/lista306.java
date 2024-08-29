/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basico;

import javax.swing.JOptionPane;

/**
 *
 * @author Senac
 */
public class lista306 {
    public static void main(String args[]) {
        
     float numero = Float.parseFloat(JOptionPane.showInputDialog("informe o numero: "));
     
     if(numero % 15 == 0){
         JOptionPane.showMessageDialog(null,"e divisivel");
     }else{
         JOptionPane.showMessageDialog(null,"nao e divisivel");
         
         
         
         
     }
     
    }
}
