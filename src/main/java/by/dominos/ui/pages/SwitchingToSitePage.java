package by.dominos.ui.pages;

import by.dominos.ui.webdriver.Singleton;
import by.dominos.ui.xpath.SwitchingToSiteXpath;
import by.dominos.utils.ScrollToBoottom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SwitchingToSitePage {
    private final WebDriver driver;

    public SwitchingToSitePage() {
        this.driver = Singleton.getDriver();
    }

    public SwitchingToSitePage clickingToInstagram() {
        new ScrollToBoottom().scrollToBoottom(driver);
        driver.findElement(By.xpath(SwitchingToSiteXpath.CLICK_INSTAGRAM_XPATH)).click();
        return this;
    }

    public SwitchingToSitePage clickingToFacebook() {
        new ScrollToBoottom().scrollToBoottom(driver);
        driver.findElement(By.xpath(SwitchingToSiteXpath.CLICK_FACEBOOK_XPATH)).click();
        return this;
    }

    public SwitchingToSitePage clickingToTiktok() {
        new ScrollToBoottom().scrollToBoottom(driver);
        driver.findElement(By.xpath(SwitchingToSiteXpath.CLICK_TIKTOK_XPATH)).click();
        return this;
    }
}
