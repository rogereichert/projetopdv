package br.com.projetopdv.DAO;

import br.com.projetopdv.jdbc.ConnectionFactory;
import br.com.projetopdv.model.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 * @author Roger Reichert
 * @version 1.0.0
 */
public class ClientesDao {
   
    // atributo de conexão
    private Connection conn;

    // construtor da classe
    public ClientesDao(){
        this.conn = new ConnectionFactory().getConnection();
    }
    
    // método para cadastrar clientes
    public void cadastraCliente(Clientes cliente){
        
        try {
            
            // string do comando sql
            String sql = "INSERT INTO tb_clientes(cpf, nome, cep, endereco, bairro, cidade, estado, telefone, email) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            // Conecta ao banco de dados para fazer a inserção dos dados
            PreparedStatement stmt = conn.prepareCall(sql);
            
            // adiciona os valores no objeto criado no parâmetro do método
            stmt.setString(1, cliente.getCpf());
            stmt.setString(2, cliente.getNome());
            stmt.setString(3, cliente.getCep());
            stmt.setString(4, cliente.getEndereco());
            stmt.setString(5, cliente.getBairro());
            stmt.setString(6, cliente.getCidade());
            stmt.setString(7, cliente.getEstado());
            stmt.setString(8, cliente.getEmail());
            
            // executo o comando sqql
            stmt.execute(sql);
            
            // fecho a conexão
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Problema encontrado: " + e, "Erro", JOptionPane.WARNING_MESSAGE);
        } 
    
    }
    
    public void consultaCliente(){
        
    }
    
    
    public void desativaCliente(){
        
    }
    
    public void atualizaCliente(){
        
    }
}
