/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.banco;


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
        EntidadBancariaDAO.read(1);
        
        
        EntidadBancaria entidadBancaria1 = new EntidadBancaria(89, "015", "CajaMar", "456789CC", TipoEntidadBancaria.COOPERATIVASCREDITO);
        EntidadBancaria.insert(entidadBancaria1);

    }
   /* public static void read(String mSQL)throws SQLException, ClassNotFoundException{
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
       
    }*/
}
