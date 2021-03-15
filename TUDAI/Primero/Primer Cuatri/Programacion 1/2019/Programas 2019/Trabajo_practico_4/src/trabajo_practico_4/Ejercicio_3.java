/*
Escribir un programa que solicite el ingreso de un número mayor
a 50, y los muestre por pantalla en caso de ser múltiplo de 2 o 3.
 */
package trabajo_practico_4;
import java.io.*;
public class Ejercicio_3 {

    public static void main(String[] args) {
        int num;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Escriba un numero mayor a 50");
            num = Integer.valueOf(entrada.readLine());
            do{
                if ((num<50)){
                    System.out.println("Error escriba un  numero mayor a 50");
                }else if((num%2==0) && (num%3==0)){
                    System.out.println("Este numero es multiplo de 2 y 3: "+num);
                }
                num = Integer.valueOf(entrada.readLine());
            }while ((num>=0));
            
            
        }catch(Exception exc){
            System.out.println(exc);
        }
    }
    
}
