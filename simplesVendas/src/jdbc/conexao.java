/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.Connection;

/**
 *
 * @author TADS
 */
public class conexao {
    public static void main (String[] args)
    {
        conectar();
    }
   
    public static Connection conectar(){
        //criando um método responsável por estabelecer uma conexão com o banco
        Connection conexao = null;
        //criando o driver correspondente ao banco
        String driver = "com.mysql.cj.jdbc.Driver";
        //armazenando imformações referente ao banco de dados
        String url = "jdbc:mysql://localhost:3306/bdvendas?useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String senha = "root";
        //estabelecer a conexão com o banco
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, senha);
            JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
            return conexao;            
        }catch (Exception e){
            //a linha abaixo serve de apoio para esclarecer o erro
            JOptionPane.showMessageDialog(null, "Ops, algo deu errado: " + e);
            return null;
        }
    }
}
