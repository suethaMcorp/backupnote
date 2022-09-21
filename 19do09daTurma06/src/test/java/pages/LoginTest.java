package pages;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import elementos.Elementos;
import metodos.Metodos;

public class LoginTest extends Metodos {
	Elementos el = new Elementos();

	@Before
	public void antesDoTeste() {
		abrirNavegador();
	}

	@After
	public void DepoisDoTeste() {
		fecharNavegador();
	}
	
	@Test
	public void login() {
		
	}
	
	@Test
	public void SenhaInvalida() {
		
	}
	
	@Test
	public void usuarioEsenhaEmBranco() {
		
	}
}
