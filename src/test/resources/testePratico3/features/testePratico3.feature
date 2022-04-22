Feature: Teste Pratico 3

  @Cenario1
  Scenario: 1 – Validar especificações do produto
    Given O usuário realiza a consulta no banco de dados pelo aparelho em oferta
    When O usuário acessa o site "https://advantageonlineshopping.com/"
    And O usuário acessa o menu special offer e clica em see offer
    Then O usuário valida que todos os valores apresentados no portal estao iguais ao armazenado no banco

