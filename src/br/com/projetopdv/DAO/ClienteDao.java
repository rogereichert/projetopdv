package br.com.projetopdv.DAO;

import br.com.projetopdv.jdbc.ConnectionFactory;
import java.sql.Connection;

/**
 * @author Roger Reichert
 * @version 1.0.0
 */
public class ClienteDao {
   
    // atributo de conexão
    private Connection conn;
    
    // construtor da classe recebe a conexão
    public ClienteDao(){
        this.conn = new ConnectionFactory().getConnection();
    }
    
    public void cadastrarCliente(){
        
    }
    
    public void listarCliente(){
        
    }
    
    public void atualizarCliente(){
        
    }
    
    public void deletarCliente(){
        
    }
    
    public void buscarCliente(){
        
    }
    
}
