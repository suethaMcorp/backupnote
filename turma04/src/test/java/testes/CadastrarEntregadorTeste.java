package testes;

import org.junit.Test;

import elementos.Elementos;
import metodos.Metodos;

public class CadastrarEntregadorTeste {
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	@Test
	public void cadastroEntregador() {
		metodos.iniciarTeste();
		metodos.escrever(el.getNomeCompleto(), "teste");
		metodos.escrever(el.getCpf(), "22357675080");
		metodos.escrever(el.getEmail(), "email@email.com");
		metodos.escrever(el.getWhatsapp(), "11-922435126");
		metodos.escrever(el.getCep(), "06463-180");
		metodos.clicar(el.getBtnBuscarCep());
		metodos.escrever(el.getNumero(), "25");
		metodos.escrever(el.getComplemento(), "n/t");
		metodos.clicar(el.getMoto());
		metodos.clicar(el.getBtnEnviar());
		metodos.validarMensagem(el.getMsgCnh(), "Adicione uma foto da sua CNH");

	}

	public void enviarDadosInvalidos() {

	}

	public void formularioEmBranco() {
		metodos.iniciarTeste();
		metodos.escrever(el.getNomeCompleto(), " ");
		metodos.escrever(el.getCpf(), " ");
		metodos.escrever(el.getEmail(), " ");
		metodos.escrever(el.getWhatsapp(), " ");
		metodos.escrever(el.getCep(), " ");
		metodos.clicar(el.getBtnBuscarCep());
	}

	public void semMetodoEntrega() {

	}

	public void semCnh() {
		metodos.iniciarTeste();
		metodos.escrever(el.getNomeCompleto(), "teste");
		metodos.escrever(el.getCpf(), "22357675080");
		metodos.escrever(el.getEmail(), "email@email.com");
		metodos.escrever(el.getWhatsapp(), "11-922435126");
		metodos.escrever(el.getCep(), "06463-180");
		metodos.clicar(el.getBtnBuscarCep());
		metodos.escrever(el.getNumero(), "25");
		metodos.escrever(el.getComplemento(), "n/t");
		metodos.clicar(el.getMoto());
		metodos.clicar(el.getBtnEnviar());
	}

	public void maisDeUmMetodoEntrega() {

	}

	public void jaCadastrado() {

	}

}
