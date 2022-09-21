package google;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import teste.DSL;

public class TestandoAlert {
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
	public void testeAlert() {
		dsl.clicar("alert");

		Alert alert = driver.switchTo().alert();
		String texto = alert.getText();
		Assert.assertEquals("Alert Simples", texto);
		alert.accept();

		dsl.escreve("elementosForm:nome", texto);
	}

	@Test
	public void testeConfirm() {

		dsl.clicar("confirm");
		Alert confirm = driver.switchTo().alert();
		Assert.assertEquals("Confirm Simples", confirm.getText());
		confirm.accept();

		Assert.assertEquals("Confirmado", confirm.getText());
		confirm.accept();

		dsl.clicar("confirm");
		Alert cancel = driver.switchTo().alert();

		Assert.assertEquals("Confirm Simples", cancel.getText());
		confirm.dismiss();

		Assert.assertEquals("Negado", cancel.getText());
		confirm.accept();
	}

	@Test
	public void testePrompt() throws InterruptedException {

		dsl.clicar("confirm");
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		Assert.assertEquals("Digite um numero", alert.getText());
		alert.sendKeys("12");
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals("Era 12?", alert.getText());
		alert.accept();
		Thread.sleep(2000);
		Assert.assertEquals(":D", alert.getText());
		alert.accept();
	}

}
