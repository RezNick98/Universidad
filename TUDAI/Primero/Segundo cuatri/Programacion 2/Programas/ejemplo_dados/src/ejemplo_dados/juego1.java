package ejemplo_dados;

public class juego1 {
	private int puntosJugador1;
	private int puntosJugador2;
	private int minimoPuntos = 7;
	public juego1() { //constructor
		this.puntosJugador1 = 0;
		this.puntosJugador2 = 0;
	}
	private int tirarDados() {
		return (int)( Math.random()*6)+1;
	}
	public String ganador() {
		if (puntosJugador1>puntosJugador2) {
			return "Jugador1:";
		}else {
			if(puntosJugador2>puntosJugador1) {
				return "Jugador2";
			}
		}
		return null;
	}
	public String jugar() {
		int puntos1 = 0;
		int puntos2 = 0;
		for (int i=1;i<10;i++) {
			puntos1 = this.tirarDados()+this.tirarDados();		
			puntos2 = this.tirarDados()+this.tirarDados();	
		}
		if((puntos1>minimoPuntos)&&(puntos1>puntos2)){
			puntosJugador1++;
		}else {
			if((puntos2>minimoPuntos)&&(puntos2>puntos1)) {
				puntosJugador2++;
			}
		}
		return this.ganador();
	}
}
