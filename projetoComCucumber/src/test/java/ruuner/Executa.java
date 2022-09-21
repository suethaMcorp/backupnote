package ruuner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import drivers.DriversFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",glue = "steps",tags = "@regressive", monochrome = false, 	dryRun = false, plugin = { "pretty", "html:target/cucumber-report.html" },	snippets = SnippetType.CAMELCASE)

public class Executa extends DriversFactory {
	public static void abrirNavegador() {
		String url = "file:///C:/Drivers/Administrator-X/projeto_semana_qa_1.0/projeto_semana_qa_1.0/cadastro.html";
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

	}
}

