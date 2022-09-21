package elementos;

import org.openqa.selenium.By;

public class Elementos {
public By registro = By.xpath("//a[text()='Register']");

// Elementos pagina de registro
public By nomeCompleto = By.xpath("//input[@id='customer.firstName']");
public By sobrenome = By.xpath("//input[@id='customer.lastName']");
public By endereco = By.xpath("//input[@id='customer.address.street']");
public By cidade = By.xpath("//input[@id='customer.address.city']");
public By estado = By.xpath("//input[@id='customer.address.state']");
public By cep = By.xpath("//input[@id='customer.address.zipCode']");
public By telefone = By.xpath("//input[@id='customer.phoneNumber']");
public By codigoPais = By.xpath("//input[@id='customer.ssn']");
public By registroUsername = By.xpath("//input[@id='customer.username']");
public By senha = By.xpath("//input[@id='customer.password']");
public By confirmSenha = By.xpath("//input[@id='repeatedPassword']");
public By btnRegistro = By.xpath("//input[@value='Register']");

// Elementos pagina de login
public By loginUsername = By.xpath("//input[@name='username']");
public By loginSenha = By.xpath("//input[@id='password']");
public By btnLogin = By.xpath("//input[@value='Log In']");

//elementos mensagens
public By cadOk = By.xpath("//p[text()='Your account was created successfully. You are now logged in.']");
public By nomeBranco = By.xpath("//span[@id='customer.firstName.errors']");
public By senhaBranco = By.xpath("//span[@id='customer.password.errors']");
public By sobrenomeBranco = By.xpath("//span[@id='customer.lastName.errors']");
public By enderecoBranco = By.xpath("//span[@id='customer.address.street.errors']");
public By cidadeBranco = By.xpath("//span[@id='customer.address.city.errors']");
public By estadoBranco = By.xpath("//span[@id='customer.address.state.errors']");
public By codigoPaisBranco = By.xpath("//span[@id='customer.ssn.errors']");
public By usuarioBranco = By.xpath("//span[@id='customer.username.errors']");
public By confirmacaoBranco = By.xpath("//span[@id='repeatedPassword.errors']");
}
