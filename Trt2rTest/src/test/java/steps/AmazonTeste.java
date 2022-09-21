package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class AmazonTeste {
	Metodos metodos = new Metodos();
	

	@Before
	public void InciarNavegador() {
		metodos.abrirNavegador("Chrome", "https://www.amazon.com.br");
	}

	@After
	public void fecharNavegador() {

	}

	@Given("que eu esteja no site da amazon")
	public void queEuEstejaNoSiteDaAmazon() {
		metodos.validaTitulo("Amazon.com.br | Tudo pra você, de A a Z.");

	}

	@When("eu criar meu cadastro")
	public void euCriarMeuCadastro() {
		metodos.clicaBotaoContasEListas();
		metodos.clicabotaoCriarConta();
		metodos.PreencherCadastro("Matheus de Oliveira", "wokifig971@yasiok.com", "teste123456", "teste123456");
		metodos.clicabotaoContinuar();
		

	}

	@Then("valido se o cadastro foi realizado")
	public void validoSeOCadastroFoiRealizado() {

	}

}
