/*
 * Escribir un programa que solicite los siguientes datos de una persona (nombre,
apellido, edad, altura, ocupación, dirección) y los imprima por pantalla.
 */
package Parte2;
import java.io.*;
public class Ejercicio2 {

	public static void main(String[] args) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		String nombre,apellido,ocupacion,direccion;
		int edad;
		float altura;
		try {
			System.out.println("Ingrese su nombre");
			nombre=String.valueOf(entrada.readLine());
			System.out.println("Ingrese su apellido");
			apellido=String.valueOf(entrada.readLine());
			System.out.println("Ingrese su direccion");
			direccion=String.valueOf(entrada.readLine());
			System.out.println("Ingrese su ocupacion");
			ocupacion=String.valueOf(entrada.readLine());
			System.out.println("Ingrese su edad");
			edad=Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese su altura");
			altura=Float.valueOf(entrada.readLine());
			System.out.println("Usted es "+nombre+apellido+" tiene "+edad+" anios"
			+"su altura es "+altura+" usted vive en "+direccion+" y su ocupacion es "+ocupacion);
			
		}catch(Exception exc) {
			
		}
		
	}

}
