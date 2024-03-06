/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_1_sobrecarga_metodos;

/**
 *
 * @author LUISIN
 */
public class EVA2_1_SOBRECARGA_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("1 + 2 = "+ sumar(1, 2));
        System.out.println("1.7 + 2.3 = "+sumar(1.7, 2.3));
        System.out.println(sumar("hola", " mundo"));
        System.out.println(sumar( ));
        System.out.println("buenas");
        System.out.println(10);
        System.out.println(false);
    }
    //firma: nombre de metodo y tipos de datos de argumentos
    public static int sumar( int num1, int num2){
        return num1+num2;
    }
    public static double sumar( double num1, double num2){
        return num1+num2;
    }
    public static String sumar( String num1, String num2){
        return num1+num2;
    }
    public static String sumar( ){
        return "suma no hace nada";
    }
}
