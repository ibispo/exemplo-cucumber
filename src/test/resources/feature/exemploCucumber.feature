#language: pt
Funcionalidade: Testes exemplo Cucumber

# @happy ---- tag para executar cenarios especificos

	@happy
  Cenário: Teste cucumber Amazon
    Dado que esteja na pagina: 'http://www.amazon.com.br'
    Quando fizer a busca pelo produto 'IPhone 12'
    Entao vou verificar se o valor esta acima de "4.984"
