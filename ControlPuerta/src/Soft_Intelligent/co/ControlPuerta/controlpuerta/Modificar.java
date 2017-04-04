package Soft_Intelligent.co.ControlPuerta.controlpuerta;

import Soft_Intelligent.co.ControlPuerta.Vista.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Julian Sanchez
 */
public class Modificar {
    
    public Modificar(){
     
    }
    String nombrePuerta;
    int ipPuerta, cantidadApertura/*, hora1, hora2*/;
    
   
    
    
    public void aplicar(){
    nombrePuerta=ModificarPuerta.txtnombrePuerta.getText();
    cantidadApertura=Integer.parseInt(ModificarPuerta.txtcantidadApertura.getText());
    //hora1=ModificarPuerta.de.getText();
    //ipPuerta=
    
    
    
    //JOptionPane.showMessageDialog(null,cantidadApertura+ " " + nombrePuerta+" ", " mensaje ", JOptionPane.PLAIN_MESSAGE);
           
    } 
    
}
    