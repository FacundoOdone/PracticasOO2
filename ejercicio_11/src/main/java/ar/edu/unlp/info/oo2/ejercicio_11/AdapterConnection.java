package ar.edu.unlp.info.oo2.ejercicio_11;

public class AdapterConnection implements Connection {

	private Connection4G connection4G;
	
	public AdapterConnection(Connection4G connection4G) {
		this.connection4G = connection4G;
	}
	
	public String sendData(String data, long crc) {
		return connection4G.transmit(data, crc);
	}

	public String pict() {
		return this.connection4G.getSymb();
	}
}
