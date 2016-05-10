/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioenclase2;
import static java.lang.System.out;
/**
 *
 * @author kirito205
 */
public class Calculos {
    public static int precio=6000;
    public static double mes=.15;
    public static double total=0;
    public Calculos(){
        int n=0;
        while(precio<55000) {
            n++;
           precio+=precio*.15;
        }
        out.println(n+" = "+precio);
    }
}
