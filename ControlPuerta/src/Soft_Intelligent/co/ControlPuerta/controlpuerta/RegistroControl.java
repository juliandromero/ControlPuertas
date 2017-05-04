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

    private Integer Cedula;
    private String Nombre;
    private String Apellido;
    private Integer Telefono;
    private String Email;
    private String Alias;
    private String Contraseña;

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

    public void setCedula(Integer Cedula) {
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
