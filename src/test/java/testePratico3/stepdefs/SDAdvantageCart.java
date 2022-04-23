package testePratico3.stepdefs;

import cucumber.api.java.en.Then;
import intern.CoreWeb;

import static intern.Log.setLogMap;
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
}
