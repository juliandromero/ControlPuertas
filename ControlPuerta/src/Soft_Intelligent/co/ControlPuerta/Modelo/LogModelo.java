/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soft_Intelligent.co.ControlPuerta.Modelo;

import Soft_Intelligent.co.ControlPuerta.controlpuerta.EstadosGeneralesControl;
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
            Guardar.setString(2, Log.getIP());
            Guardar.setString(3, Log.getHi());
            Guardar.setString(4, Log.getHi());
            Guardar.setString(5, Log.getHf());
            Guardar.setString(6, Log.getEstado());
            Guardar.setString(7, Log.getUbicacion());
            Guardar.setInt(5, Log.getID_Estado());

            Guardar.executeUpdate();

        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }
    public ArrayList<LogModeControl> Logactividad() {

        ConectMySql conex = new ConectMySql();
        ArrayList<LogModeControl> Lista = new ArrayList<LogModeControl>();
        LogModeControl Puerta;
        try {

            Statement estatuto = conex.conexion().createStatement();
            ResultSet rs = estatuto.executeQuery("Select Dis.Nombre,Dis.IP,Ala.HoraIni,Ala.HoraFin,Est.Nombre As Estado,Acc.nombre As Accion,Usu.Nombre As Usuario from Evento Eve\n" +
"inner join alarma Ala on  eve.ID_Alarm=Ala.ID\n" +
"inner join Dispositivo Dis on  eve.ID_Disp=Dis.ID\n" +
"inner join Accion Acc on  eve.ID_Acci=Acc.ID\n" +
"inner join Usuario Usu on  eve.Cedula=Usu.Cedula\n" +
"inner join Estado Est on  Est.ID=Dis.ID_Estado");

            while (rs.next()) {
                Puerta = new LogModeControl();
                Puerta.setID(Integer.parseInt(rs.getString("ID")));
                Puerta.setPuerta(rs.getString("Puerta"));
                Puerta.setUbicacion(rs.getString("Ubicacion"));
                Puerta.setIP(rs.getString("IP"));
                Puerta.setEstado(rs.getString("Estado"));
                Puerta.setEstado(rs.getString("Hi"));
                Puerta.setEstado(rs.getString("Hi"));
                Lista.add(Puerta);
            }
            rs.close();
            estatuto.close();
            conex.desconectar();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al consultar", "Error",
                    JOptionPane.ERROR_MESSAGE);

        }
        return Lista;
    }
    
    
}