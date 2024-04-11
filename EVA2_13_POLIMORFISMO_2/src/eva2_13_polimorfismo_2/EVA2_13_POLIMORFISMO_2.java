/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_13_polimorfismo_2;

/**
 *
 * @author luisin
 */
public class EVA2_13_POLIMORFISMO_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso1= new Persona("Luigi", "Bros");
        Persona perso2= new Persona("Uzi", "Doorman");
        Estudiante estu1= new Estudiante("345456", "Mario", "Bros");
        Estudiante estu2= new Estudiante("678932", "Henry", "Emily");
        
        perso1.imprimirDatos();
        perso2.imprimirDatos();
        estu1.imprimirDatos();
        estu2.imprimirDatos();
    }
    
}
