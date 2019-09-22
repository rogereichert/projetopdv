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
    
    // construtor que conecta no banco
    public CategoriaDao(){
        
        this.conn = new ConnectionFactory().getConnection();
        
    }
    
    // Método responsável por cadastrar uma categoria no banco de dados
    public void cadastrarCategoria(categoriaProduto categoria){
        
        try {
            
            String sql = "INSERT INTO tbl_categoria_produtos(descricao) "
                    + "VALUES (?)";
        
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, categoria.getCategoria());
            
            // executo o comando sqql
            stmt.execute();
            
            // fecho a conexão
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Categoria cadastrada com sucesso!", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception e) {
        
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            
        }
    }
    
    public void editarCategoria(){
        
    }
    
    public void excluirCategoria(){
        
    }
    
    public void listarCategoria(){
        
    }
}
