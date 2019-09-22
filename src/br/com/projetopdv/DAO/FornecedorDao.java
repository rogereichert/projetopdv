package br.com.projetopdv.DAO;

import br.com.projetopdv.jdbc.ConnectionFactory;
import java.sql.Connection;
import br.com.projetopdv.model.Fornecedor;
import br.com.projetopdv.model.Pessoa;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Roger Reichert
 * @version 1.0.0
 */
public class FornecedorDao {
    
    private Connection conn;
    
    public FornecedorDao(){
        
        this.conn = new ConnectionFactory().getConnection();
        
    }
    
    public void cadastrarFornecedor(Fornecedor fornecedor){
        
        try {
            
            String sql = "INSERT INTO tbl_fornecedores(id_pessoa, cnpj) VALUES (?, ?)";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            //fornecedor.setId_pessoa(dao.cadastraPessoas(p));
            
            stmt.setInt(1, fornecedor.getId_pessoa());
            stmt.setString(2, fornecedor.getCnpj());
            
            // executo o comando sqql
            stmt.execute();
            
            // fecho a conexão
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Categoria cadastrada com sucesso!", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception e) {
        }
        
    }
    
}
