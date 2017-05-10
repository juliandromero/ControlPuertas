/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soft_Intelligent.co.ControlPuerta.Modelo;

import Soft_Intelligent.co.ControlPuerta.controlpuerta.ControlPuerta;
import Soft_Intelligent.co.ControlPuerta.controlpuerta.EstadosGeneralesControl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Programacion
 */
public class EstadoGeneral {

    private final String tabla = "Dispositivo";

    public void Crear(Connection Conexion, EstadosGeneralesControl EstadoGeneral) throws SQLException {
        try {
            PreparedStatement Guardar = null;
            System.out.println("INSERT INTO " + this.tabla + "( Nombre, Ubicacion, IP,ID_Estado) VALUES(?,?,?,?)");
            Guardar = Conexion.prepareStatement("INSERT INTO " + this.tabla + "( Nombre, Ubicacion, IP,ID_Estado) VALUES(?,?,?,?)");
            Guardar.setString(1, EstadoGeneral.getNombre());
            Guardar.setString(2, EstadoGeneral.getUbicacion());
            Guardar.setString(3, EstadoGeneral.getIP());
            Guardar.setInt(4, EstadoGeneral.getID_Estado());

            Guardar.executeUpdate();
            System.out.println("Registro Adicionado");

        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }
//    public void Eliminar(Connection Conexion, EstadosGeneralesControl EstadoGeneral) throws SQLException {
//        try {
//            PreparedStatement Insert = null;
//
//            Insert = Conexion.prepareStatement("Delete " + this.tabla + "Where ID =? )");
//            Insert.setInt(1, EstadoGeneral.getID_Estado());
//
//            Insert.executeUpdate();
//
//        } catch (SQLException e) {
//            throw new SQLException(e);
//        }
//    }

    public void eliminarDisp(int ID) {
        ConectMySql conex = new ConectMySql();
        EstadosGeneralesControl Puer;

        try {
            Statement estatuto = conex.conexion().createStatement();
            System.out.println("Delete From " + this.tabla + " Where ID = " + ID);
            estatuto.execute("Delete From " + this.tabla + " Where ID = " + ID);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el registro X dependencia en evento");
            System.out.println(e.getMessage());
        }

    }

    public ArrayList<EstadosGeneralesControl> BuscaDisp() {

        ConectMySql conex = new ConectMySql();
        ArrayList<EstadosGeneralesControl> miLista = new ArrayList<EstadosGeneralesControl>();
        EstadosGeneralesControl Puer;
        try {

            Statement estatuto = conex.conexion().createStatement();
            ResultSet rs = estatuto.executeQuery("SELECT Dis.ID,Dis.Nombre,Dis.Ubicacion,Dis.IP,Est.Nombre as Estado FROM Dispositivo Dis inner join Estado Est on Dis.ID_Estado = Est.ID Order by ID");

            while (rs.next()) {
                Puer = new EstadosGeneralesControl();
                Puer.setID(Integer.parseInt(rs.getString("ID")));
                Puer.setNombre(rs.getString("Nombre"));
                Puer.setUbicacion(rs.getString("Ubicacion"));
                Puer.setIP(rs.getString("IP"));
                Puer.setEstado(rs.getString("Estado"));
                miLista.add(Puer);
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
}
