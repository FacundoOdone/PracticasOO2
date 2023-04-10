package ar.edu.unlp.info.oo2.ejercicio_8;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Definitiva extends Estado {

	public String informar(String nombre, String puntoDeEncuentro, LocalDate fechaI, LocalDate fechaF, double costo,
			int cupoMin, int cupoMax, List<Persona> listaInscriptos) {

		return "Excursion: " + nombre + " Costo: " + costo + " Fecha Inicio: " + String.valueOf(fechaI) + " Fecha Fin: "
				+ String.valueOf(fechaF) + " Punto de encuentro: " + puntoDeEncuentro + mailsInscriptos(listaInscriptos)
				+ " Cantidad de usuarios faltantes: " + (cupoMin - listaInscriptos.size());

	}

	private String mailsInscriptos(List<Persona> inscriptos) {

		return " Mails de inscriptos: "
				+ inscriptos.stream().map(p -> p.getEmail() + " ").collect(Collectors.joining(","));

	}
}
