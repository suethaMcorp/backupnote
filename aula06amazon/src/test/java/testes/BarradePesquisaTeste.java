package testes;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BarradePesquisaTeste {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		String url = "https://www.amazon.com.br/";
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		By campoPesq = By.id("twotabsearchtextbox");
		WebElement pesquisa = driver.findElement(campoPesq);
		pesquisa.sendKeys("fralda");
		
		
		assertEquals("fralda", pesquisa.getAttribute("value"));
	}

}
