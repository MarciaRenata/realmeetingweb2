/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Evento;

/**
 *
 * @author Pão
 */
public interface EventoDAO {
    
    public void inserirEvento(Evento eventoDAO);

    public void excluirEvento(Evento eventoDAO);
}
