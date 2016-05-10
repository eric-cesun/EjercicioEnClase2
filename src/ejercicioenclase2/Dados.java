/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioenclase2;

/**
 *
 * @author kirito205
 */
public class Dados {
    public static String resultado="";
    public Dados(int numero1,int numero2,int numero3){
        if(numero1==6 && numero2==6 && numero3==6)
        {
            resultado="exelente";
        }
        if (numero1==6 && numero2==6 && numero3!=6 || numero1==6 && numero3==6 && numero2!=6 || numero2==6 && numero3==6 && numero1!=6) {
            resultado="muy bien";
        }
        if (numero1==6  && numero2!=6 && numero3!=6 || numero1!=6 && numero2==6 && numero3!=6||numero1!=6 && numero2!=6 && numero3==6) {
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
