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
        
        String nome = "Roger";
        
        Produto p = new Produto();
        p.setDescricao(nome);
        
        JOptionPane.showMessageDialog(null, p.getDescricao());
    }
    
}
