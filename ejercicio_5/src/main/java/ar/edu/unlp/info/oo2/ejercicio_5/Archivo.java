package ar.edu.unlp.info.oo2.ejercicio_5;

import java.time.LocalDate;

public class Archivo extends ElementoPadre {
	
	private long tamanio;
	
	public Archivo(String name, LocalDate fecha, Long tamanio) {
		super(name,fecha);
		this.tamanio = tamanio;
	}
	
	public Long tamanioTotalOcupado() {
		return (long)this.getTamanio();
	}
	public Archivo archivoMasGrande() {
		return this;
	}
	public Archivo archivoMasNuevo() {
		return this;
	}

	public long getTamanio() {
		return tamanio;
	}

	public void setTamanio(long tamanio) {
		this.tamanio = tamanio;
	}
}
