/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio_8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExcursionesTest {
	
	Persona james;
	Persona guido;
	Persona facundo;
	Excursion excursion;
	
	@BeforeEach
	void setUp() throws Exception {
		james = new Persona("James", "Glossing","James@Glossing.com");
		guido = new Persona("Guido", "van Rossum", "van@Rossum.com");
		facundo = new Persona("Facundo", "Odone", "facundo@odone.com");
		excursion = new Excursion("Bariloche", LocalDate.of(2023, 05, 10), LocalDate.of(2023, 05, 20),"Ezeiza",50000 ,1 ,2);
	}
    
	@Test
	void sinInscriptos() {
		assertEquals("Excursion: Bariloche Costo: 50000.0 Fecha Inicio: 2023-05-10 "
				+ "Fecha Fin: 2023-05-20 Punto de encuentro: Ezeiza Cantidad de usuarios faltantes: 1",excursion.informar());
	}

	@Test
	void minimoCumplido() {
		excursion.agregarPersona(facundo);
		assertEquals("Excursion: Bariloche Costo: 50000.0 Fecha Inicio: 2023-05-10 "
				+ "Fecha Fin: 2023-05-20 Punto de encuentro: Ezeiza"
				+ " Mails de inscriptos: facundo@odone.com  Cantidad de usuarios faltantes: 0", excursion.informar());
		
	}
	
	@Test
	void maximoCumplido() {
		excursion.agregarPersona(facundo);
		excursion.agregarPersona(guido);
		excursion.agregarPersona(james);
		assertEquals("Excursion: Bariloche Costo: 50000.0 Fecha Inicio: 2023-05-10 "
				+ "Fecha Fin: 2023-05-20 Punto de encuentro: Ezeiza",excursion.informar());
	}
	
}
