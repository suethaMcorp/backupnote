package teste;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdicionarProdutosCarrinhosTeste {
	WebDriver driver;
	
	@Before
	public void antesDoteste() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com.br/");
		driver.manage().window().maximize();
	}

	@After
	public void depoisDoteste() {

	}

	@Test
	public void incluirProdutoSemSeguro() throws InterruptedException {
		By campoPesq = By.id("twotabsearchtextbox");
		By nomeIphone = By.xpath("//*[@id='search']/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div[2]/div[2]/h2/a/span");
		By botaoPesq = By.id("nav-search-submit-button");
		By botaoAdicionarAoCar = By.id("add-to-cart-button");
		By botaoconfirm = By.xpath("//input[@data-asin='B08XSRRRCV']");
		By botaoCancel = By.xpath("//*[@id='attachSiNoCoverage']/span/input");
		driver.findElement(campoPesq).sendKeys("Iphone");
		driver.findElement(botaoPesq).click();
		Thread.sleep(1000);
		driver.findElement(nomeIphone).click();
		Thread.sleep(5000);
		driver.findElement(botaoAdicionarAoCar).click();
		Thread.sleep(5000);
		driver.findElement(botaoCancel).click();
		
		
		
	}

	
	public void incluirProdutocomSeguro() {

	}

	
	public void incluirMaisDeUmProduto() {

	}

	
	public void validarLimiteDeQuantidadePermitidaDosProdutos() {

	}
}
