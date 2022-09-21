package ruuner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", // Caminho da feature
		glue = "steps", // onde esta os meus metodos de teste
		tags = "@teste", // o @ do teste que sera executado
		monochrome = true, // Caracteres especiais
		dryRun = false, // false executa o teste e true não executa
		plugin = { "pretty", "html:target/cucumber-report.html" }, 
		snippets = SnippetType.CAMELCASE
		)

public class Executa {
	
}
