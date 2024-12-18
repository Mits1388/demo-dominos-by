package by.dominos.ui;

import by.dominos.ui.messages.SwitchingToSiteMessage;
import by.dominos.ui.pages.HomePage;
import by.dominos.ui.pages.SwitchingToSitePage;
import by.dominos.ui.webdriver.Singleton;
import by.dominos.utils.SwitchToWindow;
import org.junit.jupiter.api.*;


public class SwitchingToSiteTest {
    private SwitchingToSitePage switching;

    @BeforeEach
    public void setUp() {
        HomePage homePage = new HomePage();
        homePage.open();
        switching = new SwitchingToSitePage();
    }

    @Test
    @DisplayName("тест: проверка перехода на сайт instagram")
    public void switchingInstagram() {
        switching
                .clickingToInstagram();
        Assertions.assertEquals(SwitchingToSiteMessage.INSTAGRAM_LINK, new SwitchToWindow().switchToWindow(Singleton.getDriver()));
    }

    @Test
    @DisplayName("тест: проверка перехода на сайт facebook")
    public void switchingFacebook() {
        switching
                .clickingToFacebook();
        Assertions.assertEquals(SwitchingToSiteMessage.FACEBOOK_LINK, new SwitchToWindow().switchToWindow(Singleton.getDriver()));
    }

    @Test
    @DisplayName("тест: проверка перехода на сайт tiktok")
    public void switchingTiktok() {
        switching
                .clickingToTiktok();
        Assertions.assertEquals(SwitchingToSiteMessage.TIKTOK_LINK, new SwitchToWindow().switchToWindow(Singleton.getDriver()));
    }

    @AfterEach
    public void tearDown() {
        Singleton.quit();
    }
}
