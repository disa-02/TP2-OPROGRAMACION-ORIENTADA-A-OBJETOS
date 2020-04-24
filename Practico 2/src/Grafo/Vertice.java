package Grafo;

import java.util.ArrayList;

public class Vertice {
	String nombre;
	ArrayList<Enlace> vertice;
		
	public Vertice(String nombre) {
		this.nombre=nombre;
		vertice=new ArrayList<Enlace>();
	}
	public Boolean existeArista(String nombre) {
		for (int i=0;i<vertice.size();i++)
			if (nombre.equals(vertice.get(i).getDestino()))
				return true;
		return false;
	}
	public String getNombre() {
		return nombre;
	}
	public void addArista(String agregar,int peso) {
		vertice.add(new Enlace(agregar,peso));
	}
	public void removeArista(int pos) {
		vertice.remove(pos);
	}
	public Enlace getArista(int pos) {
		return vertice.get(pos);
	}
	public int size() {
		return vertice.size();
	}
	public ArrayList<Enlace> devolverEnlaces(){
		ArrayList<Enlace> aux=new ArrayList<Enlace>();
		for (int i=0;i<vertice.size();i++) 
			aux.add(vertice.get(i));
		return aux;		
	}
}
