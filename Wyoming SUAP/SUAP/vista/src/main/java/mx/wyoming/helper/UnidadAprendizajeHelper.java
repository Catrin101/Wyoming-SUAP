/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.wyoming.helper;

import mx.wyoming.entidad.UnidadDeAprendizaje;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UnidadAprendizajeHelper {
    
    private static final String DB_URL = "jdbc:mysql://localhost:3306/wyomingsuap";
    private static final String DB_USER = "root"; // Cambiar por el usuario correcto
    private static final String DB_PASSWORD = ""; // Cambiar por la contraseña correcta

    public void guardarUnidad(UnidadDeAprendizaje unidad) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            // Conectar a la base de datos
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            
            // Crear el query de inserción
            String sql = "INSERT INTO unidad_aprendizaje (id_unidad, nombre_unidad, hora_clase, hora_taller, hora_laboratorio) VALUES (?, ?, ?, ?, ?)";
            ps = conn.prepareStatement(sql);
            
            // Asignar los parámetros
            ps.setInt(1, unidad.getIdUnidadAprendizaje());
            ps.setString(2, unidad.getNombreDeLaUnidadAprendisaje());
            ps.setInt(3, unidad.getHoraClase());
            ps.setInt(4, unidad.getHoraTaller());
            ps.setInt(5, unidad.getHorasLaboratorio());
            
            // Ejecutar el query
            ps.executeUpdate();
        } finally {
            // Cerrar recursos
            if (ps != null) ps.close();
            if (conn != null) conn.close();
        }
    }
}
