/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio_11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DispositivoTest {
	private Dispositivo dispositivo;
	private WifiConnection wifi;
	private Connection4G connection4g;
	private AdapterConnection adaptador;
	private CRC16_Calculator crc16;
	private CRC32_Calculator crc32;

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("------CONSTRUCTOR----------");
		wifi = new WifiConnection("Foto de un wifi");
		connection4g = new Connection4G("Foto del 4g");
		adaptador = new AdapterConnection(connection4g);
		crc16 = new CRC16_Calculator();
		crc32 = new CRC32_Calculator();
		dispositivo = new Dispositivo(wifi, crc16);
		System.out.println("--------------");
	}

	@Test
	public void send() {
		System.out.println("-----PROBANDO SEND-------");
		System.out.println(dispositivo.send("Data"));
		System.out.println("--------------------");
	}

	@Test
	public void cambiarCon() {
		System.out.println("-----PROBANDO CAMBIAR CONECCION-------");
		dispositivo.conectarCon(adaptador);
		System.out.println(dispositivo.send("Data"));
		System.out.println("--------------------");
	}

	@Test
	public void configurarCRC() {
		System.out.println("-----PROBANDO CONFIGURAR CRC-------");
		dispositivo.configurarCRC(crc32);
		System.out.println(dispositivo.send("Data"));
		System.out.println("--------------------");
	}
}
