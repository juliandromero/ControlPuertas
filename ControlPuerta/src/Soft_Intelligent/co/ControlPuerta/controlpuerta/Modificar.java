package Soft_Intelligent.co.ControlPuerta.controlpuerta;

import Soft_Intelligent.co.ControlPuerta.Vista.*;
import javax.swing.JOptionPane;

/**
 *
 * @author SANCHEZ-SOSA
 */
public class Modificar {
    private int IdAlarma;
    private boolean lun, mar, mie, jue, vie, sab, dom;
    
    private  String nombrePuerta="";
    private  int ipPuerta=0, cantidadApertura;
    private  String hora1 , hora2;

    public Modificar(boolean lun, boolean mar, boolean mie, boolean jue, boolean vie, boolean sab, boolean dom, Integer IdAlarma) {
        this.lun = lun;
        this.mar = mar;
        this.mie = mie;
        this.jue = jue;
        this.vie = vie;
        this.sab = sab;
        this.dom = dom;
        this.IdAlarma = IdAlarma;
    }

    public Modificar() {
        this.lun = false;
        this.mar = false;
        this.mie = false;
        this.jue = false;
        this.vie = false;
        this.sab = false;
        this.dom = false;
        this.IdAlarma = 0;
    }

    public boolean isLun() {
        return lun;
    }

    public boolean isMar() {
        return mar;
    }

    public boolean isMie() {
        return mie;
    }

    public boolean isJue() {
        return jue;
    }

    public boolean isVie() {
        return vie;
    }

    public boolean isSab() {
        return sab;
    }

    public boolean isDom() {
        return dom;
    }

    public void setLun(boolean lun) {
        this.lun = lun;
    }

    public void setMar(boolean mar) {
        this.mar = mar;
    }

    public void setMie(boolean mie) {
        this.mie = mie;
    }

    public void setJue(boolean jue) {
        this.jue = jue;
    }

    public void setVie(boolean vie) {
        this.vie = vie;
    }

    public void setSab(boolean sab) {
        this.sab = sab;
    }

    public void setDom(boolean dom) {
        this.dom = dom;
    }

    public int getIdAlarma() {
        return IdAlarma;
    }

    public void setIdAlarma(int IdAlarma) {
        this.IdAlarma = IdAlarma;
    }
    
    public String getNombrePuerta() {
        return nombrePuerta;
    }

    public int getIpPuerta() {
        return ipPuerta;
    }

    public int getCantidadApertura() {
        return cantidadApertura;
    }

    public String getHora1() {
        return hora1;
    }

    public String getHora2() {
        return hora2;
    }

    public void setNombrePuerta(String nombrePuerta) {
        this.nombrePuerta = nombrePuerta;
    }

    public void setIpPuerta(int ipPuerta) {
        this.ipPuerta = ipPuerta;
    }

    public void setCantidadApertura(int cantidadApertura) {
        this.cantidadApertura = cantidadApertura;
    }

    public void setHora1(String hora1) {
        this.hora1 = hora1;
    }

    public void setHora2(String hora2) {
        this.hora2 = hora2;
    }
    
    
    } 
    

    

    