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

/**
 *
 * @author alumno
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    // TODO code application logic here
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //System.out.println("Se ha conectado a la BD!!");
        read( " SELECT * from entidadbancaria WHERE idEntidadBancaria=? ");

    }
    public static void read(String mSQL)throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = null;
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "banco", "banco");
        String selectSQL = mSQL;
        PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
        preparedStatement.setInt(1, 1);
        ResultSet rs = preparedStatement.executeQuery();

        while (rs.next()) {
            int idEntidad = rs.getInt("idEntidadBancaria");
            int CodigoEntidad = rs.getInt("codigoEntidad");
            String Nombre = rs.getString("nombre");
            String cif = rs.getString("cif");
            System.out.println("ID " + "CódigoEntidad  " + "NombreEntidad " + "Cif ");
            System.out.println(" " + idEntidad + "     " + CodigoEntidad + "     " + Nombre + "     " + cif);
        }


        connection.close();
       
    }
}
