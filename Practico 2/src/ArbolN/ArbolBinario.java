package ArbolN;

public class ArbolBinario {
	NodoArbol raiz;
	
	public ArbolBinario(int valor) {
		raiz=new NodoArbol(valor);
	}
	public ArbolBinario(NodoArbol raiz) {
		this.raiz=raiz;
	}
		
	private void addNodo(NodoArbol arbol,int valor) {
		if (arbol==null) {
			raiz=new NodoArbol(valor);
		}
		else if(arbol.getValor()<valor)
			addNodo(arbol.getDer(),valor);
		else
			addNodo(arbol.getIzq(),valor);
	}
	
	public void agregarNodo(int valor) {
		addNodo(raiz,valor);
	}
	
	private Boolean isNodo(NodoArbol arbol,int valor) {
		if (arbol!=null) 
			if (arbol.getValor()==valor)
				return true;
			else
				if(arbol.getValor()<valor)
					isNodo(arbol.getDer(),valor);
				else
					isNodo(arbol.getIzq(),valor);
		return false;
	}
	public Boolean existeNodo(int valor) {
		return isNodo(raiz,valor);
	}
}
