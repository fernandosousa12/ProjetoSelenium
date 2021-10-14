package pageobjects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.MetodosUteis;

public class PreencherInformacoesSeguroPage extends MetodosUteis {
	
	public PreencherInformacoesSeguroPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(id = "make")
		WebElement SelectCar;
	
		@FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[1]/select/option[2]")
		WebElement SelectOpcao;
		
		@FindBy(id = "model")
		WebElement modelo;
		
		@FindBy(xpath = "//*[@id=\"model\"]/option[3]")
		WebElement modelo1;
		
		@FindBy(id = "cylindercapacity")
		WebElement cilindro;
	
		@FindBy(id = "engineperformance")
	    WebElement engine;
	    
	    @FindBy(id = "opendateofmanufacturecalender")
	    WebElement date;
	    
	    @FindBy(className = "ui-datepicker-today")
	    WebElement date1;
	    
	    @FindBy(id = "numberofseats")
	    WebElement number_seats;
	    
	    @FindBy(xpath = "//*[@id=\"numberofseats\"]/option[6]")
	    WebElement select_number_seats;
	    
	    @FindBy(id = "numberofseatsmotorcycle")
	    WebElement number_seats1;
	    
	    @FindBy(xpath = "//*[@id=\"numberofseatsmotorcycle\"]/option[3]")
	    WebElement select_number_seats1;
	    
	    @FindBy(id = "fuel")
	    WebElement select_full;
	    
	    @FindBy(xpath = "//*[@id=\"fuel\"]/option[5]")
	    WebElement select_full_type;
	    
	    @FindBy(id = "payload")
	    WebElement peso;
	    
	    @FindBy(id = "totalweight")
	    WebElement tabela;
	    
	    @FindBy(id = "listprice")
	    WebElement list_price;
	    
	    @FindBy(id = "licenseplatenumber")
	    WebElement license_plate;
	    
	    @FindBy(id = "annualmileage")
	    WebElement anual_milege;
	    
	    @FindBy(id = "nextenterinsurantdata")
	    WebElement btn_next1;
	    
	    @FindBy(id = "enterinsurantdata")
		WebElement telaSeguro;

	public void preencherFormulario() {
		SelectCar.click();
		SelectOpcao.click();
		modelo.click();
		modelo1.click();
		cilindro.sendKeys("89");
		engine.sendKeys("178");
		date.click();
		date1.click();
		number_seats.click();
		select_number_seats.click();
		number_seats1.click();
		select_number_seats1.click();
		select_full.click();
		select_full_type.click();
		peso.sendKeys("200");
		tabela.sendKeys("45000");
		list_price.sendKeys("50000");
		license_plate.sendKeys("5463728");
		anual_milege.sendKeys("120");
	}
	
	public void clicarproxima() {
		btn_next1.click();
		espere(2);
	}
	
	public void validarTelaSeguro() {
		esperarElemento(telaSeguro);
		WebElement textoSeg = telaSeguro;
		String mensagem = textoSeg.getText();
		assertTrue(mensagem, true);
	} 
}
