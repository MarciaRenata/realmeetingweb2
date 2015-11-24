/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Evento;
import model.Grupo;
import model.Usuario;

/**
 *
 * @author Pão
 */
@WebServlet(name = "GrupoServlet", urlPatterns = {"/GrupoServlet"})
public class GrupoServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GrupoServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet GrupoServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        Usuario usuario = new Usuario();
        Usuario usuario2 = new Usuario();
        Evento evento = new Evento();        
        Grupo grupo = new Grupo();
        
        usuario.setNome("Marcia Renata");
        usuario.setEmail("marciarenata@gmail.com");
        
        usuario2.setNome("Maria Silva");
        usuario2.setEmail("mariasilva@gmail.com");
        
        ArrayList<Usuario> usuarios = new ArrayList();
        usuarios.add(usuario);
        usuarios.add(usuario2);
        
        evento.setNome("Evento 1");
        evento.setDescricao("Realização do evento 1");
        evento.setMembrosConfirmados(usuarios);
        
        ArrayList<Evento> eventos = new ArrayList();
        eventos.add(evento);
        /*
        ArrayList<String> topico = new ArrayList<String>();
        topico.add("Topico 1");
        
        ArrayList<Assunto> topicos = new ArrayList();
        topicos.add(topico);
        */
        grupo.setNome("Grupo1");
        grupo.setDescricao("Este Grupo tem o objetivo de reencontrar pessoas");
        grupo.setEvento(eventos);
        grupo.setMembros(usuarios);
      
        
        ArrayList<Grupo> grupos = new ArrayList();
        grupos.add(grupo);
        
        usuario.setGrupo(grupos);
        
        request.setAttribute("grupo", grupo);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/Grupo.jsp");  
        dispatcher.forward(request, response);
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
