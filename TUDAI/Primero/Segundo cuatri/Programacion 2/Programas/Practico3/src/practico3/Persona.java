/*
1 1 Persona
Implementar una clase llamada Persona con las siguientes características:
Atributos: nombre, edad, fecha de nacimiento, DNI, sexo, peso y altura
Valores por defecto:
● El DNI es un valor obligatorio, no posee valor por defecto.
● En caso de la fecha de nacimiento será el 1 de enero de 2000.
● Sexo será Femenino por defecto.
● El nombre por defecto es N y el apellido es N.
● El peso y la altura son 1 por defecto.
Acorde a lo anterior se deben crear los constructores. Con DNI, con DNI nombre y
apellido, con DNI nombre apellido y Fecha de nacimiento.....
La responsabilidad de la clase es la siguiente:
● Cálculo del índice de masa Corporal. Una persona sabe calcular cuál es su índice
de masa corporal el cual es peso / altura 2
● Saber si está en forma. Está en forma si el índice de masa corporal se encuentra
entre 18,5 y 25 (esto es solo un ejemplo para probar la funcionalidad).
● Saber si está cumpliendo años.
● Saber si es mayor de edad. Una persona es mayor de edad si es mayor de 18
años
● Métodos set de cada parámetro, excepto de DNI.
● Saber si puede votar. Es necesario ser mayor de 16 años.
● Saber si es coherente. Que la fecha de nacimiento coincida con la edad.
● Mostrar toda la información del objeto. Es decir devolver un String con la
información del mismo.
 */
package practico3;

import java.time.LocalDate;
public class Persona {
    private int DNI;
    private int Edad;
    private String Nombre;
    private String Apellido;
    private LocalDate FechaDeNcaimiento;
    private double Peso;
    private double Altura;
    private String Sexo;
    public Persona(int DNI){ //Constructor sin ningun dato mas que el dni.
        this.DNI=DNI;
        Edad= 1;
        LocalDate FechaDeNacimiento = LocalDate.of(2000, 1, 1);
        Nombre="N";
        Apellido="N";
        Sexo="Femenino";
        Peso=1;
        Altura=1;
    }
    
    
    
    
    
    
    public Persona(int DNI,String Nombre,String Apellido){
        this.DNI=DNI;
        this.Nombre=Nombre;
        this.Apellido=Apellido;
        Edad=1;
        LocalDate FechaDeNacimiento=LocalDate.of(2000, 1, 1);
        Sexo="Femenino";
        Peso=1;
        Altura=1;
    }
    
    
    
    
    
    public Persona(int DNI,String Nombre,String Apellido,LocalDate FechaDeNacimiento){
        this.DNI=DNI;
        this.FechaDeNcaimiento=LocalDate.now();
        this.Nombre=Nombre;
        this.Apellido=Apellido;
        Edad=1;
        Peso=1;
        Sexo="Femenino";
        Altura=1;
    }
    
    
    
    
    
    
    
    //Metodos para obtener datos
    public int getDNI(){
       return DNI; 
    }
    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String nombre){
        this.Nombre=nombre;
    }
    public void setFechaDeNacimiento(LocalDate FechaDeNacimiento){
       this.FechaDeNcaimiento.getMonthValue();
       this.FechaDeNcaimiento.getDayOfWeek();
       this.FechaDeNcaimiento.getYear();
    }
    public String getApellido(){
        return Apellido;
    }
    public void setApellido(String apellido){
        this.Apellido=apellido;
    }
    public int getPeso(){
        return (int) Peso;
    }
    public void setPeso(int peso){
        this.Peso=peso;
    }
    public int Altura(){
        return (int) Altura;
    }
    public void steAltura(int altura){
        this.Altura=altura;
    }
    public double getMasa(){
        return Peso/(Altura*Altura);
    }
    
    
    //Responsabilidad de la clase
    public boolean CumplirAnios(){
        int mes=this.FechaDeNcaimiento.getMonthValue();
        int dia=this.FechaDeNcaimiento.getDayOfMonth();
        LocalDate diahoy=LocalDate.now();
        if((diahoy.getMonthValue()==mes)&& (diahoy.getDayOfMonth()==dia)){
            return true;
        }else{
            return false;
        }
    }
    public boolean MayorEdad(){
        if(Edad>=18){
            return true;
        }else{
            return false;
        }
    }
    public boolean EstaEnForma(){
        double forma=getMasa();
        if ((forma<18.5) && (forma<25)){
            return true;
    }else{
            return false;
        }
    }
    public boolean PuedeVotar(){
        if(Edad>=16){
            return true;
        }else{
            return false;
        }
    }
    
}

