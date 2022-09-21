package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;

	public void abrirNavegador(String appUrl, String descricaoPasso) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(appUrl);

	}



	public void  escrever(String texto, By elemento) {
		
		driver.findElement(elemento).sendKeys(texto);
		
	}
	
	public void submit(By elemento) {
		
		driver.findElement(elemento).submit();
		
	}
	
	public void fecharNavegador() {
		driver.quit();
	}
	
	
	
}
