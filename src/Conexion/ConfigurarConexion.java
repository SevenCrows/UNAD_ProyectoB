/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego Leon
 */
public class ConfigurarConexion {

    public Connection conection;
    private final String host;
    private final String user;
    private final String puerto;
    private final String pass;
    private final String basededatos;

    public ConfigurarConexion() {
        this.host = "localhost";
        this.user = "root";
        this.puerto = "33061";
        this.pass = "123456";
        this.basededatos = "clinica";
    }

    public void EstablecerConexion() {
        try {
            String cadenaConexion = "jdbc:mysql://" + this.host + ":" + this.puerto + "/" + this.basededatos + "?" + "user=" + this.user + "&password=" + this.pass;
            conection = DriverManager.getConnection(cadenaConexion);
            System.out.println("Conexion exitosa");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la Conexion");
        }
    }

    public void CerrarConexion() {
        try {
            conection.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en el cierre de la Conexion");
        }
    }
}
