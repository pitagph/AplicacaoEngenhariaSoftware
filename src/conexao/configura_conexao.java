/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pitag
 */
public class configura_conexao {
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/categoria";
    private static final String USER = "root";
    private static final String PASS = "";
    
    
   public static Connection getConnection() {
   
   
        try {
            Class.forName(DRIVER);
            
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro de Conexão ou banco de dados não existe", ex);
        }
   
   }
   
   public static void fecharconexao(Connection con) {
       if (con != null) {
        try {
            con.close();
        } catch (SQLException ex) {
            System.err.println("Erro: "+ ex);
        }
   
       }
       
   }
   
   
   public static void fecharconexao(Connection con, PreparedStatement stmt) {
       if (stmt != null) {
        try {
            stmt.close();
        } catch (SQLException ex) {
            System.err.println("Erro: "+ ex);
        }
            fecharconexao(con);
       }
       
       
    }
       
  public static  void fecharconexao(Connection con, PreparedStatement stmt, ResultSet rs) {
    
        
        if (rs != null) {
        try {
            rs.close();
        } catch (SQLException ex) {
            System.err.println("Erro: "+ ex);
        }
            fecharconexao(con, stmt);
       }
       
       
   }
   
   
   
   
   
   
   
}
