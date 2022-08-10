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
public class Consulta_3 {
    public ResultSet mostrar_compras() throws SQLException {
        Connection conn = JDBCUtilities.getConnection();
        Statement query = null;
        ResultSet rs = null;
        String consulta = "SELECT ID_Compra, Constructora, Banco_Vinculado FROM Proyecto p JOIN Compra c ON p.ID_Proyecto = c.ID_Proyecto WHERE p.Ciudad = 'Salento' AND c.Proveedor = 'Homecenter';";
        try {
            query = conn.createStatement();
            rs = query.executeQuery(consulta);
        } catch(SQLException e){
        conn.close();
        }
        return rs;
    }
}
