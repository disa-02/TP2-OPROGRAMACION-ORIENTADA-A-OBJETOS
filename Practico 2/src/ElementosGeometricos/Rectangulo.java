package ElementosGeometricos;

public class Rectangulo {
	PuntoGeometrico verticeSupIzq,verticeSupDer,verticeInfIzq,verticeInfDer;
	//los lados deben estar paralelos a los ejes
	
	public Rectangulo(double x,double x1,double y,double y1) {
		verticeSupIzq= new PuntoGeometrico(x,y1);
		verticeSupDer= new PuntoGeometrico(x1,y1);
		verticeInfIzq= new PuntoGeometrico(x,y);
		verticeInfDer= new PuntoGeometrico(x1,y);
	}
	
	public void desplazar(double x,double y) {
		verticeSupIzq.desplazar(x, y);
		verticeSupDer.desplazar(x, y);
		verticeInfIzq.desplazar(x, y);
		verticeInfDer.desplazar(x, y);
	}
	public double getBase() {
		if (verticeInfIzq.getX()<verticeInfDer.getX())
			return verticeInfDer.getX()-verticeInfIzq.getX();
		else
			return (verticeInfIzq.getX()-verticeInfDer.getX())*(-1);
	}
	public double getAltura() {
		if (verticeInfIzq.getY()<verticeSupIzq.getY())
			return verticeSupIzq.getY()-verticeInfIzq.getY();
		else
			return (verticeSupIzq.getY()-verticeInfIzq.getY())*(-1);
	}
	public double getArea() {	
		return (getBase()*getAltura());
	}
	public int equal(Rectangulo rectangulo) {
		if (getArea()>rectangulo.getArea())
			return 1;
		else if(getArea()==rectangulo.getArea())
			return 0;
		else 
			return -1;	
	}
	public void invertir(PuntoGeometrico punto) {
		//if (punto != verticeSupIzq && punto !=verticeSupDer && punto!=verticeInfIzq && punto!=verticeInfDer)
			//vertice no valido
			//Alta paja
	}
	public Boolean esCuadrado() {
		return getBase()==getAltura();
	}
	public int posicion() {
		if (!esCuadrado())
			if (getBase()>getAltura())
				return 1;//acostado
			else
				return 0;//parado
		else
			return -1;
	}
	
}

