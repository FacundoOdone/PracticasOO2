package ar.edu.unlp.info.oo2.ejercicio_7;

public class Finished extends Estado {
	
	
	public Estado togglePause() {
		throw new RuntimeException("La tarea esta en estado Finalizada");
	}

}
