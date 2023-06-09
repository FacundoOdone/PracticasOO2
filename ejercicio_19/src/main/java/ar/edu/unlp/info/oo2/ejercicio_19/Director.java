package ar.edu.unlp.info.oo2.ejercicio_19;

public class Director {
	private Builder builder;
	
	public Director (Builder builder) {
		this.builder = builder;
	}
	
	public void crear() {
		builder.agregarArma();
		builder.agregarArmadura();
		builder.agregarHabilidad();
	}
	
	public void reset() {
		builder.reset();
	}
}
