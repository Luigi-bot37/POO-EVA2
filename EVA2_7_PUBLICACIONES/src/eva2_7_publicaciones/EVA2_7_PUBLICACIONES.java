/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_7_publicaciones;

/**
 *
 * @author LUISIN
 */
public class EVA2_7_PUBLICACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libros libro1= new Libros("Jhon Scatsebach","El Psicoanalista" , 200, 50);
        libro1.imprimirDatos();
        libro1.venderCopias(8);
        libro1.imprimirDatos();
        libro1.ordenarCopias(30);
        libro1.imprimirDatos();
        
    }
    
}
