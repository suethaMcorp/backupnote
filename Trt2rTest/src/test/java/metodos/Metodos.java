package metodos;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import elementos.Elementos;

public class Metodos {
	public WebDriver driver;
	Elementos el = new Elementos();

	public void abrirNavegador(String nav, String site) {
		String url = site;
		String navegador = nav;

		if (navegador.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();

		} else if (navegador.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "./src/Driver/gecko.exe");
			driver = new ChromeDriver();

		} else {
			System.out.println("Insira Chrome ou Firefox");
		}
		driver.get(url);
		driver.manage().window().maximize();

	}

	public void fecharNavegador() {
		driver.quit();
	}

	public void validaTitulo(String titulo) {
		Assert.assertEquals(titulo, driver.getTitle());
	}

	public void clicaBotaoContasEListas() {
		driver.findElement(el.botaoLogin).click();
	}
	public void clicabotaoCriarConta() {
		driver.findElement(el.botaoCriarConta).click();
	}
	public void PreencherCadastro( String nome, String CeluEmail, String senha, String ConfirmSenha) {
		driver.findElement(el.nome).sendKeys(nome);
		driver.findElement(el.celuOrMail).sendKeys(CeluEmail);
		driver.findElement(el.senha).sendKeys(senha);
		driver.findElement(el.confirmSenha).sendKeys(ConfirmSenha);
	}
	public void clicabotaoContinuar() {
		driver.findElement(el.botaoContinuar).click();
	}
}
