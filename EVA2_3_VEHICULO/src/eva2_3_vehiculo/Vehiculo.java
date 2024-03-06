/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_vehiculo;

/**
 *
 * @author LUISIN
 */
public class Vehiculo {

    private String marca;
    private String modelo;
    private String color;
    private int year;

    public Vehiculo() {
        marca = "Sin registrar";
        modelo = "Sin registrar";
        color = "Sin registrar";
        year = 0;
    }

    public Vehiculo(String marca, String modelo, String color, int year) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.year = year;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void imprimirDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Anio: " + year);
    }
}
