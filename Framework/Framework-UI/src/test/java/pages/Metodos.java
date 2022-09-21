package pages;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
	
	public void validarTexto(String textoEperado, By elemento) {
		String texto = driver.findElement(elemento).getText();
		assertEquals(textoEperado, texto);
		
		
	}
	public void screenShot(String nome) throws IOException {
		
		TakesScreenshot scrShot = ((TakesScreenshot) driver); //Criação de ponteiro
		File scrFile = scrShot.getScreenshotAs(OutputType.FILE); // Aqui é tirado a evidencia o print da tela
		File destFile = new File("./src/evidencias/"+nome+".png");// enviando a evidencia para a pasta src com a extensão .png
		FileUtils.copyFile(scrFile, destFile); // aqui executou a linha 55 e 56(pegou a evidencia e enviou para a pasta src)
	}
}
