package by.dominos.ui.pages;

import by.dominos.ui.xpath.OrderXpath;
import by.dominos.ui.webdriver.Singleton;
import by.dominos.ui.xpath.PizzaConstructorXpath;
import by.dominos.utils.ScrollToElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderPage {
    private final WebDriver driver;

    public OrderPage() {
        this.driver = Singleton.getDriver();
    }

    public OrderPage clickSizeL() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(OrderXpath.SIZE_L_CHICKEN_WITH_CHAMPIGNONS_XPATH))).click();
        //By by = By.xpath(OrderXpath.SIZE_L_CHICKEN_WITH_CHAMPIGNONS_XPATH);
        //WebElement element = driver.findElement(by);
       // element.click();
        return this;
    }

    public OrderPage clickClassicPizza() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(OrderXpath.CLASSIC_CHICKEN_WITH_CHAMPIGNONS_XPATH))).click();
       // By by = By.xpath(OrderXpath.CLASSIC_CHICKEN_WITH_CHAMPIGNONS_XPATH);
       // WebElement element = driver.findElement(by);
       // element.click();
        return this;
    }

    public OrderPage clickInBasket() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(OrderXpath.BUTTON_IN_BASKET_CHICKEN_WITH_CHAMPIGNONS_XPATH))).click();
        //By by = By.xpath(OrderXpath.BUTTON_IN_BASKET_CHICKEN_WITH_CHAMPIGNONS_XPATH);
        //WebElement element = driver.findElement(by);
        //element.click();
        return this;
    }

    public OrderPage clickBasket() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(OrderXpath.BUTTON_BASKET_XPATH))).click();
        //By by = By.xpath(OrderXpath.BUTTON_BASKET_XPATH);
        //WebElement element = driver.findElement(by);
        //element.click();
        return this;
    }

    public OrderPage clickClose() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(OrderXpath.BUTTON_CLOSE_XPATH))).click();
        //By by = By.xpath(OrderXpath.BUTTON_CLOSE_XPATH);
        //WebElement element = driver.findElement(by);
        //element.click();
        return this;
    }

    public String orderNamePizza() {
        WebElement element = driver.findElement(By.xpath(OrderXpath.ORDER_CHICKEN_WITH_CHAMPIGNONS_XPATH));
        new ScrollToElement().scrollToElement(driver, element);
        return element.getText();

        //By by = By.xpath(OrderXpath.ORDER_CHICKEN_WITH_CHAMPIGNONS_XPATH);
       // WebElement element = driver.findElement(by);
       // return element.getText();
    }

    public String orderSizeAndBasePizza() {
        WebElement element = driver.findElement(By.xpath(OrderXpath.ORDER_SIZE_AND_BASE_PIZZA_XPATH));
        new ScrollToElement().scrollToElement(driver, element);
        return element.getText();
        //By by = By.xpath(OrderXpath.ORDER_SIZE_AND_BASE_PIZZA_XPATH);
        //WebElement element = driver.findElement(by);
        //return element.getText();
    }
}
