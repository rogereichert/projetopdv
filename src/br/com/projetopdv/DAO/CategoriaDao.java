package br.com.projetopdv.DAO;

import br.com.projetopdv.jdbc.ConnectionFactory;
import br.com.projetopdv.model.categoriaProduto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Roger Reichert
 * @version 1.0.0
 */
public class CategoriaDao {
     
    private Connection conn;
    
    public CategoriaDao(){
        
        this.conn = new ConnectionFactory().getConnection();
        
    }
    
    public void cadastrarCategoria(categoriaProduto categoria){
        
        try {
            
            String sql = "INSERT INTO tbl_categoria_produto (descricao) VALUES (?)";
        
            PreparedStatement stmt = conn.prepareCall(sql);
            
            stmt.setString(1, categoria.getCategoria());
            
            // executo o comando sqql
            stmt.execute(sql);
            
            // fecho a conexão
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Categoria cadastrada com sucesso!", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception e) {
        
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            
        }
        
    }
    
}
