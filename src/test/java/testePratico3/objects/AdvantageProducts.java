package testePratico3.objects;

import java.util.LinkedHashMap;

public class AdvantageProducts {

    public static String ADVANTAGE_PRODUCTS_BUTTON_COLLOR_BLUE = "//div[@id=\"productProperties\"]//div[@ng-show=\"firstImageToShow\"]/span[@title=\"BLUE\"]";
    public static String ADVANTAGE_PRODUCTS_BUTTON_COLLOR_BLACK = "//div[@id=\"productProperties\"]//div[@ng-show=\"firstImageToShow\"]/span[@title=\"BLACK\"]";
    public static String ADVANTAGE_PRODUCTS_BUTTON_COLLOR_GRAY = "//div[@id=\"productProperties\"]//div[@ng-show=\"firstImageToShow\"]/span[@title=\"GRAY\"]";
    public static String ADVANTAGE_PRODUCTS_BUTTON_COLLOR_PURPLE = "//div[@id=\"productProperties\"]//div[@ng-show=\"firstImageToShow\"]/span[@title=\"PURPLE\"]";
    public static String ADVANTAGE_PRODUCTS_BUTTON_COLLOR_RED = "//div[@id=\"productProperties\"]//div[@ng-show=\"firstImageToShow\"]/span[@title=\"RED\"]";
    public static String ADVANTAGE_PRODUCTS_BUTTON_COLLOR_YELLOW = "//div[@id=\"productProperties\"]//div[@ng-show=\"firstImageToShow\"]/span[@title=\"YELLOW\"]";
    public static String ADVANTAGE_PRODUCTS_BUTTON_ADD_TO_CART = "//div[@id=\"productProperties\"]//button[@name=\"save_to_cart\"]";
    public static String ADVANTAGE_PRODUCTS_BUTTON_ADD_QTD = "//div[@id=\"productProperties\"]//div[@class=\"e-sec-plus-minus\"]/div[@class=\"plus\"]";

    public static LinkedHashMap<String, String> ADVANTAGE_PRODUCTS = createData();
    private static LinkedHashMap<String, String> createData() {
        LinkedHashMap<String, String> ret = new LinkedHashMap<>();
        ret.put(ADVANTAGE_PRODUCTS_BUTTON_COLLOR_BLUE, "cor do produto - azul");
        ret.put(ADVANTAGE_PRODUCTS_BUTTON_COLLOR_BLACK, "cor do produto - preto");
        ret.put(ADVANTAGE_PRODUCTS_BUTTON_COLLOR_GRAY, "cor do produto - cinza");
        ret.put(ADVANTAGE_PRODUCTS_BUTTON_COLLOR_PURPLE, "cor do produto - roxo");
        ret.put(ADVANTAGE_PRODUCTS_BUTTON_COLLOR_RED, "cor do produto - vermelho");
        ret.put(ADVANTAGE_PRODUCTS_BUTTON_COLLOR_YELLOW, "cor do produto - amarelo");
        ret.put(ADVANTAGE_PRODUCTS_BUTTON_ADD_TO_CART, "botão adicionar produto ao carrinho");
        ret.put(ADVANTAGE_PRODUCTS_BUTTON_ADD_QTD, "adicionar quantidade produtos");
        return ret;
    }
}
