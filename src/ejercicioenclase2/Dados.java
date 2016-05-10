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
public class Dados {
    public static String resultado="";
    
    public Dados(/*int numero1,int numero2,int numero3*/){
        Random numero1= new Random();
         int numero4=(int)(numero1.nextInt(6)+1);
                Random numero2= new Random();
                int numero5=(int)(numero2.nextInt(6)+1);;
                Random numero3= new Random();
                int numero6=(int)(numero3.nextInt(6)+1);
        if(numero4==6 && numero5==6 && numero6==6)
        {
            resultado="exelente";
        }
        if (numero4==6 && numero5==6 && numero6!=6 || numero4==6 && numero5==6 && numero6!=6 || numero4==6 && numero5==6 && numero6!=6) {
            resultado="muy bien";
        }
        if (numero4==6  && numero5!=6 && numero6!=6 || numero4!=6 && numero5==6 && numero6!=6||numero4!=6 && numero5!=6 && numero6==6) {
            resultado="pesimo";
        }
        else{
            resultado="no salio nada";
        }
    }
    public static String R(){
          return resultado;
    }
}
