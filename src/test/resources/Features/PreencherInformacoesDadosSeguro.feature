#language: pt


Funcionalidade: Seguro
	
	Contexto: 
		 Dado que esteja na pagina de informacoes
	
	@Seguro
	Cenario: Preencho a informacoes do seguro
		Quando preencher todos os campos do veiculo
  	E valido a tela seguro
		E preencher todos os campos de dados do seguro
  	Entao valido a tela produto