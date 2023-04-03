package ar.edu.unlp.info.oo2.ejercicio_7;

import java.time.Duration;
import java.time.Instant;

public class ToDoItem {
	private Estado estado;
	private String nombre;
	private String comentario;
	private Instant tiempoComienzo;
	private Instant tiempoFin;

	public ToDoItem(String nombre) {
		this.estado = new Pending();
		this.nombre = nombre;
		tiempoComienzo = Instant.now();
	}

	/**
	 * Pasa el ToDoItem a in-progress (siempre y cuando su estado actual sea
	 * pending, si se encuentra en otro estado, no hace nada)
	 */
	public void start() {
		try {
			this.estado = this.estado.start();
			this.tiempoComienzo = this.estado.setTiempoComienzo();
		} catch (RuntimeException e) {

		}
	}

	/**
	 * Pasa la tarea a paused si su estado es in-progress, o a in-progress si su
	 * estado es paused. Caso contrario (pending o finished) genera un error
	 * informando la causa específica del mismo
	 */
	public void togglePause() {
		estado = this.estado.togglePause();
	}

	/**
	 * Pasa el ToDoItem a finished (siempre y cuando su estado actual sea
	 * in-progress o pausada, si se encuentra en otro estado, no hace nada)
	 */
	public void finish() {
		try {
			this.estado = this.estado.finish();
			this.tiempoFin = this.estado.setTiempoFin();
		} catch (RuntimeException e) {

		}
	}

	/**
	 * Retorna el tiempo que transcurrió desde que se inició la tarea (start) hasta
	 * que se finalizó. En caso de que no esté finalizada, el tiempo que haya
	 * transcurrido hasta el momento actual. Si la tarea no se inició, genera un
	 * error informando la causa específica del mismo.
	 */
	public Duration workedTime() {
		try {
			if (tiempoFin != null) {
				return Duration.between(tiempoComienzo, tiempoFin);
			} else {
				return this.estado.workedTime(tiempoComienzo);
			}
		} catch (RuntimeException e) {
			return null;
		}

	}

	/**
	 * Agrega un comentario a la tarea siempre y cuando no haya finalizado. Caso
	 * contrario no hace nada."
	 */
	public void addComment(String comment) {
		this.comentario = this.estado.comentar(comment);
	}

}
