#language: pt

Funcionalidade: Preco
	
	Contexto: 
		 Dado que esteja na pagina de informacoes
	
	@Preco
	Cenario: Seleciono a opcao do preco
		Quando preencher todos os campos do veiculo
  	E valido a tela seguro
		E preencher todos os campos de dados do seguro
  	E valido a tela produto
    E preencher todos os campos do produto
    E valido a tela preco
    E selecionar uma opcao do preco
    Entao valido a tela cotacao