package PrimeraParte;

public class Electrodomesticos {
	String nombre,color;
	float precioBase,consumoEnergetico,peso;// consumo en Kw,precio en pesos,peso en kg
	
	public Electrodomesticos() {
		nombre=null;
		color="Gris plata";
		consumoEnergetico=10;
		precioBase=100;
		peso=2;
	}
	public Electrodomesticos(String nombre) {
		this.nombre=nombre;
		color="Gris plata";
		consumoEnergetico=10;
		precioBase=100;
		peso=2;
	}
	public Electrodomesticos(String nombre,String color) {
		this.nombre=nombre;
		this.color=color;
		consumoEnergetico=10;
		precioBase=100;
		peso=2;
	}
	public Electrodomesticos(String nombre,String color,float consumoEnergetico) {
		this.nombre=nombre;
		this.color=color;
		this.consumoEnergetico=consumoEnergetico;
		precioBase=100;
		peso=2;
	}
	public Electrodomesticos(String nombre,String color,float consumoEnergetico,float precioBase) {
		this.nombre=nombre;
		this.color=color;
		this.consumoEnergetico=consumoEnergetico;
		this.precioBase=precioBase;
		peso=2;
	}
	public Electrodomesticos(String nombre,String color,float consumoEnergetico,float precioBase,float peso) {
		this.nombre=nombre;
		this.color=color;
		this.consumoEnergetico=consumoEnergetico;
		this.precioBase=precioBase;
		this.peso=peso;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void setConsumoEnergetico(float consumoEnergetico) {
		this.consumoEnergetico=consumoEnergetico;
	}
	public void setPrecioBase(float precioBase) {
		this.precioBase=precioBase;
	}
	public void setPeso(float peso) {
		this.peso=peso;
	}
	public String getNombre() {
		return nombre;
	}
	public String getColor() {
		return color;
	}
	public float getConsumoEnergetico() {
		return consumoEnergetico;
	}
	public float getPrecioBase( ) {
		return precioBase;
	}
	public float getPeso() {
		return peso;
	}
	public Boolean esBajoConsumo() {
		return (consumoEnergetico<45);
	}
	public float balance(float costo) {
		return (costo/peso);
	}
	public Boolean esAltaGama(float costo) {
		return (balance(costo)>3);
	}

	
	

}
