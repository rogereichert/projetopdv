/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetopdv.model;

import javax.swing.JOptionPane;

/**
 *
 * @author roger
 */
public class teste {

    public static void main(String[] args) {
       
       CategoriaProduto c = new CategoriaProduto();
       c.setId(100000);
       Produto p = new Produto();
       p.setDescricao("Arroz");
       p.setId_categoria(c.getId());
       
       p.setId_categoria(c.getId());
       
       
       JOptionPane.showMessageDialog(null, p.getId_categoria());
        
        
    }
    
}
