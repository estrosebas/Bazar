
# Bazar Project

## Descripción
Este proyecto parece ser una aplicación de gestión de productos para un bazar. La aplicación tiene funcionalidades para agregar, listar y gestionar diferentes tipos de productos.

## Clases Principales

1. **Producto**: Interfaz que contiene un método llamado `mostrar()`.
2. **Consumible**: Clase abstracta que implementa la interfaz `Producto`. Representa productos que son consumibles.
3. **ProductosParaElHogar**: Clase abstracta que implementa la interfaz `Producto`. Representa productos para el hogar.
4. **AceoPersonal, Alimento, Bebida, Golosina, Limpieza**: Clases que representan diferentes tipos de productos. Todos tienen atributos como nombre, precio, tipo, y otros específicos según el tipo de producto.
5. **productoGeneral**: Clase que representa un producto general con varios atributos como `idProducto`, `nombre`, `precio`, entre otros.
6. **generalDAO**: Clase DAO que interactúa con una base de datos para gestionar productos.
7. **Bazar**: Punto de entrada del programa que inicializa la interfaz gráfica.
8. **Bazargrafica, insertarproducto, listar**: Clases que representan diferentes ventanas o formularios de la interfaz gráfica de usuario (GUI) del programa.

## Notas
- Algunos métodos y lógicas están comentados en los archivos, lo que sugiere que el desarrollo puede estar en progreso o en revisión.
- Las clases GUI (como `Bazargrafica`, `insertarproducto`, `listar`) parecen haber sido generadas utilizando un editor de formularios, por lo que es posible que haya código adicional que no se haya revisado en detalle.

## Autor
El proyecto fue creado por `estrosebas`.

## Licencia
Ver el archivo de licencia en el proyecto para más detalles.
