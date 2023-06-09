package ar.edu.unlp.info.oo2.ejercicio_19;

public class Hierro extends Armadura{
	public int recibirDanio(Arma arma) {
		switch (arma.toString()) {
		case "Espada":
			return 5;
		case "Arco":
			return 3;
		case "Baston":
			return 1;
		default:
			return 0;
		}
	}

}
