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
public class EVA2_10_INTERFACES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiantes estu = new Estudiantes("12345", "Antonio", "Salazar", 50);
        estu.imprimirDatos();
        System.out.println(estu.generarNomCompleto());
        System.out.println(estu.generarAnnio());
    }

}
