package testePratico3.stepdefs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import intern.CoreWeb;

import static intern.Log.*;
import static testePratico3.objects.AdvantageCart.*;
import static testePratico3.objects.AdvantageMain.*;
import static testePratico3.stepdefs.SDBancoDeDados.dbColor;
import static testePratico3.stepdefs.SDBancoDeDados.dbNameProduct;

public class SDAdvantageCart extends CoreWeb {
    @Then("O usuario valida que o produto foi adicionado ao carrinho com a cor selecionada")
    public void oUsuarioValidaQueOProdutoFoiAdicionadoAoCarrinhoComACorSelecionada() {
        setLogMap(ADVANTAGE_MAIN);
        click(ADVANTAGE_MAIN_BUTTON_CART);
        setLogMap(ADVANTAGE_CART);
        String nomeProdutoCarrinho = getText(ADVANTAGE_CART_TEXT_PRODUCT_NAME_CART);
        String corProdutoCarrinho = getAttribute(ADVANTAGE_CART_TEXT_PRODUCT_COLLOR_CART, "title");
        assertEquals(nomeProdutoCarrinho, dbNameProduct);
        assertEquals(corProdutoCarrinho, dbColor);
    }

    @When("O usuario remove o produto do carrinho de compras")
    public void oUsuarioRemoveOProdutoDoCarrinhoDeCompras() {
        setLogMap(ADVANTAGE_CART);
        click(ADVANTAGE_CART_BUTTON_REMOVE);
    }

    @Then("O usuario valida que o carrinho de compras esta vazio")
    public void oUsuarioValidaQueOCarrinhoDeComprasEstaVazio() {
        setLogMap(ADVANTAGE_CART);
        esperarAparecer(ADVANTAGE_CART_TEXT_SHOPPING_CART);
        setMaxTempoEspera(1000);
        if (!existe(ADVANTAGE_CART_TEXT_CART_IS_EMPTY)){
            System.out.println(logAzul("O carrinho estava vazio como esperado"));
        } else {
            throw new AssertionError("O carrinho não estava vazio como esperado");
        }

    }
}
