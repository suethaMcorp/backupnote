package page;

import elementos.Elementos;
import metodos.Metodos;

public class CadastroFornecedorPage {
	Elementos el = new Elementos();
	Metodos metodos = new Metodos();

	public void preencherDadosPessoais(String nomeCompleto, String cpf, String email, String whatsapp) {
		metodos.escrever(el.nomeCompleto, nomeCompleto);
		metodos.escrever(el.cpf, cpf);
		metodos.escrever(el.email, email);
		metodos.escrever(el.whatsapp, whatsapp);
	}

	public void preencherDadosDeEndereco(String cep, String numero, String complemento) {
		metodos.escrever(el.cep, cep);
		metodos.clicar(el.btnBuscarCep);
		metodos.escrever(el.numero, numero);
		metodos.escrever(el.complemento, complemento);

	}

	public void preencherMetodoEntrega(String metodo) {
		if (metodo.equalsIgnoreCase("moto")) {
			metodos.clicar(el.moto);
		} else if (metodo.equalsIgnoreCase("bicicleta")) {
			metodos.clicar(el.bicicleta);
		} else if (metodo.equalsIgnoreCase("van/carro")) {
			metodos.clicar(el.vanCarro);
		}else {
			System.out.println("******* METODO INVALIDO: INSIRA UM METODO VALIDO*******");
		}
	}

	public void anexarCnh(String path)  {
		metodos.clicar(el.cnh);
		metodos.upload(path, 2000);
	}

	public void enviarFormulario() {
		metodos.clicar(el.btnEnviar);
	}
}
