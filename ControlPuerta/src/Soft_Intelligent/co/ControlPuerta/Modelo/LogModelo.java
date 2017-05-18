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

//    public void Crear(Connection Conexion, LogModeControl Log) throws SQLException {
//        try {
//            PreparedStatement Guardar = null;
//
//            Guardar = Conexion.prepareStatement("INSERT INTO " + this.tabla + "( Puerta, IP, Hora Inicial, Hora Final, Estado, Ubicacion, Nombre) VALUES(?,?,?,?,?,?,?,?)");
//            Guardar.setString(1, Log.getPuerta());
//            Guardar.setString(2, Log.getIP());
//            Guardar.setString(3, Log.getHi());
//            Guardar.setString(4, Log.getHf());
//            Guardar.setString(5, Log.getEstado());
//            Guardar.setString(6, Log.getUbicacion());
//            Guardar.setString(7, Log.getNombre());
//            Guardar.setInt(8, Log.getID_Estado());
//                    
//            Guardar.executeUpdate();
//            System.out.println("Registro Adicionado");
//
//        } catch (SQLException e) {
//            throw new SQLException(e);
//        }
//    }
    public ArrayList<LogModeControl> Logactividad() {

        ConectMySql conex = new ConectMySql();
        ArrayList<LogModeControl> Lista = new ArrayList<LogModeControl>();
        LogModeControl Puerta;
        try {

            Statement estatuto = conex.conexion().createStatement();
            System.out.println("Select Dis.Nombre,Dis.IP,Ala.HoraIni,Ala.HoraFin,Est.Nombre As Estado,Acc.nombre As Accion,Usu.Nombre As Usuario from Evento Eve\n" +
"inner join alarma Ala on  eve.ID_Alarm=Ala.ID\n" +
"inner join Dispositivo Dis on  eve.ID_Disp=Dis.ID\n" +
"inner join Accion Acc on  eve.ID_Acci=Acc.ID\n" +
"inner join Usuario Usu on  eve.Cedula=Usu.Cedula\n" +
"inner join Estado Est on  Est.ID=Dis.ID_Estado");
            ResultSet rs = estatuto.executeQuery("Select Dis.Nombre,Dis.IP,Ala.HoraIni,Ala.HoraFin,Est.Nombre As Estado,Acc.nombre As Accion,Usu.Nombre As Usuario from Evento Eve\n" +
"inner join alarma Ala on  eve.ID_Alarm=Ala.ID\n" +
"inner join Dispositivo Dis on  eve.ID_Disp=Dis.ID\n" +
"inner join Accion Acc on  eve.ID_Acci=Acc.ID\n" +
"inner join Usuario Usu on  eve.Cedula=Usu.Cedula\n" +
"inner join Estado Est on  Est.ID=Dis.ID_Estado");

            while (rs.next()) {
                Puerta = new LogModeControl();
                Puerta.setNombre(rs.getString("Nombre"));
                Puerta.setIP(rs.getString("IP"));
                Puerta.setHoraIni(rs.getString("HoraIni"));
                Puerta.setHoraFin(rs.getString("HoraFin"));
                Puerta.setUsuario(rs.getString("Usuario"));
                Puerta.setEstado(rs.getString("Estado"));
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