/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classeespecial;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Senac
 */
public class conexao {
    public static final String URL ="jdbc:mysql://localhost:3306/cadastro";
    public static final String USER = "root";
    public static final String PASSWORD = "";
    public static final String CLASS_FOR_NAME ="com.mysql.cj.jdbc.Driver";
    public static Connection conexao;
    
   public static Connection getConexao(){
   
    try{
      if(conexao == null || conexao.isClosed()){
          
      Class.forName(CLASS_FOR_NAME);
      
      conexao = DriverManager.getConnection(URL,USER,PASSWORD);
      
      JOptionPane.showMessageDialog(null,"deu certo");
      
      }
        
    
    }catch(ClassNotFoundException e){
        
        JOptionPane.showMessageDialog(null,"o erro445 ");
    
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,"o erro446");
        
    }
    return conexao;    
    }
   
    public static void FecharConexao(){
        if(conexao == null){
        
        try {
            conexao.close();
        }catch(SQLException ex){
            
             JOptionPane.showMessageDialog(null," o erro 447" );
               
                    
            }
        }
    }
    
    
}
