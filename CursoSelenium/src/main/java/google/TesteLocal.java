package google;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import teste.DSL;

public class TesteLocal {
	private WebDriver driver;
	private DSL dsl;

	@Before
	public void antesDoTeste() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/test/resources/componentes.html");
		dsl = new DSL(driver);
	}

	@After
	public void depoisDoTeste() {
		//driver.quit();
	}

	@Test
	public void testextfield1() {

		dsl.escreve("elementosForm:nome", "Teste");

		Assert.assertEquals("Teste", dsl.obterValorCampo("elementosForm:nome"));

	}

	@Test
	public void testTextarea2() {

		dsl.escreve("elementosForm:sugestoes", "Teeeeeste");
		Assert.assertEquals("Teeeeeste", dsl.obterValorCampo("elementosForm:nome"));

	}

	@Test
	public void testeCheckbox3() {

		dsl.clicar("elementosForm:comidaFavorita:0");
		Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:0")).isSelected());

	}

	@Test
	public void testeSelecionarEscolaridade() {
		WebElement element = driver.findElement(By.id("elementosForm:escolaridade"));
		Select combo = new Select(element);
		// combo.selectByIndex(3);
		// combo.selectByValue("superior");
		combo.selectByVisibleText("Especializacao");
		Assert.assertEquals("Especializacao", combo.getFirstSelectedOption().getText());

	}

	@Test
	public void testeVerificarValores() {
		WebElement element = driver.findElement(By.id("elementosForm:escolaridade"));
		Select combo = new Select(element);
		List<WebElement> options = combo.getOptions();
		Assert.assertEquals(8, options.size());

		boolean encontrou = false;
		for (WebElement option : options) {
			if (option.getText().equals("Mestrado")) {
				encontrou = true;
				break;
			}

		}
		Assert.assertTrue(encontrou);
	}

	@Test
	public void testeVerificarValoresComboMultiplo() {
		WebElement element = driver.findElement(By.id("elementosForm:esportes"));
		Select combo = new Select(element);
		combo.selectByVisibleText("Natacao");
		combo.selectByVisibleText("Corrida");
		combo.selectByVisibleText("O que eh esporte?");

		List<WebElement> allSelectedOptios = combo.getAllSelectedOptions();
		Assert.assertEquals(3, allSelectedOptios.size());

		combo.deselectByVisibleText("Natacao");
		allSelectedOptios = combo.getAllSelectedOptions();
		Assert.assertEquals(2, allSelectedOptios.size());
	}

	@Test
	public void testeVerificarBotoes() {
		WebElement button = driver.findElement(By.id("buttonSimple"));
		dsl.clickBotao("buttonSimple");
		Assert.assertEquals("Obrigado!", button.getAttribute("Value"));

	}

	@Test
	public void testeVerificarLinks() {
		dsl.clicarLink("Voltar");
		Assert.assertEquals("Voltou!", dsl.obterTexto(By.id("resultado")));
		driver.quit();

	}

	@Test
	public void testeBuscarTexto() {
		// Verificar se o texto esta na tela
		// Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Campo
		// de Treinamento"));
		Assert.assertEquals("Campo de Treinamento", dsl.obterTexto(By.tagName("h3")));
		Assert.assertEquals("Cuidado onde clica, muitas armadilhas...",dsl.obterTexto(By.className("facilAchar")));

	}

}
