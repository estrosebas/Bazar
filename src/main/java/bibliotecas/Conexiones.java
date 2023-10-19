/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecas;

/**
 *
 * @author estrosebas
 */
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexiones {
    // Datos de conexión
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/bazar";
    private static final String USUARIO = "root";
    private static final String CONTRASEÑA = "";
    Connection Conexion;

    // Esto ahora es un constructor
    public Conexiones() {
        try {
            Conexion = DriverManager.getConnection(JDBC_URL, USUARIO, CONTRASEÑA);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos", "Error de Conexión", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Connection getConnection() {
        return Conexion;
    }
}