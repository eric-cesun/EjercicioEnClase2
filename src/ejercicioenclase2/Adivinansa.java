/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioenclase2;

import static java.lang.System.in;
import java.util.Random;
import static java.lang.System.out;
import java.util.Scanner;
/**
 *
 * @author kirito205
 */
public class Adivinansa {
    public static int numero=0;
    public static Random numero2= new Random();
    public static int Numero2=(int)(numero2.nextInt(20)+1);
    public static boolean F=false;
    public static String advina(int numeros){
        String n="";
        if (numeros<Numero2) {
            n="es mayor";
        }
        if (numeros>Numero2) {
            n="es menor";
        }
        if (numeros==Numero2) {
            n="le atinaste";
            F=true;
        }
    return n;
    }
    public static boolean adivinaste(){
    return F;
    }
    public static void jugar(){
        Scanner leer =new Scanner(in);
        Adivinansa adivina=new Adivinansa();
        while(!adivina.adivinaste()){
                out.println("da el numero");
                int Estoes=leer.nextInt();
                out.println(adivina.advina(Estoes));
                }
    }
}
