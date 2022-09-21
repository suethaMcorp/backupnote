package pages;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import elementos.Elementos;
import metodos.Metodos;

public class RegistrarTeste extends Metodos {

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
	public void registroCompleto() {
		clicar(el.registro);
		escrever(el.nomeCompleto, "jeronimo");
		escrever(el.sobrenome, "doidao da silva");
		escrever(el.endereco, "rua das palmeiras");
		escrever(el.cidade, "Barueri");
		escrever(el.estado, "são paulo");
		escrever(el.cep, "06463-190");
		escrever(el.telefone, "11-944251342");
		escrever(el.codigoPais, "55");
		escrever(el.registroUsername, "jeronimo081");
		escrever(el.senha, "12345678");
		escrever(el.confirmSenha, "12345678");
		clicar(el.btnRegistro);
		String msgEsperada = driver.findElement(el.cadOk).getText();
		assertEquals("Your account was created successfully. You are now logged in.", msgEsperada);
	}

	@Test
	public void camposEmbranco() {
		clicar(el.registro);
		clicar(el.btnRegistro);
		String msgEsperada = driver.findElement(el.nomeBranco).getText();
		assertEquals("First name is required.", msgEsperada);
		String msgEsperada2 = driver.findElement(el.sobrenomeBranco).getText();
		assertEquals("Last name is required.", msgEsperada2);
		String msgEsperada3 = driver.findElement(el.enderecoBranco).getText();
		assertEquals("Address is required.", msgEsperada3);
		String msgEsperada4 = driver.findElement(el.cidadeBranco).getText();
		assertEquals("City is required.", msgEsperada4);
		String msgEsperada5 = driver.findElement(el.estadoBranco).getText();
		assertEquals("State is required.", msgEsperada5);
		String msgEsperada6 = driver.findElement(el.codigoPaisBranco).getText();
		assertEquals("Social Security Number is required.", msgEsperada6);
		String msgEsperada7 = driver.findElement(el.usuarioBranco).getText();
		assertEquals("Username is required.", msgEsperada7);
		String msgEsperada8 = driver.findElement(el.senhaBranco).getText();
		assertEquals("Password is required.", msgEsperada8);
		String msgEsperada9 = driver.findElement(el.confirmacaoBranco).getText();
		assertEquals("Password confirmation is required.", msgEsperada9);
	}

	@Test
	public void senhaDiferente() {
		clicar(el.registro);
		escrever(el.nomeCompleto, "Oracle");
		escrever(el.sobrenome, "dados da silva");
		escrever(el.endereco, "rua das palmeiras");
		escrever(el.cidade, "Barueri");
		escrever(el.estado, "são paulo");
		escrever(el.cep, "06463-190");
		escrever(el.telefone, "11-944251342");
		escrever(el.codigoPais, "55");
		escrever(el.registroUsername, "jeronimo080");
		escrever(el.senha, "12345678");
		escrever(el.confirmSenha, "12345679");
		clicar(el.btnRegistro);
		String msgEsperada = driver.findElement(el.confirmacaoBranco).getText();
		assertEquals("Passwords did not match.", msgEsperada);
	}

	
	public void dadosInvalidos() {

	}

}
