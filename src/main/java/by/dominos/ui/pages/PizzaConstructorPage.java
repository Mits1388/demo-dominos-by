package by.dominos.ui.pages;

import by.dominos.ui.messages.PizzaConstructorMessage;
import by.dominos.ui.webdriver.Singleton;
import by.dominos.ui.xpath.PizzaConstructorXpath;
import by.dominos.utils.ScrollToBoottom;
import by.dominos.utils.ScrollToElement;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class PizzaConstructorPage {
    private WebDriver driver;

    public PizzaConstructorPage() {
        this.driver = Singleton.getDriver();
    }

    public PizzaConstructorPage clickingToBurger() {
       // WebElement element = driver.findElement(By.xpath(PizzaConstructorXpath.CLICK_BURGER_XPATH));
        //new ScrollToElement().scrollToElement(driver,element);
       // element.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_BURGER_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToBConstructorPizza() {
        WebElement element = driver.findElement(By.xpath(PizzaConstructorXpath.CLICK_CONSTRUCTOR_PIZZA_XPATH));
        new ScrollToElement().scrollToElement(driver,element);
        element.click();
        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_CONSTRUCTOR_PIZZA_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToMeat() {
        WebElement element = driver.findElement(By.xpath(PizzaConstructorXpath.CLICK_MEAT_XPATH));
        new ScrollToElement().scrollToElement(driver,element);
        element.click();
        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_MEAT_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToSeafood() {
        WebElement element = driver.findElement(By.xpath(PizzaConstructorXpath.CLICK_SEAFOOD_XPATH));
        new ScrollToElement().scrollToElement(driver,element);
        element.click();
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_SEAFOOD_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToVegetables() {
        WebElement element = driver.findElement(By.xpath(PizzaConstructorXpath.CLICK_VEGETABLES_XPATH));
        new ScrollToElement().scrollToElement(driver,element);
        element.click();
       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
       // wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_VEGETABLES_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToProducts() {
        //WebElement element = driver.findElement(By.xpath(PizzaConstructorXpath.CLICK_PRODUCTS_XPATH));
        //new ScrollToElement().scrollToElement(driver,element);
        //element.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_PRODUCTS_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToCheese() {
        WebElement element = driver.findElement(By.xpath(PizzaConstructorXpath.CLICK_CHEESE_XPATH));
        new ScrollToElement().scrollToElement(driver,element);
        element.click();
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_CHEESE_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToSauces() {
        WebElement element = driver.findElement(By.xpath(PizzaConstructorXpath.CLICK_SAUCES_XPATH));
        new ScrollToElement().scrollToElement(driver,element);
        element.click();
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_SAUCES_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToChicken() {
        //WebElement element = driver.findElement(By.xpath(PizzaConstructorXpath.CLICK_CHICKEN_XPATH));
        //new ScrollToElement().scrollToElement(driver,element);
        //element.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_CHICKEN_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToShrimps() {
       //WebElement element = driver.findElement(By.xpath(PizzaConstructorXpath.CLICK_SHRIMPS_XPATH));
        //new ScrollToElement().scrollToElement(driver,element);
       // element.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_SHRIMPS_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToSweetPepper() {
        //WebElement element = driver.findElement(By.xpath(PizzaConstructorXpath.CLICK_SWEET_PEPPER_XPATH));
        //new ScrollToElement().scrollToElement(driver,element);
        //element.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_SWEET_PEPPER_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToPineapple() {
        //WebElement element = driver.findElement(By.xpath(PizzaConstructorXpath.CLICK_PINEAPPLE_XPATH));
       //new ScrollToElement().scrollToElement(driver,element);
        //element.click();
        //new ScrollToBoottom().scrollToBoottom(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_PINEAPPLE_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToMinusMozzarellaCheese() {
        //WebElement element = driver.findElement(By.xpath(PizzaConstructorXpath.CLICK_MINUS_MOZZARELLA_CHEESE_XPATH));
        //new ScrollToElement().scrollToElement(driver,element);
        //element.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_MINUS_MOZZARELLA_CHEESE_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToMinusDominosTomatoSauce() {
        //WebElement element = driver.findElement(By.xpath(PizzaConstructorXpath.CLICK_MINUS_DOMINOS_TOMATO_SAUCE_XPATH));
        //new ScrollToElement().scrollToElement(driver,element);
        //element.click();
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(PizzaConstructorXpath.CLICK_MINUS_DOMINOS_TOMATO_SAUCE_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToFriedOnions() {
        WebElement element = driver.findElement(By.xpath(PizzaConstructorXpath.CLICK_FRIED_ONIONS_XPATH));
        new ScrollToElement().scrollToElement(driver,element);
        element.click();
       // new ScrollToBoottom().scrollToBoottom(driver);
       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
       // wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_FRIED_ONIONS_XPATH))).click();
        return this;
    }

    public String mozzarellaCheese() {
        WebElement element = driver.findElement(By.xpath(PizzaConstructorXpath.MOZZARELLA_CHEESE_XPATH));
        new ScrollToElement().scrollToElement(driver,element);
        return element.getText();
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PizzaConstructorXpath.MOZZARELLA_CHEESE_XPATH))).getText();
    }

    public String dominosTomatoSauce() {
        WebElement element = driver.findElement(By.xpath(PizzaConstructorXpath.DOMINOS_TOMATO_SAUCE_XPATH));
        new ScrollToElement().scrollToElement(driver,element);
        return element.getText();
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PizzaConstructorXpath.DOMINOS_TOMATO_SAUCE_XPATH))).getText();
    }

    public String sweetPepper() {
        WebElement element = driver.findElement(By.xpath(PizzaConstructorXpath.SWEET_PEPPER_XPATH));
        new ScrollToElement().scrollToElement(driver,element);
        return element.getText();
    }

    public String friedOnions() {
        WebElement element = driver.findElement(By.xpath(PizzaConstructorXpath.FRIED_ONIONS_XPATH));
        new ScrollToElement().scrollToElement(driver,element);
        return element.getText();
    }

    public String chicken() {
        WebElement element = driver.findElement(By.xpath(PizzaConstructorXpath.CHICKEN_XPATH));
        new ScrollToElement().scrollToElement(driver,element);
        return element.getText();
    }

    public String shrimps() {
        WebElement element = driver.findElement(By.xpath(PizzaConstructorXpath.SHRIMPS_XPATH));
        new ScrollToElement().scrollToElement(driver,element);
        return element.getText();
    }

    public String pineapple() {
        WebElement element = driver.findElement(By.xpath(PizzaConstructorXpath.PINEAPPLE_XPATH));
        new ScrollToElement().scrollToElement(driver,element);
        return element.getText();
    }
}
