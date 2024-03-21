/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_10_interfaces;

/**
 *
 * @author Luisin
 */
public class Estudiantes extends Persona implements Datos, GenerarAnnio {

    private String numControl;

    public Estudiantes() {
        super();
        this.numControl = "-------";
    }

    public Estudiantes(String numControl, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.numControl = numControl;
    }

    public String getNumControl() {
        return numControl;
    }

    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
    }

    @Override
    public String generarNomCompleto() {
        return getNombre() + " " + getApellido();
    }

    @Override
    public int generarAnnio() {
        return 2024 - getEdad();
    }

}
