package Series;

public class Episodio {
	String nombre,descripcion;
	Boolean flag;
	int calificacion;
	
	public Episodio(String nombre,String descripcion) {
		this.nombre=nombre;
		this.descripcion=descripcion;
		flag=false;
		calificacion=-1;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public Boolean getFlag() {
		return flag;
	}
	public int getCalificacion() {
		return calificacion;
	}
	public void visto() {
		flag=true;
	}
	public void setCalificacion(int calificacion) {
		if (calificacion>=1 && calificacion<=6)
			this.calificacion=calificacion;
		else
			System.out.println("Valor no valido para calificar");
	}
	
}
