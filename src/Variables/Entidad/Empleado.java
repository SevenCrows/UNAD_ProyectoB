/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Variables.Entidad;

import Variables.DatoMaestro.DatoUsuario;
import java.sql.Date;



/**
 *
 * @author Alex
 */
public class Empleado extends DatoUsuario {

    private int IdPersona;
    private String Usuario;
    private String Contrasenia;

    public Empleado(int id, long identificacion, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, Date fechaNacimiento,
            Boolean activo, int idGenero, int idTipoUsuario, int idTipoIdentificacion, String usuario, String contrasenia) {
        super(id, identificacion, primerNombre, segundoNombre, primerApellido, segundoApellido, fechaNacimiento, activo, idGenero, idTipoUsuario, idTipoIdentificacion);
        this.IdPersona = id;
        this.Usuario = usuario;
        this.Contrasenia = contrasenia;
    }

    public Empleado(long identificacion, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, Date fechaNacimiento,
            Boolean activo, int idGenero, int idTipoUsuario, int idTipoIdentificacion, String usuario, String contrasenia) {
        super(identificacion, primerNombre, segundoNombre, primerApellido, segundoApellido, fechaNacimiento, activo, idGenero, idTipoUsuario, idTipoIdentificacion);
        this.Usuario = usuario;
        this.Contrasenia = contrasenia;
    }

    public int getIdPersona() {
        return IdPersona;
    }

    public void setIdPersona(int IdPersona) {
        this.IdPersona = IdPersona;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContrasenia() {
        return Contrasenia;
    }

    public void setContrasenia(String Contrasenia) {
        this.Contrasenia = Contrasenia;
    }

}
