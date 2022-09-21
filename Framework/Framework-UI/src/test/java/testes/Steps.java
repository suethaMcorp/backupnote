package testes;

import java.io.IOException;

import elementos.ElementosWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Steps {

	Metodos metodos = new Metodos();
	ElementosWeb el = new ElementosWeb();

	@Given("que eu esteja em {string}")
	public void que_eu_esteja_em(String appUrl) {
		metodos.abrirNavegador(appUrl, "Acessando o site. ");
	}

	@When("pequisar o nome da escola")
	public void pequisar_o_nome_da_escola() {

		metodos.escrever("TRT2R", el.getPesquisar());
		metodos.submit(el.getPesquisar());
	}

	@Then("valido as informacoes")
	public void valido_as_informacoes() {

		metodos.fecharNavegador();

	}

	@Given("que eu esteja no {string}")
	public void que_eu_esteja_no(String site) {

		metodos.abrirNavegador(site, null);
		metodos.submit(el.getPesquisar());
	}

	@When("Pesquisar {string}")
	public void pesquisar(String texto) throws IOException {
		metodos.escrever(texto, el.getPesquisar());
		metodos.submit(el.getPesquisar());

		}
	@Then("valido nome da escola {string}")
	public void valido_nome_da_escola(String textoEsperado) throws IOException {
		metodos.validarTexto(textoEsperado, el.getcontato());
		metodos.fecharNavegador();
	   
	}

	@Then("valido Inovacao {string}")
	public void valido_inovacao(String textoEsperado) throws IOException {
		metodos.validarTexto(textoEsperado, el.getInovacao());
		metodos.fecharNavegador();
	}

	@Then("valido felicidade {string}")
	public void valido_felicidade(String textoEsperado) {
		metodos.validarTexto(textoEsperado, el.getFelicidade());
		metodos.fecharNavegador();
	   
	}
	
	@Then("visualizo as {string}")
	public void visualizo_as(String teste) throws IOException {
		metodos.screenShot("teste-pesquisa");
	    metodos.fecharNavegador();
	}
}
