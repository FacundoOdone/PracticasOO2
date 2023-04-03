package ar.edu.unlp.info.oo2.ejercicio_7;

import java.time.Duration;
import java.time.Instant;

public class Pending extends Estado{
	
	
	public Estado start(Estado estado) {
		super.setTiempoComienzo();
		return new Progress();
	}
	
	public Estado togglePause() {
		throw new RuntimeException("La tarea esta en estado pendiente");
	}
	
	public Instant setTiempoComienzo() {
		return Instant.now();
	}
	
	public Duration workedTime(Instant tiempoComienzo) {
		throw new RuntimeException("La tarea no se inicio");
	}
}
