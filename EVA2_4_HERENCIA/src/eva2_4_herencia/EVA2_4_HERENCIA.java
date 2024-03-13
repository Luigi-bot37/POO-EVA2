/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_4_herencia;

/**
 *
 * @author invitado
 */
public class EVA2_4_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona perso1= new Persona();
        //TODAS LAS CLASES EN JAVA DESCIENDEN DE LA CLASE OBJECT
        System.out.println(perso1.toString());
        //el metodo toString() no es implementado por nosotros, es de herencia generacional
        //----------------------------------------
        Estudiante estu= new Estudiante();
        System.out.println("Nombre: "+estu.getNombre());
        System.out.println("Apellidos: "+estu.getApellido());
        System.out.println("Edad: "+estu.getEdad());
      
    }

}

class Persona {

    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
     this.nombre= "Sin nombres";   
     this.apellido= "Sin apellidos";   
     this.edad= 0;
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

}

class Estudiante extends Persona{
    private int nuControl;

    public Estudiante() {
        this.nuControl= 0;
    }

    public Estudiante(int nuControl) {
        this.nuControl = nuControl;
    }

    public int getNuControl() {
        return nuControl;
    }

    public void setNuControl(int nuControl) {
        this.nuControl = nuControl;
    }
    
    
}