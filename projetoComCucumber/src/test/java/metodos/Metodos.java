package metodos;

import org.openqa.selenium.By;

import drivers.DriversFactory;

public class Metodos extends DriversFactory {

	

	public void preencher(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}
	public void fecharNavegador() {
		driver.quit();
	}
}
