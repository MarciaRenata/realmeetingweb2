/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryDAO;

import dao.AdministradorDAO;
import dao.EventoDAO;
import dao.GrupoDAO;
import dao.UsuarioDAO;


/**
 *
 * @author Pão
 */
public class JDBCFactory implements Factory{

    @Override
    public AdministradorDAO createAdministradorDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EventoDAO createEventoDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GrupoDAO createGrupoDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UsuarioDAO createUsuarioDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
