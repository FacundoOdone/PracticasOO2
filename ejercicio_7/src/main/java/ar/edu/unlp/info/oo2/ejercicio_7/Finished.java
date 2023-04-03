package ar.edu.unlp.info.oo2.ejercicio_7;

import java.time.Duration;
import java.time.Instant;

public class Finished extends Estado {
	
	private Duration tiempoFin;
	
	public Finished() {
		tiempoFin = Duration.between(getTiempoComienzo(), Instant.now());
	}
	
	public Estado togglePause() {
		throw new RuntimeException("La tarea esta en estado Finalizada");
	}
	
	public Duration workedTime() {
		return tiempoFin;
	}
	
	public Duration workedTime(Instant tiempoComienzo) {
		return null;
	}

	
	public String comentar() {
		throw new RuntimeException("No se pudo comentar");
	}
}
