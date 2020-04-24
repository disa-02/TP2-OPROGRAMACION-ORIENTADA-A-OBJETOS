package AgendaPersonal;

import java.util.List;
import java.util.Calendar;


public class Reunion {
	String idReunion;
	Calendar fecha;
	String lugar;
	List<Integrantes> integrantes;
	String tema;
	long duracion;//minutos
	Calendar fechaFin;
	

	public Reunion(String idReunion,Calendar fecha,String lugar,String tema,Calendar fechaFin) {
		this.idReunion=idReunion;
		this.lugar=lugar;
		integrantes=null;
		this.tema=tema;
		this.fecha=fecha;
		this.fechaFin=fechaFin;
		duracion=(fecha.getTimeInMillis()-fechaFin.getTimeInMillis())/60000;
	}
	public String getIdReunion() {
		return idReunion;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public List<Integrantes> getIntegrantes() {
		return integrantes;
	}
	public void addIntegrante(String nombre,String apellido,String mail) {
		Integrantes aux=new Integrantes(nombre, apellido, mail);
		integrantes.add(aux);
	}
	public void removeIntegrate(Integrantes integrante) {//cambiarlo para no usar Integrantes,usar un string
		integrantes.remove(integrante);
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public long getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public Calendar getFecha() {
		return fecha;
	}
	public Calendar getFechaFin() {
		return fechaFin;
	}
	
	
}
