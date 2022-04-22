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
        return ret;
    }
}
