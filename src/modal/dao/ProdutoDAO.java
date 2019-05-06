/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal.dao;
import conexao.configura_conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modal.bean.Produto;

/**
 *
 * @author pit@g
 */
public class ProdutoDAO {
    
    
    public void Inserir(Produto p ) {
    
    Connection con = configura_conexao.getConnection();
    PreparedStatement stmt = null;
        
        try {   
            stmt = con.prepareStatement("INSERT INTO produto (descricao,qtd,preco) VALUES (?,?,?)");
            stmt.setString(1,p.getDescricao());
            stmt.setInt(2,p.getQtd());
            stmt.setDouble(3,p.getVlr());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Salvo com Sucesso");
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro ao salvar"+ex); 
        } finally {
             configura_conexao.fecharconexao(con, stmt);
    
    }
    
    
    }
    
    
       public void excluir(Produto p) {

        Connection con = configura_conexao.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM produto WHERE id = ?");
            stmt.setInt(1, p.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            configura_conexao.fecharconexao(con, stmt);
        }

    }
       
       
       public void update(Produto p) {

        Connection con = configura_conexao.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE produto SET descricao = ? ,qtd = ?,preco = ? WHERE id = ?");
            
            stmt.setString(1, p.getDescricao());
            stmt.setInt(2, p.getQtd());
            stmt.setDouble(3, p.getVlr());
            stmt.setInt(4, p.getId());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            configura_conexao.fecharconexao(con, stmt);
        }

    }
    
    
    
    
    // Vizualizar tabela no banco de dados
    public List<Produto> read() {
   Connection con = configura_conexao.getConnection();
   PreparedStatement stmt = null;
   ResultSet rs = null;
   
   
  List<Produto> products = new ArrayList<>();
   
        try { 
            stmt = con.prepareStatement("SELECT * FROM produto");
            rs = stmt.executeQuery();
            
            
            while (rs.next()) {
               Produto product = new Produto();
               
               product.setId(rs.getInt("id"));
               product.setDescricao(rs.getString("descricao"));
               product.setQtd(rs.getInt("qtd"));
               product.setVlr(rs.getDouble("preco"));
               products.add(product);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        
        configura_conexao.fecharconexao(con, stmt, rs);
        }
    
    return products;
    
    }
    
    
public List<Produto> readForDesc(String desc) {

        Connection con = configura_conexao.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM produto WHERE descricao LIKE ?");
            stmt.setString(1, "%"+desc+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Produto produto = new Produto();

                produto.setId(rs.getInt("id"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setQtd(rs.getInt("qtd"));
                produto.setVlr(rs.getDouble("preco"));
                produtos.add(produto);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            configura_conexao.fecharconexao(con, stmt, rs);
        }

        return produtos;

    }

public List<Produto> readForID(int id) {

        Connection con = configura_conexao.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM produto WHERE id LIKE ?");
            stmt.setInt(1, id);
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Produto produto = new Produto();

                produto.setId(rs.getInt("id"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setQtd(rs.getInt("qtd"));
                produto.setVlr(rs.getDouble("preco"));
                produtos.add(produto);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            configura_conexao.fecharconexao(con, stmt, rs);
        }

        return produtos;

    }
    
}
