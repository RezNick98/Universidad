/*
Escribir un programa donde el usuario ingrese un número entre 0
y 999, y muestre un mensaje de cuántos dígitos tiene. Además, si
tiene 3 dígitos debe informar qué número es.
 */
package trabajo_practico_4;
import java.io.*;
public class ejercicio4 {
public static final int MAXVALOR=999;
    public static void main(String[] args) {
        int num;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Ingrese un numero entre 0 y 999");
            num = Integer.valueOf(entrada.readLine());
            while((num>=0) && (num<=999)){
                if ((num<=9)){
                    System.out.println("El numero tiene un solo digito");
                }else if((num>=10) && (num<=99)){
                    System.out.println("El numero tiene 2 digitos");
                }else {
                    System.out.println("El numero tiene 3 digitos y es el numero: "+num);
                }
                num = Integer.valueOf(entrada.readLine());
            }
            
        }catch(Exception exc){
            System.out.println(exc);
        }
    }
    
}
