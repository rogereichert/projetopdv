package br.com.projetopdv.DAO;

import br.com.projetopdv.jdbc.ConnectionFactory;
import java.sql.Connection;
import br.com.projetopdv.model.UnidadeProduto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
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
        UnidadeProduto obj = new UnidadeProduto();
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
            String sql = "UPDATE tbl_unidades_produto SET descricao = ? WHERE id = ?";
            
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
    
    public UnidadeProduto searchUnidade(String search){
        
        try {
            
            String sql = "SELECT * FROM tbl_unidades_produto WHERE descricao = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, search);
            
            ResultSet rs = stmt.executeQuery();
            
            UnidadeProduto unidade = new UnidadeProduto();
            
            if (rs.next()){
                
                unidade.setId(rs.getInt("id"));
                unidade.setUnidade(rs.getString("descricao"));
                JOptionPane.showMessageDialog(null, "Unidade Encontrada");
                
            }else{
                
                JOptionPane.showMessageDialog(null, "Nenhuma unidade cadastrada com essa descrição: \n" + search);
            }
            
            return unidade;
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Não foi possível fazer a busca, erro: " + e.getMessage());
            return null;
        }
    }
    
    public List<UnidadeProduto> listaUnidadeProduto(){
        
        try {
            
            List<UnidadeProduto> lista = new ArrayList<>();
            
            String sql = "SELECT * FROM tbl_unidades_produto";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                UnidadeProduto obj = new UnidadeProduto();
                
                obj.setId(rs.getInt("id"));
                obj.setUnidade(rs.getString("descricao"));
                
                lista.add(obj);
            }
            
            return lista;
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Erro :" + e);
            return null;
            
        }
        
    }
    
}
