package by.dominos.ui;

import by.dominos.ui.page.HomePage;
import by.dominos.ui.page.OrderPage;
import by.dominos.ui.webdriver.Singleton;
import org.junit.jupiter.api.*;


public class OrderTest {
    private OrderPage page;

    @BeforeEach
    public void setUp() {
        HomePage homePage = new HomePage();
        homePage.open();
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


  /*  public static void switchToWindow(WebDriver driver){
        String originalWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }*/