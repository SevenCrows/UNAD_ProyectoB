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
public class Dosis extends DatoBase {

    public Dosis(int id, String descripcion) {
        super(id, descripcion);
    }

    public Dosis(String descripcion) {
        super(descripcion);
    }
}
