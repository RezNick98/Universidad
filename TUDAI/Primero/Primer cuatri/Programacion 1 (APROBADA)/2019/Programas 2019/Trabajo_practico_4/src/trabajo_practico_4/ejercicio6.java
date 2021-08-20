/*
Escribir un programa que mientras que el usuario ingrese un
número distinto de 0, pida ingresar otros dos números e imprima
el resultado de la multiplicación entre los dos últimos números
ingresados.
 */
package trabajo_practico_4;
import java.io.*;
public class ejercicio6 {

    public static void main(String[] args) {
        int numdistinto,num1,num2,resultado;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Ingrese un numero distinto de cero"); 
            numdistinto = Integer.valueOf(entrada.readLine());
            do{
                System.out.println("Ingrese dos numero enteros");
                num1 = Integer.valueOf(entrada.readLine());
                num2 = Integer.valueOf(entrada.readLine());
                System.out.println("Ingrese un numero distinto de cero");
                numdistinto = Integer.valueOf(entrada.readLine());
            }while ((numdistinto!=0));
            resultado = num1*num2;
            System.out.println("Este es el resultado de los dos ultimos digitos: "+resultado);
            
        }catch(Exception exc){
            System.out.println(exc);
        }
    }
    
}
