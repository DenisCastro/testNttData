package testePratico3.objects;

import java.util.LinkedHashMap;

public class AdvantageOrderPayment {
    public static String ADVANTAGE_ORDER_PAYMENT_TEXT_TOTAL_PRICE = "//div[@id=\"userCart\"]//span[@class=\"roboto-medium totalValue ng-binding\"]";
    public static LinkedHashMap<String, String> ADVANTAGE_ORDER_PAYMENT = createData();
    private static LinkedHashMap<String, String> createData() {
        LinkedHashMap<String, String> ret = new LinkedHashMap<>();
        ret.put(ADVANTAGE_ORDER_PAYMENT_TEXT_TOTAL_PRICE, "preço total da compra");
        return ret;
    }
}
