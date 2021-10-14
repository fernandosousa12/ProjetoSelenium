#language: pt

Funcionalidade: Seguro

  Contexto: 
    Dado que esteja na pagina de informacoes
	
	@Contratar
  Cenario: Preencher informacoes do veiculo
    Quando preencher todos os campos do veiculo
  	E valido a tela seguro
		E preencher todos os campos de dados do seguro
  	E valido a tela produto
    E preencher todos os campos do produto
    E valido a tela preco
    E selecionar uma opcao do preco
    E valido a tela cotacao
    E preencher todos os campos para enviar cotacao
    Entao o sistema verifica a mensagem