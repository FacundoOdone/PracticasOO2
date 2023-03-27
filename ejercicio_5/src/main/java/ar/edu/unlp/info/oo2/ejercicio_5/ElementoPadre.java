package ar.edu.unlp.info.oo2.ejercicio_5;

import java.time.LocalDate;
import java.util.Date;

public abstract class ElementoPadre {
	private String nombre;
	private Long tamanio;
	private LocalDate fecha;
	
	
	
	public ElementoPadre(String nombre, Long tamanio, LocalDate fecha) {
		super();
		this.nombre = nombre;
		this.tamanio = tamanio;
		this.fecha = fecha;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Long getTamanio() {
		return tamanio;
	}
	public void setTamanio(Long tamanio) {
		this.tamanio = tamanio;
	}
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
