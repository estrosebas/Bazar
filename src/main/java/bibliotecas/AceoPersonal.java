/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecas;

/**
 *
 * @author estrosebas
 */
public class AceoPersonal extends ProductosParaElHogar{
    private String genero;
    private String marca;
    public AceoPersonal(String nombre, Double precio, String tipo,String marca,String genero) {
        super(nombre, precio, tipo);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    public void mostrar(){
         System.out.println("Bebida { "
                + "Nombre: '" + nombre + '\''
                + ", Precio: " + precio
                + ", Tipo: '" + tipo + '\''
                + ", Marca: '" + marca + '\''
                + ", Genero: " + genero
                + " }");
    }
    
}
