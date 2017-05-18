/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soft_Intelligent.co.ControlPuerta.Vista;

/**
 *
 * @author luisafernanda
 */
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import Soft_Intelligent.co.ControlPuerta.Modelo.ConectMySql;
import Soft_Intelligent.co.ControlPuerta.Modelo.EstadoGeneral;
import Soft_Intelligent.co.ControlPuerta.Modelo.LogModelo;
import static Soft_Intelligent.co.ControlPuerta.Vista.EstadosGenerales.ADICIONAR;
import static Soft_Intelligent.co.ControlPuerta.Vista.EstadosGenerales.ELIMINAR;
import Soft_Intelligent.co.ControlPuerta.controlpuerta.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.MathContext;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class Logi extends JFrame implements ActionListener {

    /**
     * Creates new form Logi
     */
    
    private JLabel labelTitulo;
    JTable miTabla1;
    JScrollPane mibarra1;
    JTextField Field;
    JTextField Field2;
    JTextField Field3;
    JLabel Label;
    JButton Boton1;
    JButton Boton2;
    JButton Boton3;
    String Puerta;
    String IP;
    String Hi;
    String Hf;
    String Estado;
    String Usuario;
    LogModeControl coneg;
    

    private ArrayList<LogModeControl> miLista;
    public static String REFRESCAR = "REFRESCAR";
    
    
    LogModelo bdeg;
//    private String Ubicacion;
//    private String Nombre;

    public Logi() {
        setSize(800, 400);
        setTitle("Puerta : Login");
        setLocationRelativeTo(null);
        setResizable(false);

        miLista = new ArrayList();

        //InicializaFormularios();
        InicializaTablas();
        construirTablas();
        InicializaBoton();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        bdeg = new LogModelo();

    }
    
//        private void InicializaFormularios() {
//
//        Label = new JLabel("Puerta");
//        Label.setBounds(27, 70, 230, 30);
//        getContentPane().add(Label);
//
//        Field = new JTextField();
//        Field.setBounds(100, 70, 230, 30);
//        getContentPane().add(Field);
//
//        Label = new JLabel("IP");
//        Label.setBounds(27, 110, 230, 30);
//        getContentPane().add(Label);
//
//        Field2 = new JTextField();
//        Field2.setBounds(100, 110, 230, 30);
//        getContentPane().add(Field2);
//
//        Label = new JLabel("Hora Inicial");
//        Label.setBounds(380, 70, 230, 30);
//        getContentPane().add(Label);
//
//        Field3 = new JTextField();
//        Field3.setBounds(453, 70, 230, 30);
//        getContentPane().add(Field3);
//
//        Label = new JLabel("Hora Final");
//        Label.setBounds(380, 110, 230, 30);
//        getContentPane().add(Label);
//
//        JTextField Field4 = new JTextField();
//        Field4.setBounds(453, 110, 230, 30);
//        getContentPane().add(Field4);
//        
//        Label = new JLabel("Estado");
//        Label.setBounds(380, 110, 230, 30);
//        getContentPane().add(Label);
//
//        Field4 = new JTextField();
//        Field4.setBounds(453, 110, 230, 30);
//        getContentPane().add(Field4);
//        
//        Label = new JLabel("Ubicacion");
//        Label.setBounds(380, 110, 230, 30);
//        getContentPane().add(Label);
//
//        Field4 = new JTextField();
//        Field4.setBounds(453, 110, 230, 30);
//        getContentPane().add(Field4);
//        
//        Label = new JLabel("Nombre de Usuario");
//        Label.setBounds(380, 110, 230, 30);
//        getContentPane().add(Label);
//
//        Field4 = new JTextField();
//        Field4.setBounds(453, 110, 230, 30);
//        getContentPane().add(Field4);
//
//        coneg = new LogModeControl();
//
//    }
//    
    private void InicializaBoton() {

        Boton3 = new JButton("Refrescar");
        Boton3.setBounds(500, 340, 90, 40);
        Boton3.addActionListener(this);
        Boton3.setActionCommand(REFRESCAR);
        getContentPane().add(Boton3);
        
    }
    
    private void InicializaTablas() {
        getContentPane().setLayout(null);

        labelTitulo = new JLabel();
        labelTitulo.setBounds(200, 11, 400, 30);
        labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        labelTitulo.setText("Log");
        labelTitulo.setFont(new java.awt.Font("Verdana", 1, 18));
        getContentPane().add(labelTitulo);
        
        mibarra1 = new JScrollPane();
        mibarra1.setBounds(35, 200, 700, 130);
        getContentPane().add(mibarra1);
    }
        
         
        private void construirTablas() {
        String titulos[] = {"Puerta", "IP", "Hora Inicial", "Hora Final", "Estado", "Usuario"};
        String informacion[][] = obtenerMatriz();

        miTabla1 = new JTable(informacion, titulos);
        mibarra1.setViewportView(miTabla1);
        }
        
         private String[][] obtenerMatriz() {
             
        
         LogModelo Lg = new LogModelo();
         miLista = Lg.Logactividad();

        String matrizInfo[][] = new String[miLista.size()][8];

        for (int i = 0; i < miLista.size(); i++) {
            matrizInfo[i][0] = miLista.get(i).getNombre() + "";
            matrizInfo[i][1] = miLista.get(i).getIP() + "";
            matrizInfo[i][2] = miLista.get(i).getHi() + "";
            matrizInfo[i][3] = miLista.get(i).getHf() + "";
            matrizInfo[i][4] = miLista.get(i).getEstado() + "";
            matrizInfo[i][5] = miLista.get(i).getUsuario() + "";
        }

        return matrizInfo;
    }

   

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
              
        java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                new Logi().setVisible(true);
            }
        });
    }
    
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        String comando = e.getActionCommand();
//        
//        if (comando.equals(ADICIONAR)) {
//        //    Estado = ComboBox1.getName();
//            Puerta = Field3.getText();
//            IP = Field2.getText();
//            Hi = Field.getText();
//            Hf = Field.getText();
//            Estado = Field.getText();
//            Ubicacion = Field.getText();
//            Nombre = Field.getText();
//            coneg.setPuerta(Puerta);
//            coneg.setIP(IP);
//            coneg.setHi(Hi);
//            coneg.setHf(Hf);
//            coneg.setEstado(Estado);
//            coneg.setUbicacion(Ubicacion);
//            coneg.setNombre(Nombre);
//
//                   
//            
//            construirTablas();
//            System.out.println("Refresco tabla despues de adicionar");
//
//            }
//        
//    }
         public void actionPerformed2(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String comando = e.getActionCommand();
        if (comando == REFRESCAR) {

//            miLista = new ArrayList();
            //InicializaTabla();
            construirTablas();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
               
}  
    
        

    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

