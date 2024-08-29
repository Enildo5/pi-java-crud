/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientaçãoobjetos;

/**
 *
 * @author Senac
 */
public class produto {
  
private int codproduto;    
private String Nome;
private String Codigodoproduto;
private String Descricao;
private float Preco;
private float Quantidadeemestoque;
private String Categoria;
private String Datadevalidade;
private String Fonecedor;
private String Localizacaonoestoquie;

    public int getCodproduto() {
        return codproduto;
    }

    public void setCodproduto(int codproduto) {
        this.codproduto = codproduto;
    }
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCodigodoproduto() {
        return Codigodoproduto;
    }

    public void setCodigodoproduto(String Codigodoproduto) {
        this.Codigodoproduto = Codigodoproduto;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public float getPreco() {
        return Preco;
    }

    public void setPreco(float Preco) {
        this.Preco = Preco;
    }

    public float getQuantidadeemestoque() {
        return Quantidadeemestoque;
    }

    public void setQuantidadeemestoque(float Quantidadeemestoque) {
        this.Quantidadeemestoque = Quantidadeemestoque;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getDatadevalidade() {
        return Datadevalidade;
    }

    public void setDatadevalidade(String Datadevalidade) {
        this.Datadevalidade = Datadevalidade;
    }

    public String getFonecedor() {
        return Fonecedor;
    }

    public void setFonecedor(String Fonecedor) {
        this.Fonecedor = Fonecedor;
    }

    public String getLocalizacaonoestoquie() {
        return Localizacaonoestoquie;
    }

    public void setLocalizacaonoestoquie(String Localizacaonoestoquie) {
        this.Localizacaonoestoquie = Localizacaonoestoquie;
    }

}