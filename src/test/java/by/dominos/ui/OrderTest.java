package by.dominos.ui;

import by.dominos.ui.messages.OrderMessage;
import by.dominos.ui.pages.OrderPage;
import org.junit.jupiter.api.*;


public class OrderTest extends BaseTest{
    private OrderPage page;

    @BeforeEach
    public void setUpOrder() {
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

        Assertions.assertAll(
                () -> Assertions.assertEquals(OrderMessage.ORDER_CHICKEN_WITH_CHAMPIGNONS, page.orderNamePizza()),
                () -> Assertions.assertEquals(OrderMessage.ORDER_SIZE_AND_BASE_PIZZA, page.orderSizeAndBasePizza())
        );
    }
}
