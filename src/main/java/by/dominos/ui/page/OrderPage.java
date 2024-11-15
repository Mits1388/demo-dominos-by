package by.dominos.ui.page;

import by.dominos.ui.OrderXpath;
import by.dominos.ui.webdriver.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class OrderPage {
    private WebDriver driver;

    public OrderPage() {
        this.driver = Singleton.getDriver();
    }

    public OrderPage clickSizeL() {
        By by = By.xpath(OrderXpath.SIZE_L_CHICKEN_WITH_CHAMPIGNONS_XPATH);
        WebElement element = driver.findElement(by);
        element.click();
        return this;
    }

    public OrderPage clickClassicPizza() {
        By by = By.xpath(OrderXpath.CLASSIC_CHICKEN_WITH_CHAMPIGNONS_XPATH);
        WebElement element = driver.findElement(by);
        element.click();
        return this;
    }

    public OrderPage clickInBasket() {
        By by = By.xpath(OrderXpath.BUTTON_IN_BASKET_CHICKEN_WITH_CHAMPIGNONS_XPATH);
        WebElement element = driver.findElement(by);
        element.click();
        return this;
    }

    public OrderPage clickBasket() {
        By by = By.xpath(OrderXpath.BUTTON_BASKET_XPATH);
        WebElement element = driver.findElement(by);
        element.click();
        return this;
    }

    public OrderPage clickClose() {
        By by = By.xpath(OrderXpath.BUTTON_CLOSE_XPATH);
        WebElement element = driver.findElement(by);
        element.click();
        return this;
    }

    public String orderNamePizza() {
        By by = By.xpath(OrderXpath.ORDER_CHICKEN_WITH_CHAMPIGNONS_XPATH);
        WebElement element = driver.findElement(by);
        return element.getText();
    }

    public String orderSizeAndBasePizza() {
        By by = By.xpath(OrderXpath.ORDER_SIZE_AND_BASE_PIZZA_XPATH);
        WebElement element = driver.findElement(by);
        return element.getText();
    }


}
