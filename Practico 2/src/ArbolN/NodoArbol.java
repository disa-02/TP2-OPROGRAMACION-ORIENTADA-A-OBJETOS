package ArbolN;


public class NodoArbol {
	NodoArbol izq;
	NodoArbol der;
	int valor;
	

	public NodoArbol(int valor) {
		this.valor=valor;
	}
	
	public int getValor() {
		return valor;
	}
	
	public void setIzq(NodoArbol izquierda) {
		izq=izquierda;
	}
	
	public void setDer(NodoArbol derecha) {
		der=derecha;
	}
	
	public NodoArbol getIzq() {
		return izq;
	}
	
	public NodoArbol getDer() {
		return der;
	}
}
	
	
