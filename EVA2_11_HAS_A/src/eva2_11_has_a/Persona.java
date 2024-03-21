/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_11_has_a;

/**
 *
 * @author Luisin
 */
public class Persona {

    private String nombre;
    private String apellidos;
    private int edad;
    private Direccion direc; //atributo que es un objeto

    public Persona() {
         this.nombre = "-----";
        this.apellidos ="------";
        this.edad = 0;
        this.direc = null;
    }

    public Persona(String nombre, String apellidos, int edad, Direccion direc) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.direc = direc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDirec() {
        return direc;
    }

    public void setDirec(Direccion direc) {
        this.direc = direc;
    }

    @Override
    public String toString() {
        String cade = "Nombre: " + nombre +"\n"+ "Apellidos: "+ apellidos + "\n"
                + "Edad: " + edad + "\n" + "Direccion: " + direc.toString();
        return cade;
    }

}
