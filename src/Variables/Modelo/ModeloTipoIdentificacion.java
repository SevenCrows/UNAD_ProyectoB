/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Variables.Modelo;

import Conexion.ConfigurarConexion;
import Variables.Entidad.TipoIdentificacion;
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
public class ModeloTipoIdentificacion {
     private static ConfigurarConexion conexion;
    
    public ModeloTipoIdentificacion() {
        conexion = new ConfigurarConexion();
        conexion.EstablecerConexion();
    }
    
    public ArrayList<TipoIdentificacion> ObtenerListaTipoIdentificacion() {
        Statement stmt;
        ResultSet rs;
        ArrayList<TipoIdentificacion> listaTipoIdentificacion = new ArrayList<>();
        
        try {
            stmt = conexion.conection.createStatement();
            rs = stmt.executeQuery("SELECT * FROM tipo_identificacion");
            while(rs.next()){
                listaTipoIdentificacion.add(new TipoIdentificacion(rs.getString("Descripcion")));
            }
        } catch (SQLException ex) {            
            Logger.getLogger(ModeloTipoIdentificacion.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return listaTipoIdentificacion;
    }
}
