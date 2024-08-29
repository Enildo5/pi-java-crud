/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionario;

import classeespecial.Dao;
import classeespecial.conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Senac
 */
public class funcionrioDao implements Dao {

    @Override
    public void insert(Object o) {
        funcionario f = (funcionario) o;
        String sql = "insert into funcionario(NomeCompleto,Cpf,Endereco,Email,DatadeAdmissao,Cargo,Salario,Departamento) values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
            ps.setString(1, f.getNomeCompelrto());
            ps.setString(2, f.getCpf());
            ps.setString(3, f.getEndereco());
            ps.setString(4, f.getEmail());
            ps.setString(5, f.getDatadeAdmissao());
            ps.setString(6, f.getCargo());
            ps.setString(7, f.getDepartamento());
            int atual = ps.executeUpdate();
            if (atual > 0) {

                JOptionPane.showMessageDialog(null, "gravação com sucesso");

            } else {
                JOptionPane.showMessageDialog(null, "Não hove gravação ");

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro449");
        }

    }
            
        
        @Override
        public void update(Object o) {
        funcionario f = (funcionario) o;
        String sql = "update aluno set NomeeCompleto =?,Cpf =?,Endereco =?,Email =?,DatadeAdmissao =?,Cargo =?,Salario =?,Departamento = ?where codfuncionario =?";
        try {
            PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
            ps.setString(1, f.getNomeCompelrto());
            ps.setString(2, f.getCpf());
            ps.setString(3, f.getEndereco());
            ps.setString(4, f.getEmail());
            ps.setString(5, f.getDatadeAdmissao());
            ps.setString(6, f.getCargo());
            ps.setString(7, f.getDepartamento());
            int atual = ps.executeUpdate();
            if (atual > 0) {

                JOptionPane.showMessageDialog(null, "dados Atualizados");

            } else {
                JOptionPane.showMessageDialog(null, "Não hove atualização ");

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro449");
    }
    }
    @Override
    public void delet(int cod) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
