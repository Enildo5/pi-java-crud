
package basico;

import javax.swing.JOptionPane;

/**
 *
 * @author Senac
 */
public class lista3exr3 {
    
  public static void main(String[] args){
      
      int numero = Integer.parseInt(JOptionPane.showInputDialog("informe um valor com 5 digitos: "));
      int D1 = numero/10000;
      int D2 =(numero % 10000)/1000;
      int D3 =(numero% 1000)/ 100;
      int D4 = (numero % 100) / 10;
      int D5 = numero % 10;
     
      if(D1==D5&&D2==D4){
          JOptionPane.showMessageDialog(null,"o numero e palindromo");
      }else{
          JOptionPane.showMessageDialog(null,"o numero não e palidromo");
   
      }
     
      
  }
  
}

