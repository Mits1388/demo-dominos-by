package by.dominos.ui;

import by.dominos.ui.pages.HomePage;
import by.dominos.ui.pages.PizzaConstructorPage;
import by.dominos.ui.webdriver.Singleton;
import org.junit.jupiter.api.*;


public class PizzaConstructorTest {
    private PizzaConstructorPage pizza;

    @BeforeEach
    public void setUp() {
        HomePage homePage = new HomePage();
        homePage.open();
        pizza = new PizzaConstructorPage();
    }

    @Test
    @DisplayName("тест: сбор пиццы: курица, сладкий перец, обжаренный лук")
    public void testPizzaChicken() {
        pizza
                .clickingToBurger()
                .clickingToBConstructorPizza()
                .clickingToMeat()
                .clickingToChicken()
                .clickingToVegetables()
                .clickingToSweetPepper()
                .clickingToProducts()
                .clickingToFriedOnions();

        //  Assertions.assertEquals(SwitchingToSiteMessage.INSTAGRAM_LINK, new SwitchToWindow().switchToWindow(Singleton.getDriver()));
    }

    @Test
    @DisplayName("тест: сбор пиццы: креветки, ананас")
    public void testPizzaShrimps() {
        pizza
                .clickingToBurger()
                .clickingToBConstructorPizza()
                .clickingToSeafood()
                .clickingToShrimps()
                .clickingToProducts()
                .clickingToPineapple()
                .clickingToCheese()
                .clickingToMinusMozzarellaCheese()
                .clickingToSauces()
                .clickingToMinusDominosTomatoSauce();

        //  Assertions.assertEquals(SwitchingToSiteMessage.INSTAGRAM_LINK, new SwitchToWindow().switchToWindow(Singleton.getDriver()));
    }

    @AfterEach
    public void tearDown() {
        Singleton.quit();
    }
}
