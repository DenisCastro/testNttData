package testePratico3.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import intern.CoreWeb;

import static intern.Log.setLogMap;
import static testePratico3.objects.Advantage.*;
import static testePratico3.stepdefs.SDBancoDeDados.*;

public class SDAdvantage extends CoreWeb {

    @When("O usuario acessa o site {string}")
    public void oUsuarioAcessaOSite(String url) {
        abrirChrome(url);
        setLogMap(ADVANTAGE);
        esperarAparecer(ADVANTAGE_DIV_ROW_SECTION);
    }

    @And("O usuario acessa o menu special offer e clica em see offer")
    public void oUsuarioAcessaOMenuSpecialOfferEClicaEmSeeOffer() {
        setLogMap(ADVANTAGE);
        click(ADVANTAGE_BUTTON_SPECIAL_OFFER);
        click(ADVANTAGE_BUTTON_SEE_OFFER);
        esperarAparecer(ADVANTAGE_DIV_DESCRIPTION);
    }

    @Then("O usuário valida que todos os valores apresentados no portal estao iguais ao armazenado no banco")
    public void oUsuárioValidaQueTodosOsValoresApresentadosNoPortalEstaoIguaisAoArmazenadoNoBanco() {
        setLogMap(ADVANTAGE);

        String nameProduct = getText(ADVANTAGE_TEXT_PRODUCT_NAME);
        String customization = getText(ADVANTAGE_TEXT_PRODUCT_SPECIFICATIONS_CUSTOMIZATION);
        String display = getText(ADVANTAGE_TEXT_PRODUCT_SPECIFICATIONS_DISPLAY);
        String displayResolution = getText(ADVANTAGE_TEXT_PRODUCT_SPECIFICATIONS_RESOLUTION);
        String displaySize = getText(ADVANTAGE_TEXT_PRODUCT_SPECIFICATIONS_DISPLAY_SIZE);
        String memory = getText(ADVANTAGE_TEXT_PRODUCT_SPECIFICATIONS_MEMORY);
        String operatingSystem = getText(ADVANTAGE_TEXT_PRODUCT_SPECIFICATIONS_OPERATING_SYSTEM);
        String processor = getText(ADVANTAGE_TEXT_PRODUCT_SPECIFICATIONS_PROCESSOR);
        String touchscreen = getText(ADVANTAGE_TEXT_PRODUCT_SPECIFICATIONS_TOUCHSCREEN);
        String weight = getText(ADVANTAGE_TEXT_PRODUCT_SPECIFICATIONS_WEIGHT);

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

    @When("O usuario altera a cor do produto de acordo com a cor informada no banco de automacao")
    public void oUsuarioAlteraACorDoProdutoDeAcordoComACorInformadaNoBancoDeAutomacao() {
        setLogMap(ADVANTAGE);

        switch (dbColor){
            case "BLUE":
                click(ADVANTAGE_BUTTON_COLLOR_BLUE);
                break;
            case "BLACK":
                click(ADVANTAGE_BUTTON_COLLOR_BLACK);
                break;
            case "GRAY":
                click(ADVANTAGE_BUTTON_COLLOR_GRAY);
                break;
            case "PURPLE":
                click(ADVANTAGE_BUTTON_COLLOR_PURPLE);
                break;
            case "RED":
                click(ADVANTAGE_BUTTON_COLLOR_RED);
                break;
            case "YELLOW":
                click(ADVANTAGE_BUTTON_COLLOR_YELLOW);
                break;
        }
    }

    @When("O usuario adiciona o produto ao carrinho")
    public void oUsuarioAdicionaOProdutoAoCarrinho() {
        setLogMap(ADVANTAGE);
        click(ADVANTAGE_BUTTON_ADD_TO_CART);
    }

    @Then("O usuario valida que o produto foi adicionado ao carrinho com a cor selecionada")
    public void oUsuarioValidaQueOProdutoFoiAdicionadoAoCarrinhoComACorSelecionada() {
        setLogMap(ADVANTAGE);
        click(ADVANTAGE_BUTTON_CART);
        String nomeProdutoCarrinho = getText(ADVANTAGE_TEXT_PRODUCT_NAME_CART);
        String corProdutoCarrinho = getAttribute(ADVANTAGE_TEXT_PRODUCT_COLLOR_CART, "title");
        assertEquals(nomeProdutoCarrinho, dbNameProduct);
        assertEquals(corProdutoCarrinho, dbColor);

    }
}
