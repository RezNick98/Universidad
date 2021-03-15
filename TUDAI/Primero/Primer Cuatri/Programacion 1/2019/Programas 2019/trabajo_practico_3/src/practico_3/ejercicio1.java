/*
Este programa realiza lo siguiente:
Escribir un programa que dado 3 numeros reales ingresados por el usuario
divida el primero por el segundo y al resultado se le reste el tercero
 */
package practico_3;
import java.io.*;
public class ejercicio1 {

    public static void main(String[] args) {
        double num1,num2,num3;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            try{
                System.out.println("Ingrese tres numeros reales");
                num1 = Double.valueOf(entrada.readLine());
                num2 = Double.valueOf(entrada.readLine());
                num3 = Double.valueOf(entrada.readLine());
                num1/=num2;
                System.out.println(num1);
                num1-=num3;
                System.out.println(num1);
            }catch(Exception exc){
                System.out.println(exc);
            }
    }
    
}
