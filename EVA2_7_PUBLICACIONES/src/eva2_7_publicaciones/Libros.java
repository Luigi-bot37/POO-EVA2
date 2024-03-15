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
public class Libros extends Publicaciones {

    private String autores;

    public Libros(String autores) {
        super();
        this.autores = "Sin registro";
    }

    public Libros(String autores, String titulo, double precio, int copias) {
        super(titulo, precio, copias);
        this.autores = autores;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    
    @Override
    public void venderCopias(int cant) {
        super.venderCopias(cant); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCopias(int copias) {
        super.setCopias(copias); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getCopias() {
        return super.getCopias(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPrecio(double precio) {
        super.setPrecio(precio); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPrecio() {
        return super.getPrecio(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTitulo(String titulo) {
        super.setTitulo(titulo); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTitulo() {
        return super.getTitulo(); //To change body of generated methods, choose Tools | Templates.
    }

    public void ordenarCopias(int cant) {
        //recuperar extistencias
        int existencias = getCopias();
        setCopias(existencias + cant);
    }
    @Override
    public void imprimirDatos(){
       super.imprimirDatos();
        System.out.println("Autor: "+autores);
    }
}
