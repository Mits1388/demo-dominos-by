package by.dominos.ui.pages;

import by.dominos.ui.webdriver.Singleton;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver driver;

    public HomePage() {
        driver = Singleton.getDriver();
    }

    public void open() {
        driver.get("https://dominos.by/ru/minsk/");
    }
}
