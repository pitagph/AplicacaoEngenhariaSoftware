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
public class Usuario {
    
 private String Nome;
 private String Email;
 private int Senha;
 private String Endereco;
 private Pedido pedido;

    public Usuario(String Nome, String Email, int Senha, String Endereco, Pedido pedido) {
        this.Nome = Nome;
        this.Email = Email;
        this.Senha = Senha;
        this.Endereco = Endereco;
        this.pedido = pedido;
    }

    public Usuario() {
    }
 

    
    
    
 void editaDados () {
 
 
 } 
 
 void excluirConta() {
     
     
 }

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the Senha
     */
    public int getSenha() {
        return Senha;
    }

    /**
     * @param Senha the Senha to set
     */
    public void setSenha(int Senha) {
        this.Senha = Senha;
    }

    /**
     * @return the Endereco
     */
    public String getEndereco() {
        return Endereco;
    }

    /**
     * @param Endereco the Endereco to set
     */
    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }
 
    
}
