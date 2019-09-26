package br.com.projetopdv.model;

/**
 * @author Roger Reichert
 */
public class ItemVenda {
 
    private int id;
    private Venda venda;
    private Produto produto;
    private int quantidade;
    private double subtotal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        if (subtotal <= 0.00){
            this.subtotal = 0.00;
        }else{
            this.subtotal = subtotal;
        }
    }
    
}