package metodos;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import drivers.DriversFactory;
import elementos.Elementos;

public class Metodos extends DriversFactory {
	Elementos el= new Elementos();
public void escrever(By elemento, String texto) {
	driver.findElement(elemento).sendKeys(texto);
}

public void clicar(By elemento) {
	driver.findElement(elemento).submit();;
}

public void upload(String path, int time )  {
	
	
	try{
	Robot robot = new Robot();
	robot.delay(time);
	StringSelection ss = new StringSelection(path);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, ss);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	robot.delay(time);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	robot.delay(time);
	
	
	
	
	
	
	}catch(AWTException e){
		System.out.println("***** NÃO FOI POSSIVEL ANEXAR O ARQUIVO DESEJADO******");
		e.printStackTrace();
	}
	


}

public void tirarEvidencia(String nomeEvidencia) {
	
	TakesScreenshot scrShot =(TakesScreenshot) driver;
	File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
	File destFile = new File("./evidencias/" +nomeEvidencia+".png");
	try {
		FileUtils.copyFile(srcFile, destFile);
	} catch (IOException e) {
		System.out.println("*******ERRO AO TRAR EVIDENCIA*******");
		e.printStackTrace();
	}
	
	
}

public String gerarNome(int letras) {
	String nomeGerado = RandomStringUtils.randomAlphabetic(letras);
	String nome = "john"+nomeGerado;
	return nome.toLowerCase();
	
}
public String gerarEmail(int letras) {
	String emailGerado = RandomStringUtils.randomAlphabetic(letras);
	String email = "john"+emailGerado+"@teste.com.br";
	return email.toLowerCase();
	
}
public void fileUpload() {
	
	File file = new File("C:\\Users\\Qintess\\Downloads\\cnh-digital.png");
	driver.findElement(el.cnh).sendKeys(file.getAbsolutePath());

}



}
