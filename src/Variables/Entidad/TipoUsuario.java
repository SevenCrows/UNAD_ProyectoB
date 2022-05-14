/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Variables.Entidad;

import Variables.DatoMaestro.DatoBase;

/**
 *
 * @author Alex
 */
public class TipoUsuario extends DatoBase {

    public TipoUsuario(int id, String descripcion) {
        super(id, descripcion);
    }

    public TipoUsuario(String descripcion) {
        super(descripcion);
    }
}
