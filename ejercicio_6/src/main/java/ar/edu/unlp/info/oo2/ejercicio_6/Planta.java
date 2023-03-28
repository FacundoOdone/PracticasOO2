package ar.edu.unlp.info.oo2.ejercicio_6;

public class Planta extends Empleado{
	private boolean casado;
	private int hijos;
	private int antiguedad;
	
	public Planta(String nombre, boolean casado, int hijos, int antiguedad) {
		super(nombre);
		this.casado = casado;
		this.hijos = hijos;
		this.antiguedad = antiguedad;
	}
	
	
	public double calcularBasico() {
		return 50000;
	}
	
	public double calcularAdicional() {
		double monto =0;
		if (casado)
			monto+=5000;
		return monto + this.hijos * 2000 + this.antiguedad * 2000; 
	}
	
}


