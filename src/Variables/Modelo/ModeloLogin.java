/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Variables.Modelo;

import Conexion.ConfigurarConexion;
import Variables.Entidad.Login;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alex
 */
public class ModeloLogin {

    private static ConfigurarConexion conexion;

    public ModeloLogin() {
        conexion = new ConfigurarConexion();
        conexion.EstablecerConexion();
    }

    public Boolean ValidarAccesoPlataforma(String usuario, String password) {
        Statement stmt;
        ResultSet rs;
        Boolean ingreso = true;
        try {
            stmt = conexion.conection.createStatement();
            rs = stmt.executeQuery(String.format("SELECT * FROM login WHERE Usuario = '%s' AND Contrasenia = '%s'", usuario, password));

            if (!rs.isBeforeFirst()) {
                ingreso = false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ModeloDosis.class.getName()).log(Level.SEVERE, null, ex);
        }

        return ingreso;
    }

    public int GuardarLoginEmpleado(Login login) throws SQLException {
        String insertar = "INSERT INTO login (IdPersona, Usuario, Contrasenia) VALUE (?,?,?)";
        PreparedStatement ps = conexion.conection.prepareStatement(insertar, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, login.getIdPersona());
        ps.setString(2, login.getUsuario());
        ps.setString(3, login.getContrasenia());

        ps.execute();
        ResultSet rs = ps.getGeneratedKeys();
        int idInsert = 0;
        if (rs.next()) {
            idInsert = rs.getInt(1);
        }
        return idInsert;
    }

}
