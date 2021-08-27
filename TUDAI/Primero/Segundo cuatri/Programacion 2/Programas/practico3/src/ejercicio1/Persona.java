package ejercicio1;
public class Persona {
	private String nombre;
	private String apellido;
	private String sexo;
	private int edad;
	private String fechaDeNacimiento;
	private int DNI;
	private double peso;
	private double altura;
	
	public Persona() {
		this.DNI = this.getDNI();
		this.nombre = "N";
		this.apellido = "N";
		this.peso=1.0;
		this.fechaDeNacimiento = "1/1/2000";
		this.edad = 1;
		this.sexo="Femenino";
		this.altura= 1.0;
		
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


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}


	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}


	public int getDNI() {
		return DNI;
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

	public static void main(String[] args) {

		Persona persona1 = new Persona( );
		System.out.println("Valores por defecto");
		System.out.println(persona1.getDNI());
		System.out.println(persona1.altura);
		System.out.println(persona1.peso);
		System.out.println(persona1.nombre);
		System.out.println(persona1.apellido);
		System.out.println(persona1.edad);
		System.out.println(persona1.fechaDeNacimiento);
		System.out.println(persona1.sexo);
	}

}
