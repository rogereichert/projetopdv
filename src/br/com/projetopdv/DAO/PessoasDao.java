package br.com.projetopdv.DAO;

import br.com.projetopdv.jdbc.ConnectionFactory;
import br.com.projetopdv.model.Pessoas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Roger Reichert
 * @version 1.0.1
 */
public class PessoasDao {
   
    // atributo de conexão
    private Connection conn;

    // construtor da classe
    public PessoasDao(){
        this.conn = new ConnectionFactory().getConnection();
    }
    
    // método para cadastrar clientes
    public void cadastraPessoas(Pessoas pessoa){
        
        try {
            
            // string do comando sql
            String sql = "INSERT INTO tb_clientes(nome, cep, endereco, bairro, cidade, estado, telefone, email) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            // Conecta ao banco de dados para fazer a inserção dos dados
            PreparedStatement stmt = conn.prepareCall(sql);
            
            // adiciona os valores no objeto criado no parâmetro do método
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getCep());
            stmt.setString(3, pessoa.getEndereco());
            stmt.setString(4, pessoa.getBairro());
            stmt.setString(5, pessoa.getCidade());
            stmt.setString(6, pessoa.getEstado());
            stmt.setString(7, pessoa.getTelefone());
            stmt.setString(8, pessoa.getEmail());
            
            // executo o comando sqql
            stmt.execute(sql);
            
            // fecho a conexão
            stmt.close();
            
            //JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Problema encontrado: " + e, "Erro", JOptionPane.WARNING_MESSAGE);
        } 
    
    }
}
