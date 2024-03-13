/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_6_clases_abstractas;

/**
 *
 * @author Luisin
 */
public class EVA2_6_CLASES_ABSTRACTAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo sir=new Circulo(5);
        Triangulo tri= new Triangulo(5, 4);
        Rectangulo rec= new Rectangulo(10, 2);
        sir.imprimirDatos();
        tri.imprimirDatos();
        rec.imprimirDatos();
   }
    
}
