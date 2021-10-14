package pageobjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.MetodosUteis;

public class SelecioneOpcaoPreco extends MetodosUteis {
	
	public SelecioneOpcaoPreco(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Mapeamento aba do preco
			@FindBy(xpath = "//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]/span")
			WebElement selectPreco;
			
			@FindBy(id = "nextsendquote")
			WebElement btn_next4;
			
			@FindBy(id = "sendquote")
			WebElement telaCotacao;
			
			public void selecionarPreco() {
				selectPreco.click();
			}
			
			public void clicarProximaPreco() {
				btn_next4.click();
				espere(2);
			}
			
			public void validarTelaCotacao() {
				esperarElemento(telaCotacao);
				WebElement textoCot = telaCotacao;
				String mensagem = textoCot.getText();
				assertTrue(mensagem, true);
			}
}
