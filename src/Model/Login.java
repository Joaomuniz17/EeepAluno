/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author aluno
 */
public class Login {
 
	private String usuarioLogin;
	 
	private int idLogin;
	 
	private String senhaLogin;
        
       public Login(String usuarioLogin, String senhaLogin){
        this.usuarioLogin = usuarioLogin;
        this.senhaLogin = senhaLogin;
       }

 
    public String getUsuarioLogin() {
        return usuarioLogin;
    }

    /**
     * @param usuarioLogin the usuarioLogin to set
     */
    public void setUsuarioLogin(String usuarioLogin) {
        this.usuarioLogin = usuarioLogin;
    }

    /**
     * @return the idLogin
     */
    public int getIdLogin() {
        return idLogin;
    }

    /**
     * @param idLogin the idLogin to set
     */
    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
    }
    
    /**
     * @return the senhaLogin
     */
    public String getSenhaLogin() {
        return senhaLogin;
    }

    /**
     * @param senhaLogin the senhaLogin to set
     */
    public void setSenhaLogin(String senhaLogin) {
        this.senhaLogin = senhaLogin;
    }
        
        
	 
}
