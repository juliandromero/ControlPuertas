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
public class CLog {
    
    public String[] rellenarnombre() {
        String[] nombre= new String[10];

        for (int i = 0; i < 10; i++) {
            
            nombre[i]= "nombre" + i;

        }
        return nombre;

    }

    public String[] rellenarip() {
        String[] ip = new String[10];
        for (int i = 0; i < 10; i++) {
            ip[i]="192.168.0." + i;
        }
        return ip;
    }

    public String[] rellenarHoraI() {

        String[] HoraI = new String[10];

        for (int i = 0; i < 10; i++) {
            HoraI[i]=("10:" + i);
        }
        return HoraI;
    }

    public String[] rellenarHoraf() {

        String[] HoraF = new String[10];

        for (int i = 0; i < 10; i++) {

            HoraF[i]=("12:" + i);

        }
        return HoraF;
    }

    public String[] rellenarEstado() {

        String[] Estado = new String[10];
        for (int i = 0; i < 10; i++) {
            Estado[i]=("Online" + i);
        }
        return Estado;
    }
}
