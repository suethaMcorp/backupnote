package google;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public  class TesteGoogle {
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
		driver.quit();
	}
	@Test
	public void teste() {
					
			//driver.manage().window().setPosition(new Point(200,200));
			Assert.assertEquals("Google",driver.getTitle());
			
		
	}

}
