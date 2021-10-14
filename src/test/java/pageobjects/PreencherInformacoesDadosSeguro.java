package pageobjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.MetodosUteis;

public class PreencherInformacoesDadosSeguro extends MetodosUteis{
	
	public PreencherInformacoesDadosSeguro(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Mapeamento aba dados do seguro
    @FindBy(id = "firstname")
	WebElement nome;

	@FindBy(id = "lastname")
	WebElement nome2 ;

	@FindBy(id = "birthdate")
	WebElement date_birth;

	@FindBy(id = "streetaddress")
	WebElement address;

	@FindBy(id = "country")
	WebElement country;

	@FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[6]/select/option[32]")
	WebElement country1;

	@FindBy(id = "zipcode")
	WebElement code;

	@FindBy(id = "occupation")
	WebElement occupation;

	@FindBy(xpath = "//*[@id=\"occupation\"]/option[3]")
	WebElement occupation1;

	@FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[1]/span")
	WebElement hobbies;

	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[3]/span")
	WebElement hobbies1;

	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[4]/span")
	WebElement hobbies2;

	@FindBy(id = "nextenterproductdata")
	WebElement btn_next2;
	
	@FindBy(id = "enterproductdata")
	WebElement telaProduto;
	
	public void preencherDadosSeguro() {
		nome.sendKeys("Michael");
		nome2.sendKeys("Jordan");
		date_birth.sendKeys("07/20/1999");
		address.sendKeys("Apt2");
		country.click();
		country1.click();
		code.sendKeys("23456");
		occupation.click();
		occupation1.click();
		hobbies.click();
		hobbies1.click();
		hobbies2.click();
	}
	
	public void clicarProximaSeguro() {
		btn_next2.click();
		espere(2);
	}
	
	public void validarTelaProduto() {
		esperarElemento(telaProduto);
		WebElement textoPro = telaProduto;
		String mensagem = textoPro.getText();
		assertTrue(mensagem, true);
	}
}
