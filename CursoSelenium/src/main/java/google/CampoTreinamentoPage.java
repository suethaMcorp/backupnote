package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import teste.DSL;

public class CampoTreinamentoPage {
		private DSL dsl;

	
	public CampoTreinamentoPage(WebDriver driver) {
		dsl = new DSL(driver);
	}
	public void setNome(String nome) {
		dsl.escreve("elementosForm:nome", nome);
	}
	public void setSobrenome(String sobrenome) {
		dsl.escreve("elementosForm:sobrenome", sobrenome);
	}
	public void setSexo() {
		dsl.clicar("elementosForm:sexo:0");
	}
	public void setComidaFavorita() {
		dsl.clicar("elementosForm:comidaFavorita:0");
	}
	public void setEscolaridade(String escolaridade) {
		dsl.combo("elementosForm:escolaridade", escolaridade);
	}
	public void setEsportes(String esporte) {
		dsl.combo("elementosForm:esportes", esporte);
	}
	public void setSugestao(String sugestao) {
		dsl.escreve("elementosForm:sugestoes", sugestao);
	}
	public void setcadastrar() {
		dsl.clickBotao("elementosForm:cadastrar");	}
	public String obterResultadoCadastro() {
		return dsl.obterTexto(By.xpath("//*[@id=\"resultado\"]/span"));
		}
	public String obternomeCadastro() {
		return dsl.obterTexto(By.id("descNome"));
		}
	public String obtersobrenomeCadastro() {
		return dsl.obterTexto(By.id("descSobrenome"));
	}
	public String obtersexoCadastro() {
		return dsl.obterTexto(By.id("descSexo"));
	}
	
	public String obtercomidaCadastro() {
		return dsl.obterTexto(By.id("descComida"));
	}
	public String obterescolaridadeCadastro() {
		return dsl.obterTexto(By.id("descEscolaridade"));
	}
	public String obteresporteCadastro() {
		return dsl.obterTexto(By.id("descEsportes"));
	}
	public String obtersugestoesCadastro() {
		return dsl.obterTexto(By.id("descSugestoes"));
	}
	
	
	
	
	
	
}
