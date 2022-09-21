package metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {
	public static WebDriver driver;
	String url = "https://parabank.parasoft.com/parabank/index.htm";

	public void abrirNavegador() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	public void fecharNavegador() {
		driver.quit();

	}

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();

	}
	
	public void capturarTexto(By elemento) {
		driver.findElement(elemento).getText();
		
	}

}
