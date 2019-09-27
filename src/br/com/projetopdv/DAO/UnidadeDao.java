package br.com.projetopdv.DAO;

import br.com.projetopdv.jdbc.ConnectionFactory;
import java.sql.Connection;
import br.com.projetopdv.model.UnidadeProduto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Reichert
 * @version 1.0.0
 */
public class UnidadeDao {
    
    private Connection conn;
    
    public UnidadeDao(){
        this.conn = new ConnectionFactory().getConnection();
    }
    
    public void cadastrarUnidade(UnidadeProduto unidade){
        
        try {
            
            String sql = "INSERT INTO tbl_unidades_produto(descricao) VALUES (?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, unidade.getUnidade());
            
             // executo o comando sqql
            stmt.execute();
            
            // fecho a conexão
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Unidade cadastrada com sucesso!", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
    
    public void alterarUnidade(UnidadeProduto unidade){
        
      
    }
    
}
