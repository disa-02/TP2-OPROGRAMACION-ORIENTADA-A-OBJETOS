package AgendaPersonal;

import java.util.List;
import java.util.Calendar;

public class AgendaPersonal {
	String dueno;
	List<Reunion> agenda;
	
	public AgendaPersonal(String dueno) {
		this.dueno=dueno;
	}
	public Boolean fechaOcupada(Calendar fecha) {
		Boolean encontrado=false;
		for (int i=0;i<agenda.size() && encontrado==false;i++) 
			if ((agenda.get(i).getFecha().compareTo(fecha)>=0 && agenda.get(i).getFechaFin().compareTo(fecha)<0))
				return true;
		return false;
	}
	int posReunion(String idReunion) {
		for (int i=0;i<agenda.size();i++) 
			if (agenda.get(i).getIdReunion()==idReunion)
				return i;
		return -1;
	}
	public Boolean addReunion(String idReunion,Calendar fecha,String lugar,String tema,Calendar fechaFin) {
		if (!fechaOcupada(fecha) && !fechaOcupada(fechaFin)) {
			agenda.add(new Reunion(idReunion,fecha,lugar,tema,fechaFin));
			return true;
		}
		return false;
	}
	public void removeReunion(String idReunion) {
		int pos=posReunion(idReunion);
		if (pos>=0) {
		}
	}
	public void addIntegrante(String idReunion,String nombre,String apellido,String mail) {
		int pos=posReunion(idReunion);
		if (pos>=0) {
			agenda.get(pos).addIntegrante(nombre, apellido, mail);
			}
	}
	public void removeIntegrante(String idReunion,Integrantes integrante) {//cambiarlo para no usar Integrantes,usar un string
		int pos=posReunion(idReunion);
		if (pos>=0) {
			agenda.get(pos).removeIntegrate(integrante);
		}
	}
	//Agegar mas funciones,listar reuniones de un dia,devolver una reunion(por id,por fecha),listar reuniones donde hay un participante en especifico
	
	
}
