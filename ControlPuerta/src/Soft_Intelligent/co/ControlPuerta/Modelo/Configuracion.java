/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soft_Intelligent.co.ControlPuerta.Modelo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Soft_Intelligent.co.ControlPuerta.controlpuerta.Modificar;
/**
 *
 * @author Programacion
 */
public class Configuracion {
    private final String tabla = "Alarma"; 
    
     public void guardarSemana(Connection Conexion, Modificar mod) throws SQLException {
        try {
            PreparedStatement Guardar = null;

            if (0 == mod.getIdAlarma()) {

                Guardar = Conexion.prepareStatement("INSERT INTO " + this.tabla +"(Nombre, HoraIni, HoraFin, CantidadApertura, Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo) VALUES(?,?,?,?,?,?,?,?,?,?,?)");
             //   Guardar.setString(1, );
            } else {
                
            }
            Guardar.executeUpdate();
        } catch (SQLException e) {

            throw new SQLException(e);
        }
    }
     
}
