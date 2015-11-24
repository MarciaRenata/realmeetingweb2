/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JdbcDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JDBCUsuario {
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
}
