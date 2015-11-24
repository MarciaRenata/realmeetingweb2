/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.chart.PieChart.Data;

/**
 *
 * @author Pão
 */
public class Evento {
    
    private String nome;
    
    private String descricao;
    
    private Data data;
    
    private ArrayList<Usuario> MembrosConfirmados;

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
     * @return the MembrosConfirmados
     */
    public ArrayList<Usuario> getMembrosConfirmados() {
        return MembrosConfirmados;
    }

    /**
     * @param MembrosConfirmados the MembrosConfirmados to set
     */
    public void setMembrosConfirmados(ArrayList<Usuario> MembrosConfirmados) {
        this.MembrosConfirmados = MembrosConfirmados;
    }
    
}
