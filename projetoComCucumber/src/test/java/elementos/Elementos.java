package elementos;

import org.openqa.selenium.By;

public class Elementos {
public By nome = By.xpath("//input[@id='nome_cad']");
public By email = By.xpath("//input[@id='email_cad']");
public By senha = By.xpath("//input[@id='senha_cad']");
public By btn = By.xpath("//*[@id=\"cadastro\"]/form/p[4]/input");
}
