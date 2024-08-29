package Cliente;


import classeespecial.Dao;
import classeespecial.conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Senac
 */

public class clientedao implements Dao {

    @Override
    public void insert(Object o) {
        cliente c = (cliente) o;
        String sql = "insert into cliente(nome,cpf,Enderco,telefone,email,DataNsc,"
                + "Sexo,EstadoC,profissao) values(?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
            ps.setString(1, c.getNome());
            ps.setString(2, c.getCpf());
            ps.setString(3, c.getEndereco());
            ps.setString(4, c.getTelefone());
            ps.setString(5, c.getEmail());
            ps.setString(6, c.getDataNASC());
            ps.setString(7, c.getSexo());
            ps.setString(8, c.getEstadoC());
            ps.setString(9, c.getProfissao());
            int atual = ps.executeUpdate();
            if (atual > 0) {

                JOptionPane.showMessageDialog(null, "gravado com sucesso");

            } else {
                JOptionPane.showMessageDialog(null, "não houve grvação");

            }
            ps.close();
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro445");

        }
    }

    @Override
    public void update(Object o) {
        cliente c = (cliente) o;
        String sql = "update cliente set nome=?, cpf=? ,Enderco=?,telefone=?,email=?,DaNsc=?,Sexo=?,EstadoC=?,profissao=? where codcliente";

        try {
            PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
            ps.setString(1, c.getNome());
            ps.setString(2, c.getCpf());
            ps.setString(3, c.getEndereco());
            ps.setString(4, c.getTelefone());
            ps.setString(5, c.getEmail());
            ps.setString(6, c.getDataNASC());
            ps.setString(7, c.getSexo());
            ps.setString(8, c.getEstadoC());
            ps.setString(9, c.getProfissao());
            ps.setInt(10,c.getCodcliente());
            int atual = ps.executeUpdate();
            if (atual > 0) {

                JOptionPane.showMessageDialog(null, "gravado com sucesso");

            } else {
                JOptionPane.showMessageDialog(null, "não houve grvação");

            }
            ps.close();
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro na menssagem");

        }
    }

        @Override
        public void delet (int cod){
        String sql = "delete from cliente where codcliente=?";
        try{
            PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
            ps.setInt(1,cod);
            int atual =  ps.executeUpdate();
            if(atual > 0){
               JOptionPane.showMessageDialog(null, "gravação com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Não hove gravação ");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);  
            }
            
         }
            
     
      
    public ArrayList<cliente> SelectAll(){
        ArrayList<cliente> Arrayc =new ArrayList<>();
    String sql ="select * from cliente";
    try{
    PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
    cliente c = new cliente();
    c.setCodcliente(rs.getInt("codcliente"));
    c.setNome(rs.getString("nome"));
    c.setCpf(rs.getString("Cpf"));
    c.setEndereco(rs.getString("Enderco"));
    c.setTelefone(rs.getString("telefone"));
    c.setEmail(rs.getString("Email"));
    c.setDataNASC(rs.getString("DataNsc"));
    c.setSexo(rs.getString("sexo"));
    c.setEstadoC(rs.getString("EstadoC"));
    c.setProfissao(rs.getString("profissao"));
    
    Arrayc.add(c);
}
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null,e);

            }
    return Arrayc;

        }


}
        
    
    
