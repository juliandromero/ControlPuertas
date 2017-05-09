package Soft_Intelligent.co.ControlPuerta.controlpuerta;

import Soft_Intelligent.co.ControlPuerta.Vista.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Julian Sanchez
 */
public class Modificar {
    private boolean lun, mar, mie, jue, vie, sab, dom;
    private final Integer IdAlarma;

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
        this.IdAlarma = null;
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

    public Integer getIdAlarma() {
        return IdAlarma;
    }
    
    
    

    public static String nombrePuerta="";
    public static int ipPuerta=0, cantidadApertura/*, hora1, hora2*/;
    
   
    
    
    public void aplicar(){
    nombrePuerta=ModificarPuerta.txtnombrePuerta.getText();
//    cantidadApertura=Integer.parseInt(ModificarPuerta.txtcantidadApertura.getText());
    //hora1=ModificarPuerta.de.getText();
    //ipPuerta=
    
    
    
    JOptionPane.showMessageDialog(null,cantidadApertura+ " " + nombrePuerta+" ", " mensaje ", JOptionPane.PLAIN_MESSAGE);
           
    } 
    

    
}
    