/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Variables.Entidad;

/**
 *
 * @author Alex
 */
public class Login {

    private int Id;
    private int IdPersona;
    private String Usuario;
    private String Contrasenia;

    public Login(int id, int idPersona, String usuario, String password) {
        this.Id = id;
        this.IdPersona = idPersona;
        this.Usuario = usuario;
        this.Contrasenia = password;
    }

    public Login(int idPersona, String usuario, String password) {
        this.IdPersona = idPersona;
        this.Usuario = usuario;
        this.Contrasenia = password;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
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
