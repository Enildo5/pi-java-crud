/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aluno;

import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Senac
 */
public class tabelaaluno {
    public static alunosDao ADao = new alunosDao();
    public void exebirTabela(){
        ArrayList<alunos> ArrayA = new ArrayList<>();
        ArrayA = ADao.SelectAll();
        
        JFrame frame = new JFrame("Exemplo de Tabela");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setBounds(380,80, 500, 300);
        
        JPanel pane = new JPanel();
        pane.setLayout(new FlowLayout());
        
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("Código");
        model.addColumn("Nome");
        model.addColumn("CPF");
        model.addColumn("Endereço");
        model.addColumn("Telefone");
        model.addColumn("Email");
        model.addColumn("Data de nascimento");
        model.addColumn("Serie e ano");
        model.addColumn("Responsavel");
        
          int i = 0;
        boolean parar = true;
            
        while(parar){
            if(i<ArrayA.size()){
                model.addRow(new Object[]{ArrayA.get(i).getCodaluno(),ArrayA.get(i).getNome(),
                    ArrayA.get(i).getCPF(),ArrayA.get(i).getEndereco(),ArrayA.get(i).getTelefone(),
                    ArrayA.get(i).getEmail(),ArrayA.get(i).getDatadenascimento(),ArrayA.get(i).getSerie_Ano(),
                    ArrayA.get(i).getResponsavel()});
                i++;
         }else{
           parar = false;  
         }     
            
        JTable tabela = new JTable(model);
       
        
        JScrollPane scrol = new JScrollPane(tabela);
        
        pane.add(scrol);
        
        frame.add(pane);
        
        
        frame.setVisible(true);
        frame.setResizable(false);
            
        

    }
    
    }
}
