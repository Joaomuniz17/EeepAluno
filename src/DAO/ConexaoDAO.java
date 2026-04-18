
package DAO;

import java.sql.Connection; // conexão SQL pra o java
import java.sql.DriverManager; //driver d conexão SQL p/ java
import java.sql.SQLException; // trataemento de exeção
import javax.swing.JOptionPane; //painel de mensagem

public class ConexaoDAO {
    // metodo publico conectaBD
    public Connection conectaBD(){
        //variavel do tipo Connection chamada com
         Connection conn = null;
         
         try { //try faz a verificação para gerar algo
             // 1 parameto refere-se ao drive de conexão jdb
             // 2 parametro onde está nossa base de dados
             // 3 parametro nome da base de dados
             // 4 parametro usuario e a senha de acesso ao banco
            String url = "jdbc:mysql://localhost:3306/eeepaluno?user=root&password=root";
            // armazenar o driver de gerenciamento na variavel
            //conn usando o metodo getConnection
            conn = DriverManager.getConnection(url);
            // Classe de Expection exeção
        } catch (SQLException erro) {
             JOptionPane.showMessageDialog( null,"erro na classe ConexãoDAO"+erro.getMessage());
        }
        return conn;
    }
}

