/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_5_super;

/**
 *
 * @author luisin
 */
            //subclase    de     superclase
public class Estudiante extends Persona {

    private int nuControl;
    private String carrera;
//SIEMPRE SE LLAMA A LA SUPER CLASE, DEBE SER LA 1RA INSTRUCCION
    public Estudiante() {
        super();
        this.nuControl = 0;
        this.carrera = "Ninguna";
    }

    public Estudiante(String nombre, String apPaterno, String apMaterno, int edad, char genero, int nuControl, String carrera) {
        super(nombre, apPaterno, apMaterno, edad, genero);
        this.nuControl = nuControl;
        this.carrera = carrera;
    }

    public int getNuControl() {
        return nuControl;
    }

    public void setNuControl(int nuControl) {
        this.nuControl = nuControl;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
public void imprimirDatos(){
    super.imprimirDatos();
    System.out.println("NoControl: "+nuControl);
    System.out.println("Carrera: "+carrera);
}
}
