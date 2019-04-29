/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal.dao;

import modal.bean.Categoria;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pit@g
 */
public class CategoriaDAOTest {
    
    public CategoriaDAOTest() {
    }

    @Test
    public void inserir() {
        
        Categoria cat = new Categoria("Loja de Produto");
        CategoriaDAO dao = new CategoriaDAO();
        
        if (dao.save(cat)){System.out.println("Salvo com sucesso");} else {
            fail("erro ao salvar");
            
                }       
        
        
    }
    
}
