package br.com.projetopdv.model;

/**
 *
 * @author Roger Reichert
 * @version 1.0.0
 */
public class Fornecedor{
    
    private int id;
    private int id_pessoa;
    private String cnpj;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_pessoa() {
        return id_pessoa;
    }
   
    public void setId_pessoa(int id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    
    
}
