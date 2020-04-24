package Grafo;

import java.util.ArrayList;
import java.util.Queue;





public class Grafo {
	ArrayList<Vertice> grafo;
	private Queue<Integer> fila;
	
	public Grafo() {
		grafo=new ArrayList<Vertice>();
	}
	public int getPosVertice(String nombre) {
		for (int i=0;i<grafo.size();i++)
			if (nombre.equals(grafo.get(i).getNombre()))
				return i;
		return -1;
	}
	public void agregarVertice(String nombre) {
		Vertice agregar=new Vertice(nombre);
		grafo.add(agregar);
	}
	public void eliminarVertice(String nombre) {
		grafo.remove(getPosVertice(nombre));
	}
	public Boolean existeVertice(String vertice) {
		for (int i=0;i<grafo.size();i++)
			if (vertice.equals(grafo.get(i).getNombre()))
				return true;
		return false;
	}
	public void agregarArco(String origen,String destino,int peso) {
		grafo.get(getPosVertice(origen)).addArista(destino, peso);;
	}
	public void eliminarArco(String origen,String destino) {
		grafo.get(getPosVertice(origen)).removeArista(getPosVertice(destino));
	}
	public Boolean existeArco(String origen,String destino) {
		int posOrigen=getPosVertice(origen);
		return grafo.get(posOrigen).existeArista(destino);		
	}
	
	
	private void DFS(int u,Boolean visitado[]){
	    visitado[u]=true;
	    //Accion a ejectuar con la busqueda(como puede ser mostrar en pantalla)
	    ArrayList<Enlace> adyacentes= grafo.get(u).devolverEnlaces();
	    for(int i=0;i <adyacentes.size();i++){
	    	int pos=getPosVertice(adyacentes.get(i).getDestino());
	        if (!visitado[pos])
	            DFS(pos,visitado);
	    }
	}

	public void BosqueDFS(){
	    int n=grafo.size();
	    Boolean visitado[]=new Boolean[n];
	    for(int i=0;i<n;i++)
	        visitado[i]=false;
	    for(int i=0;i<grafo.size();i++){
	        if (!visitado[i])
	            DFS(i,visitado);
	    }
	}

	

	private void BFS(int x,Boolean visitado[]){
	    visitado[x]=true;
	    fila = null;
	    fila.add(x);
	    while (!fila.isEmpty()){
	        int u=fila.element();
	        //Accion a ejectuar con la busqueda(como puede ser mostrar en pantalla)
	        ArrayList<Enlace> adyacentes= grafo.get(u).devolverEnlaces();
	        for(int i = 0; i != adyacentes.size();i++){
	        	int posAdyacente=getPosVertice(adyacentes.get(i).getDestino());
	            if (!visitado[posAdyacente]){
	                visitado[posAdyacente]=true;
	                fila.add(posAdyacente);
	            }
	        }
	        fila.remove();
	    }
	}


	void BosqueBFS(){
		int n=grafo.size();
		Boolean visitado[]=new Boolean[n];
		for(int i=0;i<n;i++)
	        visitado[i]=false;
	    for(int i=0;i<grafo.size();i++){
	        if (!visitado[i])
	            BFS(i,visitado);
	    }
	}
}
