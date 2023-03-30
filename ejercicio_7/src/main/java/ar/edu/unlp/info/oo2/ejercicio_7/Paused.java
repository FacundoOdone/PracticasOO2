package ar.edu.unlp.info.oo2.ejercicio_7;

public class Paused extends Estado{
	public Estado togglePause() {
		return new Progress();
	}
	
	public Estado finish(Estado estado) {
		return new Finished();
	}
	

}
