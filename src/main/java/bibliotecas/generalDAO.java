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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;
public class generalDAO {

    private Connection conexion;

    public generalDAO() {
        Conexiones conexiones = new Conexiones();
        this.conexion = conexiones.getConnection();
    }

    // Método para insertar un producto
    public boolean insertarProducto(String categoria) {
        switch (categoria) {
            case "Bebida":
                // Lógica para insertar una bebida
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la bebida:");
                double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de la bebida:"));
                String tipo = "Bebida";
                String marca = JOptionPane.showInputDialog("Ingrese la marca de la bebida:");
                double litros = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los litros de la bebida:"));
                String tipoBebida = JOptionPane.showInputDialog("Ingrese el tipo de bebida:");

                // Crear una instancia de Bebida con los datos ingresados
                Bebida bebida = new Bebida(nombre, precio, tipo, marca, litros, tipoBebida);

                // Mostrar la bebida creada
                JOptionPane.showMessageDialog(null, "Bebida creada:\n" + bebida.toString());

                // Preparar la sentencia SQL para la inserción
                String sql = "INSERT INTO productos (nombre, precio, marca, stock, contenido, categoria, tipo) VALUES (?, ?, ?, ?, ?, ?, ?)";

                try {
                    // Crear un PreparedStatement
                    PreparedStatement preparedStatement = conexion.prepareStatement(sql);

                    // Establecer los valores de los parámetros
                    preparedStatement.setString(1, bebida.getNombre());
                    preparedStatement.setDouble(2, bebida.getPrecio());
                    preparedStatement.setString(3, bebida.getMarca());
                    preparedStatement.setInt(4, 0); // Inicialmente, el stock es 0
                    preparedStatement.setString(5, bebida.getLitros() + "L");
                    preparedStatement.setString(6, categoria);
                    preparedStatement.setString(7, bebida.getTipoBebida());

                    // Ejecutar la inserción
                    int filasAfectadas = preparedStatement.executeUpdate();
                    preparedStatement.close();

                    if (filasAfectadas > 0) {
                        JOptionPane.showMessageDialog(null, "Bebida insertada con éxito en la base de datos.");
                        return true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al insertar la bebida en la base de datos.");
                        return false;
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                    return false;
                }
            case "Alimento":
                // Lógica para insertar un alimento
                String nombreAlimento = JOptionPane.showInputDialog("Ingrese el nombre del alimento:");
                double precioAlimento = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del alimento:"));
                String tipoAlimento = "Alimento";
                String marcaAlimento = JOptionPane.showInputDialog("Ingrese la marca del alimento:");
                double pesoAlimento = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del alimento:"));

                // Crear una instancia de Alimento con los datos ingresados
                Alimento alimento = new Alimento(nombreAlimento, precioAlimento, tipoAlimento, marcaAlimento, pesoAlimento);

                // Mostrar el alimento creado
                JOptionPane.showMessageDialog(null, "Alimento creado:\n" + alimento.toString());

                // Preparar la sentencia SQL para la inserción del alimento
                String sqlAlimento = "INSERT INTO productos (nombre, precio, marca, stock, contenido, categoria, tipo) VALUES (?, ?, ?, ?, ?, ?, ?)";

                try {
                    // Crear un PreparedStatement
                    PreparedStatement preparedStatementAlimento = conexion.prepareStatement(sqlAlimento);

                    // Establecer los valores de los parámetros para el alimento
                    preparedStatementAlimento.setString(1, alimento.getNombre());
                    preparedStatementAlimento.setDouble(2, alimento.getPrecio());
                    preparedStatementAlimento.setString(3, alimento.getMarca());
                    preparedStatementAlimento.setInt(4, 0); // Inicialmente, el stock es 0
                    preparedStatementAlimento.setString(5, alimento.getPeso() + "g"); // Peso en gramos
                    preparedStatementAlimento.setString(6, categoria);
                    preparedStatementAlimento.setString(7, tipoAlimento);

                    // Ejecutar la inserción del alimento
                    int filasAfectadasAlimento = preparedStatementAlimento.executeUpdate();
                    preparedStatementAlimento.close();

                    if (filasAfectadasAlimento > 0) {
                        JOptionPane.showMessageDialog(null, "Alimento insertado con éxito en la base de datos.");
                        return true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al insertar el alimento en la base de datos.");
                        return false;
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                    return false;
                }
            case "AceoPersonal":
                // Lógica para insertar un artículo de aseo personal
                String nombreAceoPersonal = JOptionPane.showInputDialog("Ingrese el nombre del artículo de aseo personal:");
                double precioAceoPersonal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del artículo de aseo personal:"));
                String tipoAceoPersonal = "Aceo";
                String marcaAceoPersonal = JOptionPane.showInputDialog("Ingrese la marca del artículo de aseo personal:");
                String generoAceoPersonal = JOptionPane.showInputDialog("Ingrese el género del artículo de aseo personal:");

                // Verificar si la marca es nula y asignar "NULL" en su lugar
                if (marcaAceoPersonal == null) {
                    marcaAceoPersonal = "NULL";
                }

                // Crear una instancia de AceoPersonal con los datos ingresados
                AceoPersonal aceoPersonal = new AceoPersonal(nombreAceoPersonal, precioAceoPersonal, tipoAceoPersonal, marcaAceoPersonal, generoAceoPersonal);

                // Mostrar el artículo de aseo personal creado
                JOptionPane.showMessageDialog(null, "Artículo de aseo personal creado:\n" + aceoPersonal.toString());

                // Preparar la sentencia SQL para la inserción del artículo de aseo personal
                String sqlAceoPersonal = "INSERT INTO productos (nombre, precio, marca, stock, contenido, categoria, tipo) VALUES (?, ?, ?, ?, ?, ?, ?)";

                try {
                    // Crear un PreparedStatement
                    PreparedStatement preparedStatementAceoPersonal = conexion.prepareStatement(sqlAceoPersonal);

                    // Establecer los valores de los parámetros para el artículo de aseo personal
                    preparedStatementAceoPersonal.setString(1, aceoPersonal.getNombre());
                    preparedStatementAceoPersonal.setDouble(2, aceoPersonal.getPrecio());
                    preparedStatementAceoPersonal.setString(3, aceoPersonal.getMarca());
                    preparedStatementAceoPersonal.setInt(4, 0); // Inicialmente, el stock es 0
                    preparedStatementAceoPersonal.setString(5, "1u"); // Contenido para artículo de aseo personal
                    preparedStatementAceoPersonal.setString(6, categoria);
                    preparedStatementAceoPersonal.setString(7, tipoAceoPersonal);

                    // Ejecutar la inserción del artículo de aseo personal
                    int filasAfectadasAceoPersonal = preparedStatementAceoPersonal.executeUpdate();
                    preparedStatementAceoPersonal.close();

                    if (filasAfectadasAceoPersonal > 0) {
                        JOptionPane.showMessageDialog(null, "Artículo de aseo personal insertado con éxito en la base de datos.");
                        return true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al insertar el artículo de aseo personal en la base de datos.");
                        return false;
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                    return false;
                }
            case "Golosina":
                // Lógica para insertar una golosina
                String nombreGolosina = JOptionPane.showInputDialog("Ingrese el nombre de la golosina:");
                double precioGolosina = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de la golosina:"));
                String tipoGolosina = "Consumible";
                String marcaGolosina = JOptionPane.showInputDialog("Ingrese la marca de la golosina:");
                String tipoDeGolosina = JOptionPane.showInputDialog("Ingrese el tipo de golosina:");

                // Verificar si la marca es nula y asignar "NULL" en su lugar
                if (marcaGolosina == null) {
                    marcaGolosina = "NULL";
                }

                // Crear una instancia de Golosina con los datos ingresados
                Golosina golosina = new Golosina(nombreGolosina, precioGolosina, tipoGolosina, marcaGolosina, tipoDeGolosina);

                // Mostrar la golosina creada
                JOptionPane.showMessageDialog(null, "Golosina creada:\n" + golosina.toString());

                // Preparar la sentencia SQL para la inserción de la golosina
                String sqlGolosina = "INSERT INTO productos (nombre, precio, marca, stock, contenido, categoria, tipo) VALUES (?, ?, ?, ?, ?, ?, ?)";

                try {
                    // Crear un PreparedStatement
                    PreparedStatement preparedStatementGolosina = conexion.prepareStatement(sqlGolosina);

                    // Establecer los valores de los parámetros para la golosina
                    preparedStatementGolosina.setString(1, golosina.getNombre());
                    preparedStatementGolosina.setDouble(2, golosina.getPrecio());
                    preparedStatementGolosina.setString(3, golosina.getMarca());
                    preparedStatementGolosina.setInt(4, 0); // Inicialmente, el stock es 0
                    preparedStatementGolosina.setString(5, "1u"); // Contenido para golosina
                    preparedStatementGolosina.setString(6, categoria);
                    preparedStatementGolosina.setString(7, tipoGolosina);

                    // Ejecutar la inserción de la golosina
                    int filasAfectadasGolosina = preparedStatementGolosina.executeUpdate();
                    preparedStatementGolosina.close();

                    if (filasAfectadasGolosina > 0) {
                        JOptionPane.showMessageDialog(null, "Golosina insertada con éxito en la base de datos.");
                        return true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al insertar la golosina en la base de datos.");
                        return false;
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                    return false;
                }
            case "Limpieza":
                // Lógica para insertar un producto de limpieza
                String nombreLimpieza = JOptionPane.showInputDialog("Ingrese el nombre del producto de limpieza:");
                double precioLimpieza = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto de limpieza:"));
                String tipoLimpieza = "Productos para el Hogar";
                String marcaLimpieza = JOptionPane.showInputDialog("Ingrese la marca del producto de limpieza:");

                // Verificar si la marca es nula y asignar "NULL" en su lugar
                if (marcaLimpieza == null) {
                    marcaLimpieza = "NULL";
                }

                // Crear una instancia de Limpieza con los datos ingresados
                Limpieza limpieza = new Limpieza(nombreLimpieza, precioLimpieza, tipoLimpieza, marcaLimpieza);

                // Mostrar el producto de limpieza creado
                JOptionPane.showMessageDialog(null, "Producto de limpieza creado:\n" + limpieza.toString());

                // Preparar la sentencia SQL para la inserción del producto de limpieza
                String sqlLimpieza = "INSERT INTO productos (nombre, precio, marca, stock, contenido, categoria, tipo) VALUES (?, ?, ?, ?, ?, ?, ?)";

                try {
                    // Crear un PreparedStatement
                    PreparedStatement preparedStatementLimpieza = conexion.prepareStatement(sqlLimpieza);

                    // Establecer los valores de los parámetros para el producto de limpieza
                    preparedStatementLimpieza.setString(1, limpieza.getNombre());
                    preparedStatementLimpieza.setDouble(2, limpieza.getPrecio());
                    preparedStatementLimpieza.setString(3, limpieza.getMarca());
                    preparedStatementLimpieza.setInt(4, 0); // Inicialmente, el stock es 0
                    preparedStatementLimpieza.setString(5, "1u"); // Contenido para producto de limpieza
                    preparedStatementLimpieza.setString(6, categoria);
                    preparedStatementLimpieza.setString(7, tipoLimpieza);

                    // Ejecutar la inserción del producto de limpieza
                    int filasAfectadasLimpieza = preparedStatementLimpieza.executeUpdate();
                    preparedStatementLimpieza.close();

                    if (filasAfectadasLimpieza > 0) {
                        JOptionPane.showMessageDialog(null, "Producto de limpieza insertado con éxito en la base de datos.");
                        return true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al insertar el producto de limpieza en la base de datos.");
                        return false;
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                    return false;
                }
            
            default:
                System.out.println("Categoría no reconocida");
                return false;
        }
    }
    
    public List<productoGeneral> listarProductos() {
        List<productoGeneral> productos = new ArrayList<>();

        try {
            // Query SQL para seleccionar todos los productos
            String sql = "SELECT * FROM productos";
            PreparedStatement statement = conexion.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            // Iterar a través de los resultados y crear objetos Producto
            while (resultSet.next()) {
                int id = resultSet.getInt("idProducto");
                String nombre = resultSet.getString("nombre");
                double precio = resultSet.getDouble("precio");
                String marca = resultSet.getString("marca");
                int stock = resultSet.getInt("stock");
                String contenido = resultSet.getString("contenido");
                String categoria = resultSet.getString("categoria");
                String tipo = resultSet.getString("tipo");
                
                // Crear un objeto Producto y agregarlo a la lista
                productoGeneral producto = new productoGeneral(id, nombre, precio, marca, stock,contenido,categoria,tipo);
                productos.add(producto);
            }
            
            // Cerrar recursos
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return productos;
    }
}
