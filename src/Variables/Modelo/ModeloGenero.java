/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Variables.Modelo;

import Conexion.ConfigurarConexion;
import Variables.Entidad.Genero;
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
public class ModeloGenero {
    
    private static ConfigurarConexion conexion;
    
    public ModeloGenero() {
        conexion = new ConfigurarConexion();
        conexion.EstablecerConexion();
    }
    
    public ArrayList<Genero> ObtenerListaGeneros() {
        Statement stmt;
        ResultSet rs;
        ArrayList<Genero> listaGeneros = new ArrayList<>();
        
        try {
            stmt = conexion.conection.createStatement();
            rs = stmt.executeQuery("SELECT * FROM genero");
            while(rs.next()){
                listaGeneros.add(new Genero(rs.getString("Descripcion")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloGenero.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return listaGeneros;
    }
}
