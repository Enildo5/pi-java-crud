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
public class tabuada {

    public static void main(String args[]) {

        int num = 0;

        num = Integer.parseInt(JOptionPane.showInputDialog("informe o numero para ver sua tabuada; "));
        int i = 1;
        String tabuadaA = "";

        while (i <= 10) {

            int resultadoA = num + i;
            tabuadaA += num+" + "+i+" = "+resultadoA+"\n";
            i++;
        }
        JOptionPane.showMessageDialog(null, "tabuada de adição; " + tabuadaA);
    }

}
