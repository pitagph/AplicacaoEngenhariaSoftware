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
import java.sql.Statement;

/**
 *
 * @author pit@g
 */
public class other_modelo_conexao {
    
    
    public Connection con;
    public Statement stmt;
    public ResultSet rs;
    
    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/categoria";
    String user = "root";
    String pass = "";
    
    
    
    public void abrirConexao(){
    
        try {
             Class.forName(driver).newInstance();
             con = DriverManager.getConnection(url, user, pass);
             stmt = con.createStatement();
     
        
        
        
        } catch (Exception e) {
            
            System.err.println("Erro: "+ e);
            
            
        } 
    
   
    }
    
    

       
    
    
    
    
}
