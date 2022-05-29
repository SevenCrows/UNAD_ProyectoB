/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Variables.Modelo;

import Conexion.ConfigurarConexion;
import Variables.Consulta.UsuarioConsulta;
import Variables.DatoMaestro.DatoUsuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public void EditarUsuario(DatoUsuario usuario) throws SQLException {
        String editar = "UPDATE persona SET PrimerNombre = ?,SegundoNombre = ?, PrimerApellido = ?, SegundoApellido = ?, Fecha_Nacimiento = ?, Activo = ?, IdGenero = ?, IdTipoIdentificacion = ? WHERE Id = ?";
        PreparedStatement ps = conexion.conection.prepareStatement(editar);        
        ps.setString(1, usuario.getPrimerNombre());
        ps.setString(2, usuario.getSegundoNombre());
        ps.setString(3, usuario.getPrimerApellido());
        ps.setString(4, usuario.getSegundoApellido());
        ps.setDate(5, usuario.getFechaNacimiento());
        ps.setBoolean(6, usuario.getActivo());
        ps.setInt(7, usuario.getIdGenero());
        ps.setInt(8, usuario.getIdTipoIdentificacion());
        ps.setInt(9, usuario.getId());

        int row = ps.executeUpdate();
        
    }

    public ArrayList<UsuarioConsulta> ConsultarListaUsuariosPorIdentificacion(String identificacion) {
        Statement stmt;
        ResultSet rs;
        ArrayList<UsuarioConsulta> listaUsuarios = new ArrayList<>();

        try {
            stmt = conexion.conection.createStatement();
            rs = stmt.executeQuery("SELECT p.Id, p.Identificacion, p.PrimerNombre, p.SegundoNombre, p.PrimerApellido, p.SegundoApellido, p.Fecha_Nacimiento, p.Activo, p.IdGenero, p.IdTipoIdentificacion, p.IdTipoUsuario, g.Descripcion, l.Usuario, l.Contrasenia "
                    + "FROM persona p INNER JOIN genero g on p.IdGenero = g.Id LEFT JOIN login l on p.Id = l.IdPersona WHERE p.Identificacion = '" + identificacion + "'");
            while (rs.next()) {
                listaUsuarios.add(new UsuarioConsulta(
                        rs.getInt("Id"),
                        rs.getLong("Identificacion"),
                        rs.getString("PrimerNombre"),
                        rs.getString("SegundoNombre"),
                        rs.getString("PrimerApellido"),
                        rs.getString("SegundoApellido"),
                        rs.getDate("Fecha_Nacimiento"),
                        rs.getBoolean("Activo"),
                        rs.getInt("IdGenero"),
                        rs.getInt("IdTipoIdentificacion"),
                        rs.getInt("IdTipoUsuario"),
                        rs.getString("Usuario"),
                        rs.getString("Contrasenia"),
                        rs.getString("Descripcion")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloGenero.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaUsuarios;
    }
}
