/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_14_vehiculos;

/**
 *
 * @author lUISIN
 */
public class EVA2_14_VEHICULOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo flota[] = new Vehiculo[5];
        flota[0] = new Automovil(2, 0);
        flota[1] = new Automovil(4, 0);
        flota[2] = new Automovil(2, 0);
        flota[3] = new Motocicleta(134, 0);
        flota[4] = new Motocicleta(432, 0);
        //CASTING: asi recuperamos un auto o moto
        Automovil auto = (Automovil) flota[0];

        System.out.println("Num de puertas del auto: " + auto.getPuertas());

        Motocicleta moto = (Motocicleta) flota[3];
        System.out.println("Capacidad de la moto: " + moto.getCapacidad());

        if (flota[2] instanceof Automovil) {
            auto = (Automovil) flota[2];
            System.out.println("Num de puertas del auto: " + auto.getPuertas());

        }
        acelerar(auto, 19);
        System.out.println("Velocidad del auto: "+auto.getVelocidad());
        acelerar(auto, 50);
        System.out.println("Velocidad del auto: "+auto.getVelocidad());
        acelerar(moto, 30);
        System.out.println("Velocidad de moto: "+moto.getVelocidad());
        acelerar(moto, 70);
        System.out.println("Velocidad de moto: "+moto.getVelocidad());
    }

    public static void acelerar(Vehiculo vehiculo, int ajuste) {
        vehiculo.acelerar(ajuste);
    }

}
