package by.dominos.ui.pages.order;

import by.dominos.ui.webdriver.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {
    private final WebDriver driver;

    public OrderPage() {
        this.driver = Singleton.getDriver();
    }

    public OrderPage clickSizeL() {
        driver.findElement(By.xpath(OrderXpath.SIZE_L_CHICKEN_WITH_CHAMPIGNONS_XPATH)).click();
        return this;
    }

    public OrderPage clickClassicPizza() {
        driver.findElement(By.xpath(OrderXpath.CLASSIC_CHICKEN_WITH_CHAMPIGNONS_XPATH)).click();
        return this;
    }

    public OrderPage clickInBasket() {
        driver.findElement(By.xpath(OrderXpath.BUTTON_IN_BASKET_CHICKEN_WITH_CHAMPIGNONS_XPATH)).click();
        return this;
    }

    public OrderPage clickBasket() {
        driver.findElement(By.xpath(OrderXpath.BUTTON_BASKET_XPATH)).click();
        return this;
    }

    public OrderPage clickClose() {
        driver.findElement(By.xpath(OrderXpath.BUTTON_CLOSE_XPATH)).click();
        return this;
    }

    public String orderNamePizza() {
        return driver.findElement(By.xpath(OrderXpath.ORDER_CHICKEN_WITH_CHAMPIGNONS_XPATH)).getText();
    }

    public String orderSizeAndBasePizza() {
        return driver.findElement(By.xpath(OrderXpath.ORDER_SIZE_AND_BASE_PIZZA_XPATH)).getText();
    }
}
