package testePratico3.objects;

import java.util.LinkedHashMap;

public class AdvantageCart {
    public static String ADVANTAGE_CART_TEXT_PRODUCT_NAME_CART = "(//div[@id=\"shoppingCart\"]//tbody/tr/td)[2]";
    public static String ADVANTAGE_CART_TEXT_PRODUCT_COLLOR_CART = "(//div[@id=\"shoppingCart\"]//tbody/tr/td)[4]/span";
    public static LinkedHashMap<String, String> ADVANTAGE_CART = createData();
    private static LinkedHashMap<String, String> createData() {
        LinkedHashMap<String, String> ret = new LinkedHashMap<>();
        ret.put(ADVANTAGE_CART_TEXT_PRODUCT_NAME_CART, "nome do produto presente no carrinho");
        ret.put(ADVANTAGE_CART_TEXT_PRODUCT_COLLOR_CART, "cor do produto presente no carrinho");
        return ret;
    }
}
