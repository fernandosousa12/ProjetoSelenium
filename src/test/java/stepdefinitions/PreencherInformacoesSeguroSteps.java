package stepdefinitions;



import org.openqa.selenium.WebDriver;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.PreencherInformacoesSeguroPage;

public class PreencherInformacoesSeguroSteps {
	
public static WebDriver driver;
	
	@Dado("^que esteja na pagina de informacoes$")
	public void que_esteja_na_pagina_de_informacoes() throws Throwable {
		Hooks.abrirUrl("http://sampleapp.tricentis.com/101/app.php");
	    driver = Hooks.getDriver();
	}

	@Quando("^preencher todos os campos do veiculo$")
	public void preencher_todos_os_campos_do_veiculo() throws Throwable {
	    PreencherInformacoesSeguroPage Sv = new PreencherInformacoesSeguroPage(driver);
	    Sv.preencherFormulario();
	    Sv.clicarproxima();
	}
	
	@Quando("^valido a tela seguro$")
	public void valido_a_tela_seguro() throws Throwable {
		PreencherInformacoesSeguroPage Sv = new PreencherInformacoesSeguroPage(driver);
		Sv.validarTelaSeguro();
	    
	}

	@Quando("^preencher todos os campos de dados do seguro$")
	public void preencher_todos_os_campos_de_dados_do_seguro() throws Throwable {
		PreencherInformacoesSeguroPage Sv = new PreencherInformacoesSeguroPage(driver);
		Sv.preencherDadosSeguro();
		Sv.clicarProximaSeguro();
	    
	}
	
	@Quando("^valido a tela produto$")
	public void valido_a_tela_produto() throws Throwable {
		PreencherInformacoesSeguroPage Sv = new PreencherInformacoesSeguroPage(driver);
		Sv.validarTelaProduto();
	}

	@Quando("^preencher todos os campos do produto$")
	public void preencher_todos_os_campos_do_produto() throws Throwable {
		PreencherInformacoesSeguroPage Sv = new PreencherInformacoesSeguroPage(driver);
		Sv.preencherDadosProduto();
		Sv.ClicarProximaProduto();
	}
	
	@Quando("^valido a tela preco$")
	public void valido_a_tela_preco() throws Throwable {
		PreencherInformacoesSeguroPage Sv = new PreencherInformacoesSeguroPage(driver);
		Sv.validarTelaPreco();
	}

	@Quando("^selecionar uma opcao do preco$")
	public void selecionar_uma_opcao_do_preco() throws Throwable {
		PreencherInformacoesSeguroPage Sv = new PreencherInformacoesSeguroPage(driver);
		Sv.selecionarPreco();
	    Sv.clicarProximaPreco();
	}

	@Quando("^valido a tela cotacao$")
	public void valido_a_tela_cotacao() throws Throwable {
		PreencherInformacoesSeguroPage Sv = new PreencherInformacoesSeguroPage(driver);
		Sv.validarTelaCotacao();
	}

	@Quando("^preencher todos os campos para enviar cotacao$")
	public void preencher_todos_os_campos_para_enviar_cotacao() throws Throwable {
		PreencherInformacoesSeguroPage Sv = new PreencherInformacoesSeguroPage(driver);
		Sv.PreencherEnviar();
		Sv.clicarEnviar();
	}
	
	@Entao("^o sistema verifica a mensagem$")
	public void o_sistema_verifica_a_mensagem() throws Throwable {
		PreencherInformacoesSeguroPage Sv = new PreencherInformacoesSeguroPage(driver);
		Sv.validarMensagem();
	}
}
