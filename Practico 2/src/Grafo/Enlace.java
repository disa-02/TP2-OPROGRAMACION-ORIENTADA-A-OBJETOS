package Grafo;

public class Enlace {
	String destino;
	int peso;
	
	public Enlace(String destino) {
		this.destino=destino;
		peso=1;
	}
	public Enlace(String destino,int peso) {
		this.destino=destino;
		this.peso=peso;
	}
	public String getDestino() {
		return destino;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso=peso;
	}

}
