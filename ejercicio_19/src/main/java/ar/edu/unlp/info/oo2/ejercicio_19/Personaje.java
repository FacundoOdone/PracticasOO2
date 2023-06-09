package ar.edu.unlp.info.oo2.ejercicio_19;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlp.info.oo2.ejercicio_19.Arma;
import ar.edu.unlp.info.oo2.ejercicio_19.Armadura;
import ar.edu.unlp.info.oo2.ejercicio_19.Habilidad;

public class Personaje {
	private Arma arma;
	private Armadura armadura;
	private List<String> habilidades;
	private int vida;

	public Personaje() {
		this.vida = 100;
		this.habilidades = new ArrayList<String>();
	}
	
	public final void setArma(Arma arma) {
		this.arma = arma;
	}
	
	public void agregarHabilidad(String habilidad) {
		this.habilidades.add(habilidad);
	}

	public final void setArmadura(Armadura armadura) {
		this.armadura = armadura;
	}


	public String atacar(Personaje p) {
		if ((this.vida > 0 ) && (p.getVida() > 0))
			return "Hiciste " + p.recibirDanio(this.arma) + " de danio";
		return "No tienen vida suficiente para batallar";
	}

	private int recibirDanio(Arma arma) {
		int valor = this.armadura.recibirDanio(arma);
		this.vida -= valor;
		return valor;
	}
	
	public int getVida() {
		return this.vida;
	}
	
	public void setVida(int vida) {
		this.vida = 0;
	}
}
