package ar.edu.unlp.info.oo2.ejercicio_4;

public abstract class Topografia {
	
	public abstract double getProporcionAgua();
	public abstract double getProporcionTierra();
	
	public boolean igualA(Topografia topo) {
		return ((this.getProporcionAgua() == topo.getProporcionAgua()) 
				&& (this.getProporcionTierra() == topo.getProporcionTierra()));
	}
	
	
}
