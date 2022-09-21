package turma10testesunitarios;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CadastrarClienteTest {
	CadastrarCliente cad = new CadastrarCliente();

	

	@Test
	public void testCadastroOk() {
		assertEquals("Cliente cadastrado com sucesso",cad.CadastrarUsuario("Matheus", 18));
	}
	@Test
	public void testCadastroMenorDeIdade() {
		assertEquals("Somente maiores de idade",cad.CadastrarUsuario("Matheus", 16));
	}
	
	@Test
	public void testCadastroEmBranco() {
		assertEquals("Somente maiores de idade",cad.CadastrarUsuario("", 0));
	}

	@Test
	public void testCadastroNomeEmBranco() {
		assertEquals("campo nome invalido",cad.CadastrarUsuario(" ", 18));
	}
	@Test
	public void testCadastroNomeNull() {
		assertEquals("campo nome invalido",cad.CadastrarUsuario("", 19));
	}
	//@Test
	public void testCadastroSuperiorInvalido() {
		assertEquals("Somente maiores de idade",cad.CadastrarUsuario("Matheus", 18));
	}
	

}
