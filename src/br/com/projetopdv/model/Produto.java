package br.com.projetopdv.model;

/**
 *
 * @author Reichert
 * @version 1.0.0
 */
public class Produto {
    
    private int id;
    private int codigoBarras;
    private String descricao;
    private double preco;
    private int quantidade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(int codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao.toUpperCase();
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        
        if (quantidade < 0){
            
            quantidade = 0;
            this.quantidade = quantidade;
            
        }else{
            
            this.quantidade = quantidade;
            
        }
        
    }
    
    
    
}
