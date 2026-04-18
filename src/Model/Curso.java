/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Cotroller.ControleAdministrador;

/**
 *
 * @author aluno
 */
public class Curso {
 
	private int idCurso;
        
        private String nomeCurso;
	 
	private String statusCurso;
  
	private ControleAdministrador ControleAdministrador;
	 
	private Aluno aluno;

    /**
     * @return the idCurso
     */
    public int getIdCurso() {
        return idCurso;
    }

    /**
     * @param idCurso the idCurso to set
     */
    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    /**
     * @return the nomeCurso
     */
    public String getNomeCurso() {
        return nomeCurso;
    }

    /**
     * @param nomeCurso the nomeCurso to set
     */
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    /**
     * @return the statusCurso
     */
    public String getStatusCurso() {
        return statusCurso;
    }

    /**
     * @param statusCurso the statusCurso to set
     */
    public void setStatusCurso(String statusCurso) {
        this.statusCurso = statusCurso;
    }
        
        
	 
}

