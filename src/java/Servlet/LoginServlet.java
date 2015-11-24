/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Usuario;

/**
 *
 * @author Pão
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                
            String exLogin="marciarenata@gmail.com", exPass="123", nome="Marcia Renata" ;
            
            String login = request.getParameter("login");
            String password = request.getParameter("password");
            
            if(JdbcDao.JDBCUsuario.checarLogin(login, password) == 0){
                RequestDispatcher dispatcher = request.getRequestDispatcher("PagPrincipalUsuarioLogado.jsp");
                dispatcher.forward(request, response);
                request.getSession(true).setAttribute("nome",nome);
            }
            
                
            /*        
            if(exLogin.equals(login) && exPass.equals(password)) {
                RequestDispatcher dispatcher = request.getRequestDispatcher("PagPrincipalUsuarioLogado.jsp");
                dispatcher.forward(request, response);
                request.getSession(true).setAttribute("nome",nome);
            } */
                    else {
                request.setAttribute("mensagem","Usuário ou Senha Inválidos!");
                RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
                dispatcher.forward(request, response);
            }
            System.out.println(JdbcDao.JDBCUsuario.checarLogin(login, password));
    }
}