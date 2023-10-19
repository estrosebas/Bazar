/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecas;

/**
 *
 * @author estrosebas
 */
public abstract class ProductosParaElHogar implements Producto {
    protected String nombre;
    protected Double precio;
    protected String tipo;

    public ProductosParaElHogar(String nombre, Double precio, String tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void mostrar(){
        System.out.println("\"ProductosParaElHogar{\" + \"nombre=\" + nombre + \", precio=\" + precio + \", marca=\" + marca + '}'");
    }
    
    
}
