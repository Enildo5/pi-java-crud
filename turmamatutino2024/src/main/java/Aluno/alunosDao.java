/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aluno;

import Aluno.alunos;
import classeespecial.Dao;
import classeespecial.conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Senac
 */
public class alunosDao implements Dao {

    @Override
    public void insert(Object o) {

        alunos a = (alunos) o;
        String sql = "insert into aluno(Nme,Cpf,,Endeco,Telefone,Email,,datadenascimento,Serie_ano,responsavel) values( ?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
            ps.setString(1, a.getNome());
            ps.setString(2, a.getCPF());
            ps.setString(3, a.getEndereco());
            ps.setString(4, a.getTelefone());
            ps.setString(5, a.getEmail());
            ps.setString(6, a.getDatadenascimento());
            ps.setString(7, a.getSerie_Ano());
            ps.setString(8, a.getResponsavel());
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
        alunos a = (alunos) o;

        String sql = "update aluno set Nome =?,CPF =?,Endereco =?,Telefone =?,Email =?,DatadeNascimento =?, "
                + "Serie_Ano =?,Responsavel =? where codaluno =?";
        try {
            PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
            ps.setString(1, a.getNome());
            ps.setString(2, a.getCPF());
            ps.setString(3, a.getEndereco());
            ps.setString(4, a.getTelefone());
            ps.setString(5, a.getEmail());
            ps.setString(6, a.getDatadenascimento());
            ps.setString(7, a.getSerie_Ano());
            ps.setString(8, a.getResponsavel());
            ps.setInt(9, a.getCodaluno());
            int atual = ps.executeUpdate();
            if (atual > 0) {
                JOptionPane.showMessageDialog(null, "dads atualizados");
            } else {
                JOptionPane.showMessageDialog(null, "Erro de atualização");
            }
            ps.close();
        } catch (SQLException e) {

        }
        JOptionPane.showMessageDialog(null, "Erro na menssagem");
    }

    @Override
    public void delet(int cod) {
        String sql = "delete from aluno where codaluno=?";
        try {
            PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, cod);
            int atual = ps.executeUpdate();
            if (atual > 0) {
                JOptionPane.showMessageDialog(null, "gravação com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Não hove gravação ");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public ArrayList<alunos> SelectAll() {
        ArrayList<alunos> ArrayA = new ArrayList<>();
        String sql = "select *  from aluno";
        try {
            PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                alunos a = new alunos();
                a.setCodaluno(rs.getInt("Codaluno"));
                a.setNome(rs.getString("Nome"));
                a.setCPF(rs.getString("CPF"));
                a.setEndereco(rs.getString("Endereco"));
                a.setTelefone(rs.getString("Telefone"));
                a.setEmail(rs.getString("Email"));
                a.setDatadenascimento(rs.getString("Datadenascimento"));
                a.setSerie_Ano(rs.getString("Serie_Ano"));
                a.setResponsavel(rs.getString("Responsavel"));
                
                ArrayA.add(a);
                
            }
        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
        return ArrayA;
    }

}
