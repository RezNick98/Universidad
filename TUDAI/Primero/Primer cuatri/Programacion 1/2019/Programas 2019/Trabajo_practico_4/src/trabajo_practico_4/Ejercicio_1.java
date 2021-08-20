/*
Escribir un programa que dado un número natural ingresado por
el usuario imprima la tabla de multiplicar de ese número.
 */
package trabajo_practico_4;
import java.io.*;
public class Ejercicio_1 {
public static final int MAX=10;

    public static void main(String[] args) {
        int numero,resultado;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Ingrese un numero");
            numero = Integer.valueOf(entrada.readLine());
            for(int i=1;i<=MAX;i++){
                resultado=numero*i;
                System.out.println(resultado);
            }
            
        }catch(Exception exc){
            System.out.println(exc);
        }
    }
    
}
