/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal.dao;
import conexao.configura_conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
            stmt = con.prepareStatement("INSERT INTO produto (descricao,qtd,preco) VALUES (NULL,NULL,NULL)");
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
    
}
