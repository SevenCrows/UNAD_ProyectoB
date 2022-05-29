/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Variables.Consulta;

/**
 *
 * @author Alex
 */
public class VacunaConsulta {
    private int Id;
    private long Identificacion;
    private String Vacuna;
    private String Dosis;
    private String FechaVacunacion;
    private String ProximaFecha;

    public VacunaConsulta(int id, long identificacion, String vacuna, String dosis, String fechaVacuna, String fechaProximo){
        this.Id = id;
        this.Identificacion = identificacion;
        this.Vacuna = vacuna;
        this.Dosis = dosis;
        this.FechaVacunacion = fechaVacuna;
        this.ProximaFecha = fechaProximo;
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

    public String getVacuna() {
        return Vacuna;
    }

    public void setVacuna(String Vacuna) {
        this.Vacuna = Vacuna;
    }

    public String getDosis() {
        return Dosis;
    }

    public void setDosis(String Dosis) {
        this.Dosis = Dosis;
    }

    public String getFechaVacunacion() {
        return FechaVacunacion;
    }

    public void setFechaVacunacion(String FechaVacunacion) {
        this.FechaVacunacion = FechaVacunacion;
    }

    public String getProximaFecha() {
        return ProximaFecha;
    }

    public void setProximaFecha(String ProximaFecha) {
        this.ProximaFecha = ProximaFecha;
    }
}
