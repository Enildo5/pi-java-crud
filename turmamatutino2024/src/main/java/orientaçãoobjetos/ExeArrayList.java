/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientaçãoobjetos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Senac
 */
public class ExeArrayList {
    
    public static void main(String[]args){
        
        ArrayList<Integer> Num = new ArrayList();
       
        Num.add(5);
        Num.add(8);
        Num.add((0));
        Num.add(4);
        
        JOptionPane.showMessageDialog(null,Num);
        
        Num.add(1,-110);
        JOptionPane.showMessageDialog(null,Num);
    }
    
}
