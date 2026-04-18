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
public class Administrador extends Login {
 
	private int idAdmin;
	 
	private String nomeAdmin;
	 
	private String emailAdmin;
	 
	private String telefoneAdmin;
	 
	private ControleAdministrador ControleAdmnistrador ;

    public Administrador(String usuarioLogin, String senhaLogin) {
        super(usuarioLogin, senhaLogin);
    }

    /**
     * @return the idAdmin
     */
    public int getIdAdmin() {
        return idAdmin;
    }

    /**
     * @param idAdmin the idAdmin to set
     */
    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    /**
     * @return the nomeAdmin
     */
    public String getNomeAdmin() {
        return nomeAdmin;
    }

    /**
     * @param nomeAdmin the nomeAdmin to set
     */
    public void setNomeAdmin(String nomeAdmin) {
        this.nomeAdmin = nomeAdmin;
    }

    /**
     * @return the emailAdmin
     */
    public String getEmailAdmin() {
        return emailAdmin;
    }

    /**
     * @param emailAdmin the emailAdmin to set
     */
    public void setEmailAdmin(String emailAdmin) {
        this.emailAdmin = emailAdmin;
    }

    /**
     * @return the telefoneAdmin
     */
    public String getTelefoneAdmin() {
        return telefoneAdmin;
    }

    /**
     * @param telefoneAdmin the telefoneAdmin to set
     */
    public void setTelefoneAdmin(String telefoneAdmin) {
        this.telefoneAdmin = telefoneAdmin;
    }
        
        
        
	 
}
 

