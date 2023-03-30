package ar.edu.unlp.info.oo2.ejercicio_5;

import java.time.LocalDate;
import java.util.Date;

public abstract class ElementoPadre {
	private String nombre;
	private LocalDate fecha;
		
	public ElementoPadre(String nombre, LocalDate fecha) {
		this.nombre = nombre;
		this.fecha = fecha;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public abstract long getTamanio();
	
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public abstract Long tamanioTotalOcupado();
	public abstract Archivo archivoMasGrande();
	public abstract Archivo archivoMasNuevo();
	
}
