/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecas;

/**
 *
 * @author estrosebas
 */
public class Golosina extends Consumible {

    private String marca;
    private String tipoGolosina;

    // Constructor que inicializa nombre, precio y marca
    public Golosina(String nombre, double precio, String tipo, String marca, String tipoGolosina) {
        super(nombre, precio, tipo);
        this.marca = marca;
        this.tipoGolosina = tipoGolosina;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoGolosina() {
        return tipoGolosina;
    }

    public void setTipoGolosina(String tipoGolosina) {
        this.tipoGolosina = tipoGolosina;
    }

    public void mostrar() {
        System.out.println("Golosina { "
                + "Nombre: '" + nombre + '\''
                + ", Precio: " + precio
                + ", Tipo: '" + tipo + '\''
                + ", Marca: '" + marca + '\''
                + ", Tipo de Golosina: '" + tipoGolosina + '\''
                + " }");
    }

    @Override

    public String toString() {
        return "Golosina { "
                + "Nombre: '" + nombre + '\''
                + ", Precio: " + precio
                + ", Tipo: '" + tipo + '\''
                + ", Marca: '" + marca + '\''
                + ", Tipo de Golosina: '" + tipoGolosina + '\''
                + " }";
    }
}
