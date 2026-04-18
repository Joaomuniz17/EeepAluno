/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Login;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AdmDAO {

    //variavel global fora do metodo
    Connection conn;
    //acessar os objetos, entao trago todos os objetos para cá

    public ResultSet autenticarLogin(Login objLogin) {
        //acessando minha classe de conexao
        //com o nosso metodo conectaDB()
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "select * from login where usuarioLogin = ? and senhaLogin = ?";
            //preparar o objeto pstm a conexão e chamar a variavel sql
            PreparedStatement pstm = conn.prepareStatement(sql);
            //usando o objeto pstm p/ comparar o que o usuario digitou e definir o parametro
            pstm.setString(1, objLogin.getUsuarioLogin());
            pstm.setString(2, objLogin.getSenhaLogin());

            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe AdmDAO" + erro.getMessage());
            return null;

        }

    }

}
