package testePratico3.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import intern.CoreWeb;

import static intern.Log.setLogMap;
import static testePratico3.objects.AdvantageProducts.*;
import static testePratico3.stepdefs.SDBancoDeDados.dbColor;
public class SDAdvantageProducts extends CoreWeb {

    public static int quantidadeEquipamentos = 1 ;
    public static String newCollorProduct = "";
    @When("O usuario altera a cor do produto de acordo com a cor informada no banco de automacao")
    public void oUsuarioAlteraACorDoProdutoDeAcordoComACorInformadaNoBancoDeAutomacao() {
        setLogMap(ADVANTAGE_PRODUCTS);

        switch (dbColor){
            case "BLUE":
                click(ADVANTAGE_PRODUCTS_BUTTON_COLLOR_BLUE);
                break;
            case "BLACK":
                click(ADVANTAGE_PRODUCTS_BUTTON_COLLOR_BLACK);
                break;
            case "GRAY":
                click(ADVANTAGE_PRODUCTS_BUTTON_COLLOR_GRAY);
                break;
            case "PURPLE":
                click(ADVANTAGE_PRODUCTS_BUTTON_COLLOR_PURPLE);
                break;
            case "RED":
                click(ADVANTAGE_PRODUCTS_BUTTON_COLLOR_RED);
                break;
            case "YELLOW":
                click(ADVANTAGE_PRODUCTS_BUTTON_COLLOR_YELLOW);
                break;
        }
    }
    @When("O usuario adiciona o produto ao carrinho")
    public void oUsuarioAdicionaOProdutoAoCarrinho() {
        setLogMap(ADVANTAGE_PRODUCTS);
        click(ADVANTAGE_PRODUCTS_BUTTON_ADD_TO_CART);
    }
    @And("O usuario altera a cor do produto para uma cor diferente da cor definida no banco de automacao")
    public void oUsuarioAlteraACorDoProdutoParaUmaCorDiferenteDaCorDefinidaNoBancoDeAutomacao() {
        setLogMap(ADVANTAGE_PRODUCTS);
        switch (dbColor){
            case "BLUE":
                click(ADVANTAGE_PRODUCTS_BUTTON_COLLOR_YELLOW);
                newCollorProduct = "YELLOW";
                break;
            case "BLACK":
                click(ADVANTAGE_PRODUCTS_BUTTON_COLLOR_BLUE);
                newCollorProduct = "BLUE";
                break;
            case "GRAY":
                click(ADVANTAGE_PRODUCTS_BUTTON_COLLOR_BLACK);
                newCollorProduct = "BLACK";
                break;
            case "PURPLE":
                click(ADVANTAGE_PRODUCTS_BUTTON_COLLOR_GRAY);
                newCollorProduct = "GRAY";
                break;
            case "RED":
                click(ADVANTAGE_PRODUCTS_BUTTON_COLLOR_PURPLE);
                newCollorProduct = "PURPLE";
                break;
            case "YELLOW":
                click(ADVANTAGE_PRODUCTS_BUTTON_COLLOR_RED);
                newCollorProduct = "RED";
                break;
        }
    }
    @And("O usuário incrementa a quantidade de produtos que deseja comprar com {int}")
    public void oUsuárioIncrementaAQuantidadeDeProdutosQueDesejaComprarCom(int quantidade) {
        setLogMap(ADVANTAGE_PRODUCTS);
        for (int i = 0; i < quantidade; i++) {
            quantidadeEquipamentos++;
            click(ADVANTAGE_PRODUCTS_BUTTON_ADD_QTD);
        }
    }
}
