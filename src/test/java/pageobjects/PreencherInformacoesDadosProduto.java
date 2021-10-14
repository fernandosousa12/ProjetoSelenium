package pageobjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.MetodosUteis;

public class PreencherInformacoesDadosProduto extends MetodosUteis {
	
	public PreencherInformacoesDadosProduto(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//mapeamento aba do produto
			@FindBy(id = "openstartdatecalender")
			WebElement start_date;

			@FindBy(xpath = "/html/body/div[2]/div/a[2]")
			WebElement nextMonth;
			
			@FindBy(xpath = "/html/body/div[2]/table/tbody/tr[5]/td[2]/a")
			WebElement selectDay;
			
			@FindBy(id = "insurancesum")
			WebElement Insurance ;
			
			@FindBy(xpath = "//*[@id=\"insurancesum\"]/option[2]")
			WebElement Insurance1;
			
			@FindBy(id = "meritrating")
			WebElement Merit;
			
			@FindBy(xpath = "//*[@id=\"meritrating\"]/option[5]")
			WebElement Merit1;
			
			@FindBy(id = "damageinsurance")
			WebElement Damage;
			
			@FindBy(xpath = "//*[@id=\"damageinsurance\"]/option[2]")
			WebElement Damage1;
			
			@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span")
			WebElement Products;
			
			@FindBy(id = "courtesycar")
			WebElement Courtesy;
			
			@FindBy(xpath = "//*[@id=\"courtesycar\"]/option[2]")
			WebElement Courtesy1;
			
			@FindBy(id = "nextselectpriceoption")
			WebElement btn_next3;
			
			@FindBy(id = "selectpriceoption")
			WebElement telaPreco;
			
			public void preencherDadosProduto() {
				start_date.click();
				nextMonth.click();
				selectDay.click();
				Insurance.click();
				Insurance1.click();
				Merit.click();
				Merit1.click();
				Damage.click();
				Damage1.click();
				Products.click();
				Courtesy.click();
				Courtesy1.click();
			}
			
			public void ClicarProximaProduto() {
				btn_next3.click();
				espere(2);
			}
			
			public void validarTelaPreco() {
				esperarElemento(telaPreco);
				WebElement textoPre = telaPreco;
				String mensagem = textoPre.getText();
				assertTrue(mensagem, true);
			}
}
