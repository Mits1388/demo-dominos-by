package by.dominos.ui;

import by.dominos.ui.pages.HomePage;
import by.dominos.ui.webdriver.Singleton;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    @BeforeEach
    public void setUp() {

        new HomePage().open();
    }

    @AfterEach
    public void tearDown() {

        Singleton.quit();
    }
}
