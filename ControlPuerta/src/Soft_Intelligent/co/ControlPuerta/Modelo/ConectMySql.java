/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soft_Intelligent.co.ControlPuerta.Modelo;

import java.sql.*;

/**
 *
 * @author Programacion
 */
public class ConectMySql {

    private static Connection con = null;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/softintelligent", "root", "");
            System.out.println("Conexion BD Exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Conexion BD Errada" + e);
        }
        return con;    
         }

    
    public void desconectar() {
        con = null;
    }
}
