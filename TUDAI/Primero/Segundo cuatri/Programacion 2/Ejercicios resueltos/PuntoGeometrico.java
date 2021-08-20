package EJ3;

public class PuntoGeometrico {

	private int X;
	private int Y;
	private String name;
	
	public PuntoGeometrico() {
		X = 0;
		Y = 0;
	}
	
	public PuntoGeometrico(String name) {
		this.name = name;
		X = 0;
		Y = 0;
	}
	
	public PuntoGeometrico(String name, int X, int Y) {
		this.name = name;
		this.X = X;
		this.Y = Y;
	}
	
	public void desplazarPunto (int X, int Y) {
		this.X = this.X + X;
		this.Y = this.Y + Y;
	}
	
	public int getX () {
		return X;
	}
	public int getY () {
		return Y;
	}
	public void setX (int X) {
		this.X = X;
	}
	public void setY (int Y) {
		this.Y = Y;
	}
	public String getName() {
		return name;
	}
	
	public static double calcularDistanciaEuclidea(PuntoGeometrico punto1, PuntoGeometrico punto2) {
		
		return Math.sqrt((punto1.getX()-punto2.getX())*(punto1.getX()-punto2.getX())+
				(punto1.getY()-punto2.getY())*(punto1.getY()-punto2.getY()));
	}
	
	public static void main (String [] Args) {
		PuntoGeometrico punto1 = new PuntoGeometrico("punto1");
		PuntoGeometrico punto2 = new PuntoGeometrico("punto2");
		
		// punto1.desplazarPunto(3, 4);
		System.out.println("X: "+punto1.getX()+" 	Y: "+punto1.getY());
		// punto1.desplazarPunto(4, 3);
		
		punto2.desplazarPunto(2, 2);

		
		System.out.println("La distancia euclidea entre "+punto1.getName()+" y "+punto2.getName()+" es: "+
		calcularDistanciaEuclidea(punto1, punto2));
	}
}
