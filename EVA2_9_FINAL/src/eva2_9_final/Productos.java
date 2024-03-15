/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_9_final;

/**
 *
 * @author LUISIN
 */
public abstract class Productos {

    private String nombre;
    private double precio;

    public Productos() {
        this.nombre = "-----";
        this.precio = 0;
    }

    public Productos(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        String cade = "Nombre: " + nombre + "\n" + "Precio: " + precio;
        return cade;
    }

}
