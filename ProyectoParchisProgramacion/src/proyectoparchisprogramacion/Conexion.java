/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoparchisprogramacion;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/juego_parchis"; // Cambia "tu_basedatos" por el nombre de tu base de datos
    private static final String USUARIO = "root";
    private static final String CONTRASENIA = "";

    public static Connection Conectar() {
        Connection connection = null;

        try {
            // Cargar el controlador JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establecer la conexión
            connection = DriverManager.getConnection(URL, USUARIO, CONTRASENIA);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error en la conexión: " + e.getMessage());
        }

        return connection;
    }

    public static void Desconectar(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Conexión cerrada.");
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
}