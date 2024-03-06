/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_2_sobrecarga_constructores;

/**
 *
 * @author Luisin
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
        nombre = "NADA";
        apellido = "En blanco";
        edad = 0;
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
public void imprimirDatos(){
    System.out.println("Nombre: "+ nombre);
    System.out.println("Apellido: "+ apellido);
    System.out.println("Edad: "+ edad);
}
}
