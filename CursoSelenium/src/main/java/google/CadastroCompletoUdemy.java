package google;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import teste.DSL;

public class CadastroCompletoUdemy {
	private WebDriver driver;
	private DSL dsl;
	private CampoTreinamentoPage campo;

	@Before
	public void antesDoTeste() {
		System.setProperty("webdriver.chrome.driver", "./src/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/test/resources/componentes.html");
		dsl = new DSL(driver);
		campo = new CampoTreinamentoPage(driver);
	}

	/*@After
	public void depoisDoTeste() {
		driver.quit();
	}*/

	@Test
	public void cadastroCompleto() throws InterruptedException {

		campo.setNome("Matheus");
		
		Thread.sleep(1000);

		campo.setSobrenome("de Oliveira");

		Thread.sleep(1000);
		campo.setSexo();

		
		campo.setComidaFavorita();

		
		Thread.sleep(1000);
		campo.setEscolaridade("2o grau completo");

		// new
		// Select(driver.findElement(By.id("elementosForm:esportes"))).selectByVisibleText("Natacao");
		// - modo simplificado
		campo.setEsportes("Natacao");
		
		campo.setSugestao("Teste");

		dsl.clickBotao("elementosForm:cadastrar");

		// Assert.assertEquals("Cadastrado!",driver.findElement(By.xpath("//*[@id=\"resultado\"]/span")).getText());
		// - pegar campo com xpath
		Assert.assertTrue(campo.obterResultadoCadastro().startsWith("Cadastrado!"));
		Assert.assertEquals("Nome: Matheus", campo.obternomeCadastro());
		Assert.assertEquals("Sobrenome: de Oliveira", campo.obtersobrenomeCadastro());
		Assert.assertEquals("Sexo: Masculino", campo.obtersexoCadastro());
		Assert.assertEquals("Comida: Carne", campo.obtercomidaCadastro());
		Assert.assertEquals("Escolaridade: 2graucomp", campo.obterescolaridadeCadastro());
		Assert.assertEquals("Esportes: Natacao", campo.obteresporteCadastro());
		Assert.assertEquals("Sugestoes: Teste", campo.obtersugestoesCadastro());

	}

}
