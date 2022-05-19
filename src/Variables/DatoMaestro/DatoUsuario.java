/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Variables.DatoMaestro;

import java.sql.Date;


/**
 *
 * @author Alex
 */
public class DatoUsuario {

    private int Id;
    private long Identificacion;
    private String PrimerNombre;
    private String SegundoNombre;
    private String PrimerApellido;
    private String SegundoApellido;
    private Date FechaNacimiento;
    private Boolean Activo;
    private int IdGenero;
    private int IdTipoUsuario;
    private int IdTipoIdentificacion;

    public DatoUsuario(int id, long identificacion, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, Date fechaNacimiento,
            Boolean activo, int idGenero, int idTipoUsuario, int idTipoIdentificacion) {
        this.Id = id;
        this.Identificacion = identificacion;
        this.PrimerNombre = primerNombre;
        this.SegundoNombre = segundoNombre;
        this.PrimerApellido = primerApellido;
        this.SegundoApellido = segundoApellido;
        this.FechaNacimiento = fechaNacimiento;
        this.Activo = activo;
        this.IdGenero = idGenero;
        this.IdTipoUsuario = idTipoUsuario;
        this.IdTipoIdentificacion = idTipoIdentificacion;
    }

    public DatoUsuario(long identificacion, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, Date fechaNacimiento,
            Boolean activo, int idGenero, int idTipoUsuario, int idTipoIdentificacion) {
        this.Identificacion = identificacion;
        this.PrimerNombre = primerNombre;
        this.SegundoNombre = segundoNombre;
        this.PrimerApellido = primerApellido;
        this.SegundoApellido = segundoApellido;
        this.FechaNacimiento = fechaNacimiento;
        this.Activo = activo;
        this.IdGenero = idGenero;
        this.IdTipoUsuario = idTipoUsuario;
        this.IdTipoIdentificacion = idTipoIdentificacion;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public long getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(long Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getPrimerNombre() {
        return PrimerNombre;
    }

    public void setPrimerNombre(String PrimerNombre) {
        this.PrimerNombre = PrimerNombre;
    }

    public String getSegundoNombre() {
        return SegundoNombre;
    }

    public void setSegundoNombre(String SegundoNombre) {
        this.SegundoNombre = SegundoNombre;
    }

    public String getPrimerApellido() {
        return PrimerApellido;
    }

    public void setPrimerApellido(String PrimerApellido) {
        this.PrimerApellido = PrimerApellido;
    }

    public String getSegundoApellido() {
        return SegundoApellido;
    }

    public void setSegundoApellido(String SegundoApellido) {
        this.SegundoApellido = SegundoApellido;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public Boolean getActivo() {
        return Activo;
    }

    public void setActivo(Boolean Activo) {
        this.Activo = Activo;
    }

    public int getIdGenero() {
        return IdGenero;
    }

    public void setIdGenero(int IdGenero) {
        this.IdGenero = IdGenero;
    }

    public int getIdTipoUsuario() {
        return IdTipoUsuario;
    }

    public void setIdTipoUsuario(int IdTipoUsuario) {
        this.IdTipoUsuario = IdTipoUsuario;
    }

    public int getIdTipoIdentificacion() {
        return IdTipoIdentificacion;
    }

    public void setIdTipoIdentificacion(int IdTipoIdentificacion) {
        this.IdTipoIdentificacion = IdTipoIdentificacion;
    }

}
