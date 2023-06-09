package ar.edu.unlp.info.oo2.ejercicio_19;

public class Cuero extends Armadura {
	public int recibirDanio(Arma arma) {
		switch (arma.toString()) {
		case "Espada":
			return 8;
		case "Arco":
			return 5;
		case "Baston":
			return 2;
		default:
			return 0;
		}
	}
}
