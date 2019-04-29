/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaçãoatividademarlon;

import java.util.Scanner;

/**
 *
 * @author Alunos
 */
public class AplicaçãoAtividadeMarlon {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Usuario user1 = new Usuario();
        
        user1.setNome("Phillipe");
        user1.setEmail("pitagph@gmail.com");
        user1.setEndereco("Avenida Presidente Costa e Silva");
        user1.setSenha(123);
    
        produtos produto1 = new produtos();
        
        produto1.setId_produto(0000001);
        produto1.setMarca("Kimimo");
        produto1.setTitulo("Café em Pó");
        produto1.setValorUnidade(4.0);
        
        
        
         // Saida
 Scanner menu = new Scanner (System.in); 
        
  Scanner menuuser = new Scanner (System.in); 
  
  
        System.out.println("Bem vindo ao Sistema");
          System.out.println("Para acessar o menu do Gerente");
          System.out.println("Digite seu usuário e senha:");
          
          
       
          int opcao = 0;
          
       do {
   
    System.out.println("## Escolha uma das opções abaixo ##");
    System.out.println("Opção 1 = Ver lista de produtos");
    System.out.println("Opção 2 = Ver Lista do Usuário");
    System.out.println("Opção 3 = Ver Lista de Pedido ");
    System.out.println("Opção 0 - Sair do programa");
    System.out.println("_______________________");
    
     opcao = Integer.parseInt(menu.nextLine());   
          
          
     if(opcao == 1){

 System.out.println ("Id || Marca || Titulo ||  Valor ||");  
  System.out.println ("");    
 System.out.println (produto1.getId_produto()+"||"+produto1.getMarca()+"||"+produto1.getTitulo()+"||"+produto1.getValorUnidade()+"||");
  System.out.println ("");
 
         System.out.println ("");  
      }   
     
      
              
     if(opcao == 2){

 System.out.println ("Nome || Email || Endereço ||  Senha ||");  
  System.out.println ("");    
 System.out.println (user1.getNome()+"||"+user1.getEmail()+"||"+user1.getEndereco()+"||"+user1.getSenha()+"||");
  System.out.println ("");
 
         System.out.println ("");  
      }   
     
        
   
    
          } while (opcao != 0); // Fim do CADASTRO
   
   
   System.out.println("Voce saiu do programa");
   
  }
        
        
        
    }
    
