/*
Hacer un programa que inicialice y luego cargue un arreglo (sin
orden) de tamaño MAX=10 con números enteros ingresados por
teclado. Finalmente imprima el arreglo por pantalla.
 */
package practico6;
import java.io.*;
public class Ejercicio1 {
    public static final int MINARREGLO=1;
public static final int MAXARREGLO=10;
    public static void main(String[] args) {
        int [] arr;
        int i=MINARREGLO;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            arr = new int[MAXARREGLO];
            System.out.println("Cargue el arreglo");
            for(;i<MAXARREGLO;i++){
                arr[i]= Integer.valueOf(entrada.readLine());
            }
            for(;i<MAXARREGLO;i++){
                System.out.println(arr[i]);
            }
        }catch(Exception exc){
            System.out.println(exc);
        }
    }
}
