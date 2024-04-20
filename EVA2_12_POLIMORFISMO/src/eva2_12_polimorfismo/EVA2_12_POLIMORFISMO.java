/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_12_polimorfismo;

/**
 *
 * @author luisin
 */
public class EVA2_12_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Estudiante estu= new Estudiante("12345678", "Alex", "Gutierrez");
        System.out.println(estu);
          Persona persona = estu;//polimorfismo
        System.out.println(persona.getNombre());
        System.out.println(persona.getApellidos());
    }
    
}
class Persona{
     private String nombre;
    private String apellidos;

    public Persona() {
          this.nombre = "-----";
        this.apellidos = "-----";
    }

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
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
    
    @Override
    public String toString(){
       String cade= nombre + " "+apellidos;
       return cade;
    }
}
class Estudiante extends Persona{
    private String noControl;

    public Estudiante() {
        super();
        this.noControl= "---------";
    }
    public Estudiante(String noControl, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.noControl = noControl;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    
    @Override
   public String toString(){
        String cade= super.toString()+" "+noControl;
        return cade;
    }
}