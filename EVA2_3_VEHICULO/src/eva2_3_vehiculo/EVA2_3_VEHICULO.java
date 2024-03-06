/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_3_vehiculo;

/**
 *
 * @author LUISIN
 */
public class EVA2_3_VEHICULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo car1= new Vehiculo();
        car1.imprimirDatos();
        Vehiculo car2= new Vehiculo("Nissan", "Tsuru", "Rojo", 98);
        car2.imprimirDatos();
        
    }
    
}
