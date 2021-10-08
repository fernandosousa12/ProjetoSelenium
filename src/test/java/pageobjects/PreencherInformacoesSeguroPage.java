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
		
		//Mapeamento aba do preco
		@FindBy(xpath = "//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]/span")
		WebElement selectPreco;
		
		@FindBy(id = "nextsendquote")
		WebElement btn_next4;
		
		@FindBy(id = "sendquote")
		WebElement telaCotacao;
		
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
