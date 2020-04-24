package Series;

import java.util.ArrayList;

public class Serie {
	String nombre,descripcion,creador,genero;
	ArrayList<Temporada> serie;
	
	public Serie(String nombre,String descripcion,String creador,String genero) {
		this.nombre=nombre;
		this.descripcion=descripcion;
		this.creador=creador;
		this.genero=genero;
		serie=new ArrayList<Temporada>();
	}

	
	
	public Temporada getTemporada(int posicion) {
		return serie.get(posicion);
	}
	public void addTemporada(Temporada nuevaTemporada) {
		serie.add(nuevaTemporada);
	}
	public void removeTemporada(int posicion) {
		serie.remove(posicion);
	}
	public int cantEpisodios() {
		int cont=0;
		for (int i=0;i<serie.size();i++)
			cont +=serie.get(i).cantidadEpisodios();
		return cont;
	}
	public int cantEpisodiosVistos() {
		int cont=0;
		for (int i=0;i<serie.size();i++)
			cont +=serie.get(i).cantidadEpisodiosVistos();
		return cont;
	}
	public int promedioCalificacionesVistos() {
		int cont=0;
		int calificacion=0;
		for (int i=0;i<serie.size();i++)
			calificacion +=serie.get(i).calificacionPromedioEpisodiosVistos();
			cont++;
		return calificacion/cont;
		
	}
	
	
	
}
