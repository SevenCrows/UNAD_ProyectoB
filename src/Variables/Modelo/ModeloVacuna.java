/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Variables.Modelo;

import Conexion.ConfigurarConexion;
import Variables.Consulta.VacunaConsulta;
import Variables.Entidad.RegistroVacuna;
import Variables.Entidad.Vacuna;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alex
 */
public class ModeloVacuna {
     private static ConfigurarConexion conexion;
    
    public ModeloVacuna() {
        conexion = new ConfigurarConexion();
        conexion.EstablecerConexion();
    }
    
    public ArrayList<Vacuna> ObtenerListaVacuna() {
        Statement stmt;
        ResultSet rs;
        ArrayList<Vacuna> listaVacuna = new ArrayList<>();
        
        try {
            stmt = conexion.conection.createStatement();
            rs = stmt.executeQuery("SELECT * FROM vacuna");
            while(rs.next()){
                listaVacuna.add(new Vacuna(rs.getString("Descripcion")));
            }
        } catch (SQLException ex) {            
            Logger.getLogger(ModeloVacuna.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return listaVacuna;
    }    
    
    public  ArrayList<VacunaConsulta> ObtenerReporteVacunacion(int idPersona){
         Statement stmt;
        ResultSet rs;
        ArrayList<VacunaConsulta> listaReporte = new ArrayList<>();
        
        try {
            stmt = conexion.conection.createStatement();
            rs = stmt.executeQuery("SELECT rv.Id, p.Identificacion, v.Descripcion AS DescripcionVacuna, d.Descripcion AS DescripcionDosis, rv.FechaVacunacion, rv.FechaProximaDosis "
                    + "FROM registro_vacunacion rv "
                    + "INNER JOIN vacuna v on rv.IdVacuna = v.Id "
                    + "INNER JOIN dosis d on rv.IdDosis = d.Id "
                    + "INNER JOIN persona p on rv.IdPersona = p.Id "
                    + "WHERE rv.IdPersona = "+ idPersona);
            
            while(rs.next()){
                listaReporte.add(
                        new VacunaConsulta(
                                rs.getInt("Id"),
                                rs.getLong("Identificacion"),
                                rs.getString("DescripcionVacuna"),
                                rs.getString("DescripcionDosis"),
                                rs.getString("FechaVacunacion"),
                                rs.getString("FechaProximaDosis")
                        )
                );
            }
        } catch (SQLException ex) {            
            Logger.getLogger(ModeloVacuna.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return listaReporte;
    }
    
    public int GuardarReporteVacunacion(RegistroVacuna registro) throws SQLException {
        String insertar = "INSERT INTO registro_vacunacion (IdPersona, IdVacuna, IdDosis, FechaVacunacion, FechaProximaDosis) VALUE (?,?,?,?,?)";
        PreparedStatement ps = conexion.conection.prepareStatement(insertar, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, registro.getIdPersona());
        ps.setInt(2, registro.getIdVacuna());
        ps.setInt(3, registro.getIdDosis());
        ps.setDate(4, registro.getFechaVacunacion());
        ps.setDate(5, registro.getFechaProximaDosis());       

        ps.execute();
        ResultSet rs = ps.getGeneratedKeys();
        int idInsert = 0;
        if (rs.next()) {
            idInsert = rs.getInt(1);
        }
        return idInsert;
    }
}
