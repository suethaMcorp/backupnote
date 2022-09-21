package ruuner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import drivers.DriversFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src/test/resources/features", glue = "steps", tags = "@bike", monochrome = true, dryRun = false, plugin = {
				"pretty", "html:target/cucumber-report.html" }, snippets = SnippetType.CAMELCASE

)

public class Executa extends DriversFactory {
	public static void abrirNavegador() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://buger-eats.vercel.app/deliver");
		driver.manage().window().maximize();

		System.out.println("***********************Iniciando Teste***********************");
	}

	public static void fecharNavegador() {

		driver.quit();
		System.out.println("***********************Finalizando Teste***********************");
	}

}
