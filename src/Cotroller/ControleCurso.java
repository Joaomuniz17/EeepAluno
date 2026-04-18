/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cotroller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import DAO.ConexaoDAO;
import Model.Curso;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControleCurso {

    //variavel globais
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Curso> lista = new ArrayList<>();

    public void cadastrarCurso(Curso objCurso) {
        String sql = "insert into curso (nomeCurso, statusCurso) values (?,?)";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            //passamos a informação atraves do set
            //o get pega os valores da variavel
            // 1° parametro o nome do curso
            pstm.setString(1, objCurso.getNomeCurso());
            //2°parametro o status do curso
            pstm.setString(2, objCurso.getStatusCurso());
            pstm.execute(); //pedir pra executar a variavel
            pstm.close(); //depois de executar fecha a conexão
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Falha ao cadastrar, verifique a classe ControleCurso no metodo cadastrarCurso" + erro);
        }
    }

    public ArrayList<Curso> consultarCurso() {
        String sql = "select * from curso";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            //como podemos ter varias informacoes no banco
            // crio um laço d repetição
            while (rs.next()) {
                Curso objCurso = new Curso();
                objCurso.setIdCurso(rs.getInt("IdCurso"));
                objCurso.setNomeCurso(rs.getString("NomeCurso"));
                objCurso.setStatusCurso(rs.getString("StatusCurso"));
                lista.add(objCurso);
            }
          
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Falha ao Consultar Curso" + erro);
        }
        return lista;

    }

}
