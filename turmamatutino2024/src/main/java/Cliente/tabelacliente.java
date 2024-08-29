/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;

import Aluno.alunos;
import Aluno.alunosDao;
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
public class tabelacliente {
    
    public static clientedao CDao = new clientedao();
    public void exebirTabela(){
        ArrayList<cliente> ArrayC = new ArrayList<>();
        ArrayC = CDao.SelectAll();
        
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
        model.addColumn("Sexo");
        model.addColumn("EstadoC");
         model.addColumn("Profissao");
        
          int i = 0;
        boolean parar = true;
            
        while(parar){
            if(i<ArrayC.size()){
                model.addRow(new Object[]{ArrayC.get(i).getCodcliente(),ArrayC.get(i).getNome(),
                    ArrayC.get(i).getCpf(),ArrayC.get(i).getEndereco(),ArrayC.get(i).getTelefone(),
                    ArrayC.get(i).getEmail(),ArrayC.get(i).getDataNASC(),ArrayC.get(i).getSexo(),
                    ArrayC.get(i).getEstadoC(),ArrayC.get(i).getProfissao()});
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


