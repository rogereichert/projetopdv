package br.com.projetopdv.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Roger Reichert
 * @version 1.0.0
 */

// Classe ConnectionFactory
public class ConnectionFactory {
    
    // método de conexão com o banco de dados
    public Connection getConnection(){
        
        try {
            
            // retorna os dados da conexão
            return DriverManager.getConnection("jdbc:mysql://localhost/pdv", "root", "");
            
        } catch (Exception e) {
            
            // caso aconteça algum erro de execução, mostra na tela.
            throw new RuntimeException(e);
            
        }
        
    }
    
}
