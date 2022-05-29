/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Variables.Entidad;

import java.sql.Date;

/**
 *
 * @author Alex
 */
public class RegistroVacuna {

    private int IdPersona;
    private int IdVacuna;
    private int IdDosis;
    private Date FechaVacunacion;
    private Date FechaProximaDosis;

    public RegistroVacuna(int idPersona, int idVacuna, int idDosis, Date fechaVacuna, Date fechaProxima) {
        this.IdPersona = idPersona;
        this.IdVacuna = idVacuna;
        this.IdDosis = idDosis;
        this.FechaVacunacion = fechaVacuna;
        this.FechaProximaDosis = fechaProxima;
    }

    public int getIdPersona() {
        return IdPersona;
    }

    public void setIdPersona(int IdPersona) {
        this.IdPersona = IdPersona;
    }

    public int getIdVacuna() {
        return IdVacuna;
    }

    public void setIdVacuna(int IdVacuna) {
        this.IdVacuna = IdVacuna;
    }

    public int getIdDosis() {
        return IdDosis;
    }

    public void setIdDosis(int IdDosis) {
        this.IdDosis = IdDosis;
    }

    public Date getFechaVacunacion() {
        return FechaVacunacion;
    }

    public void setFechaVacunacion(Date FechaVacunacion) {
        this.FechaVacunacion = FechaVacunacion;
    }

    public Date getFechaProximaDosis() {
        return FechaProximaDosis;
    }

    public void setFechaProximaDosis(Date FechaProximaDosis) {
        this.FechaProximaDosis = FechaProximaDosis;
    }

}
