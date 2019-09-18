package br.com.projetopdv.jdbc;

import java.sql.Connection;
import javafx.scene.control.ButtonBar;
import javax.swing.JOptionPane;

/**
 *
 * @author Roger Reichert
 * @version 1.0.0
 */

public class TestaConexao {

    public static void main(String[] args) {
        
        try {
            
            new ConnectionFactory().getConnection();
            JOptionPane.showMessageDialog(null, "Conectado", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Erro: " + e);
            
        }
        
    }
    
}
