package google;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testeregranegocio {
	private WebDriver driver;

	@Before
	public void antesDoTeste() {
		System.setProperty("webdriver.chrome.driver", "./src/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/test/resources/componentes.html");
	}

	@After
	public void depoisDoTeste() {
		driver.quit();
	}

	@Test
	public void deveValidarNomeObrigatorio() {
		// driver.findElement(By.id("elementosForm:nome")).sendKeys("");
		driver.findElement(By.id("elementosForm:cadastrar")).click();
		Alert alert = driver.switchTo().alert();
		Assert.assertEquals("Nome eh obrigatorio", alert.getText());

	}

	@Test
	public void deveValidarSobrenomeObrigatorio() {

		driver.findElement(By.id("elementosForm:nome")).sendKeys("Matheus");
		driver.findElement(By.id("elementosForm:cadastrar")).click();
		Alert alert = driver.switchTo().alert();
		Assert.assertEquals("Sobrenome eh obrigatorio", alert.getText());

	}

	@Test
	public void deveValidarSexoObrigatorio() {

		driver.findElement(By.id("elementosForm:nome")).sendKeys("Matheus");
		driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("oliveira");
		driver.findElement(By.id("elementosForm:cadastrar")).click();
		Alert alert = driver.switchTo().alert();
		Assert.assertEquals("Sexo eh obrigatorio", alert.getText());

	}

	@Test
	public void deveValidarComidaObrigatorio() {

		driver.findElement(By.id("elementosForm:nome")).sendKeys("Matheus");
		driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("oliveira");
		driver.findElement(By.id("elementosForm:sexo")).click();
		driver.findElement(By.id("elementosForm:comidaFavorita:0")).click();
		driver.findElement(By.id("elementosForm:comidaFavorita:3")).click();
		driver.findElement(By.id("elementosForm:cadastrar")).click();
		Alert alert = driver.switchTo().alert();
		Assert.assertEquals("Tem certeza que voce eh vegetariano?", alert.getText());

	}

	@Test
	public void deveValidarEsporteObrigatorio() {

		driver.findElement(By.id("elementosForm:nome")).sendKeys("Matheus");
		driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("oliveira");
		driver.findElement(By.id("elementosForm:sexo")).click();
		driver.findElement(By.id("elementosForm:comidaFavorita:0")).click();
		WebElement element = driver.findElement(By.id("elementosForm:esportes"));
		Select combo = new Select(element);
		combo.selectByVisibleText("Natacao");
		combo.selectByVisibleText("O que eh esporte?");
		driver.findElement(By.id("elementosForm:cadastrar")).click();
		Alert alert = driver.switchTo().alert();
		Assert.assertEquals("Voce faz esporte ou nao?", alert.getText());
	}
}
