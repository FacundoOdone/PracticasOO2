/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio_7;

import static org.junit.jupiter.api.Assertions.*;

import java.time.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToDoItemTest {

	ToDoItem tarea;
	ToDoItem tarea2;

	@BeforeEach
	void setUp() throws Exception {
		tarea = new ToDoItem("tarea");
		tarea2 = new ToDoItem("tarea2");
	}

	@Test
	public void testStart() {
		tarea.start();
		assertEquals("Progress", tarea.getEstado().getClass().getSimpleName());
	}

	@Test
	public void testTogglePause() {
		assertThrows(RuntimeException.class, () -> tarea.togglePause());
		tarea.start();
		tarea.togglePause();
		assertEquals("Paused", tarea.getEstado().getClass().getSimpleName());
		tarea.togglePause();
		assertEquals("Progress", tarea.getEstado().getClass().getSimpleName());
	}

	@Test
	public void testFinish() {
		tarea.finish();
		assertEquals("Pending", tarea.getEstado().getClass().getSimpleName());
		tarea.start();
		tarea.finish();
		assertEquals("Finished", tarea.getEstado().getClass().getSimpleName());
		tarea2.start();
		tarea2.togglePause();
		tarea2.finish();
		assertEquals("Finished", tarea2.getEstado().getClass().getSimpleName());
	}

	@Test
	public void testWorkedTime() {
		assertThrows(RuntimeException.class, () -> tarea.workedTime());
		tarea.start();
		/*
		 * Comentado porque el Instant.now() da algo distinto al otro, porque son
		 * instantes distintos xd y nose como probarlo
		 * assertEquals(Duration.between(tarea.getInit(),Instant.now()),tarea.workedTime
		 * ());
		 */
		tarea.finish();
		assertEquals(Duration.between(tarea.getTiempoComienzo(), tarea.getTiempoFin()), tarea.workedTime());
	}
}
