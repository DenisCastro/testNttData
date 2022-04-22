package intern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome {

    public static WebDriver driver = null;

    public static void createChrome() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--ignore-certificate-errors");
        //options.addArguments("--headless");
        driver = new ChromeDriver(options);
    }

    /*public static String pegarUrl() {
        return driver.getCurrentUrl();
    }
    public void navegar(String url) {
        driver.navigate().to(url);
    }*/
}
