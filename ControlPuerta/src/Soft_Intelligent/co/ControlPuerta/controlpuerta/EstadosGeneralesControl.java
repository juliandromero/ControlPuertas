/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soft_Intelligent.co.ControlPuerta.controlpuerta;

/**
 *
 * @author Programacion
 */
public class EstadosGeneralesControl {

    private int ID;
    private String Nombre;
    private String Ubicacion;
    private String IP;
    private String Estado;
    private int ID_Estado;

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public String getIP() {
        return IP;
    }

    public String getEstado() {
        return Estado;
    }

    public int getID_Estado() {
        return ID_Estado;
    }

    public void setID_Estado(String Estado) {
        System.out.println(Estado);
        int ID_Estado;
        if ("Activo".equals(Estado)) {
            ID_Estado = 1;
        } else {
            ID_Estado = 2;
        }
        
        this.ID_Estado = ID_Estado;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

}
