package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {
	
	//Elementos Web encapsulados

	private By pesquisar  = By.name("q"); 
	private By contato = By.xpath("//*[@class='qrShPb kno-ecr-pt PZPZlf q8U8x']");
	private By Inovacao = By.xpath("//div[@class='SPZz6b']");
	private By Felicidade = By.xpath("//*[@class='qrShPb kno-ecr-pt PZPZlf q8U8x']");
//Metodos public para acessar os elementos 
	
	public By getPesquisar() {
		return pesquisar;
	}

	public By getcontato() {
		return contato;
	}

	public By getInovacao() {
		return Inovacao;
	}

	public By getFelicidade() {
		return Felicidade;
	}

	
	 

	
	

}
