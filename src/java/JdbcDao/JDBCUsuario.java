/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JdbcDao;

import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuario;


public class JDBCUsuario  implements UsuarioDAO{
    
    public static Connection connection;
    
    
    public static int checarLogin(String email, String senha){
        
          String select = "SELECT senha FROM usuario WHERE email LIKE '" + email + "'";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDBCUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try {
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            
            Connection conexao;
              conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/realmeetingweb2", "marcia", "1234");
            
            Statement stmt = conexao.createStatement();
            
            
            ResultSet result = stmt.executeQuery(select);
            
            if(result.next()){
                String senhaDB = result.getString("senha");
                
                if(senhaDB.equals(senha)){
                    return 0;
                } else {
                    return -1;
                }
            } else {
                return -2;
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao criar conexao com o banco: " + ex.getMessage());
            Logger.getLogger(JDBCUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return -3;
        } 
        
    }
    

    @Override
    public void inserirUsuario(Usuario usuario) {
        String inserir = "INSERT INTO usuario(nome, email, senha) "
                + "VALUES (?,?,?)";
      
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDBCUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            
            Connection conexao;
              conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/realmeetingweb2", "marcia", "1234");
            
            
            PreparedStatement stmt = conexao.prepareStatement(inserir);
            
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getSenha());
            stmt.execute();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao criar conexao com o banco: " + ex.getMessage());
            Logger.getLogger(JDBCUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }
    
    public static String getUser(String email){
        
        String select = "SELECT nome FROM usuario WHERE email LIKE '" + email + "'";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDBCUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
               
        try {            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/realmeetingweb2", "marcia", "1234");
            
            Statement stmt = conexao.createStatement();
            
            ResultSet result = stmt.executeQuery(select);
            
            if(result.next()){
                return result.getString("nome");
            } else {
                return null;
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao criar conexao com o banco: " + ex.getMessage());
            Logger.getLogger(JDBCUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
    }

    @Override
    public void excluirUsuario(Usuario usuarioDAO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
