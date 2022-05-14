/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Variables.Modelo;

import Conexion.ConfigurarConexion;
import Variables.Entidad.Vacuna;
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
}
