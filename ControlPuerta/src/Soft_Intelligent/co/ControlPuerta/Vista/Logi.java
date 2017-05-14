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
    JTextField Field4;
    JLabel Label;
    JButton Boton1;
    JButton Boton2;
    JButton Boton3;
    String Estado;
    String Nombre;
    String Ubicacion;
    String IP;
    LogModeControl coneg;

    private ArrayList<LogModeControl> miLista;
    
      LogModelo bdeg;

    public Logi() {
        setSize(800, 400);
        setTitle("Puerta : Login");
        setLocationRelativeTo(null);
        setResizable(false);

        miLista = new ArrayList();

        InicializaFormulario();
        InicializaTabla();
        construirTabla();
        InicializaBotones();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        bdeg = new LogModelo();

    }
    
    private void InicializaFormulario() {

        Label = new JLabel("Puerta");
        Label.setBounds(27, 70, 230, 30);
        getContentPane().add(Label);

        Field = new JTextField();
        Field.setBounds(100, 70, 230, 30);
        getContentPane().add(Field);

        Label = new JLabel("IP");
        Label.setBounds(27, 110, 230, 30);
        getContentPane().add(Label);

        Field2 = new JTextField();
        Field2.setBounds(100, 110, 230, 30);
        getContentPane().add(Field2);

        Label = new JLabel("Hora Inicial");
        Label.setBounds(380, 70, 230, 30);
        getContentPane().add(Label);

        Field3 = new JTextField();
        Field3.setBounds(453, 70, 230, 30);
        getContentPane().add(Field3);

        Label = new JLabel("Hora Final");
        Label.setBounds(380, 110, 230, 30);
        getContentPane().add(Label);

        Field4 = new JTextField();
        Field4.setBounds(453, 110, 230, 30);
        getContentPane().add(Field4);
        
        Label = new JLabel("Estado");
        Label.setBounds(380, 110, 230, 30);
        getContentPane().add(Label);

        Field4 = new JTextField();
        Field4.setBounds(453, 110, 230, 30);
        getContentPane().add(Field4);
        
        Label = new JLabel("Ubicacion");
        Label.setBounds(380, 110, 230, 30);
        getContentPane().add(Label);

        Field4 = new JTextField();
        Field4.setBounds(453, 110, 230, 30);
        getContentPane().add(Field4);
        
        Label = new JLabel("Nombre de Usuario");
        Label.setBounds(380, 110, 230, 30);
        getContentPane().add(Label);

        Field4 = new JTextField();
        Field4.setBounds(453, 110, 230, 30);
        getContentPane().add(Field4);

        coneg = new LogModeControl();

    }
    
    private void InicializaBotones() {

        Boton1 = new JButton("Eliminar");
        Boton1.setBounds(600, 340, 80, 25);
        Boton1.addActionListener(this);
        Boton1.setActionCommand(ELIMINAR);
        getContentPane().add(Boton1);

        Boton2 = new JButton("Atras");
        Boton2.setBounds(700, 340, 80, 25);
        getContentPane().add(Boton2);
        Boton2.addActionListener((e) -> {

            MenuDeOpciones mdo = new MenuDeOpciones();
            mdo.setVisible(true);
            dispose();

        });
        
        private void InicializaTabla() {
        getContentPane().setLayout(null);

        labelTitulo = new JLabel();
        labelTitulo.setBounds(200, 11, 400, 30);
        labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        labelTitulo.setText("Loging");
        labelTitulo.setFont(new java.awt.Font("Verdana", 1, 18));
        getContentPane().add(labelTitulo);
        
        
         
        private void construirTabla() {
        String titulos[] = {"Puerta", "IP", "Hora Inicial", "Hora Final", "Estado", "Ubicacion", "Nombre"};
        String informacion[][] = obtenerMatriz();

        miTabla1 = new JTable(informacion, titulos);
        mibarra1.setViewportView(miTabla1);
        }
        
         private String[][] obtenerMatriz() {

        LogModelo EstGen = new LogModelo();
        miLista = EstGen.Logactividad();

        String matrizInfo[][] = new String[miLista.size()][5];

        for (int i = 0; i < miLista.size(); i++) {
            matrizInfo[i][0] = miLista.get(i).getID() + "";
            matrizInfo[i][1] = miLista.get(i).getPuerta() + "";
            matrizInfo[i][2] = miLista.get(i).getIP() + "";
            matrizInfo[i][3] = miLista.get(i).getHi() + "";
            matrizInfo[i][4] = miLista.get(i).getHf() + "";
            matrizInfo[i][5] = miLista.get(i).getEstado() + "";
            matrizInfo[i][6] = miLista.get(i).getUbicacion() + "";
            matrizInfo[i][7] = miLista.get(i).getNombre() + "";
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
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EstadosGenerales.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstadosGenerales.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstadosGenerales.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstadosGenerales.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LogModelo().setVisible(true);
        });
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        ConectMySql con = new ConectMySql();
    
            try {
                bdeg.Crear(con.conexion(), coneg);          
            }   catch (SQLException ex) {
                System.out.println(ex.getMessage());
                JOptionPane.showMessageDialog(this, "Ha surgido un error y no se ha podido guardar el registro.");
            }
    }
        

    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
