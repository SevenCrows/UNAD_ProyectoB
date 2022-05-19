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
public class Paciente extends DatoUsuario {

    public Paciente(int id, long identificacion, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, Date fechaNacimiento,
            Boolean activo, int idGenero, int idTipoUsuario, int idTipoIdentificacion) {
        super(id, identificacion, primerNombre, segundoNombre, primerApellido, segundoApellido, fechaNacimiento, activo, idGenero, idTipoUsuario, idTipoIdentificacion);
    }

    public Paciente(long identificacion, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, Date fechaNacimiento,
            Boolean activo, int idGenero, int idTipoUsuario, int idTipoIdentificacion) {
        super(identificacion, primerNombre, segundoNombre, primerApellido, segundoApellido, fechaNacimiento, activo, idGenero, idTipoUsuario, idTipoIdentificacion);
    }
}
