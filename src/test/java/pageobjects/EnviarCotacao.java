package pageobjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.MetodosUteis;

public class EnviarCotacao extends MetodosUteis {
	
	public EnviarCotacao(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Mapeamento aba enviar
			@FindBy(id = "email")
			WebElement email;
			
			@FindBy(id = "username")
			WebElement usuario;
			
			@FindBy(id = "password")
			WebElement senha;
			
			@FindBy(id = "confirmpassword")
			WebElement confirSenha;
			
			@FindBy(id = "sendemail")
			WebElement btn_send;
			
			@FindBy(xpath = "/html/body/div[4]")
			WebElement box;
			
			public void PreencherEnviar() {
				email.sendKeys("mjemail00@gmail.com.br");
				usuario.sendKeys("Mijordan");
				senha.sendKeys("Jordan@8920");
				confirSenha.sendKeys("Jordan@8920");		
			}
			
			public void clicarEnviar() {
				btn_send.click();
			}
			
			public void validarMensagem() {
				esperarElemento(box);
				WebElement texto = driver.findElement(By.xpath("/html/body/div[4]/h2"));
				String mensagem = texto.getText();
				assertEquals("Sending e-mail success!", mensagem);
				
			}
}
