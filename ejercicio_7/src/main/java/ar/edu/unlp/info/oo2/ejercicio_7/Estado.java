package ar.edu.unlp.info.oo2.ejercicio_7;

import java.time.Duration;
import java.time.Instant;

public abstract class Estado {
	private Instant tiempoComienzo;
	
	public Estado start() {
		return this;
	}

	public Estado finish() {
		return this;
	}
	
	public Estado getEstado() {
		return this;
	}

	public abstract Estado togglePause();
	
	public abstract Duration workedTime(Instant tiempoComienzo);
	
	public String comentar(String comment) {
		return comment;
	}

	public Instant getTiempoComienzo() {
		return tiempoComienzo;
	}

	public Instant setTiempoComienzo() {
		throw new RuntimeException ("Estado Incorrecto");
	}
	
	public Instant setTiempoFin() {
		throw new RuntimeException("Estado Incorrecto");
	}
	

	
	
}
