/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioenclase2;
import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;
/**
 *
 * @author kirito205
 */
public class FormaN {
    public static int numero=0;
    public FormaN(){}
    public FormaN(int numeros){
    numero=numeros;
    }
    public static void forma(){
        int numeroso=numero;
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numeroso; j++) {
                out.print("*");
            }
            out.println();
            numeroso--;
        }
    }
     public static void forma2(){
        int numeroso=1;
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numeroso; j++) {
                out.print("*");
            }
            out.println();
            numeroso++;
        }
     }
        public static void realizar(){
            Scanner leer =new Scanner(in);
                out.println("da el numero");
                int NumeroForma=leer.nextInt();
                FormaN forma=new FormaN(NumeroForma);
                forma();
                forma2();
        }
}
