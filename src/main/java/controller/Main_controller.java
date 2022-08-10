/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.Consulta_1;
import model.Consulta_2;
import model.Consulta_3;

/**
 *
 * @author RG
 */
public class Main_controller {
    private Consulta_1 consulta_1;
    private Consulta_2 consulta_2;
    private Consulta_3 consulta_3;
    
    public Main_controller(){
        consulta_1 = new Consulta_1();
        consulta_2 = new Consulta_2();
        consulta_3 = new Consulta_3();
    }
    
    public ResultSet total_lider() throws SQLException{
        return consulta_1.mostrar_lider();
    }
    
    public  ResultSet total_proyecto() throws SQLException{
        return consulta_2.mostrar_proyecto();
    }
    
    public ResultSet total_compras() throws SQLException{
        return consulta_3.mostrar_compras();
    }
}
