package EJ3;

public class Rectangulo {
	
	private String name;
	private PuntoGeometrico punto1;
	private PuntoGeometrico punto2;
	
	public Rectangulo () {
		name = "rectangulo1";
		punto1 = new PuntoGeometrico("punto1");
		punto2 = new PuntoGeometrico("punto2", 2, 2);
	}
	public Rectangulo (String name) {
		this.name = name;
		punto1 = new PuntoGeometrico("punto1");
		punto2 = new PuntoGeometrico("punto2", 2, 2);
	}
	
	public Rectangulo (String name, int X1, int Y1, int X2, int Y2) {
		this.name = name;
		punto1 = new PuntoGeometrico("punto1", X1, Y1);
		punto2 = new PuntoGeometrico("punto2", X2, Y2);
	}
	
	public String getName() {
		return name;
	}
	public void trasladarRectangulo(int valor) {
		this.punto1.desplazarPunto(valor, valor);
		this.punto2.desplazarPunto(valor, valor);
	}
	
	public double calcularArea() {
		return (Math.abs(this.punto1.getX() - this.punto2.getX()) * Math.abs(this.punto1.getY() - this.punto2.getY()));
	}
	
	public int compararRectangulo(Rectangulo rectanguloComp) {
		if (this.calcularArea() > rectanguloComp.calcularArea()) {
			return 1;
		}
		else if (this.calcularArea() < rectanguloComp.calcularArea()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	public boolean determinarSiEsCuadrado() {
		if (Math.abs(this.punto1.getX() - this.punto2.getX()) == Math.abs(this.punto1.getY() - this.punto2.getY())) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int determinarLargoLadoSuperior() {
		if (Math.abs(this.punto1.getX() - this.punto2.getX()) > Math.abs(this.punto1.getY() - this.punto2.getY())) {
			return Math.abs(this.punto1.getX() - this.punto2.getX());
		}
		else {
			return Math.abs(this.punto1.getY() - this.punto2.getY());
		}
	}
	
	public String determinarPosicion() {
		if (Math.abs(this.punto1.getX() - this.punto2.getX()) > Math.abs(this.punto1.getY() - this.punto2.getY())) {
			return "Acostado";
		}
		else if (Math.abs(this.punto1.getX() - this.punto2.getX()) < Math.abs(this.punto1.getY() - this.punto2.getY())) {
			return "Parado";
		}
		else {
			return "Cuadrado";
		}
	}
	
	public static void main (String [] Args) {
		Rectangulo rectangulo1 = new Rectangulo("rectangulo1");
		Rectangulo rectangulo2 = new Rectangulo("rectangulo2", 1, 1, 6, 4);
		
		System.out.println("El area del "+rectangulo1.getName()+" es: "+rectangulo1.calcularArea());
		System.out.println("El area del "+rectangulo2.getName()+" es: "+rectangulo2.calcularArea());
		System.out.println("El "+rectangulo1.getName()+" esta: "+rectangulo1.determinarPosicion());
		System.out.println("El "+rectangulo2.getName()+" esta: "+rectangulo2.determinarPosicion());
		System.out.println("El largo del lado superior de "+rectangulo2.getName()+
				" es de: "+rectangulo2.determinarLargoLadoSuperior());
		System.out.println("El "+rectangulo1.getName()+" es cuadrado? "+rectangulo1.determinarSiEsCuadrado());
		System.out.println("El "+rectangulo2.getName()+" es cuadrado? "+rectangulo2.determinarSiEsCuadrado());
		System.out.println("Comparar Rectangulo: "+rectangulo1.compararRectangulo(rectangulo2));
	}
}
