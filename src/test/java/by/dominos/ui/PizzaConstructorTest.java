package by.dominos.ui;

import by.dominos.ui.messages.OrderMessage;
import by.dominos.ui.messages.PizzaConstructorMessage;
import by.dominos.ui.pages.HomePage;
import by.dominos.ui.pages.PizzaConstructorPage;
import by.dominos.ui.webdriver.Singleton;
import org.junit.jupiter.api.*;


public class PizzaConstructorTest extends BaseTest{
    private PizzaConstructorPage pizza;

    @BeforeEach
    public void setUpPizzaConstructor() {
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

        Assertions.assertAll(
                () -> Assertions.assertEquals(PizzaConstructorMessage.CHICKEN_MESSAGE, pizza.chicken()),
                () -> Assertions.assertEquals(PizzaConstructorMessage.SWEET_PEPPER_MESSAGE, pizza.sweetPepper()),
                () -> Assertions.assertEquals(PizzaConstructorMessage.FRIED_ONIONS_MESSAGE, pizza.friedOnions())
        );
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

        Assertions.assertAll(
                () -> Assertions.assertEquals(PizzaConstructorMessage.SHRIMPS_MESSAGE, pizza.shrimps()),
                () -> Assertions.assertEquals(PizzaConstructorMessage.PINEAPPLE_MESSAGE, pizza.pineapple())
        );
    }
}
