/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_15_clases_anonimas;

/**
 *
 * @author LUISIN
 */
public class EVA2_15_CLASES_ANONIMAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //no se pueden crear objetos de interfaces
        //manejo de eventos en la interfaz grafica llamados Listeners
        //Listeners son interfaces
        Prueba prueba= new Prueba() {

            @Override
            public void mostrarMensaje() {
                System.out.println("Hola mundo :>");
            }
        };
        prueba.mostrarMensaje();
        
        ClaseAbstracta prueba2= new ClaseAbstracta() {

            @Override
            public void mensaje() {
                System.out.println("Otro mensaje abstracto"); 
            }
        };
        
        prueba2.mensaje();
        prueba2.otroMensaje();
    }
    
}
 interface Prueba{
     public void mostrarMensaje();
 }

abstract class ClaseAbstracta{
    public abstract void mensaje();
    public void otroMensaje(){
        System.out.println("Hola mundo abstracto!!");
    }
}