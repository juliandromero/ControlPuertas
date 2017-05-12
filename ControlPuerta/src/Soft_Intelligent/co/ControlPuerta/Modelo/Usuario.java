/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soft_Intelligent.co.ControlPuerta.Modelo;

import Soft_Intelligent.co.ControlPuerta.controlpuerta.RegistroControl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Programacion
 */
public class Usuario {

    private final String tabla = "Usuario";

    public void Crear(Connection Conexion, RegistroControl registro) throws SQLException {
        try {
            PreparedStatement Guardar = null;

            Guardar = Conexion.prepareStatement("INSERT INTO " + this.tabla + "(Cedula, Nombre, Apellido, Telefono, Email, Alias, Contraseña) VALUES(?,?,?,?,?,?,?)");
            Guardar.setInt(1, registro.getCedula());
            Guardar.setString(2, registro.getNombre());
            Guardar.setString(3, registro.getApellido());
            Guardar.setInt(4, registro.getTelefono());
            Guardar.setString(5, registro.getEmail());
            Guardar.setString(6, registro.getAlias());
            Guardar.setString(7, registro.getContraseña());

            Guardar.executeUpdate();
        } catch (SQLException e) {
            System.out.println("catch registro");
            throw new SQLException(e);
        }
    }

    /*public List<RegistroControl> leer(Connection conexion, String Alias) throws SQLException {


        List<RegistroControl> reg = new ArrayList<>();

        try {
            PreparedStatement consulta = conexion.prepareStatement("SELECT Alias, Contraseña FROM " + this.tabla + " ORDER BY ID");
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                reg.add( new RegistroControl(resultado.getString("Alias"), resultado.getString("Contraseña")));
            }
        } catch (Exception e) {
            throw new SQLException(e);
        }
        return reg;
    }*/
    public String autenticacion(String Usuario, Connection conexion) throws SQLException {
        try {
            ConectMySql conex = new ConectMySql();
            Statement estatuto = conex.conexion().createStatement();
            ResultSet rs = estatuto.executeQuery("SELECT Contraseña FROM " + this.tabla + " WHERE Alias = '" + Usuario + "'");
            String Contraseña = null;
            if (rs.next()) {
                Contraseña = rs.getString("Contraseña");
            }

            return Contraseña;
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }

    }

}
