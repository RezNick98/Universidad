/*
Este programa realiza lo siguiente:
Pide al usuario que ingrese por pantalla su edad,altura,ocupacion y nombre
y luego se imprimen por pantalla
 */
package trabajo_practico_2;
import java.io.*;
public class ejercicio2 {
    public static void main(String[] args) {
        String nombre,ocupacion;
        int edad;
        double altura;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
           System.out.println("Ingrese su nombre");
           nombre = entrada.readLine();
           System.out.println("Ingrese su oucpacion");
           ocupacion = entrada.readLine();
           System.out.println("Ingrese su edad");
           edad = Integer.valueOf(entrada.readLine());
           System.out.println("Ingrese su altura");
           altura = Double.valueOf(entrada.readLine());
           System.out.println("Su nombre es "+nombre);
           System.out.println("Tiene "+edad+" anios");
           System.out.println("Usted mide "+altura);
           System.out.println("Su ocupacion "+ocupacion);
        }catch(Exception exc){
            System.out.println(exc);
        }
    }
    
}
