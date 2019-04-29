/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaçãoatividademarlon;

/**
 *
 * @author Alunos
 */
public class produtos {
    
    private int id_produto;
    private String Titulo;
    private String Marca;
    private double ValorUnidade;
    private Pedido pedido;

    public produtos() {
    }

       
    public produtos(String Titulo, String Marca, double ValorUnidade, Pedido pedido) {
  
        this.Titulo = Titulo;
        this.Marca = Marca;
        this.ValorUnidade = ValorUnidade;
        this.pedido = pedido;
    }
    
     

    /**
     * @return the id_produto
     */
    public int getId_produto() {
        return id_produto;
    }

    /**
     * @param id_produto the id_produto to set
     */
    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    /**
     * @return the Titulo
     */
    public String getTitulo() {
        return Titulo;
    }

    /**
     * @param Titulo the Titulo to set
     */
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    /**
     * @return the Marca
     */
    public String getMarca() {
        return Marca;
    }

    /**
     * @param Marca the Marca to set
     */
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    /**
     * @return the ValorUnidade
     */
    public double getValorUnidade() {
        return ValorUnidade;
    }

    /**
     * @param ValorUnidade the ValorUnidade to set
     */
    public void setValorUnidade(double ValorUnidade) {
        this.ValorUnidade = ValorUnidade;
    }
    
    
    
    
}
