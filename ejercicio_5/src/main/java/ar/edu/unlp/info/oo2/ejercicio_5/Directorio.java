package ar.edu.unlp.info.oo2.ejercicio_5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class Directorio extends ElementoPadre {
	
	private ArrayList<ElementoPadre> archivos;
	
	public Directorio (String nombre, LocalDate fecha) {
		super(nombre,fecha);
		archivos = new ArrayList<ElementoPadre>();
	}
	
	public long getTamanio() {
		return 32;
	}
	
	public Long tamanioTotalOcupado() {
		Long suma =  archivos.stream()
				.mapToLong(arch -> arch.tamanioTotalOcupado())
				.sum();
		suma+= this.getTamanio();
		return suma;
	}
	
	public Archivo archivoMasGrande() {
		return
		this.archivos.stream()
			.map(e -> e.archivoMasGrande())
			.filter(e -> e != null)
			.max((a1, a2) -> Long.compare(a1.getTamanio(), a2.getTamanio()))
			.orElse(null);
	}
	
	
	public Archivo archivoMasNuevo() {
	return
			this.archivos.stream()
				.map(e -> e.archivoMasNuevo())
				.filter(e -> e != null)
				.max((a1, a2) -> (a1.getFecha().compareTo(a2.getFecha())))
				.orElse(null);
	}
	
	public void addArchivo(ElementoPadre archivo) {
		this.archivos.add(archivo);
	}
	
		
}
