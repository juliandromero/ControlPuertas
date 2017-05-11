/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soft_Intelligent.co.ControlPuerta.Modelo;

import Soft_Intelligent.co.ControlPuerta.Vista.Log;
import Soft_Intelligent.co.ControlPuerta.controlpuerta.EstadosGeneralesControl;
import Soft_Intelligent.co.ControlPuerta.controlpuerta.CLog;
import Soft_Intelligent.co.ControlPuerta.controlpuerta.LogModeControl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author luisafernanda
 */
public class LogModelo {

    
    private final String tabla = "Dispositivo";

    public void Crear(Connection Conexion, LogModeControl Log) throws SQLException {
        try {
            PreparedStatement Guardar = null;

            Guardar = Conexion.prepareStatement("INSERT INTO " + this.tabla + "( Puerta, IP, Hi, Hf, Estado, Ubicacion) VALUES(?,?,?,?,?,?)");
            Guardar.setString(1, Log.getPuerta());
            Guardar.setString(2, Log.getIp());
            Guardar.setString(3, Log.getHi());
            Guardar.setString(4, Log.getHi());
            Guardar.setString(5, Log.getHf());
            Guardar.setString(6, Log.getEstado());
            Guardar.setString(7, Log.getUbicacion());
            Guardar.setInt(5, EstadoGeneral.getID_Estado());

            Guardar.executeUpdate();

        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }
    public ArrayList<LogModelo> Logactividad() {

        ConectMySql conex = new ConectMySql();
        ArrayList<Logactividad> Lista = new ArrayList<Logactividad>();
        Logactividad Puerta;
        try {

            Statement estatuto = conex.conexion().createStatement();
            ResultSet rs = estatuto.executeQuery("SELECT Dis.ID,Dis.Nombre,Dis.Ubicacion,Dis.IP,Est.Nombre as Estado FROM Dispositivo Dis inner join Estado Est on Dis.ID_Estado = Est.ID Order by ID");

            while (rs.next()) {
                Puer = new EstadosGeneralesControl();
                Puer.setID(Integer.parseInt(rs.getString("ID")));
                Puer.setPuerta(rs.getString("Puerta"));
                Puer.setUbicacion(rs.getString("Ubicacion"));
                Puer.setIP(rs.getString("IP"));
                Puer.setEstado(rs.getString("Estado"));
                Puer.setEstado(rs.getString("Hi"));
                Puer.setEstado(rs.getString("Hi"));
                Lista.add(Puer);
            }
            rs.close();
            estatuto.close();
            conex.desconectar();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al consultar", "Error",
                    JOptionPane.ERROR_MESSAGE);

        }
        return miLista;
    }

    private static class LogControl {

        public LogControl() {
        }
    }
}