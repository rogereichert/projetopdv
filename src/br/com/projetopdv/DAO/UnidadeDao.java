package br.com.projetopdv.DAO;

import br.com.projetopdv.jdbc.ConnectionFactory;
import java.sql.Connection;
import br.com.projetopdv.model.UnidadeProduto;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

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
    
    /*
        updateProduto() = MÉTODO RESPONSÁVEL POR ATUALIZAR UMA UNIDADE DE PRODUTO
    */
    public void updateUnidadeProduto(UnidadeProduto obj){
        
        try {
            
            // COMANDO UPDATE
            String sql = "UPDATE tbl_udades_produto SET descricao = ? WHERE id = ?";
            
            // CONECTAR AO BANCO E ORGANIZAR O COMANDO SQL
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            // ATRIBUIO OS VALORES QUE SERÃO PASSADOS NO OBJETO
            stmt.setString(1, obj.getUnidade());
            stmt.setInt(2, obj.getId());
            
            // EXECUTA A SQL
            stmt.execute();
            
            // MOSTRO AO USUÁRIO QUE A ALTERAÇÃO FOI REALIZADA COM SUCESSO
            JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso");
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Erro em atualizar unidade: " + e);
        }
    }
    
}
