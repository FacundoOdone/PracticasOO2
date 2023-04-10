package ar.edu.unlp.info.oo2.ejercicio_11;

public class Dispositivo {
	private Ringer ringer;
	private Display display;
	private Connection connection;
	private Calculator calculator;
	
	public Dispositivo(Connection connection, Calculator calculator) {
		this.ringer = new Ringer();
		this.display = new Display();
		this.conectarCon(connection);
		this.configurarCRC(calculator);
	}
	
	public String send(String data) {
		long crc = this.calculator.crcFor(data);
		return this.connection.sendData(data, crc);
	}
	
	public void conectarCon (Connection connection) {
		this.connection = connection;
		this.ringer.ring();
		System.out.println(this.display.showBanner(this.connection.pict()));
	}
	
	public void configurarCRC(Calculator crc) {
		this.calculator = crc;
	}
	
	
}
