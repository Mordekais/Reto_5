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
public class Consulta_2 {
    public ResultSet mostrar_proyecto() throws SQLException {
        Connection conn = JDBCUtilities.getConnection();
        Statement query = null;
        ResultSet rs = null;
        String consulta = "SELECT ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad FROM Proyecto p WHERE Ciudad IN ('Santa Marta', 'Cartagena', 'Barranquilla') AND Clasificacion = 'Casa Campestre';";
        try {
            query = conn.createStatement();
            rs = query.executeQuery(consulta);
        } catch(SQLException e){
        conn.close();
        }
        return rs;
    }
}
