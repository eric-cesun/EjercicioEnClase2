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
                Random numero1= new Random();
                int numero4=(int)(numero1.nextInt(6)+1);
                Random numero2= new Random();
                int numero5=(int)(numero2.nextInt(6)+1);;
                Random numero3= new Random();
                int numero6=(int)(numero3.nextInt(6)+1);
                Dados x= new Dados(numero4,numero5,numero6);
                out.println(x.R());
                break;
            case 2:
                int s=0;
                int par=0;
                while(par!=5){
                    out.println("dame numeros");
                    int numero=leer.nextInt();
                    if(numero%2==0)
                    {
                    par++;
                    }
                    NumerosMayores y =new NumerosMayores(numero);                 
                }
                NumerosMayores y =new NumerosMayores();
                out.println(y.numeroF());
                out.println(y.suma());
                break;
            case 3:
                MultiplicacionAleatoria numerosos= new MultiplicacionAleatoria();
                out.println(numerosos.multiplicacion());
               for (int i = 0; i < 5; i++) {
                out.println("da el numero");
                int resultado=leer.nextInt();
                numerosos= new MultiplicacionAleatoria(resultado);
                boolean n=numerosos.resultadosT();
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
                break;
            case 4:
                out.println("da el numero");
                int NumeroForma=leer.nextInt();
                FormaN forma=new FormaN(NumeroForma);
                forma.forma();
                forma.forma2();
                break;
            case 5:
                Adivinansa adivina=new Adivinansa();
                while(!adivina.adivinaste()){
                out.println("da el numero");
                int Estoes=leer.nextInt();
                out.println(adivina.advina(Estoes));
                }
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
