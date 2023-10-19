/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecas;

/**
 *
 * @author estrosebas
 */
public class Alimento extends Consumible{
    private String marca;
    private Double peso;

    public Alimento(String nombre, double precio, String tipo, String marca, Double peso) {
        super(nombre, precio, tipo);
        this.marca = marca;
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public void mostrar() {
        System.out.println("Bebida { "
                + "Nombre: '" + nombre + '\''
                + ", Precio: " + precio
                + ", Tipo: '" + tipo + '\''
                + ", Marca: '" + marca + '\''
                + ", Peso: " + peso
                + " }");
    }

}
