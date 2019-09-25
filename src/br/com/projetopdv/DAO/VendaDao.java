package br.com.projetopdv.DAO;
import br.com.projetopdv.jdbc.ConnectionFactory;
import br.com.projetopdv.model.Venda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;

/**
 * @author Roger Reichert
 */
public class VendaDao {
    
    private Connection con;
    
    public VendaDao(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public void cadastraVenda(){}
    
    public int retornaUltimaVenda(){ int retorno = 0; return retorno;}
    
    public List<Venda> ListarVendasPorPeriodo(LocalDate data_inicio, LocalDate data_fim){  List<Venda> lista = new ArrayList<>(); return lista;}
    
    
    
    
}
