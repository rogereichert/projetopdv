package br.com.projetopdv.model;

/**
 * @author Roger Reichet
 * @version 1.0.0
 */
public class Cliente {
   
    private int id;
    private Pessoa id_pessoa;
    private String cpf;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pessoa getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(Pessoa id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
 
}
