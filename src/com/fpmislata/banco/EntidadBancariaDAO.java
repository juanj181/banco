/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author alumno
 */
public class EntidadBancariaDAO {
    
    EntidadBancaria read(int idEntidadBancaria) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = null;
        connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/banco","banco","banco");
        String selectSQL= " SELECT * from entidadbancaria WHERE idEntidadBancaria=? ";
        PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
      preparedStatement.setInt(1, 1);
        ResultSet rs =preparedStatement.executeQuery();{
       return  null; 
    }
    }
    
    
    void insert( EntidadBancaria entidadBancaria){
        
    }
    
    void update( EntidadBancaria entidadBancaria){
        
    }
    
    Void delete(int idEntidadBancaria){
        return null;
    }
    
    List<EntidadBancaria> findAll(){
        return null;
    }    
    
    List<EntidadBancaria> findByCodigo(String codigo){
        return null;
        
    }
}
