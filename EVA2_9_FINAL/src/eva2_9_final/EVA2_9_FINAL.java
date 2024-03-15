/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_9_final;

/**
 *
 * @author LUISIN
 */
public class EVA2_9_FINAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Computo compu= new Computo("8", "550", "IntelCOre I5", "Lenovo", true, "FLEX5", 6000);
        System.out.println(compu.toString());
    }

}
