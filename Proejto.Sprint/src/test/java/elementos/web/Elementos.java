package elementos.web;

import org.openqa.selenium.By;

public class Elementos {

	private By nome = By.xpath(null);
	private By email = By.xpath(null);
	private By senha = By.xpath(null);
	private By btnCadastrar = By.xpath(null);
	private By btnLogin = By.xpath(null);

	public By getNome() {
		return nome;
	}

	public By getEmail() {
		return email;
	}

	public By getSenha() {
		return senha;
	}

	public By getBtnCadastrar() {
		return btnCadastrar;
	}

	public By getBtnLogin() {
		return btnLogin;
	}

}
