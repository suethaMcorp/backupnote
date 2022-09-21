package metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {
WebDriver driver ;



public void iniciarTeste () {
	String url = "https://buger-eats.vercel.app/deliver";
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
}
public void escrever(By elemento, String texto) {
	driver.findElement(elemento).sendKeys(texto);
}
public void clicar(By elemento) {
	driver.findElement(elemento).click();
}

public void validarMensagem(By elemento, String msgEsperada) {
	String msgCapturada = driver.findElement(elemento).getText();
	assertEquals(msgEsperada, msgCapturada);
	
}




}
