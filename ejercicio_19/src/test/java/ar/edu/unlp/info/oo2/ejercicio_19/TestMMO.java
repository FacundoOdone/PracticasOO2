package ar.edu.unlp.info.oo2.ejercicio_19;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMMO {
	private Director director;
	private BuilderMago bm;
	private BuilderGuerrero bg;
	private Personaje p1;
	private Personaje p2;
	
	@BeforeEach
	void SetUp() {
		bm = new BuilderMago();
		director = new Director(bm);
		director.crear();
		p1 = bm.getResult();
		
		bg = new BuilderGuerrero();
		director = new Director(bg);
		director.crear();
		p2 = bg.getResult();
	}
	
	@Test
	void Ataque() {
		assertEquals("Hiciste 8 de danio", p2.atacar(p1));
	}
	
	@Test
	void noAtaca() {
		p1.setVida(0);
		assertEquals("No tienen vida suficiente para batallar", p2.atacar(p1));
	}
}
