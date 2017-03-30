package Soft_Intelligent.co.ControlPuerta.controlpuerta;

import Soft_Intelligent.co.ControlPuerta.Vista.ModificarPuerta;

/**
 *
 * @author Julian Sanchez
 */
public class Modificar {
    
    public Modificar(){
     
    }
    int ipPuerta;
    String nombrePuerta = "";
    int cantidadApertura;
    
    public void aplicar(){
    nombrePuerta=ModificarPuerta.txtnombrePuerta.getText();
    cantidadApertura=Integer.parseInt(ModificarPuerta.txtcantidadApertura.getText());
    //ipPuerta=
    } 
    
}
    