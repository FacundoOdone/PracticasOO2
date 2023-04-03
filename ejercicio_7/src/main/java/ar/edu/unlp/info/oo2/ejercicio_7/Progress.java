package ar.edu.unlp.info.oo2.ejercicio_7;

import java.time.Duration;
import java.time.Instant;

public class Progress extends Estado{
	public Estado togglePause() {
		return new Paused();
	}
	
	public Estado finish( ) {
		return new Finished();
	}
	
	public Instant setTiempoFin() {
		return Instant.now();
	}
	public Duration workedTime(Instant tiempoComienzo) {
		return Duration.between(tiempoComienzo, Instant.now());
	}
	

}
