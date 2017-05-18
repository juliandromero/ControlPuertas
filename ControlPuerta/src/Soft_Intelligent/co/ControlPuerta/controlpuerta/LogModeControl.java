/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soft_Intelligent.co.ControlPuerta.controlpuerta;

import Soft_Intelligent.co.ControlPuerta.Modelo.Usuario;

/**
 *
 * @author luisafernanda
 */
public class LogModeControl {

    private int ID;
    private String Nombre;
    private String IP;
    private String HoraIni;
    private String HoraFin;
    private String Puerta;
    private String Estado;
    public String Usuario;

    public int getID() {
        return ID;
    }

    public String getPuerta() {
        return Puerta;
    }

    public String getIP() {
        return IP;
    }

    public String getHi() {
        return HoraIni;
    }

    public String getHf() {
        return HoraFin;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getEstado() {
        return Estado;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setID_Estado(String Estado) {
        System.out.println(Estado);
//        int ID_Estado;
//        if ("Activo".equals(Estado)) {
//            ID_Estado = 1;
//        } else {
//            ID_Estado = 2;
//        }

    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public void setHoraIni(String HoraIni) {
        this.HoraIni = HoraIni;
    }

    public void setHoraFin(String HoraFin) {
        this.HoraFin = HoraFin;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

}
