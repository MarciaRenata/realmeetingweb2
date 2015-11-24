package factoryDAO;

import dao.AdministradorDAO;
import dao.EventoDAO;
import dao.GrupoDAO;
import dao.UsuarioDAO;

public interface Factory {
 
    public AdministradorDAO createAdministradorDAO();
    public EventoDAO createEventoDAO();
    public GrupoDAO createGrupoDAO();
    public UsuarioDAO createUsuarioDAO();
}
