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
public class NumerosMayores {
    public static int numero=0;
    public static int numeroSumado=0;
    /*public static int[] numero1=new int[5];*/
    public static String resultados="";
    public static int numero1=0;
    public NumerosMayores(){}
    public NumerosMayores(int numeros){
        if (numeros>20) {
            numero1=numeros;
            numeroSumado+=numeros;
            resultados+=""+numero1+"+";
        }
    }
    public static String numeroF(){
        return resultados;
    }
    public static int suma(){
    return numeroSumado;
    }
}
