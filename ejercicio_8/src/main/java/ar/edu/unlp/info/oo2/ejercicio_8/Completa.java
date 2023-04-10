package ar.edu.unlp.info.oo2.ejercicio_8;

import java.time.LocalDate;
import java.util.List;

public class Completa extends Estado {

	public String informar(String nombre, String puntoDeEncuentro, LocalDate fechaI, LocalDate fechaF, double costo,
			int cupoMin, int cupoMax, List<Persona> listaInscriptos) {

		return "Excursion: " + nombre + " Costo: " + costo + " Fecha Inicio: " + String.valueOf(fechaI) + " Fecha Fin: "
				+ String.valueOf(fechaF) + " Punto de encuentro: " + puntoDeEncuentro;

	}
}
