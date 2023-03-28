package ar.edu.unlp.info.oo2.ejercicio_6;

public class Temporario extends Empleado{
	private int horas;
	private boolean casado;
	private int hijos;
	
	public Temporario(String nombre,int horas, boolean casado, int hijos) {
		super(nombre);
		this.horas = horas;
		this.casado = casado;
		this.hijos = hijos;
	}
	
	public double calcularBasico() {
		return 20000 + this.horas * 300;
	}
	
	public double calcularAdicional() {
		double monto = 0;
		if (casado)
			monto+=5000;
		return monto + this.hijos * 2000;
	}
	
	
	
	
}
