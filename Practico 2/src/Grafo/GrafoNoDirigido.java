package Grafo;

import java.util.ArrayList;

public class GrafoNoDirigido extends Grafo {
	
	
	public GrafoNoDirigido() {
		grafo=new ArrayList<Vertice>();
	}
	public void agregarArco(String origen,String destino,int peso1,int peso2) {
		grafo.get(getPosVertice(origen)).addArista(destino, peso1);
		grafo.get(getPosVertice(destino)).addArista(origen, peso2);
		
		
	}
	@Override
	public void agregarArco(String origen,String destino,int peso) {//no permite diferentes pesos 
		grafo.get(getPosVertice(origen)).addArista(destino, peso);
		grafo.get(getPosVertice(destino)).addArista(origen, peso);
	}
	
	@Override
	public void eliminarArco(String origen,String destino) {
		grafo.get(getPosVertice(origen)).removeArista(getPosVertice(destino));
		grafo.get(getPosVertice(destino)).removeArista(getPosVertice(origen));
	}
}
