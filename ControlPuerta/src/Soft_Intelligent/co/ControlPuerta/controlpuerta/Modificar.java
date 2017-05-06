package Soft_Intelligent.co.ControlPuerta.controlpuerta;

import Soft_Intelligent.co.ControlPuerta.Vista.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Julian Sanchez
 */
public class Modificar {
    private boolean lun, mar, mie, jue, vie, sab, dom;

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
    
    
    
    public Modificar(){
     
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
    