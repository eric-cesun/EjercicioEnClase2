/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioenclase2;

import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kirito205
 */
public class MultiplicacionAleatoria {
    public static Random numero= new Random();
    public static Random numero2= new Random();
    public static int Numero = (int)(numero.nextInt(10)+1);
    public static int Numero2=(int)(numero2.nextInt(10)+1);
    public static boolean n=false;
    public static String resultados="";
    public MultiplicacionAleatoria(){}
    public MultiplicacionAleatoria(int numeros){
    int resultado=Numero*Numero2;
    resultados=""+resultado;
        if (resultado==numeros) {
            n=true;
        }
    }
    public static boolean resultadosT()
    {
        return n;
    }
    public static String multiplicacion(){
        return ""+Numero+"*"+Numero2;
    }
    public static void Realizar(){
          Scanner leer =new Scanner(in);
         out.println(multiplicacion());
        for (int i = 0; i < 5; i++) {
                out.println("da el numero");
                int resultado=leer.nextInt();
               MultiplicacionAleatoria numerosos= new MultiplicacionAleatoria(resultado);
                resultadosT();
                    if (n) {
                        out.println("asertaste");
                        break;
                    }
                    if (i==4) {
                       out.println(" no asertaste");
                   }
                    else{
                        out.println("no es");
                    }
                }
    }
}
