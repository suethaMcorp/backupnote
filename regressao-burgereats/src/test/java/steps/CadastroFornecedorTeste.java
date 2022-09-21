package steps;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import page.CadastroFornecedorPage;
import ruuner.Executa;

public class CadastroFornecedorTeste {
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	CadastroFornecedorPage cadastrar = new CadastroFornecedorPage();

	@Given("que o prestador acesse o formulario de cadastro")
	public void queOPrestadorAcesseOFormularioDeCadastro() {
		Executa.abrirNavegador();
	}

	@When("preencher os dados pessoais do entregador")
	public void preencherOsDadosPessoaisDoEntregador() {
		cadastrar.preencherDadosPessoais("teste", "79028750070", "teste@teste.com", "11-942543687");
	}

	@When("preencher os dados de endereco do entregador")
	public void preencherOsDadosDeEnderecoDoEntregador() {
		cadastrar.preencherDadosDeEndereco("06463-180", "338", "casa 12");

	}

	@When("preencher os dados de entrega moto")
	public void preencherOsDadosDeEntregaMoto() {

		cadastrar.preencherMetodoEntrega("moto");
	}

	@When("anexar o documento")
	public void anexarODocumento() {
		cadastrar.anexarCnh("C:\\Users\\Qintess\\Downloads\\cnh-digital.png");

	}

	@Then("enviamos o formulario")
	public void enviamosOFormulario() {
		cadastrar.enviarFormulario();

	}

	@Then("validamos a confirmacao")
	public void validamosAConfirmacao() {

	}

	@When("preencher os dados de entrega bicicleta")
	public void preencherOsDadosDeEntregaBicicleta() {
		cadastrar.preencherMetodoEntrega("bicicleta");
	}

	@When("preencher os dados de entrega van\\/carro")
	public void preencherOsDadosDeEntregaVanCarro() {
		cadastrar.preencherMetodoEntrega("van/carro");
	}

	@When("preencher mais de um metodo de entrega")
	public void preencherMaisDeUmMetodoDeEntrega() {
		cadastrar.preencherMetodoEntrega("moto");
		cadastrar.preencherMetodoEntrega("bicicleta");
	}

	@Then("validamos mensagem de erro")
	public void validamosMensagemDeErro() {

	}

	@Then("validamos a mensagem de erro sobre os campos obrigatorios")
	public void validamosAMensagemDeErroSobreOsCamposObrigatorios() {

	}

	@When("sem anexar o documento do prestador")
	public void semAnexarODocumentoDoPrestador() {

	}

	@Then("validamos a mensagem de erro sobre a falta do documento")
	public void validamosAMensagemDeErroSobreAFaltaDoDocumento() {

	}

}
