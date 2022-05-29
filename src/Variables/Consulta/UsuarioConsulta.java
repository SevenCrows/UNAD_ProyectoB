/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Variables.Consulta;

import Variables.Entidad.Empleado;
import java.sql.Date;

/**
 *
 * @author Alex
 */
public class UsuarioConsulta extends Empleado {

    private String Genero;

    public UsuarioConsulta(int id, long identificacion, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, Date fechaNacimiento,
            Boolean activo, int idGenero, int idTipoUsuario, int idTipoIdentificacion, String usuario, String contrasenia, String generoDescripcion) {
        super(id, identificacion, primerNombre, segundoNombre, primerApellido, segundoApellido, fechaNacimiento, activo, idGenero, idTipoUsuario, idTipoIdentificacion, usuario, contrasenia);
        this.Genero = generoDescripcion;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

}
