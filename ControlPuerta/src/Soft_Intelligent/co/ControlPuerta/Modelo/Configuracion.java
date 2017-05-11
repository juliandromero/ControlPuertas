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
            
            
            if (null == mod.getIdAlarma()) {

                Guardar = Conexion.prepareStatement("INSERT INTO " + this.tabla +"(Nombre, HoraIni, HoraFin, CantidadApertura, Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo) VALUES(?,?,?,?,?,?,?,?,?,?,?)");
             //   Guardar.setString(1, );
             Guardar.setString(1,mod.getNombrePuerta());
            Guardar.setString(2, mod.getHora1());
            Guardar.setString(3, mod.getHora2());
            Guardar.setInt(4, mod.getCantidadApertura());
            Guardar.setBoolean(5, mod.isLun());
            Guardar.setBoolean(6, mod.isMar());
            Guardar.setBoolean(7, mod.isMie());
            Guardar.setBoolean(8, mod.isJue());
            Guardar.setBoolean(9, mod.isVie());
            Guardar.setBoolean(10, mod.isSab());
            Guardar.setBoolean(11, mod.isDom());
            Guardar.executeUpdate();
            } else {

            }
            
        } catch (SQLException e) {

            throw new SQLException(e);
        }
    }
     
}
