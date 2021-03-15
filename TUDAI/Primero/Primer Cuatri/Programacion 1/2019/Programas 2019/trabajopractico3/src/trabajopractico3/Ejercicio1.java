/*
Escribir un programa completo (declaración de constantes y variable, carga de datos,
procesamiento e impresión de resultados) para cada caso o ítem que:
• solicite un número e indique si es positivo o negativo.
• solicite un número e imprima “grande” si es mayor a 100 y
“chico “ si es menor.
• solicite un número del 1 al 7 e imprima el día de la semana.
• solicite una letra e imprima si es vocal o consonante.
• solicite 3 números e imprima “creciente” si los tres números están en orden
creciente, “decreciente” si están en orden decreciente o “error” si no cumplen
ningún orden.
 */
package trabajopractico3;
import java.io.*;
public class Ejercicio1 {
public static final int MAXVALOR=100;
    public static void main(String[] args) {
        int numero;
        int dia;
        char letra;
        int num1,num2,num3;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Ingrese un numero");
            numero = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese un dia de la semana");
            dia = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese una letra");
            letra = entrada.readLine().charAt(0);
            System.out.println("Ingrese 3 numeros para saber si es creciente o decreciente");
            num1 = Integer.valueOf(entrada.readLine());
            num2 = Integer.valueOf(entrada.readLine());
            num3 = Integer.valueOf(entrada.readLine());
            if((numero>0) && (numero>MAXVALOR)){
                System.out.println("El numero es positivo y mayor a 100");
                
            }else if((numero>0) && (numero<MAXVALOR)){
                System.out.println("El numero es positivo y es menor a 100");
            }else{
                System.out.println("El numero es negativo");
            }
            switch (dia) {
                case 1:
                    System.out.println("Es lunes");
                    break;
                case 2:
                    System.out.println("Es martes");
                    break;
                case 3:
                    System.out.println("Es miercoles");
                    break;
                case 4:
                    System.out.println("Es jueves");
                    break;
                case 5:
                    System.out.println("Es viernes");
                    break;
                case 6:
                    System.out.println("Es sabado");
                    break;
                case 7:
                    System.out.println("Es domingo");
                    break;
                default:
                    break;
            }
            switch(letra){
                case 'a': case 'e': case 'i': case 'o': case'u':
                    System.out.println("Es vocal");
                    break;
                default:
                    System.out.println("Es consonante");
            }
            if((num1<num2) && (num2<num3)){
                System.out.println("El orden es creciente");
                
            }else if((num1>num2) && (num2>num3)){
                System.out.println("El orden es decreciente");
            }else{
                System.out.println("eror");
            }
            
        }catch(Exception exc){
            System.out.println(exc);
        }
    }
    
}
