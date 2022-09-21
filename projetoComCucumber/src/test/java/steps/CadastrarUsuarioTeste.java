package steps;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import ruuner.Executa;

public class CadastrarUsuarioTeste {
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	

	@Given("que acesse o formulario para cadastrar um novo usuario")
	public void queAcesseOFormularioParaCadastrarUmNovoUsuario() {
		Executa.abrirNavegador();
	   
	}
	@When("preencher todos os campos obrigatorios no formulario")
	public void preencherTodosOsCamposObrigatoriosNoFormulario() {
	   metodos.preencher(el.nome, "Teste");
	   metodos.preencher(el.email, "Teste");
	   metodos.preencher(el.senha, "Teste");
	   
	}
	@When("clicar no botao cadastrar do formulario")
	public void clicarNoBotaoCadastrarDoFormulario() {
	    metodos.clicar(el.btn);
	   
	}
	@Then("formulario de cadastro de usuario enviado")
	public void formularioDeCadastroDeUsuarioEnviado() {
	    
	}



}
