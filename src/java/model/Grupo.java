/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pão
 */
public class Grupo {
    
    private String nome;
    
    private String descricao;
    
    private ArrayList<Topico> topicos;
    
    private ArrayList<Usuario> membros;
    
    private ArrayList<Evento> evento;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the membros
     */
    public ArrayList<Usuario> getMembros() {
        return membros;
    }

    /**
     * @param membros the membros to set
     */
    public void setMembros(ArrayList<Usuario> membros) {
        this.membros = membros;
    }


    /**
     * @return the evento
     */
    public List<Evento> getEvento() {
        return evento;
    }

    /**
     * @param evento the evento to set
     */
    public void setEvento(ArrayList<Evento> evento) {
        this.evento = evento;
    
    }

    /**
     * @return the topicos
     */
    public ArrayList<Topico> getTopicos() {
        return topicos;
    }

    /**
     * @param topicos the topicos to set
     */
    public void setTopicos(ArrayList<Topico> topicos) {
        this.topicos = topicos;
    }
}