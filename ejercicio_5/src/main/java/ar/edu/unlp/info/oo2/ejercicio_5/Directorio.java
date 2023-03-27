package ar.edu.unlp.info.oo2.ejercicio_5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class Directorio extends ElementoPadre {
	
	private ArrayList<ElementoPadre> archivos;
	
	public Directorio (String nombre, LocalDate fecha) {
		super(nombre,(long) 32,fecha);
		archivos = new ArrayList<ElementoPadre>();
	}
	
	public Long tamanioTotalOcupado() {
		Long suma =  archivos.stream()
				.mapToLong(arch -> arch.tamanioTotalOcupado())
				.sum();
		suma+= this.getTamanio();
		return suma;
	}
	
	public Archivo archivoMasGrande() {
		Archivo a = new Archivo ("vacio",LocalDate.of(0001, 1, 1),(long)-1);
		for (ElementoPadre e :this.archivos) {
			if (e.archivoMasGrande().getTamanio() > a.getTamanio())
				a = e.archivoMasGrande();
		}
		if (a.getNombre().equals("vacio"))
			return null;
		else
			return a;
	}
	
	public Archivo archivoMasNuevo() {
		Archivo a = new Archivo ("vacio",LocalDate.of(0001, 1, 1),(long)-1);
		for (ElementoPadre e :this.archivos) {
			if (e.archivoMasNuevo().getFecha().isAfter(a.getFecha()))
				a = e.archivoMasNuevo();
		}
		if (a.getNombre().equals("vacio"))
			return null;
		else
			return a;
	}
	
	public void addArchivo(ElementoPadre archivo) {
		this.archivos.add(archivo);
	}
	
		
}
