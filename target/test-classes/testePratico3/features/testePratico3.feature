Feature: Teste Pratico 3

  @TestePratico3 @Cenario1
  Scenario: 1 – Validar especificações do produto
    Given O usuário realiza a consulta no banco de dados pelo aparelho em oferta
    When O usuario acessa o site "https://advantageonlineshopping.com/"
    And O usuario acessa o menu special offer e clica em see offer
    Then O usuário valida que todos os valores apresentados no portal estao iguais ao armazenado no banco

  @TestePratico3 @Cenario2
  Scenario: 2 – Validar alteração de cor do produto no carrinho
    Given O usuário realiza a consulta no banco de dados pelo aparelho em oferta
    And O usuario acessa o site "https://advantageonlineshopping.com/"
    And O usuario acessa o menu special offer e clica em see offer
    And O usuario altera a cor do produto de acordo com a cor informada no banco de automacao
    When O usuario adiciona o produto ao carrinho
    Then O usuario valida que o produto foi adicionado ao carrinho com a cor selecionada

  @TestePratico3 @Cenario3
  Scenario: 3 – Validar página de checkout
    Given O usuário realiza a consulta no banco de dados pelo aparelho em oferta
    And O usuario acessa o site "https://advantageonlineshopping.com/"
    And O usuario realiza a pesquisa do produto por nome com o valor recebido na consulta do banco
    And O usuario altera a cor do produto para uma cor diferente da cor definida no banco de automacao
    And O usuário incrementa a quantidade de produtos que deseja comprar com 1
    When O usuario adiciona o produto ao carrinho
    And O usuário acessa a pagina de checkout
    Then O usuario valida que o total apresentado corresponde a soma dos precos dos produtos
    And O usuario realiza um update no banco alterando a cor atual do registo para a selecionada no teste

  @TestePratico3 @Cenario4
  Scenario: 4 – Remover produto do carrinho de compras
    Given O usuario acessa o site "https://advantageonlineshopping.com/"
    And O usuario acessa o menu special offer e clica em see offer
    And O usuario adiciona o produto ao carrinho
    And O usuário acessa o carrinho de compras
    When O usuario remove o produto do carrinho de compras
    Then O usuario valida que o carrinho de compras esta vazio


