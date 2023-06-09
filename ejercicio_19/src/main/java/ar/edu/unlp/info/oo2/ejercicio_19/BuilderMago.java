package ar.edu.unlp.info.oo2.ejercicio_19;

public class BuilderMago implements Builder{
	private Personaje personaje;
	
	public void agregarArmadura() {
		personaje.setArmadura(new Cuero());
	}
	
	public void agregarArma() {
		personaje.setArma(new Baston());
	}
	
	public void agregarHabilidad() {
		personaje.agregarHabilidad("Combate a distancia");
		personaje.agregarHabilidad("Curacion");
	}
	
	public Personaje getResult() {
		return this.personaje;
	}
	
	public BuilderMago() {
		personaje = new Personaje();
	}
	
	public void reset() {
		personaje = new Personaje();
	}
}
