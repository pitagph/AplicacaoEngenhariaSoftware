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
import modal.bean.Categoria;



/**
 *
 * @author pit@g
 */
public class CategoriaDAO {
    
    private Connection con = null;

    public CategoriaDAO() {
        
        con = configura_conexao.getConnection();
        
    }
    
    
    public boolean  save(Categoria categoria){
    
   String sql = "INSERT INTO categoria (descricao) VALUER (?)";
        
        
        PreparedStatement stmt = null;
   
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, categoria.getDescricao());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
          System.err.println("Erro:"+ex );
          return false;
        } finally {
    
    configura_conexao.fecharconexao(con, stmt);
    
    
    }
          
}
    
    }
