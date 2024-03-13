/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_6_clases_abstractas;

import static java.lang.Math.sqrt;

/**
 *
 * @author luisin
 */
public class Triangulo extends Figuras {

    private double b;
    private double h;

    public Triangulo() {
        this.b = 0;
        this.h = 0;
    }

    public Triangulo(double b, double h) {
        this.b = b;
        this.h = h;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double calcularArea() {
        return (b * h) / 2;
    }

    @Override
    public double calcularPeri() {
        return b + h + calcularHipo();
    }

    private double calcularHipo() {
        return sqrt((Math.pow(b, 2)) + (Math.pow(h, 2)));
    }
      @Override
    public void imprimirDatos() {
        System.out.println("Triangulo------------------");
        System.out.println("Area: "+ calcularArea()+"u2"); 
        System.out.println("Perimetro: "+calcularPeri()+"u");
    }
    /*A travez de error
     @Override
     public double calcularArea() {
     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }

     @Override
     public double calcularPeri() {
     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }
     */
    /*manual:
     @Override
     public double calcularArea(){
       
     } */
}
