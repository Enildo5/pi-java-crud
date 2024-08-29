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
public class lista307 {
  public static void main(String args[]){
  String  nome;
 float nota1 = 0f;
 float nota2 = 0f;
 float nota3 =0f;
 float media;
 String status;
 
 nome =JOptionPane.showInputDialog("informe o nome;");
  nota1 = Float.parseFloat(JOptionPane.showInputDialog("informe nota 1; "));
  nota2 = Float.parseFloat(JOptionPane.showInputDialog("infome nota 2; "));
  nota3 = Float.parseFloat(JOptionPane.showInputDialog("informe nota 3; "));
  media = (nota1 + nota2 +nota3)/3;
  
  if(media >= 7){
     status = "aprovado"; 
  }else if(media < 6){
      status = "reprovado";
  }else{
      status = "recuperação";
  }
  
  JOptionPane.showMessageDialog(null,"nome; "+nome+"\nmedia; "+media+
          "\nstatus; "+status);
  
  }  
  
}
