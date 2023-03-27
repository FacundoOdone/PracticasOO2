package ar.edu.unlp.info.oo2.ejercicio_4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaTest {
	
	private Agua agua;
	private Tierra tierra;
	private Pantano pantano;
	private Mixta mixta;
	private Mixta mixta2;
	
	@BeforeEach
	void setUp() {
		agua = new Agua();
		tierra = new Tierra();
		pantano = new Pantano();
		mixta = new Mixta();
		mixta2 = new Mixta();
	}
	
	@Test
	void testAgua() {
		mixta.addPart(agua);
		mixta.addPart(agua);
		mixta.addPart(agua);
		mixta.addPart(tierra);
		assertEquals(0.75, mixta.getProporcionAgua());
	}
	
	@Test
	void testTierra() {
		mixta.addPart(agua);
		mixta.addPart(agua);
		mixta.addPart(agua);
		mixta.addPart(mixta2);
		mixta2.addPart(tierra);
		mixta2.addPart(tierra);
		mixta2.addPart(tierra);
		mixta2.addPart(tierra);
		assertEquals(0.25, mixta.getProporcionTierra());
	}
	@Test
	void testIgualdad() {
		mixta.addPart(agua);
		mixta.addPart(agua);
		mixta.addPart(tierra);
		mixta.addPart(tierra);
		mixta2.addPart(agua);
		mixta2.addPart(agua);
		mixta2.addPart(tierra);
		mixta2.addPart(tierra);
		
		assertTrue(mixta.igualA(mixta2));
	}
	
	 @Test
	    public void testPantanos() {
	        
	        Topografia pantano2 = new Pantano();
	        
	         assertEquals(0.7, pantano.getProporcionAgua());
	         assertEquals(0.3, pantano.getProporcionTierra());
	         
	        assertTrue(pantano.igualA(pantano2));
	         assertFalse(pantano.igualA(agua));
	         assertFalse(pantano.igualA(tierra));
	         assertFalse(pantano.igualA(mixta));
	         
	         mixta.addPart(agua);
	         mixta.addPart(tierra);
	         mixta.addPart(pantano);
	         mixta.addPart(agua);
	         
	         mixta2.addPart(agua);
	         mixta2.addPart(tierra);
	         mixta2.addPart(agua);
	         
	        assertFalse(mixta.igualA(mixta2));
	        assertFalse(mixta.igualA(agua));
	        assertFalse(mixta.igualA(tierra));
	        assertFalse(mixta.igualA(pantano));
	        
	        mixta2.addPart(pantano);
	        
	        assertTrue(mixta.igualA(mixta2));
	    }
	
	
	
}
