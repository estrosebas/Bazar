/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecas;

/**
 *
 * @author estrosebas
 */
public class Bebida extends Consumible{
    private String marca;
    private double litros;
    private String tipoBebida;
    public Bebida(String nombre, double precio, String tipo, String marca, double litros, String tipoBebida) {
        super(nombre, precio, tipo);
        this.marca = marca;
        this.litros = litros;
        this.tipoBebida = tipoBebida;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public String getTipoBebida() {
        return tipoBebida;
    }

    public void setTipoBebida(String tipoBebida) {
        this.tipoBebida = tipoBebida;
    }

    @Override
    public void mostrar() {
        System.out.println("Bebida { "
                + "Nombre: '" + nombre + '\''
                + ", Precio: " + precio
                + ", Tipo: '" + tipo + '\''
                + ", Marca: '" + marca + '\''
                + ", Litros: " + litros + '\''
                + ", Tipo Bebida: " + tipoBebida
                + " }");
    }

    @Override
    public String toString() {
        return "Bebida { "
                + "Nombre: '" + nombre + '\''
                + ", Precio: " + precio
                + ", Tipo: '" + tipo + '\''
                + ", Marca: '" + marca + '\''
                + ", Litros: " + litros + '\''
                + ", Tipo Bebida: " + tipoBebida
                + " }";
    }
}
