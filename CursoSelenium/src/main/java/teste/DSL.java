package teste;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DSL {
	private WebDriver driver;

	public DSL(WebDriver driver) {
		this.driver = driver;
	}

	public void escreve(String id_campo, String valor_campo) {
		driver.findElement(By.id(id_campo)).sendKeys(valor_campo);
	}

	public String obterValorCampo(String id_campo) {

		return driver.findElement(By.id(id_campo)).getAttribute("value");

	}

	public void clicar(String id_campo) {

		driver.findElement(By.id(id_campo)).click();
	}

	public boolean selecionado(String id) {
		return driver.findElement(By.id("elementosForm:comidaFavorita:0")).isSelected();
	}

	public void combo(String id, String valor) {
		WebElement element = driver.findElement(By.id(id));
		Select combo = new Select(element);
		// combo.selectByIndex(3);
		// combo.selectByValue("superior");
		combo.selectByVisibleText(valor);
	}

	public String valorCombo(String id) {
		WebElement element = driver.findElement(By.id(id));
		Select combo = new Select(element);
		return combo.getFirstSelectedOption().getText();
	}

	public void clickBotao(String id_botao) {
		WebElement button = driver.findElement(By.id(id_botao));
		button.click();
	}

	public void clicarLink(String linktext) {
		driver.findElement(By.linkText(linktext)).click();
	}

	public String obterTexto(By by) {
		return driver.findElement(by).getText();
	}

	public String obterTexto2(String id) {
		return obterTexto(By.id(id));
	}

	public String alertObterTextoEaceita() {
		Alert alert = driver.switchTo().alert();
		alert.getText();
		alert.accept();
		return null;
	}
	public String alertObterTextoEcancela() {
		Alert alert = driver.switchTo().alert();
		alert.getText();
		alert.dismiss();
		return null;
	}
}