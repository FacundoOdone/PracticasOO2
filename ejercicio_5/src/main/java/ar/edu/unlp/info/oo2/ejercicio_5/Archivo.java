package ar.edu.unlp.info.oo2.ejercicio_5;

import java.time.LocalDate;

public class Archivo extends ElementoPadre {
	
	
	public Archivo(String name, LocalDate fecha, Long tamanio) {
		super(name,tamanio,fecha);
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
}
