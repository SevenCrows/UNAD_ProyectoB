/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Variables.Modelo;

import Conexion.ConfigurarConexion;
import Variables.Entidad.TipoUsuario;
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
public class ModeloTipoUsuario {
     private static ConfigurarConexion conexion;
    
    public ModeloTipoUsuario() {
        conexion = new ConfigurarConexion();
        conexion.EstablecerConexion();
    }
    
    public ArrayList<TipoUsuario> ObtenerListaTipoUsuario() {
        Statement stmt;
        ResultSet rs;
        ArrayList<TipoUsuario> listaTipoUsuario = new ArrayList<>();
        
        try {
            stmt = conexion.conection.createStatement();
            rs = stmt.executeQuery("SELECT * FROM tipo_usuario");
            while(rs.next()){
                listaTipoUsuario.add(new TipoUsuario(rs.getString("Descripcion")));
            }
        } catch (SQLException ex) {            
            Logger.getLogger(ModeloTipoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return listaTipoUsuario;
    }
}
