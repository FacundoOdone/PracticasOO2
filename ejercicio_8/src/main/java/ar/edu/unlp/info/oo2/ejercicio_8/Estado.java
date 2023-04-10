package ar.edu.unlp.info.oo2.ejercicio_8;

import java.time.LocalDate;
import java.util.List;

public abstract class Estado {

	public abstract String informar(String nombre, String puntoDeEncuentro, LocalDate fechaI, LocalDate fechaF,
			double costo, int cupoMin, int cupoMax, List<Persona> listaInscriptos);
}
