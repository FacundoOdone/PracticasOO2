package ar.edu.unlp.info.oo2.ejercicio_7;

public class Progress extends Estado{
	public Estado togglePause() {
		return new Paused();
	}
	
	public Estado finish( ) {
		return new Finished();
	}

}
