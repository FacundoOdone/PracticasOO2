package ar.edu.unlp.info.oo2.ejercicio_11;

public class WifiConnection implements Connection{
	private String pict;
	
	public WifiConnection(String pict) {
		this.pict = pict;
	}
	
	public String sendData(String data, long crc) {
		return "Enviando " + data + " con Wifi " + crc; 
	}
	
	public String pict() {
		return this.pict;
	}
}
