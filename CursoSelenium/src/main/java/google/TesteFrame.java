package google;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import teste.DSL;



public class TesteFrame {
	private WebDriver driver;
	private DSL dsl;
	@Before
	public void antesDoTeste() {
		System.setProperty("webdriver.chrome.driver", "./src/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/test/resources/componentes.html");
		dsl = new DSL(driver);
	}

	@After
	public void depoisDoTeste() {
		driver.quit();
	}

	@Test
	public void testeFrame() throws InterruptedException {

		driver.switchTo().frame("frame1");// mudar o foco para o frame
		dsl.clicar("frameButton");
		Alert alerta = driver.switchTo().alert(); // mudar o foco para o alerta
		String msg = alerta.getText(); // capturar a mensagem do alerta
		Assert.assertEquals("Frame OK!", msg);
		alerta.accept();// aceitar o alerta (OK)
		
		driver.switchTo().defaultContent(); // voltar o foco para o normal
		dsl.escreve("elementosForm:nome", msg);

	}
}
