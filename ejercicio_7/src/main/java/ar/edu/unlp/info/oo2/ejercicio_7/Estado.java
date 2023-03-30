package ar.edu.unlp.info.oo2.ejercicio_7;

public abstract class Estado {
	public Estado start() {
		return this;
	}

	public Estado finish() {
		return this;
	}

	public abstract Estado togglePause();

}
