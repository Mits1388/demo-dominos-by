package by.dominos.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollToElement {

    public void scrollToElement(WebDriver driver, WebElement element) {

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
