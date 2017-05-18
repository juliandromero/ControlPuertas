/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soft_Intelligent.co.ControlPuerta.Vista;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import Soft_Intelligent.co.ControlPuerta.Modelo.ConectMySql;
import Soft_Intelligent.co.ControlPuerta.Modelo.EstadoGeneral;
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

/**
 *
 * @author Programacion
 */
public class EstadosGenerales extends JFrame implements ActionListener {

    private JLabel labelTitulo;
    JTable miTabla1;
    JScrollPane mibarra1;
    JTextField Field;
    JTextField Field2;
    JTextField Field3;
    private JComboBox ComboBox1;
    JLabel Label;
    JButton Boton1;
    JButton Boton2;
    JButton Boton3;
    String Estado;
    String Nombre;
    String Ubicacion;
    String IP;
    EstadosGeneralesControl coneg;

    private ArrayList<EstadosGeneralesControl> miLista;

    public static String ELIMINAR = "ELIMINAR";
    public static String ADICIONAR = "ADICIONAR";

    EstadoGeneral bdeg;

    public EstadosGenerales() {
        setSize(800, 400);
        setTitle("Puerta : Estados Generales");
        setLocationRelativeTo(null);
        setResizable(false);

        miLista = new ArrayList();

        InicializaFormulario();
        InicializaTabla();
        construirTabla();
        InicializaBotones();
        ConsultaEstado();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        bdeg = new EstadoGeneral();

    }

    private void InicializaFormulario() {

        Label = new JLabel("Nombre");
        Label.setBounds(27, 70, 230, 30);
        getContentPane().add(Label);

        Field = new JTextField();
        Field.setBounds(100, 70, 230, 30);
        getContentPane().add(Field);

        Label = new JLabel("Ubicacion");
        Label.setBounds(27, 110, 230, 30);
        getContentPane().add(Label);

        Field2 = new JTextField();
        Field2.setBounds(100, 110, 230, 30);
        getContentPane().add(Field2);

        Label = new JLabel("IP");
        Label.setBounds(380, 70, 230, 30);
        getContentPane().add(Label);

        Field3 = new JTextField();
        Field3.setBounds(453, 70, 230, 30);
        getContentPane().add(Field3);

        Label = new JLabel("Estado");
        Label.setBounds(380, 110, 230, 30);
        getContentPane().add(Label);

        ComboBox1 = new JComboBox();
        ComboBox1.setBounds(453, 110, 230, 30);
        getContentPane().add(ComboBox1);

        coneg = new EstadosGeneralesControl();

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

        Boton3 = new JButton("Adicionar");
        Boton3.setBounds(500, 340, 80, 25);
        Boton3.addActionListener(this);
        Boton3.setActionCommand(ADICIONAR);
        getContentPane().add(Boton3);

    }

    private void InicializaTabla() {
        getContentPane().setLayout(null);

        labelTitulo = new JLabel();
        labelTitulo.setBounds(200, 11, 400, 30);
        labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        labelTitulo.setText("Configurar Dispositivos");
        labelTitulo.setFont(new java.awt.Font("Verdana", 1, 18));
        getContentPane().add(labelTitulo);

        mibarra1 = new JScrollPane();
        mibarra1.setBounds(35, 200, 700, 130);
        getContentPane().add(mibarra1);

    }

    private void ConsultaEstado() {
        ComboBox1.removeAllItems();
        EstadoGeneral CEstado = new EstadoGeneral();
        ArrayList< EstadosGeneralesControl> listaEstados = CEstado.consultarEstados();

        for (int i = 0; i < listaEstados.size(); i++) {
            ComboBox1.addItem(listaEstados.get(i).getEstado());
        }

    }

    private void construirTabla() {
        String titulos[] = {"ID", "Nombre", "Ubicacion", "IP", "Estado"};
        String informacion[][] = obtenerMatriz();

        miTabla1 = new JTable(informacion, titulos);
        mibarra1.setViewportView(miTabla1);

    }

    private String[][] obtenerMatriz() {

        EstadoGeneral EstGen = new EstadoGeneral();
        miLista = EstGen.BuscaDisp();

        String matrizInfo[][] = new String[miLista.size()][5];

        for (int i = 0; i < miLista.size(); i++) {
            matrizInfo[i][0] = miLista.get(i).getID() + "";
            matrizInfo[i][1] = miLista.get(i).getNombre() + "";
            matrizInfo[i][2] = miLista.get(i).getUbicacion() + "";
            matrizInfo[i][3] = miLista.get(i).getIP() + "";
            matrizInfo[i][4] = miLista.get(i).getEstado() + "";
        }

        return matrizInfo;
    }

    public void borrarLista(int ID) {
        //miLista.clear();
        bdeg.eliminarDisp(ID);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 632, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 289, Short.MAX_VALUE)
        );

        pack();
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstadosGenerales().setVisible(true);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String comando = e.getActionCommand();
        if (comando.equals(ELIMINAR)) {
            int posicion = miTabla1.getSelectedRow();
            int ID = miLista.get(posicion).getID();
            borrarLista(ID);
            // Recarga la tabla despues de eliminar
            construirTabla();
            System.out.println("Refresco tabla despues de eliminar");
        } else if (comando.equals(ADICIONAR)) {

            IP = Field3.getText();
            Ubicacion = Field2.getText();
            Nombre = Field.getText();
            Estado = ComboBox1.getSelectedItem().toString();
            coneg.setID_Estado(Estado);
            coneg.setNombre(Nombre);
            coneg.setIP(IP);
            coneg.setUbicacion(Ubicacion);
            
            //Limpia valores
            Field.setText("");
            Field2.setText("");
            Field3.setText("");
            
            ConectMySql con = new ConectMySql();

            try {
                bdeg.CrearDisp(con.conexion(), coneg);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                JOptionPane.showMessageDialog(this, "Ha surgido un error y no se ha podido guardar el registro.");
            }
            construirTabla();
            System.out.println("Refresco tabla despues de adicionar");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
