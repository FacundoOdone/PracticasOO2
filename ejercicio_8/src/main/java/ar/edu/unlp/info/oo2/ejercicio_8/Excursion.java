package ar.edu.unlp.info.oo2.ejercicio_8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursion {
	private Estado estado;
	private List<Persona> listaInscriptos;
	private List<Persona> listaEspera;
	private String nombre;
	private LocalDate fechaI;
	private LocalDate fechaF;
	private String puntoDeEncuentro;
	private double costo;
	private int cupoMin;
	private int cupoMax;

	public Excursion(String nombre, LocalDate fechaI, LocalDate fechaF, String puntoDeEncuentro, double costo,
			int cupoMin, int cupoMax) {
		this.estado = new Provisoria();
		this.nombre = nombre;
		this.fechaI = fechaI;
		this.fechaF = fechaF;
		this.costo = costo;
		this.puntoDeEncuentro = puntoDeEncuentro;
		this.cupoMax = cupoMax;
		this.cupoMin = cupoMin;
		this.listaInscriptos = new ArrayList<Persona>();
		this.listaEspera = new ArrayList<Persona>();
	}

	public void agregarPersona(Persona p) {

		if (listaInscriptos.size() < cupoMax) {
			this.listaInscriptos.add(p);
		} else {
			this.listaEspera.add(p);
		}

		cambiarEstado();
	}

	private void cambiarEstado() {
		if (this.cupoMin == this.listaInscriptos.size())
			this.estado = new Definitiva();
		else {
			if (this.cupoMax == this.listaInscriptos.size() && this.listaEspera.size() == 0)
				this.estado = new Completa();
		}
	}

	public String informar() {
		return this.estado.informar(nombre, puntoDeEncuentro, fechaI, fechaF, costo, cupoMin, cupoMax, listaInscriptos);
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public void setListaInscriptos(List<Persona> listaInscriptos) {
		this.listaInscriptos = listaInscriptos;
	}

	public void setListaEspera(List<Persona> listaEspera) {
		this.listaEspera = listaEspera;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setFechaI(LocalDate fechaI) {
		this.fechaI = fechaI;
	}

	public void setFechaF(LocalDate fechaF) {
		this.fechaF = fechaF;
	}

	public void setPuntoDeEncuentro(String puntoDeEncuentro) {
		this.puntoDeEncuentro = puntoDeEncuentro;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public void setCupoMin(int cupoMin) {
		this.cupoMin = cupoMin;
	}

	public void setCupoMax(int cupoMax) {
		this.cupoMax = cupoMax;
	}

}
