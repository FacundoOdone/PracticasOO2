package ar.edu.unlp.info.oo2.ejercicio_19;

public class BuilderGuerrero implements Builder {

private Personaje personaje;
	
	public void agregarArmadura() {
		personaje.setArmadura(new Acero());
	}
	
	public void agregarArma() {
		personaje.setArma(new Espada());
	}
	
	public void agregarHabilidad() {
		personaje.agregarHabilidad("Combate cuerpo a cuerpo");
	}
	
	public Personaje getResult() {
		return this.personaje;
	}
	
	public BuilderGuerrero() {
		personaje = new Personaje();
	}
	
	public void reset() {
		personaje = new Personaje();
	}
}
