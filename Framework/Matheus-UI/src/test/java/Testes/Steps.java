package Testes;

import Elementos.Elementos;
import Pages.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Steps {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	@Given("que eu esteja no {string}")
	public void que_eu_esteja_no(String appUrl) {
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









}
