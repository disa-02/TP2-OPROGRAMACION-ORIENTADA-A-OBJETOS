package Series;

import java.util.ArrayList;

public class Temporada {
	String nombre;
	ArrayList<Episodio> temporada;
	
	public Temporada(String nombre) {
		this.nombre=nombre;
		temporada=new ArrayList<Episodio>();
	}
	public Episodio getEpisodio(int posicion) {
		return temporada.get(posicion);
	}
	public void addEpisodio(Episodio nuevoEpisodio) {
		temporada.add(nuevoEpisodio);
	}
	public void removeEpisodio(int posicion) {
		temporada.remove(posicion);
	}
	public int cantidadEpisodios() {
		return temporada.size();
	}
	public int cantidadEpisodiosVistos() {
		int cont=0;
		for (int i=0;i<temporada.size();i++)
			if (temporada.get(i).getFlag())
				cont ++;
	    return cont;
	}
	public float calificacionPromedioEpisodiosVistos() {
		int cont=0;
		int calificacion=0;
		for (int i=0;i<temporada.size();i++)
			if (temporada.get(i).getFlag()) {
				calificacion += temporada.get(i).getCalificacion();
				cont++;
			}
		return calificacion/cont;
	}
	

}
