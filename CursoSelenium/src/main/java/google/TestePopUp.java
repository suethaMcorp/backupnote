package google;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestePopUp {
	private WebDriver driver;

	@Before
	public void antesDoTeste() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/test/resources/componentes.html");
	}

	@After
	public void depoisDoTeste() {
		//driver.quit();
	}

	@Test
	public void deveInteragirComJanelas() throws InterruptedException {

		driver.findElement(By.id("buttonPopUpEasy")).click();
		driver.switchTo().window("Popup");
		driver.findElement(By.tagName("Textarea")).sendKeys("Teste");
		driver.close();
		driver.switchTo().window("");
		driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Teste");

	}

	@Test
	public void deveInteragirComJanelasSemtitulo() throws InterruptedException {

		driver.findElement(By.id("buttonPopUpHard")).click();
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		driver.switchTo().window((String) driver.getWindowHandles().toArray()[1]);
		driver.findElement(By.tagName("Textarea")).sendKeys("Pop UP");
		driver.switchTo().window((String) driver.getWindowHandles().toArray()[0]);
		driver.findElement(By.tagName("Textarea")).sendKeys("Pop UP");
	}
}
