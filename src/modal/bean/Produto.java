/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal.bean;

/**
 *
 * @author pitag
 */
public class Produto {
    
    
    private int id;
    private String descricao;
    private int qtd;
    private double vlr;
    private Categoria caterogia;
    
    
        public Produto() {
    }

    public Produto(String descricao, int qtd, double vlr, Categoria caterogia) {

        this.descricao = descricao;
        this.qtd = qtd;
        this.vlr = vlr;
        this.caterogia = caterogia;
        
        
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the qtd
     */
    public int getQtd() {
        return qtd;
    }

    /**
     * @param qtd the qtd to set
     */
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    /**
     * @return the vlr
     */
    public double getVlr() {
        return vlr;
    }

    /**
     * @param vlr the vlr to set
     */
    public void setVlr(double vlr) {
        this.vlr = vlr;
    }
    
    
        
    
}
