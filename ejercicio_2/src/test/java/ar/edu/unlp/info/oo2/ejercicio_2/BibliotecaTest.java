package ar.edu.unlp.info.oo2.ejercicio_2;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class BibliotecaTest {

	@Test
	void jsonSimple() {
		JSONObject json = new JSONObject();
		json.put("Nombre","Arya Stark");
		json.put("Email", "needle@stark.com");
		json.put("Legajo", "5234-5");
		JSONArray array = new JSONArray();
		array.add(json);
		json.put("Nombre","Tyron Lannister");
		json.put("Email", "tyron@thelannisters.com");
		json.put("Legajo", "2345-2");
		array.add(json);
		
		System.out.println(array.toJSONString());
		
	}
	
	@Test
	void jackson() throws JsonProcessingException {
		Socio socio = new Socio("Pepe", "Pepe@papucho.com.ar","2255-5");
		ArrayList<Socio> socios = new ArrayList();
		socios.add(socio);
		socio = new Socio("Carlos", "Carlos@gmail.com","4206-9");
		socios.add(socio);
		ObjectMapper mapper = new ObjectMapper();
		String jsonText = mapper.writeValueAsString(socios);
		System.out.println(jsonText);
	}
}
