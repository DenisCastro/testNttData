package testePratico3.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import intern.CoreWeb;

import static intern.Log.setLogMap;
import static testePratico3.objects.AdvantageMain.*;
import static testePratico3.stepdefs.SDBancoDeDados.*;

public class SDAdvantageMain extends CoreWeb {
    public static float unitPriceProduct = 0;

    @When("O usuario acessa o site {string}")
    public void oUsuarioAcessaOSite(String url) {
        abrirChrome(url);
        setLogMap(ADVANTAGE_MAIN);
        esperarAparecer(ADVANTAGE_MAIN_DIV_ROW_SECTION);
    }
    @And("O usuario acessa o menu special offer e clica em see offer")
    public void oUsuarioAcessaOMenuSpecialOfferEClicaEmSeeOffer() {
        setLogMap(ADVANTAGE_MAIN);
        click(ADVANTAGE_MAIN_BUTTON_SPECIAL_OFFER);
        click(ADVANTAGE_MAIN_BUTTON_SEE_OFFER);
        esperarAparecer(ADVANTAGE_MAIN_DIV_DESCRIPTION);
    }
    @Then("O usuário valida que todos os valores apresentados no portal estao iguais ao armazenado no banco")
    public void oUsuárioValidaQueTodosOsValoresApresentadosNoPortalEstaoIguaisAoArmazenadoNoBanco() {
        setLogMap(ADVANTAGE_MAIN);

        String nameProduct = getText(ADVANTAGE_MAIN_TEXT_PRODUCT_NAME);
        String customization = getText(ADVANTAGE_MAIN_TEXT_PRODUCT_SPECIFICATIONS_CUSTOMIZATION);
        String display = getText(ADVANTAGE_MAIN_TEXT_PRODUCT_SPECIFICATIONS_DISPLAY);
        String displayResolution = getText(ADVANTAGE_MAIN_TEXT_PRODUCT_SPECIFICATIONS_RESOLUTION);
        String displaySize = getText(ADVANTAGE_MAIN_TEXT_PRODUCT_SPECIFICATIONS_DISPLAY_SIZE);
        String memory = getText(ADVANTAGE_MAIN_TEXT_PRODUCT_SPECIFICATIONS_MEMORY);
        String operatingSystem = getText(ADVANTAGE_MAIN_TEXT_PRODUCT_SPECIFICATIONS_OPERATING_SYSTEM);
        String processor = getText(ADVANTAGE_MAIN_TEXT_PRODUCT_SPECIFICATIONS_PROCESSOR);
        String touchscreen = getText(ADVANTAGE_MAIN_TEXT_PRODUCT_SPECIFICATIONS_TOUCHSCREEN);
        String weight = getText(ADVANTAGE_MAIN_TEXT_PRODUCT_SPECIFICATIONS_WEIGHT);

        assertEquals(nameProduct, dbNameProduct);
        assertEquals(customization, dbCustomization);
        assertEquals(display, dbDisplay);
        assertEquals(displayResolution, dbDisplayResolution);
        assertEquals(displaySize, dbDisplaySize);
        assertEquals(memory, dbMemory);
        assertEquals(operatingSystem, dbOperatingSystem);
        assertEquals(processor, dbProcessor);
        assertEquals(touchscreen, dbTouchscreen);
        assertEquals(weight, dbWeight);
    }
    @And("O usuario realiza a pesquisa do produto por nome com o valor recebido na consulta do banco")
    public void oUsuarioRealizaAPesquisaDoProdutoPorNomeComOValorRecebidoNaConsultaDoBanco() {
        setLogMap(ADVANTAGE_MAIN);
        esperarAparecer(ADVANTAGE_MAIN_BUTTON_OPEN_SEARCH);
        click(ADVANTAGE_MAIN_BUTTON_OPEN_SEARCH);
        digitar(ADVANTAGE_MAIN_INPUT_SEARCH, dbNameProduct);
        esperar(1000);
        click(ADVANTAGE_MAIN_BUTTON_SEARCH);
        unitPriceProduct = Float.parseFloat(getText(ADVANTAGE_MAIN_TEXT_UNIT_PRICE).replace("$", ""));
        click(ADVANTAGE_MAIN_BUTTON_RESULT_SEARCH);
    }
    @And("O usuário acessa a pagina de checkout")
    public void oUsuárioAcessaAPaginaDeCheckout() {
        setLogMap(ADVANTAGE_MAIN);
        click(ADVANTAGE_MAIN_BUTTON_CART);
        click(ADVANTAGE_MAIN_BUTTON_CHECKOUT);
    }

    @When("O usuário acessa o carrinho de compras")
    public void oUsuárioAcessaOCarrinhoDeCompras() {
        setLogMap(ADVANTAGE_MAIN);
        click(ADVANTAGE_MAIN_BUTTON_CART);
    }
}
