Feature: Teste Pratico 3

  @Cenario1
  Scenario: 1 – Validar especificações do produto
    Given O usuário realiza a consulta no banco de dados pelo aparelho em oferta
    When O usuario acessa o site "https://advantageonlineshopping.com/"
    And O usuario acessa o menu special offer e clica em see offer
    Then O usuário valida que todos os valores apresentados no portal estao iguais ao armazenado no banco

  @Cenario2
  Scenario: 2 – Validar alteração de cor do produto no carrinho
    Given O usuário realiza a consulta no banco de dados pelo aparelho em oferta
    And O usuario acessa o site "https://advantageonlineshopping.com/"
    And O usuario acessa o menu special offer e clica em see offer
    And O usuario altera a cor do produto de acordo com a cor informada no banco de automacao
    When O usuario adiciona o produto ao carrinho
    Then O usuario valida que o produto foi adicionado ao carrinho com a cor selecionada
    #Then O usuário valida que todos os valores apresentados no portal estao iguais ao armazenado no banco

