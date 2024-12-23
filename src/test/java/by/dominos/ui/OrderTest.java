package by.dominos.ui;

import by.dominos.ui.messages.OrderMessage;
import by.dominos.ui.pages.HomePage;
import by.dominos.ui.pages.OrderPage;
import by.dominos.ui.webdriver.Singleton;
import org.junit.jupiter.api.*;


public class OrderTest {
    private OrderPage page;

    @BeforeEach
    public void setUp() {
        new HomePage().open();
        page = new OrderPage();
    }

    @Test
    @DisplayName("тест: заказ пиццы цыпленок с шампиньонами")
    public void OrderPizza() {
        page
                .clickSizeL()
                .clickClassicPizza()
                .clickInBasket()
                .clickBasket()
                .clickClose();
        Assertions.assertEquals(OrderMessage.ORDER_CHICKEN_WITH_CHAMPIGNONS, page.orderNamePizza());
        Assertions.assertEquals(OrderMessage.ORDER_SIZE_AND_BASE_PIZZA, page.orderSizeAndBasePizza());
    }

    @AfterEach
    public void tearDown() {
        Singleton.quit();
    }
}
