/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

/**
 *
 * @author jhoja
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static Connection cnx = null;

    public static Connection obtener() throws SQLException, ClassNotFoundException {
        if (cnx == null || cnx.isClosed()) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/colonia", "root", "");  // Cambia "root" y "" por tu usuario y contraseña
            } catch (SQLException ex) {
                System.err.println("Error de SQL: " + ex.getMessage());
                throw new SQLException("No se pudo establecer la conexión con la base de datos.", ex);
            } catch (ClassNotFoundException ex) {
                System.err.println("Error: Driver no encontrado - " + ex.getMessage());
                throw new ClassNotFoundException("No se encontró el driver de la base de datos.", ex);
            }
        }
        return cnx;
    }

    public static void cerrar() throws SQLException {
        if (cnx != null && !cnx.isClosed()) {
            cnx.close();
            cnx = null;
        }
    }
}

