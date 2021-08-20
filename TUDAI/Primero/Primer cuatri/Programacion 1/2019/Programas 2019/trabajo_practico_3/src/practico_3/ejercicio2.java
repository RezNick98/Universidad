/*
Este programa realiaza lo siguiente:
Dado un numero entero, ingresado por el usuario, se imprima el cociente 
de la division con 2 3 y 4
 */
package practico_3;
import java.io.*;
public class ejercicio2 {

    public static void main(String[] args) {
        int dividendo;
        double cociente;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            try{
                dividendo = Integer.valueOf(entrada.readLine());
                cociente = dividendo/2;
                System.out.println(cociente);
                cociente = dividendo/3;
                System.out.println(cociente);
                cociente = dividendo/4;
                System.out.println(cociente);
            }catch(Exception exc){
                System.out.println(exc);
            }
    }
    
}
