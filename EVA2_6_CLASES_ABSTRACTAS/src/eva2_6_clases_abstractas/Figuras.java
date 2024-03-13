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
public abstract class  Figuras {
    //tienen area y perimetro
    //metodo abstracto: sin implementacion (las {})
    public abstract double calcularArea();
    public abstract double calcularPeri();
    public abstract void imprimirDatos();
}
