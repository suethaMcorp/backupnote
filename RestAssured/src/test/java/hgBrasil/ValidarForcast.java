package hgBrasil;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ValidarForcast {
	
	Response response = RestAssured.get("https://api.hgbrasil.com/weather");

	@Test
	public void validarListUser() {
		
		String name = response.getBody().path("results.forecast.max[2]", "Argumento").toString();
		System.out.println(name);                                      
	}
@Test
public void validarStatusCode() {
	assertEquals(200,response.getStatusCode());
}
}
