package ar.edu.unlp.info.oo2.ejercicio_7;

public class Pending extends Estado{
	
	
	public Estado start(Estado estado) {
		return new Progress();
	}
	
	public Estado togglePause() {
		throw new RuntimeException("La tarea esta en estado pendiente");
	}
}
