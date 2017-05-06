/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soft_Intelligent.co.ControlPuerta.Modelo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Programacion
 */
public class Configuracion {
    private final String tabla = "Semana"; 
     public void guardarSemana(Connection Conexion, Configuracion configuracion) throws SQLException {
        try {
            PreparedStatement Guardar = null;

            if (0 ==) {

            } else {
                Guardar = Conexion.prepareStatement("INSERT INTO " + this.tabla "(Cedula, Nombre, Apellido, Telefono, Email, Alias, Contraseña) VALUES(?,?,?,?,?,?,?)");

            }
            Guardar.executeUpdate();
        } catch (SQLException e) {

            throw new SQLException(e);
        }
    }
}
