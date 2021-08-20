/*
Escribir un programa que dado un valor ingresado por el usuario
menor que 10 y mayor a 1, muestre por pantalla una cuenta
regresiva de números desde dicho valor hasta el 0 inclusive.
 */
package trabajo_practico_4;
import java.io.*;
public class Ejercicio_2 {
    public static void main(String[] args) {
        int num;
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
        try{
            System.out.println("Ingrese un numero mayor que 1 y menor que 10");
            num = Integer.valueOf(entrada.readLine());
            while(num!=0){
                if((num<10)){
                num--;
                System.out.println(num);
                }else{
                    System.out.println("Error ingrese un numero menor que 10 y mayor que 1");
                    num = Integer.valueOf(entrada.readLine());
                }
            }
        }catch(Exception exc){
            System.out.println(exc);
        }
    }
    
}
