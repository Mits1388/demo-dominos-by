package by.dominos.utils;

import by.dominos.ui.webdriver.Singleton;
import org.openqa.selenium.WebDriver;
import java.util.Set;

public class SwitchToWindow {

    public String switchToWindow(WebDriver driver) {

        String originalWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        return driver.getCurrentUrl();
    }
}
