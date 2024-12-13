package by.dominos.ui.pages;

import by.dominos.ui.webdriver.Singleton;
import by.dominos.ui.xpath.PizzaConstructorXpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class PizzaConstructorPage {
    private WebDriver driver;

    public PizzaConstructorPage() {
        this.driver = Singleton.getDriver();
    }

    public PizzaConstructorPage clickingToBurger(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_BURGER_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToBConstructorPizza(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_CONSTRUCTOR_PIZZA_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToMeat(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_MEAT_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToSeafood(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_SEAFOOD_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToVegetables(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_VEGETABLES_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToProducts(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_PRODUCTS_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToCheese(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_CHEESE_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToSauces(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_SAUCES_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToChicken(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_CHICKEN_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToShrimps(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_SHRIMPS_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToSweetPepper(){
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
         wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_SWEET_PEPPER_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToPineapple(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_PINEAPPLE_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToMinusMozzarellaCheese(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_MINUS_MOZZARELLA_CHEESE_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToMinusDominosTomatoSauce(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_MINUS_DOMINOS_TOMATO_SAUCE_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToFriedOnions(){
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_FRIED_ONIONS_XPATH))).click();
       return this;
    }
}
