import java.time.LocalDate;


public class persona {
	//ATRIBUTOS DEL OBJETO
	private int edad;
	private int dni;
	private String sexo;
	private double peso;
	private double altura;
	private String nombre;
	private String apellido;
	private LocalDate fechaDeNacimiento;
	
	//CONSTRUCTORES
		//constructor DNI
	public persona(int dni) {
		this.dni = dni;
		nombre="N"; 
		apellido="N";
		fechaDeNacimiento=LocalDate.of(2000, 1, 1);
		sexo= "femenino";
		peso=1;
		altura=1;
	}
		//constructor dni, nombre, apellido
	public persona(int dni, String nombre, String apellido) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		fechaDeNacimiento=LocalDate.of(2000, 1, 1);
		sexo= "femenino";
		peso=1;
		altura=1;
	}
		//constructor dni, nombre, apellido, fecha de nacimiento
	public persona(int dni, String nombre, String apellido,LocalDate fechaDeNacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
		sexo= "femenino";
		peso=1;
		altura=1;
	}
	
	//RESPONSABILIDADES
	
	//1- Calcular el índice de masa corporal.Una persona sabe calcular su índice de masa corporal
	public double getmasaCorporal(){
		return peso/(altura*altura);
	}
	
	//2-Saber si está en forma
	public boolean estarEnForma(){
		double forma=getmasaCorporal();
		if(forma<25&&forma>18.5){
			return true;
		}
			else{
				
				return false;
			}
	}
		
	//3- Saber si está cumpliendo años
	public boolean cumplirAnios(){
		LocalDate fechaDeHoy=LocalDate.now();
		if((fechaDeHoy.getMonthValue()==fechaDeNacimiento.getMonthValue())&&
				(fechaDeHoy.getDayOfMonth()==fechaDeNacimiento.getDayOfMonth())){
			return true;
		}
		else {
			return false;
		}		
} 
	//4-Saber si es mayor de edad
	public boolean mayorDeEdad(){
		if(edad>=18){
			return true;
		}
		else{
			return false;
		}
	}
	
	//5-Saber si puede votar
	public boolean puedeVotar(){
		if(edad>=16){
			return true;
		}
		else{
			return false;
		}
	}
	
	//6- Saber si es coherente. Que la fecha de nacimiento coincida con la edad
	public boolean coherente(){
		LocalDate fechaHoy= LocalDate.now();//defino y calculo fecha de hoy
		int edadAnios= fechaHoy.getDayOfYear()-fechaDeNacimiento.getDayOfYear();//calculo anños
		if(fechaHoy.getDayOfYear()<fechaDeNacimiento.getDayOfYear()){
			edadAnios--;
		}
		if(edadAnios==edad){
			return true;
		}
		else{
			return false;
		}
	}
	
	//7- Mostrar toda la información del objeto. Es decir devolver un String con la
	//información del mismo.
	
	//*ACLARACIÓN DE SEBAS: ES IMPORTANTE NO PONER System.out.printl EN UN MÉTODO, QUE NO SEA PARTE 
	//DE LA FUNCIONABILIDAD, NO HAGO UN MÉTODO mostrarDatos QUE IMPRIMA POR PANTALLA, HAGO UN MÉTODO 
	//QUE DEVUELVA UN STRING Y EL DE AFUERA QUE SE ENCARGUE DE IMPRIMIR O DE HACER LO QUIERA
	
	public String mostrarDatos(){
		String datos= "La persona "+getNombre()+" "+getApellido()+" tiene "+getEdad()
				+" anios y es de genero: "+getSexo();
		
		return datos;
		}
	
//Métodos set y get de cada parámetro, excepto de DNI
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getDni() {
		return dni;
	}
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	} 
	
	}
