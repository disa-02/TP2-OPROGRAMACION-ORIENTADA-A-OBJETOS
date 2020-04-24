package Series;

import java.util.ArrayList;

public class Usuario {
	String nombre;
	ArrayList<Serie> seriesUsuario;
	
	public Usuario(String nombre) {
		this.nombre=nombre;
		seriesUsuario=new ArrayList<Serie>();
	}
	public void addSerie(Serie nuevaSerie) {
		seriesUsuario.add(nuevaSerie);
	}
	public void removeSerie(int posicion) {
		seriesUsuario.remove(posicion);
	}
	public int cantSeries() {
		return seriesUsuario.size();
	}
	public Serie getSerie(int posicion) {
		return seriesUsuario.get(posicion);
	}
	public int cantEpisodiosVistosEnLaSerie() {
		int cont=0;
		for (int i=0;i<seriesUsuario.size();i++)
			cont += seriesUsuario.get(i).cantEpisodiosVistos();
		return cont;
	}
	public int promedioCalificacionesEpisodiosVistos() {
		int cont=0;
		int calificacion=0;
		for (int i=0;i<seriesUsuario.size();i++) {
			calificacion += seriesUsuario.get(i).promedioCalificacionesVistos();
			cont ++;
		}
		return calificacion/cont;
	}
	public Boolean serieTerminada(int posicion) {
		return seriesUsuario.get(posicion).cantEpisodios()==seriesUsuario.get(posicion).cantEpisodiosVistos();
	}	

}
