/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Variables.DatoMaestro;

/**
 *
 * @author Alex
 */
public class DatoBase {

    private int Id;
    private String Descripcion;

    public DatoBase(int id, String descripcion) {
        this.Id = id;
        this.Descripcion = descripcion;
    }

    public DatoBase(String descripcion) {
        this.Descripcion = descripcion;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
}
