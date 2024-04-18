/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_14_vehiculos;

/**
 *
 * @author invitado
 */
public class Automovil extends Vehiculo {

    private int puertas;

    public Automovil() {
        super();
        this.puertas = 0;
    }

    public Automovil(int puertas, int velocidad) {
        super(velocidad);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

}
