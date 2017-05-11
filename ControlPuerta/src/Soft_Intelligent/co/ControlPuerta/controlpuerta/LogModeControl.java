/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soft_Intelligent.co.ControlPuerta.controlpuerta;

/**
 *
 * @author luisafernanda
 */
public class LogModeControl {
    
    private int ID;
    private String Puerta;
    private String IP;
    private String Hi;
    private String Hf;
    private int ID_Estado;
    private String Ubicacion;
    private String Nombre;
    private String Estado;
    

    public int getID() {
        return ID;
    }

    public String getPuerta() {
        return  Puerta;
    }

    public String getIP() {
        return IP;
    }

    public String getHi() {
        return Hi;
    }

    public String getHf() {
        return Hf;
    }

    public int getID_Estado() {
        return ID_Estado;
    }
    
      public String getEstado() {
        return Estado;
    }
    public String getUbicacion() {
        return Ubicacion;
    }
    
    public String getNombre() {
        return Nombre;
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

    public void setPuerta(String Puerta) {
        this.Puerta = Puerta;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }
    
    public void setHi(String Hi) {
        this.Hi = Hi;
    }
    
    public void setHf(String Hf) {
        this.Hf = Hf;
    }
       public void setEstado(String Estado) {
        this.Estado = Estado;
    }
       
         public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }
         
         public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

    

