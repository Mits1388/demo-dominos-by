package by.dominos.ui.pages;

import by.dominos.ui.messages.PizzaConstructorMessage;
import by.dominos.ui.webdriver.Singleton;
import by.dominos.ui.xpath.PizzaConstructorXpath;
import by.dominos.utils.ScrollToBoottom;
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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_BURGER_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToBConstructorPizza() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_CONSTRUCTOR_PIZZA_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToMeat() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_MEAT_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToSeafood() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_SEAFOOD_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToVegetables() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_VEGETABLES_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToProducts() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_PRODUCTS_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToCheese() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_CHEESE_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToSauces() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_SAUCES_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToChicken() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_CHICKEN_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToShrimps() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_SHRIMPS_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToSweetPepper() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_SWEET_PEPPER_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToPineapple() {
        //new ScrollToBoottom().scrollToBoottom(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_PINEAPPLE_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToMinusMozzarellaCheese() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_MINUS_MOZZARELLA_CHEESE_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToMinusDominosTomatoSauce() {
        WebElement element = driver.findElement(By.xpath(PizzaConstructorXpath.CLICK_MINUS_DOMINOS_TOMATO_SAUCE_XPATH));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",element);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        element.click();
        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
       // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(PizzaConstructorXpath.CLICK_MINUS_DOMINOS_TOMATO_SAUCE_XPATH))).click();
        return this;
    }

    public PizzaConstructorPage clickingToFriedOnions() {
        WebElement element = driver.findElement(By.xpath(PizzaConstructorXpath.CLICK_FRIED_ONIONS_XPATH));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",element);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        element.click();
       // new ScrollToBoottom().scrollToBoottom(driver);
       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
       // wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PizzaConstructorXpath.CLICK_FRIED_ONIONS_XPATH))).click();
        return this;
    }

    public String mozzarellaCheese() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PizzaConstructorXpath.MOZZARELLA_CHEESE_XPATH))).getText();
    }

    public String dominosTomatoSauce() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PizzaConstructorXpath.DOMINOS_TOMATO_SAUCE_XPATH))).getText();
    }

    public String sweetPepper() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PizzaConstructorXpath.SWEET_PEPPER_XPATH))).getText();
    }

    public String friedOnions() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PizzaConstructorXpath.FRIED_ONIONS_XPATH))).getText();
    }

    public String chicken() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PizzaConstructorXpath.CHICKEN_XPATH))).getText();
    }

    public String shrimps() {
        WebElement element = driver.findElement(By.xpath(PizzaConstructorXpath.SHRIMPS_XPATH));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",element);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return element.getText();

       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
       // return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(PizzaConstructorXpath.SHRIMPS_XPATH))).getText();
    }

    public String pineapple() {
        WebElement element = driver.findElement(By.xpath(PizzaConstructorXpath.PINEAPPLE_XPATH));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",element);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return element.getText();
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
       // return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(PizzaConstructorXpath.PINEAPPLE_XPATH))).getText();
    }
}
