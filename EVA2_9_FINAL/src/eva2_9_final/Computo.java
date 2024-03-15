/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_9_final;

/**
 *
 * @author Luisin
 */
//final termina la herencia
public final class Computo extends Electronica {

    private String ram;
    private String hd;
    private String procesador;

    public Computo() {
        this.ram = "-----";
        this.hd = "-----";
        this.procesador = "-----";
    }

    public Computo(String ram, String hd, String procesador, String marca, boolean garantia, String nombre, double precio) {
        super(marca, garantia, nombre, precio);
        this.ram = ram;
        this.hd = hd;
        this.procesador = procesador;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String toString() {
        String cade = super.toString()+"\n";
        cade += "Ram: " + ram + "\n" + "Hd: " + hd + "\n" + "Procesador: " + procesador;
        return cade;
    }
}
