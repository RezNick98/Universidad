
public class Avion {
  
	private String nombre;
	private int modelo;
	private String color;
	private int capacidad;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nn) {
	  if ((nn != null) && (! nn.equals("Drop")))	
		  nombre = nn;
	}

	public int getModelo() {
	
	  	
		return modelo;
	}



	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
  
	/*public Avion() {
		this.capacidad = 10;
		color = "negro";
		modelo = 1980;
		nombre = "Airbus";
	}
	*/
	
	public Avion(int capacidad) {
		color = "negro";
		modelo = 1980;
		nombre = "Airbus";
        this.capacidad = capacidad;
		
	}
	
	public Avion(int modelo, String color) {
      
        this.modelo  =  modelo;
		setColor(color);
	}
	
	public Avion(int modelo, int cap) {
  
        this.modelo  =  modelo;
		
	}

	public Avion(String nombre, int modelo, String color, int capacidad) {
		this.nombre = nombre;
		this.modelo = modelo;
		this.color = color;
		this.capacidad = capacidad;
	}
	
	
	
	
}
