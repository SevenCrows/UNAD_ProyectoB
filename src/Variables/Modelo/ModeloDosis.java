/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Variables.Modelo;

import Conexion.ConfigurarConexion;
import Variables.Entidad.Dosis;
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
public class ModeloDosis {
    private static ConfigurarConexion conexion;
    
    public ModeloDosis() {
        conexion = new ConfigurarConexion();
        conexion.EstablecerConexion();
    }
    
    public ArrayList<Dosis> ObtenerListaDosis() {
        Statement stmt;
        ResultSet rs;
        ArrayList<Dosis> listaDosis = new ArrayList<>();
        
        try {
            stmt = conexion.conection.createStatement();
            rs = stmt.executeQuery("SELECT * FROM dosis");
            while(rs.next()){
                listaDosis.add(new Dosis(rs.getString("Descripcion")));
            }
        } catch (SQLException ex) {            
            Logger.getLogger(ModeloDosis.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return listaDosis;
    }
}
