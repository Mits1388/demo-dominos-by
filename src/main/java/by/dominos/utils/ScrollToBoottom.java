package by.dominos.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ScrollToBoottom {

    public void scrollToBoottom(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        long lastHeight = (long) js.executeScript("return document.body.scrollHeight");
        while (true) {
            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
            long newHeight = (long) js.executeScript("return document.body.scrollHeight");
            if (newHeight == lastHeight) {
                break;
            }
            lastHeight = newHeight;
        }
    }
}
