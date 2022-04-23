package testePratico3.stepdefs;

import cucumber.api.java.en.Then;
import intern.CoreWeb;

import static intern.Log.setLogMap;
import static testePratico3.objects.AdvantageOrderPayment.*;
import static testePratico3.stepdefs.SDAdvantageMain.unitPriceProduct;
import static testePratico3.stepdefs.SDAdvantageProducts.quantidadeEquipamentos;
public class SDAdvantageOrderPayment extends CoreWeb {
    @Then("O usuario valida que o total apresentado corresponde a soma dos precos dos produtos")
    public void oUsuarioValidaQueOTotalApresentadoCorrespondeASomaDosPrecosDosProdutos() {
        setLogMap(ADVANTAGE_ORDER_PAYMENT);
        float totalFinal = Float.parseFloat(getText(ADVANTAGE_ORDER_PAYMENT_TEXT_TOTAL_PRICE).replace("$", ""));
        float totalPrevisto = unitPriceProduct * quantidadeEquipamentos;
        assertEquals(totalPrevisto, totalFinal);
    }
}
