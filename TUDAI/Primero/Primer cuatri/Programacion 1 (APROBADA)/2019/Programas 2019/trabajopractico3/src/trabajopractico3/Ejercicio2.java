/*
Construir un programa que solicite desde teclado un número de mes y
posteriormente notifique por pantalla la cantidad de días de ese mes. En el caso de
que ingrese 2 como número de mes (febrero) deberá además solicitar ingresar un
número de anio (no usar ñ), y dependiendo de si es bisiesto o no con la siguiente
sentencia
Si ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) es verdadero es bisiesto
imprimir la cantidad de días correspondiente.
 */
package trabajopractico3;
import java.io.*;

public class Ejercicio2 {

    public static void main(String[] args) {
        int mes,anio;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Ingrese un mes");
            mes = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese un anio");
            anio = Integer.valueOf(entrada.readLine());
            switch(mes){
                case 1: case 3: case 5: case 7:case 8:case 10:case 12:
                    System.out.println("Este mes tiene 31 dias");
                    break;
                case 4:case 6:case 9:case 11:
                    System.out.println("Este mes tiene 30 dias");
                    break;
                case 2:
                    if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){
                        System.out.println("Febrero en este anio tiene 29 dias");
                    }else{
                        System.out.println("Febrero en este anio tiene 28 dias");
                    }
                    break;
            }
        }catch(Exception exc){
            System.out.println(exc);
        }
    }
    
}
