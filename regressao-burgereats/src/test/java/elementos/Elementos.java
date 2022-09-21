package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	
public By nomeCompleto = By.name("name");
public By cpf = By.name("cpf");
public By email = By.name("email");
public By whatsapp = By.name("whatsapp");


public By cep = By.name("postalcode");
public By btnBuscarCep = By.xpath("//input[@value = 'Buscar CEP']");
public By numero = By.name("address-number");
public By complemento = By.name("address-details");



public By moto = By.xpath("//*[contains(text() , 'Moto')]");
public By bicicleta = By.xpath("//*[contains(text() , 'Bicicleta')]");
public By vanCarro = By.xpath("//*[contains(text() , 'Van/Carro')]");


public By cnh = By.xpath("//*[text()='Foto da sua CNH']");



public By btnEnviar = By.xpath("//button[@class='button-success']");


}
