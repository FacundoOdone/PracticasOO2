package ar.edu.unlp.info.oo2.ejercicio_6;

public abstract class Empleado {
	
	private String nombre;
	
	
	public Empleado(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public double calcularSueldo() {
		return ((this.calcularBasico() + this.calcularAdicional()) - ((this.calcularBasico() * 0.13) + (this.calcularAdicional() * 0.05)));
	}
	
	
	public abstract double calcularBasico();
	public abstract double calcularAdicional();
	
}
