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
public class EjercicioEnClase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer =new Scanner(in);
        out.println("Elije el programa");
        int opcion=leer.nextInt();
        switch(opcion){
            case 1: 
                Dados x= new Dados();
                out.println(x.R());
                break;
            case 2:
                NumerosMayores y =new NumerosMayores();
                y.realisar();
                out.println(y.numeroF());
                out.println(y.suma());
                break;
            case 3:
                MultiplicacionAleatoria numerosos= new MultiplicacionAleatoria();
                numerosos.Realizar();
                break;
            case 4:
                FormaN forma=new FormaN();
                forma.realizar();
                break;
            case 5:
                Adivinansa adivina=new Adivinansa();
                adivina.jugar();
                break;  
            case 6:
                Calculos calculo=new Calculos();
                break;
            default:
                out.println("no es opcion");
                break;
        }
    }
    
}
