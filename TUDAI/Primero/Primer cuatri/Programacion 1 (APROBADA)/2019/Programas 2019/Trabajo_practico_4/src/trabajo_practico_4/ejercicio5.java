/*
Escribir un programa que mientras que el usuario ingrese un
número distinto de 0, pida ingresar otro numero y lo imprima.
 */
package trabajo_practico_4;
import java.io.*;
public class ejercicio5 {
    public static void main(String[] args) {
      int numdistinto,numamostrar;
      BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
      try{
          System.out.println("Ingrese un numero distinto de cero");
          numdistinto = Integer.valueOf(entrada.readLine());
          while ((numdistinto!=0)){
              System.out.println("Escriba el numero que se mostrar por pantalla");
              numamostrar = Integer.valueOf(entrada.readLine());
              System.out.println(numamostrar);
              System.out.println("Vuelva a introducir un numero distinto de cero");
                      
              numdistinto =  Integer.valueOf(entrada.readLine());
          }
      }catch(Exception exc){
          System.out.println(exc);
      }
    }
    
}
