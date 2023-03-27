package ar.edu.unlp.info.oo2.ejercicio_4;

import java.util.ArrayList;

public class Mixta extends Topografia{
	
	private ArrayList<Topografia> partes;
	
	public Mixta() {
		partes = new ArrayList<Topografia> ();
	}
	
	public void addPart(Topografia obj) {
		partes.add(obj);
	}
	
	public double getProporcionAgua() {
		double aux = this.partes.stream()
				.mapToDouble(p -> p.getProporcionAgua())
				.sum();
		
		return aux / 4;
	}
	
	public double getProporcionTierra() {
		double aux = this.partes.stream()
				.mapToDouble(p -> p.getProporcionTierra())
				.sum();
		
		return aux / 4;
	}
	
	
	
	
}
