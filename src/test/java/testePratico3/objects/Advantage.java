package testePratico3.objects;

import java.util.LinkedHashMap;

public class Advantage {
    public static String ADVANTAGE_DIV_ROW_SECTION = "(//div[@class=\"rowSection\"])[1]";
    public static String ADVANTAGE_BUTTON_SPECIAL_OFFER = "(//a[@id=\"shoppingCartLink\"]/ancestor::li/following-sibling::li)[5]";
    public static String ADVANTAGE_BUTTON_SEE_OFFER = "//button[@id=\"see_offer_btn\"]";
    public static String ADVANTAGE_DIV_DESCRIPTION = "//div[@id=\"Description\"]";
    public static String ADVANTAGE_TEXT_PRODUCT_NAME = "//div[@id=\"Description\"]/h1";
    public static String ADVANTAGE_TEXT_PRODUCT_SPECIFICATIONS_CUSTOMIZATION = "(((//article[@class=\"max-width \"])[2]/div)[1]/label)[2]";
    public static String ADVANTAGE_TEXT_PRODUCT_SPECIFICATIONS_DISPLAY = "(((//article[@class=\"max-width \"])[2]/div)[2]/label)[2]";
    public static String ADVANTAGE_TEXT_PRODUCT_SPECIFICATIONS_RESOLUTION = "(((//article[@class=\"max-width \"])[2]/div)[3]/label)[2]";
    public static String ADVANTAGE_TEXT_PRODUCT_SPECIFICATIONS_DISPLAY_SIZE = "(((//article[@class=\"max-width \"])[2]/div)[4]/label)[2]";
    public static String ADVANTAGE_TEXT_PRODUCT_SPECIFICATIONS_MEMORY = "(((//article[@class=\"max-width \"])[2]/div)[5]/label)[2]";
    public static String ADVANTAGE_TEXT_PRODUCT_SPECIFICATIONS_OPERATING_SYSTEM = "(((//article[@class=\"max-width \"])[2]/div)[6]/label)[2]";
    public static String ADVANTAGE_TEXT_PRODUCT_SPECIFICATIONS_PROCESSOR = "(((//article[@class=\"max-width \"])[2]/div)[7]/label)[2]";
    public static String ADVANTAGE_TEXT_PRODUCT_SPECIFICATIONS_TOUCHSCREEN = "(((//article[@class=\"max-width \"])[2]/div)[8]/label)[2]";
    public static String ADVANTAGE_TEXT_PRODUCT_SPECIFICATIONS_WEIGHT = "(((//article[@class=\"max-width \"])[2]/div)[9]/label)[2]";


    public static String ADVANTAGE_BUTTON_COLLOR_BLUE = "//div[@id=\"productProperties\"]//div[@ng-show=\"firstImageToShow\"]/span[@title=\"BLUE\"]";
    public static String ADVANTAGE_BUTTON_COLLOR_BLACK = "//div[@id=\"productProperties\"]//div[@ng-show=\"firstImageToShow\"]/span[@title=\"BLACK\"]";
    public static String ADVANTAGE_BUTTON_COLLOR_GRAY = "//div[@id=\"productProperties\"]//div[@ng-show=\"firstImageToShow\"]/span[@title=\"GRAY\"]";
    public static String ADVANTAGE_BUTTON_COLLOR_PURPLE = "//div[@id=\"productProperties\"]//div[@ng-show=\"firstImageToShow\"]/span[@title=\"PURPLE\"]";
    public static String ADVANTAGE_BUTTON_COLLOR_RED = "//div[@id=\"productProperties\"]//div[@ng-show=\"firstImageToShow\"]/span[@title=\"RED\"]";
    public static String ADVANTAGE_BUTTON_COLLOR_YELLOW = "//div[@id=\"productProperties\"]//div[@ng-show=\"firstImageToShow\"]/span[@title=\"YELLOW\"]";
    public static String ADVANTAGE_BUTTON_ADD_TO_CART = "//div[@id=\"productProperties\"]//button[@name=\"save_to_cart\"]";
    public static String ADVANTAGE_BUTTON_CART = "//a[@id=\"shoppingCartLink\"]";
    public static String ADVANTAGE_TEXT_PRODUCT_NAME_CART = "(//div[@id=\"shoppingCart\"]//tbody/tr/td)[2]";
    public static String ADVANTAGE_TEXT_PRODUCT_COLLOR_CART = "(//div[@id=\"shoppingCart\"]//tbody/tr/td)[4]/span";

    public static LinkedHashMap<String, String> ADVANTAGE = createData();
    private static LinkedHashMap<String, String> createData() {
        LinkedHashMap<String, String> ret = new LinkedHashMap<>();
        ret.put(ADVANTAGE_DIV_ROW_SECTION, "primeira linha da home");
        ret.put(ADVANTAGE_BUTTON_SPECIAL_OFFER, "button menu special offer");
        ret.put(ADVANTAGE_BUTTON_SEE_OFFER, "button see offer");
        ret.put(ADVANTAGE_DIV_DESCRIPTION, "div product description");
        ret.put(ADVANTAGE_TEXT_PRODUCT_NAME, "nome do produto");
        ret.put(ADVANTAGE_TEXT_PRODUCT_SPECIFICATIONS_CUSTOMIZATION, "customização do produto");
        ret.put(ADVANTAGE_TEXT_PRODUCT_SPECIFICATIONS_DISPLAY, "display do produto");
        ret.put(ADVANTAGE_TEXT_PRODUCT_SPECIFICATIONS_RESOLUTION, "resolução do produto");
        ret.put(ADVANTAGE_TEXT_PRODUCT_SPECIFICATIONS_DISPLAY_SIZE, "tamanho tela do produto");
        ret.put(ADVANTAGE_TEXT_PRODUCT_SPECIFICATIONS_MEMORY, "memória do produto");
        ret.put(ADVANTAGE_TEXT_PRODUCT_SPECIFICATIONS_OPERATING_SYSTEM, "sistema operacional do produto");
        ret.put(ADVANTAGE_TEXT_PRODUCT_SPECIFICATIONS_PROCESSOR, "processador do produto");
        ret.put(ADVANTAGE_TEXT_PRODUCT_SPECIFICATIONS_TOUCHSCREEN, "touchscreen do produto");
        ret.put(ADVANTAGE_TEXT_PRODUCT_SPECIFICATIONS_WEIGHT, "peso do produto");
        ret.put(ADVANTAGE_BUTTON_COLLOR_BLUE, "cor do produto - azul");
        ret.put(ADVANTAGE_BUTTON_COLLOR_BLACK, "cor do produto - preto");
        ret.put(ADVANTAGE_BUTTON_COLLOR_GRAY, "cor do produto - cinza");
        ret.put(ADVANTAGE_BUTTON_COLLOR_PURPLE, "cor do produto - roxo");
        ret.put(ADVANTAGE_BUTTON_COLLOR_RED, "cor do produto - vermelho");
        ret.put(ADVANTAGE_BUTTON_COLLOR_YELLOW, "cor do produto - amarelo");
        ret.put(ADVANTAGE_BUTTON_ADD_TO_CART, "botão adicionar produto ao carrinho");
        ret.put(ADVANTAGE_BUTTON_CART, "botão carrinho");
        ret.put(ADVANTAGE_TEXT_PRODUCT_NAME_CART, "nome do produto presente no carrinho");
        ret.put(ADVANTAGE_TEXT_PRODUCT_COLLOR_CART, "cor do produto presente no carrinho");
        return ret;
    }
}
