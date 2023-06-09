package ar.edu.unlp.info.oo2.ejercicio_19;

public class BuilderArquero implements Builder{

private Personaje personaje;
	
	public void agregarArmadura() {
		personaje.setArmadura(new Cuero());
	}
	
	public void agregarArma() {
		personaje.setArma(new Arco());
	}
	
	public void agregarHabilidad() {
		personaje.agregarHabilidad("Combate a distancia");
	}
	
	public Personaje getResult() {
		return this.personaje;
	}
	
	public BuilderArquero() {
		personaje = new Personaje();
	}
	
	public void reset() {
		personaje = new Personaje();
	}
}
