#language: pt

Funcionalidade: Produto
	
	Contexto: 
		 Dado que esteja na pagina de informacoes
	
	@Produto
	Cenario: Preencho a informacoes do produto
		Quando preencher todos os campos do veiculo
  	E valido a tela seguro
		E preencher todos os campos de dados do seguro
  	E valido a tela produto
    E preencher todos os campos do produto
    Entao valido a tela preco