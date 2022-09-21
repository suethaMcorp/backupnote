package api022022;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ListarUsuarios {
	Response resp = RestAssured.get("https://reqres.in/api/users?page=2");

	@Test
	public void validarStatusCode() {
		int statusCode = resp.getStatusCode();
		assertEquals(200, statusCode);
	}

}
