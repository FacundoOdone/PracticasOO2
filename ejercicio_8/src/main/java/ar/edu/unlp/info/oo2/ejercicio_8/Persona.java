package ar.edu.unlp.info.oo2.ejercicio_8;

public class Persona {

	private String nombre;
	private String apellido;
	private String email;

	public Persona(String nombre, String apellido, String email) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getEmail() {
		return email;
	}

	/**
	 * Retorna el nombre completo de la persona de la forma apellido, nombre
	 * 
	 * @return
	 */
	public String getNombreCompleto() {
		return this.getApellido() + ", " + this.getNombre();
	}

}
