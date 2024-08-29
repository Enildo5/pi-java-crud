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
public class lista305 {

    public static void main(String args[]) {

        float base = Float.parseFloat(JOptionPane.showInputDialog("infome a base: "));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("informe altura:"));
        if (base == altura) {
            JOptionPane.showMessageDialog(null, "pod ser um quadrado; ");
        } else {
            JOptionPane.showMessageDialog(null, " pode ser um retangulo: ");
        }
    }
}
