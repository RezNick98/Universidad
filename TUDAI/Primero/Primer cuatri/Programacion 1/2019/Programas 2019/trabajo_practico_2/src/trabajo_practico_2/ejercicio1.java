/*
 Estwe programa realiza lo siguiente:
Permitir que se ingrese 5 numerosde uno por vez y luego
se muestre eb orden inverso
 */
package trabajo_practico_2;
import java.io.*;
public class ejercicio1 {
    public static void main(String[] args) {
        int num1,num2,num3,num4,num5;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Ingrese los numeros uno por uno");
            num1 = Integer.valueOf(entrada.readLine());
            num2 = Integer.valueOf(entrada.readLine());
            num3 = Integer.valueOf(entrada.readLine());
            num4 = Integer.valueOf(entrada.readLine());
            num5 = Integer.valueOf(entrada.readLine());
            System.out.println("Este es elo orden inverso con el que ingreso sus numeros");
            System.out.println(num5);
            System.out.println(num4);
            System.out.println(num3);
            System.out.println(num2);
            System.out.println(num1);
        }catch(Exception exc){
            System.out.println(exc);
        }
    }
    
}
