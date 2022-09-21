import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import elementos.web.Elementos;
import metodos.MetodosdeTeste;

public class CadastrarUsuarioTeste {
	MetodosdeTeste metodos = new MetodosdeTeste();
	Elementos el = new Elementos();

	@Before
	public void setUp() throws Exception {
		metodos.abrirNavegador();
	}

	@After
	public void tearDown() throws Exception {
		metodos.fecharNavegador();
	}

	@Test
	public void testCadastrar() {
		metodos.preencher(el.getNome(), "Matheus");
		metodos.preencher(el.getEmail(), "teste@teste.com");
		metodos.preencher(el.getSenha(), "1234");
		metodos.clicar(el.getBtnCadastrar());
	}
	
	@Test
	public void testcamposEmBranco() {
		metodos.clicar(el.getBtnLogin());
		
	}
	@Test
	public void testEmailInvalido() {
		metodos.preencher(el.getNome(), "Matheus");
		metodos.preencher(el.getEmail(), "testeteste.com");
		metodos.preencher(el.getSenha(), "1234");
		metodos.clicar(el.getBtnCadastrar());
		
	}
	

}
