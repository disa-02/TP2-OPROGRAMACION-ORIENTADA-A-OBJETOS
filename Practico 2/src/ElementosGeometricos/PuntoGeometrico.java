package ElementosGeometricos;

public class PuntoGeometrico {
	double x,y;
	
	public PuntoGeometrico() {
		x=0;
		y=0;
	}
	public PuntoGeometrico(double x,double y) {
		this.x=x;
		this.y=y;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}

	public void desplazar(double x,double y) {
		this.x += x;
		this.y += y;
	}
	public double distanciaEuclidea(PuntoGeometrico punto) {
		return (Math.sqrt(x-punto.getX())+Math.sqrt(y-punto.getY()));
	}
}
