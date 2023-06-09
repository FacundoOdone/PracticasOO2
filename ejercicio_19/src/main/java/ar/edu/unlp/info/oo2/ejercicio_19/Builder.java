package ar.edu.unlp.info.oo2.ejercicio_19;

public interface Builder {
	public void reset();
	public void agregarArmadura();
	public void agregarArma();
	public void agregarHabilidad();
	public Personaje getResult();
}
