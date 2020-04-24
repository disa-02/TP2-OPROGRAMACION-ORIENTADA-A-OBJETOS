package PrimeraParte;

public class Persona {
	String nombre,apellido,fechaNacimiento,sexo;//fecha de nacimiento en formato xx/xx/xxxx
	int edad,dni;
	float peso,altura;
	
	public Persona(int dni) {
		nombre="N";
		apellido="N";
		sexo="mujer";
		fechaNacimiento="01/01/2000";
		edad=20;
		this.dni=dni;
		peso=1;
		altura=1;
		}
	
	public Persona(int dni,String nombre) {
		this.nombre=nombre;
		apellido="N";
		sexo="mujer";
		fechaNacimiento="01/01/2000";
		edad=20;
		this.dni=dni;
		peso=1;
		altura=1;
	}
	public Persona(int dni,String nombre,String apellido) {
		this.nombre=nombre;
		this.apellido=apellido;
		sexo="mujer";
		fechaNacimiento="01/01/2000";
		edad=20;
		this.dni=dni;
		peso=1;
		altura=1;
	}
	public Persona(int dni,String nombre,String apellido,String fechaNacimiento) {
		this.nombre=nombre;
		this.apellido=apellido;
		sexo="mujer";
		this.fechaNacimiento=fechaNacimiento;
		edad=20;
		this.dni=dni;
		peso=1;
		altura=1;
	}
	public Persona(int dni,String nombre,String apellido,String fechaNacimiento,String sexo) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.sexo=sexo;
		this.fechaNacimiento=fechaNacimiento;
		edad=20;
		this.dni=dni;
		peso=1;
		altura=1;
	}
	public Persona(int dni,String nombre,String apellido,String fechaNacimiento,String sexo,int edad) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.sexo=sexo;
		this.fechaNacimiento=fechaNacimiento;
		this.edad=20;
		this.dni=dni;
		peso=1;
		altura=1;
	}
	public Persona(int dni,String nombre,String apellido,String fechaNacimiento,String sexo,int edad,float peso) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.sexo=sexo;
		this.fechaNacimiento=fechaNacimiento;
		this.edad=20;
		this.dni=dni;
		this.peso=peso;
		altura=1;
	}
	public Persona(int dni,String nombre,String apellido,String fechaNacimiento,String sexo,int edad,float peso,float altura) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.sexo=sexo;
		this.fechaNacimiento=fechaNacimiento;
		this.edad=20;
		this.dni=dni;
		this.peso=peso;
		this.altura=altura;
	}
	
	public float getMasaCorporal() {
		return peso/altura;
	}
	
	public Boolean estoyEnForma() {
		float idmc=getMasaCorporal();
		return (idmc>28.5 && idmc<25);
	}
	public Boolean esMiCumpleanos(String fechaActual) {
		String diaMesActual=fechaActual.substring(0,4);
		String diaMesCumple=fechaNacimiento.substring(0, 4);
		return (diaMesActual.equals(diaMesCumple));
	}
	public Boolean soyMaor() {
		return (edad>18);
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setApellido(String apellido) {
		this.apellido=apellido;
	}
	public void setSexo(String sexo) {
		this.sexo=sexo;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento=fechaNacimiento;
	}
	public void setEdad(int edad) {
		this.edad=edad;
	}
	public void sePeso(float peso) {
		this.peso=peso;
	}
	public void setAltura(float altura) {
		this.altura=altura;
	}
	public Boolean puedoVotar() {
		return (edad>16);
	}
	public Boolean esCoherente(String fechaActual) {
		String anoActual=fechaActual.substring(5, 7);
		String anoNacimiento=fechaNacimiento.substring(5, 7);
		return (anoActual.equals(anoNacimiento));
	}
	public String informacion() {
		return "Nombre: "+nombre+" Apellido: "+apellido+" Edad: "+edad+" Fecha de Nacimiento: "+fechaNacimiento+" DNI: "+dni+" Sexo: "+sexo+" Peso: "+peso+"Altura: "+altura;
	}
	
}
