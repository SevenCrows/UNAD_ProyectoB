/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Variables.Entidad.Empleado;
import Variables.Entidad.Genero;
import Variables.Entidad.Login;
import Variables.Entidad.Paciente;
import Variables.Entidad.TipoIdentificacion;
import Variables.Entidad.TipoUsuario;
import Variables.Modelo.ModeloGenero;
import Variables.Modelo.ModeloLogin;
import Variables.Modelo.ModeloTipoIdentificacion;
import Variables.Modelo.ModeloTipoUsuario;
import Variables.Modelo.ModeloUsuario;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alex
 */
public class RegistroUsuario extends javax.swing.JFrame {

    private Boolean esEdicion;
    private ModeloUsuario modeloUsuario;
    private ModeloLogin modeloLogin;

    /**
     * Creates new form RegistroUsuario
     */
    public RegistroUsuario() {
        this.esEdicion = false;
        initComponents();
        this.setLocationRelativeTo(null);
        CargarListaGenero();
        CargarListaTipoIdentificacion();
        CargarListaTipoUsuario();
        this.modeloUsuario = new ModeloUsuario();
        this.modeloLogin = new ModeloLogin();
    }

    public RegistroUsuario(Boolean editar) {
        this.esEdicion = editar;
        initComponents();
        this.setLocationRelativeTo(null);
        CargarListaGenero();
        CargarListaTipoIdentificacion();
        CargarListaTipoUsuario();
    }

    private void CargarListaGenero() {
        ModeloGenero modeloGenero = new ModeloGenero();
        ArrayList<Genero> listaGenero = modeloGenero.ObtenerListaGeneros();
        cb_genero.removeAllItems();
        cb_genero.addItem("Seleccione una opción");
        for (int i = 0; i < listaGenero.size(); i++) {
            cb_genero.addItem(listaGenero.get(i).getDescripcion());
        }
    }

    private void CargarListaTipoIdentificacion() {
        ModeloTipoIdentificacion modeloTipoIdentificacion = new ModeloTipoIdentificacion();
        ArrayList<TipoIdentificacion> listaTipoIdentificacion = modeloTipoIdentificacion.ObtenerListaTipoIdentificacion();
        cb_tipo_identificacion.removeAllItems();
        cb_tipo_identificacion.addItem("Seleccione una opción");
        for (int i = 0; i < listaTipoIdentificacion.size(); i++) {
            cb_tipo_identificacion.addItem(listaTipoIdentificacion.get(i).getDescripcion());
        }
    }

    private void CargarListaTipoUsuario() {
        ModeloTipoUsuario modeloTipoUsuario = new ModeloTipoUsuario();
        ArrayList<TipoUsuario> listaTipoUsuario = modeloTipoUsuario.ObtenerListaTipoUsuario();
        cb_tipo_usuario.removeAllItems();
        cb_tipo_usuario.addItem("Seleccione una opción");
        for (int i = 0; i < listaTipoUsuario.size(); i++) {
            cb_tipo_usuario.addItem(listaTipoUsuario.get(i).getDescripcion());
        }

        cb_tipo_usuario.setEnabled(!this.esEdicion);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_toolbar_registro = new javax.swing.JPanel();
        lb_titulo_registro = new javax.swing.JLabel();
        panel_registro = new javax.swing.JPanel();
        lb_tipo_identificacion = new javax.swing.JLabel();
        lb_identificacion = new javax.swing.JLabel();
        lb_primer_nombre = new javax.swing.JLabel();
        lb_segundo_nombre = new javax.swing.JLabel();
        lb_primer_apellido = new javax.swing.JLabel();
        lb_segundo_apellido = new javax.swing.JLabel();
        lb_genero = new javax.swing.JLabel();
        lb_fecha_nacimiento = new javax.swing.JLabel();
        lb_tipo_usuario = new javax.swing.JLabel();
        btn_guardar = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();
        cb_tipo_identificacion = new javax.swing.JComboBox<>();
        cb_tipo_usuario = new javax.swing.JComboBox<>();
        txt_identificacion = new javax.swing.JTextField();
        txt_primer_nombre = new javax.swing.JTextField();
        txt_segundo_nombre = new javax.swing.JTextField();
        txt_primer_apellido = new javax.swing.JTextField();
        ftf_fecha_nacimiento = new javax.swing.JFormattedTextField();
        cb_genero = new javax.swing.JComboBox<>();
        txt_segundo_apellido = new javax.swing.JTextField();
        lb_tipo_usuario1 = new javax.swing.JLabel();
        cbx_activo = new javax.swing.JCheckBox();
        pnl_login = new javax.swing.JPanel();
        lb_usuario = new javax.swing.JLabel();
        lb_password = new javax.swing.JLabel();
        lb_password_repetir = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        jpf_password = new javax.swing.JPasswordField();
        jpf_password_rectificar = new javax.swing.JPasswordField();
        lb_titulo_usuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_toolbar_registro.setBackground(new java.awt.Color(0, 102, 102));
        panel_toolbar_registro.setPreferredSize(new java.awt.Dimension(984, 50));
        panel_toolbar_registro.setRequestFocusEnabled(false);

        lb_titulo_registro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_titulo_registro.setForeground(new java.awt.Color(255, 255, 255));
        lb_titulo_registro.setText("REGISTRO - HOSPITAL COMUNAL LAS MERCEDES");
        lb_titulo_registro.setToolTipText("");

        javax.swing.GroupLayout panel_toolbar_registroLayout = new javax.swing.GroupLayout(panel_toolbar_registro);
        panel_toolbar_registro.setLayout(panel_toolbar_registroLayout);
        panel_toolbar_registroLayout.setHorizontalGroup(
            panel_toolbar_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_toolbar_registroLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lb_titulo_registro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_toolbar_registroLayout.setVerticalGroup(
            panel_toolbar_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_toolbar_registroLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lb_titulo_registro)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        lb_tipo_identificacion.setText("Tipo de identificación:");

        lb_identificacion.setText("Identificación:");

        lb_primer_nombre.setText("Primer nombre:");

        lb_segundo_nombre.setText("Segundo nombre:");

        lb_primer_apellido.setText("Primer apellido:");

        lb_segundo_apellido.setText("Segundo apellido:");

        lb_genero.setText("Genero:");

        lb_fecha_nacimiento.setText("Fecha de nacimiento:");

        lb_tipo_usuario.setText("Tipo de usuario:");

        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_regresar.setText("Regresar");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        cb_tipo_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_tipo_usuarioActionPerformed(evt);
            }
        });

        ftf_fecha_nacimiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));

        lb_tipo_usuario1.setText("Activo:");

        cbx_activo.setSelected(true);

        pnl_login.setBackground(new java.awt.Color(204, 204, 204));
        pnl_login.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(), javax.swing.BorderFactory.createCompoundBorder()));

        lb_usuario.setText("Usuario:");

        lb_password.setText("Contraseña:");

        lb_password_repetir.setText("Repetir contraseña:");

        lb_titulo_usuario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lb_titulo_usuario.setText("INFORMACIÓN DE USUARIO");

        javax.swing.GroupLayout pnl_loginLayout = new javax.swing.GroupLayout(pnl_login);
        pnl_login.setLayout(pnl_loginLayout);
        pnl_loginLayout.setHorizontalGroup(
            pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_loginLayout.createSequentialGroup()
                .addGroup(pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_loginLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_password)
                            .addComponent(lb_usuario)
                            .addComponent(lb_password_repetir))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpf_password, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpf_password_rectificar, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_loginLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(lb_titulo_usuario)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        pnl_loginLayout.setVerticalGroup(
            pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_loginLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lb_titulo_usuario)
                .addGap(18, 18, 18)
                .addGroup(pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_usuario)
                    .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_password)
                    .addComponent(jpf_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_password_repetir)
                    .addComponent(jpf_password_rectificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_registroLayout = new javax.swing.GroupLayout(panel_registro);
        panel_registro.setLayout(panel_registroLayout);
        panel_registroLayout.setHorizontalGroup(
            panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_registroLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_tipo_usuario)
                    .addComponent(lb_fecha_nacimiento)
                    .addComponent(lb_genero)
                    .addComponent(lb_segundo_apellido)
                    .addComponent(lb_primer_apellido)
                    .addComponent(lb_segundo_nombre)
                    .addComponent(lb_primer_nombre)
                    .addComponent(lb_identificacion)
                    .addComponent(lb_tipo_identificacion)
                    .addComponent(lb_tipo_usuario1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_registroLayout.createSequentialGroup()
                        .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_tipo_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_primer_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_segundo_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cb_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_segundo_nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ftf_fecha_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cb_tipo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_primer_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(pnl_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbx_activo))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_registroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        panel_registroLayout.setVerticalGroup(
            panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_registroLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_registroLayout.createSequentialGroup()
                        .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnl_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_registroLayout.createSequentialGroup()
                                .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lb_tipo_identificacion)
                                    .addComponent(cb_tipo_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lb_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_primer_nombre)
                                    .addComponent(txt_primer_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lb_segundo_nombre)
                                    .addComponent(txt_segundo_nombre))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lb_primer_apellido)
                                    .addComponent(txt_primer_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lb_segundo_apellido)
                                    .addComponent(txt_segundo_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_genero)
                            .addComponent(cb_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_fecha_nacimiento)
                            .addComponent(ftf_fecha_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_tipo_usuario)
                            .addComponent(cb_tipo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lb_tipo_usuario1))
                    .addComponent(cbx_activo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(btn_regresar))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_toolbar_registro, javax.swing.GroupLayout.DEFAULT_SIZE, 882, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_toolbar_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_registro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        Ingreso ingreso = new Ingreso();
        ingreso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed

        try {
            if (cb_tipo_usuario.getSelectedIndex() != 0) {
                if (cb_tipo_usuario.getSelectedIndex() == 1) {
                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                    Date fecha = (Date) formato.parse(ftf_fecha_nacimiento.getText());
                    Paciente paciente = new Paciente(
                            Long.parseLong(txt_identificacion.getText()),
                            txt_primer_nombre.getText(),
                            txt_segundo_nombre.getText(),
                            txt_primer_apellido.getText(),
                            txt_segundo_apellido.getText(),
                            Date.valueOf("1993-05-27"),
                            true,
                            cb_genero.getSelectedIndex(),
                            cb_tipo_usuario.getSelectedIndex(),
                            cb_tipo_identificacion.getSelectedIndex()
                    );

                    int id = this.modeloUsuario.GuardarUsuario(paciente);

                } else {

                    Empleado empleado = new Empleado(
                            Long.parseLong(txt_identificacion.getText()),
                            txt_primer_nombre.getText(),
                            txt_segundo_nombre.getText(),
                            txt_primer_apellido.getText(),
                            txt_segundo_apellido.getText(),
                            Date.valueOf("1993-05-27"),
                            true,
                            cb_genero.getSelectedIndex(),
                            cb_tipo_usuario.getSelectedIndex(),
                            cb_tipo_identificacion.getSelectedIndex(),
                            txt_usuario.getText(),
                            String.copyValueOf(jpf_password.getPassword())
                    );

                    int id = this.modeloUsuario.GuardarUsuario(empleado);

                    Login login = new Login(id, empleado.getUsuario(), empleado.getContrasenia());
                    this.modeloLogin.GuardarLoginEmpleado(login);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegistroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(RegistroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_guardarActionPerformed


    private void cb_tipo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_tipo_usuarioActionPerformed
        // TODO add your handling code here:
        if (cb_tipo_usuario.getSelectedIndex() == 2) {
            pnl_login.setVisible(true);
            //TODO: Cargar la informacion del login si existe al editar
        } else {
            pnl_login.setVisible(false);

            if (!this.esEdicion) {
                txt_usuario.setText("");
                jpf_password.setText("");
                jpf_password_rectificar.setText("");
            }
        }
    }//GEN-LAST:event_cb_tipo_usuarioActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JComboBox<String> cb_genero;
    private javax.swing.JComboBox<String> cb_tipo_identificacion;
    private javax.swing.JComboBox<String> cb_tipo_usuario;
    private javax.swing.JCheckBox cbx_activo;
    private javax.swing.JFormattedTextField ftf_fecha_nacimiento;
    private javax.swing.JPasswordField jpf_password;
    private javax.swing.JPasswordField jpf_password_rectificar;
    private javax.swing.JLabel lb_fecha_nacimiento;
    private javax.swing.JLabel lb_genero;
    private javax.swing.JLabel lb_identificacion;
    private javax.swing.JLabel lb_password;
    private javax.swing.JLabel lb_password_repetir;
    private javax.swing.JLabel lb_primer_apellido;
    private javax.swing.JLabel lb_primer_nombre;
    private javax.swing.JLabel lb_segundo_apellido;
    private javax.swing.JLabel lb_segundo_nombre;
    private javax.swing.JLabel lb_tipo_identificacion;
    private javax.swing.JLabel lb_tipo_usuario;
    private javax.swing.JLabel lb_tipo_usuario1;
    private javax.swing.JLabel lb_titulo_registro;
    private javax.swing.JLabel lb_titulo_usuario;
    private javax.swing.JLabel lb_usuario;
    private javax.swing.JPanel panel_registro;
    private javax.swing.JPanel panel_toolbar_registro;
    private javax.swing.JPanel pnl_login;
    private javax.swing.JTextField txt_identificacion;
    private javax.swing.JTextField txt_primer_apellido;
    private javax.swing.JTextField txt_primer_nombre;
    private javax.swing.JTextField txt_segundo_apellido;
    private javax.swing.JTextField txt_segundo_nombre;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
