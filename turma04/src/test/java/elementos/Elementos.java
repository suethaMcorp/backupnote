package elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By nomeCompleto = By.name("name");
	private By cpf = By.name("cpf");
	private By email = By.name("email");
	private By whatsapp = By.name("whatsapp");
	private By msgCnh = By.xpath("//span[text()='Adicione uma foto da sua CNH']");


	private By cep = By.name("postalcode");
	private By btnBuscarCep = By.xpath("//input[@value = 'Buscar CEP']");
	private By numero = By.name("address-number");
	private By complemento = By.name("address-details");



	private By moto = By.xpath("//*[contains(text() , 'Moto')]");
	private By bicicleta = By.xpath("//*[contains(text() , 'Bicicleta')]");
	private By vanCarro = By.xpath("//*[contains(text() , 'Van/Carro')]");


	public By getNomeCompleto() {
		return nomeCompleto;
	}



	public By getCpf() {
		return cpf;
	}



	public By getEmail() {
		return email;
	}



	public By getWhatsapp() {
		return whatsapp;
	}



	public By getCep() {
		return cep;
	}



	public By getBtnBuscarCep() {
		return btnBuscarCep;
	}



	public By getNumero() {
		return numero;
	}



	public By getComplemento() {
		return complemento;
	}



	public By getMoto() {
		return moto;
	}



	public By getBicicleta() {
		return bicicleta;
	}



	public By getVanCarro() {
		return vanCarro;
	}



	public By getCnh() {
		return cnh;
	}



	public By getBtnEnviar() {
		return btnEnviar;
	}



	public By getMsgCnh() {
		return msgCnh;
	}



	private By cnh = By.xpath("//*[text()='Foto da sua CNH']");



	private By btnEnviar = By.xpath("//button[@class='button-success']");
}
                       