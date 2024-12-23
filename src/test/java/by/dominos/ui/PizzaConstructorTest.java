package by.dominos.ui;

import by.dominos.ui.messages.PizzaConstructorMessage;
import by.dominos.ui.pages.HomePage;
import by.dominos.ui.pages.PizzaConstructorPage;
import by.dominos.ui.webdriver.Singleton;
import org.junit.jupiter.api.*;


public class PizzaConstructorTest {
    private PizzaConstructorPage pizza;

    @BeforeEach
    public void setUp() {

        new HomePage().open();
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

        Assertions.assertEquals(PizzaConstructorMessage.MOZZARELLA_CHEESE_MESSAGE, pizza.mozzarellaCheese());
        //Assertions.assertEquals(PizzaConstructorMessage.DOMINOS_TOMATO_SAUCE_MESSAGE, pizza.dominosTomatoSauce());
        //Assertions.assertEquals(PizzaConstructorMessage.CHICKEN_MESSAGE, pizza.chicken());
        //Assertions.assertEquals(PizzaConstructorMessage.SWEET_PEPPER_MESSAGE, pizza.sweetPepper());
        //Assertions.assertEquals(PizzaConstructorMessage.FRIED_ONIONS_MESSAGE, pizza.friedOnions());
    }

    @Test
    @DisplayName("тест: сбор пиццы: креветки, ананас")
    public void testPizzaShrimps() {
        new PizzaConstructorPage()
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
        Assertions.assertEquals(PizzaConstructorMessage.SHRIMPS_MESSAGE, pizza.shrimps());
        Assertions.assertEquals(PizzaConstructorMessage.PINEAPPLE_MESSAGE, pizza.pineapple());
    }

    @AfterEach
    public void tearDown() {

        //Singleton.quit();
    }
}
