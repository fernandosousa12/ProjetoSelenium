package stepdefinitions;



import org.openqa.selenium.WebDriver;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.EnviarCotacao;
import pageobjects.PreencherInformacoesDadosProduto;
import pageobjects.PreencherInformacoesDadosSeguro;
import pageobjects.PreencherInformacoesSeguroPage;
import pageobjects.SelecioneOpcaoPreco;

public class PreencherInformacoesSeguroSteps {
	
public static WebDriver driver;
	
	@Dado("^que esteja na pagina de informacoes$")
	public void que_esteja_na_pagina_de_informacoes() throws Throwable {
		Hooks.abrirUrl("http://sampleapp.tricentis.com/101/app.php");
	    driver = Hooks.getDriver();
	}

	//Aba Dados do Veiculo
	@Quando("^preencher todos os campos do veiculo$")
	public void preencher_todos_os_campos_do_veiculo() throws Throwable {
	    PreencherInformacoesSeguroPage Sv = new PreencherInformacoesSeguroPage(driver);
	    Sv.preencherFormulario();
	    Sv.clicarproxima();
	}
	
	@Entao("^valido a tela seguro$")
	public void valido_a_tela_seguro() throws Throwable {
		PreencherInformacoesSeguroPage Sv = new PreencherInformacoesSeguroPage(driver);
		Sv.validarTelaSeguro();
	    
	}
	
	
	//Aba Dados do Seguro  
	@Quando("^preencher todos os campos de dados do seguro$")
	public void preencher_todos_os_campos_de_dados_do_seguro() throws Throwable {
		PreencherInformacoesDadosSeguro Ss = new PreencherInformacoesDadosSeguro(driver);
		Ss.preencherDadosSeguro();
		Ss.clicarProximaSeguro();
	}

	@Entao("^valido a tela produto$")
	public void valido_a_tela_produto() throws Throwable {
		PreencherInformacoesDadosSeguro Ss = new PreencherInformacoesDadosSeguro(driver);
		Ss.validarTelaProduto();
	}


	//Aba dados do Produto
	@Quando("^preencher todos os campos do produto$")
	public void preencher_todos_os_campos_do_produto() throws Throwable {
		PreencherInformacoesDadosProduto Sv = new PreencherInformacoesDadosProduto(driver);
		Sv.preencherDadosProduto();
		Sv.ClicarProximaProduto();
	}
	
	@Entao("^valido a tela preco$")
	public void valido_a_tela_preco() throws Throwable {
		PreencherInformacoesDadosProduto Sv = new PreencherInformacoesDadosProduto(driver);
		Sv.validarTelaPreco();
	}

	//Aba opção preço
	@Quando("^selecionar uma opcao do preco$")
	public void selecionar_uma_opcao_do_preco() throws Throwable {
		SelecioneOpcaoPreco Sv = new SelecioneOpcaoPreco(driver);
		Sv.selecionarPreco();
	    Sv.clicarProximaPreco();
	}

	@Entao("^valido a tela cotacao$")
	public void valido_a_tela_cotacao() throws Throwable {
		SelecioneOpcaoPreco Sv = new SelecioneOpcaoPreco(driver);
		Sv.validarTelaCotacao();
	}

	
	//Aba enviar cotação
	@Quando("^preencher todos os campos para enviar cotacao$")
	public void preencher_todos_os_campos_para_enviar_cotacao() throws Throwable {
		EnviarCotacao Sv = new EnviarCotacao(driver);
		Sv.PreencherEnviar();
		Sv.clicarEnviar();
	}
	
	@Entao("^o sistema verifica a mensagem$")
	public void o_sistema_verifica_a_mensagem() throws Throwable {
		EnviarCotacao Sv = new EnviarCotacao(driver);
		Sv.validarMensagem();
	}
}
