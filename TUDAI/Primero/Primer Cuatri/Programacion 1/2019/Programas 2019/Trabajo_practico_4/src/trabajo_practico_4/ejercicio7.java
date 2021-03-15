/*
Construir un programa que solicite desde teclado un número de
mes válido y posteriormente notifique por pantalla la cantidad de
días de ese mes. En el caso de que ingrese 2 como número de
mes (febrero) deberá además solicitar ingresar un número de
anio entre 2000 y 2019 inclusive, y dependiendo de si es bisiesto
o no imprimir la cantidad de días correspondiente.
 */
package trabajo_practico_4;
import java.io.*;
public class ejercicio7 {
public static final int MINANIO=2000;
public static final int MAXANIO=2019;
    public static void main(String[] args) {
        int mes,anio;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Ingrese el anuio(entre 2000 y 2019 inclusive)");
            anio = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese el mes");
            mes = Integer.valueOf(entrada.readLine());
            while((anio>=2000) && (anio<=2019)){
                switch(mes){
                    case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                        System.out.println("El mes tiene 31 dias");
                        break;
                    case 4:case 6:case 9:case 11:
                        System.out.println("Este mes tiene 30 ");
                        break;
                    case 2:
                        if((anio%4==0) && (anio%100!=0) || (anio%400==0)){
                            System.out.println("El anio es bisiesto tiene 29 dias");
                        }else{
                            System.out.println("El anio no es bisiesto tiene 28 dias");
                        }
                        break;
                }
                System.out.println("Ingrese un nuevo aniuo(entre 2000 y 2019 inclusive");
                anio = Integer.valueOf(entrada.readLine());
                System.out.println("Ingrese un mes");
                mes = Integer.valueOf(entrada.readLine());
            }
        }catch(Exception exc){
            System.out.println(exc);
        }
        
    }
    
}
