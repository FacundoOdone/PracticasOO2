package ar.edu.unlp.info.oo2.ejercicio_19;

public class Acero extends Armadura{
	public int recibirDanio(Arma arma) {
		switch (arma.toString()) {
		case "Espada":
			return 3;
		case "Arco":
			return 2;
		case "Baston":
			return 1;
		default:
			return 0;
		}
	}
}
