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
public class RegistroControl {

    private int Cedula;
    private String Nombre;
    private String Apellido;
    private int Telefono;
    private String Email;
    private String Alias;
    private String Contraseña;

    public RegistroControl(int Cedula, String Nombre, String Apellido, int Telefono, String Email, String Alias, String Contraseña) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Telefono = Telefono;
        this.Email = Email;
        this.Alias = Alias;
        this.Contraseña = Contraseña;
    }
    

    public RegistroControl(String usuario, String Contraseña) {
       this.Alias = usuario;
       this.Contraseña = Contraseña;     
    }

    public int getCedula() {
        return Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getTelefono() {
        return Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public String getAlias() {
        return Alias;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

}
