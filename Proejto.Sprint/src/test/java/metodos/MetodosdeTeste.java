package metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MetodosdeTeste {
	WebDriver driver;
	

	public void abrirNavegador() {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(null);

	}

	public void fecharNavegador() {
		driver.quit();

	}

	public void preencher( By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();

	}

}
