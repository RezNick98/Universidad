/*
Este programa realiza lo siguiente:
Pide al usuario el ingreso de 2 numeros enteros y se fija si:
-El primer numero ingresado es mayor al segundo
-SI ambos son multiplos de 2
 */
package practico_3;
import java.io.*;
public class ejercicio3 {
    public static void main(String[] args) {
        int num1,num2;
        int resto;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Ingrese dos numeros enteros");
            num1 = Integer.valueOf(entrada.readLine());
            num2 = Integer.valueOf(entrada.readLine());
            if ((num1>num2)) {
                System.out.println("El numero 1 es mayor que el numero 2");
            }else{
                System.out.println("El numero 2 es mayor que el 1");
            }
            if((num1%2==0) && (num2%2==0)){
                System.out.println("Los numeros son multiplo de 2");
            }else{
                System.out.println("Alguno de los dos numeros no es multiplo de 2");
            }
            
        }catch(Exception exc){
            System.out.println(exc);
        }
    }
    
}
