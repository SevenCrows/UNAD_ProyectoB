/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Variables.Modelo;

import Conexion.ConfigurarConexion;
import Variables.DatoMaestro.DatoUsuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Alex
 */
public class ModeloUsuario {

    private static ConfigurarConexion conexion;

    public ModeloUsuario() {
        conexion = new ConfigurarConexion();
        conexion.EstablecerConexion();
    }

    public int GuardarUsuario(DatoUsuario usuario) throws SQLException {
        String insertar = "INSERT INTO persona(Identificacion, PrimerNombre, SegundoNombre, PrimerApellido, SegundoApellido, Fecha_Nacimiento, Activo, IdGenero, IdTipoUsuario, IdTipoIdentificacion) VALUE (?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conexion.conection.prepareStatement(insertar, Statement.RETURN_GENERATED_KEYS);
        ps.setLong(1, usuario.getIdentificacion());
        ps.setString(2, usuario.getPrimerNombre());
        ps.setString(3, usuario.getSegundoNombre());
        ps.setString(4, usuario.getPrimerApellido());
        ps.setString(5, usuario.getSegundoApellido());
        ps.setDate(6, usuario.getFechaNacimiento());
        ps.setBoolean(7, usuario.getActivo());
        ps.setInt(8, usuario.getIdGenero());
        ps.setInt(9, usuario.getIdTipoUsuario());
        ps.setInt(10, usuario.getIdTipoIdentificacion());

        ps.execute();
        ResultSet rs = ps.getGeneratedKeys();
        int idInsert = 0;
        if (rs.next()) {
            idInsert = rs.getInt(1);
        }
        return idInsert;
    }

    
}
