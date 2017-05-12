package Soft_Intelligent.co.ControlPuerta.Modelo;


import Soft_Intelligent.co.ControlPuerta.controlpuerta.EstadosGeneralesControl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Soft_Intelligent.co.ControlPuerta.controlpuerta.Modificar;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
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
     
     public ArrayList<Modificar> BuscaAl() {

        ConectMySql conex = new ConectMySql();
            ArrayList<Modificar> myList = new ArrayList<Modificar>();
        Modificar alarma;
        try {

            Statement estatuto = conex.conexion().createStatement();
            ResultSet rs = estatuto.executeQuery("SELECT * FROM Alarma *");

            while (rs.next()) {
                alarma = new Modificar();
                alarma.setIdAlarma(rs.getInt("ID"));
                alarma.setNombrePuerta(rs.getString("Nombre"));
                alarma.setHora1(rs.getString("HoraIni"));
                alarma.setHora2(rs.getString("HoraFin"));
                alarma.setLun(rs.getBoolean("Lunes"));
                alarma.setMar(rs.getBoolean("Martes"));
                alarma.setMie(rs.getBoolean("Miercoles"));
                alarma.setJue(rs.getBoolean("Jueves"));
                alarma.setVie(rs.getBoolean("Viernes"));
                alarma.setSab(rs.getBoolean("Sabado"));
                alarma.setDom(rs.getBoolean("Domingo"));
                
                myList.add(alarma);
            }
            rs.close();
            estatuto.close();
            conex.desconectar();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al consultar", "Error",
                    JOptionPane.ERROR_MESSAGE);

        }
        return myList;
    }
     
}
