/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_8_protected;

import Packetaxo.Persona;

/**
 *
 * @author invitado
 */
public class Estudiante extends Persona{
    private String nuControl;

    public Estudiante() {
        super();
        this.nuControl= "0";
    }

    public Estudiante(String nuControl, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.nuControl = nuControl;
    }

    public String getNuControl() {
        return nuControl;
    }

    public void setNuControl(String nuControl) {
        this.nuControl = nuControl;
    }
   public void imprimirDatos(){
            System.out.println("Nombre: "+ nombre);
            System.out.println("Apellidos: "+ apellido);
            System.out.println("Edad: "+ edad);
            System.out.println("No. COntrol: "+ nuControl);
   } 
}
