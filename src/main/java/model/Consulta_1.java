/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import util.JDBCUtilities;

/**
 *
 * @author RG
 */
public class Consulta_1 {

    public ResultSet mostrar_lider() throws SQLException {
        Connection conn = JDBCUtilities.getConnection();
        Statement query = null;
        ResultSet rs = null;
        String consulta = "SELECT ID_lider, Nombre, Primer_Apellido, Ciudad_Residencia FROM Lider l ORDER BY Ciudad_Residencia ASC;";
        try {
            query = conn.createStatement();
            rs = query.executeQuery(consulta);
        } catch(SQLException e){
        conn.close();
        }
        return rs;
    }
}
