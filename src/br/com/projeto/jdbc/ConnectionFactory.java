/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projeto.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Matheus
 */
public class ConnectionFactory {
    
    public Connection getConnection(){
       
        //Tratamento de erro
        try {
            
            //Conecta de verdade é o DriverManager
            return DriverManager.getConnection("jdbc:postgresql://ec2-44-210-36-247.compute-1.amazonaws.com/d961271v0ntcq","gxntijveetutts","4fb7d3e0ffd13aaaf27642b3b452ecb37632a20b4afc09b67db3f96c6186b6fa");
            
        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }
    }
    
}
