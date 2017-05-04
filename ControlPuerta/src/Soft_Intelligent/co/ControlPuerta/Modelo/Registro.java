/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soft_Intelligent.co.ControlPuerta.Modelo;

import Soft_Intelligent.co.ControlPuerta.controlpuerta.RegistroControl;
import java.sql.*;

/**
 *
 * @author Programacion
 */
public class Registro {

    private final String tabla = "Usuario";

    public void guardar(Connection Conexion, RegistroControl registro) throws SQLException {
        try {
            PreparedStatement Guardar = null;
            if (registro.getCedula() == 0) {
                Guardar = Conexion.prepareStatement("INSERT INTO " + this.tabla + "(Cedula, Nombre, Apellido, Telefono, Email, Alias, Contraseña) VALUES (?,?,?,?,?,?,?)");
                Guardar.setInt(1, registro.getCedula());
                Guardar.setString(2, registro.getNombre());
                Guardar.setString(3, registro.getApellido());
                Guardar.setInt(4, registro.getTelefono());
                Guardar.setString(5, registro.getEmail());
                Guardar.setString(6, registro.getAlias());
                Guardar.setString(7, registro.getContraseña());
            } else {
            }
            Guardar.executeUpdate();
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }
}
