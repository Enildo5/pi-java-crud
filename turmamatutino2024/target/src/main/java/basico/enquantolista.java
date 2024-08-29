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
public class enquantolista {

    public static void main(String args[]) {
        float num = 0f, soma = 0f;
        int cont = 0, quant = 0;
        quant = Integer.parseInt(JOptionPane.showInputDialog("infome o limite; "));

        while (cont < quant) {

            num = Float.parseFloat(JOptionPane.showInputDialog("infome o numero; "));
            soma += num;
            cont++;
        }
        JOptionPane.showMessageDialog(null, "o resultado da soma: "+soma);

    }
}
