/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecas;

/**
 *
 * @author estrosebas
 */
public class Limpieza extends ProductosParaElHogar{
    private String marca;

    public Limpieza(String nombre, Double precio, String tipo,String marca) {
        super(nombre, precio, tipo);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void marca(){
        System.out.println("Bebida { "
                + "Nombre: '" + nombre + '\''
                + ", Precio: " + precio
                + ", Tipo: '" + tipo + '\''
                + ", Marca: '" + marca
                + " }");
    }
}
