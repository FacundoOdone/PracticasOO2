package ar.edu.unlp.info.oo2.ejercicio_6;

public class Pasante extends Empleado{
	private int examenesRendidos;

	public Pasante(String nombre, int examenesRendidos) {
		super(nombre);
		this.examenesRendidos = examenesRendidos;
	}
	
	public double calcularBasico() {
		return 20000;
	}
	
	public double calcularAdicional() {
		return this.examenesRendidos * 2000;
	}

}
