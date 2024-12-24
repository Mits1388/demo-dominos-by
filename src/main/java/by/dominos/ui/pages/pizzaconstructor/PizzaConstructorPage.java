package by.dominos.ui.pages.pizzaconstructor;

import by.dominos.ui.webdriver.Singleton;
import by.dominos.utils.ScrollToElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class PizzaConstructorPage {
    private final WebDriver driver;

    public PizzaConstructorPage() {
        this.driver = Singleton.getDriver();
    }

    public PizzaConstructorPage clickingToBurger() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_BURGER_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToBConstructorPizza() {

        WebElement element = driver.findElement(By.xpath(PizzaConstructorXpath.CLICK_CONSTRUCTOR_PIZZA_XPATH));
        new ScrollToElement().scrollToElement(driver, element);
        element.click();
        return this;
    }

    public PizzaConstructorPage clickingToMeat() {
        WebElement element = driver.findElement(By.xpath(PizzaConstructorXpath.CLICK_MEAT_XPATH));
        new ScrollToElement().scrollToElement(driver, element);
        element.click();
        return this;
    }

    public PizzaConstructorPage clickingToSeafood() {
        WebElement element = driver.findElement(By.xpath(PizzaConstructorXpath.CLICK_SEAFOOD_XPATH));
        new ScrollToElement().scrollToElement(driver, element);
        element.click();
        return this;
    }

    public PizzaConstructorPage clickingToVegetables() {

        WebElement element = driver.findElement(By.xpath(PizzaConstructorXpath.CLICK_VEGETABLES_XPATH));
        new ScrollToElement().scrollToElement(driver, element);
        element.click();
        return this;
    }

    public PizzaConstructorPage clickingToProducts() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_PRODUCTS_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToCheese() {
        WebElement element = driver.findElement(By.xpath(PizzaConstructorXpath.CLICK_CHEESE_XPATH));
        new ScrollToElement().scrollToElement(driver, element);
        element.click();
        return this;
    }

    public PizzaConstructorPage clickingToSauces() {
        WebElement element = driver.findElement(By.xpath(PizzaConstructorXpath.CLICK_SAUCES_XPATH));
        new ScrollToElement().scrollToElement(driver, element);
        element.click();
        return this;
    }

    public PizzaConstructorPage clickingToChicken() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_CHICKEN_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToShrimps() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_SHRIMPS_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToSweetPepper() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_SWEET_PEPPER_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToPineapple() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_PINEAPPLE_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToMinusMozzarellaCheese() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_MINUS_MOZZARELLA_CHEESE_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToMinusDominosTomatoSauce() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_MINUS_DOMINOS_TOMATO_SAUCE_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToFriedOnions() {

        WebElement element = driver.findElement(By.xpath(PizzaConstructorXpath.CLICK_FRIED_ONIONS_XPATH));
        new ScrollToElement().scrollToElement(driver, element);
        element.click();
        return this;
    }

    public String sweetPepper() {
        WebElement element = driver.findElement(By.xpath(PizzaConstructorXpath.SWEET_PEPPER_XPATH));
        new ScrollToElement().scrollToElement(driver, element);
        return element.getText();
    }

    public String friedOnions() {
        WebElement element = driver.findElement(By.xpath(PizzaConstructorXpath.FRIED_ONIONS_XPATH));
        new ScrollToElement().scrollToElement(driver, element);
        return element.getText();
    }

    public String chicken() {
        WebElement element = driver.findElement(By.xpath(PizzaConstructorXpath.CHICKEN_XPATH));
        new ScrollToElement().scrollToElement(driver, element);
        return element.getText();
    }

    public String shrimps() {
        WebElement element = driver.findElement(By.xpath(PizzaConstructorXpath.SHRIMPS_XPATH));
        new ScrollToElement().scrollToElement(driver, element);
        return element.getText();
    }

    public String pineapple() {
        WebElement element = driver.findElement(By.xpath(PizzaConstructorXpath.PINEAPPLE_XPATH));
        new ScrollToElement().scrollToElement(driver, element);
        return element.getText();
    }
}
