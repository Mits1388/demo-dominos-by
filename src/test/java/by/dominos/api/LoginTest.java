package by.dominos.api;

import io.restassured.response.ValidatableResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

public class LoginTest {
    private static final Logger logger = LogManager.getLogger();

    @Test
    @DisplayName("тест: вход без ввода номера телефона")
    public void noPhone() {
        logger.info("Начало теста: noPhone() - вход без ввода номера телефона");
        ValidatableResponse response = new DominosApi()
                .getResponse(Phone.EMPTY_PHONE.getLabel());
        logger.info("LoginMessage.LOGIN_EMPTY_NUMBER_PHONE = " + LoginMessage.LOGIN_EMPTY_NUMBER_PHONE);
        response
                .statusCode(400)
                .body("phone[0]", equalTo(LoginMessage.LOGIN_EMPTY_NUMBER_PHONE));
        logger.info("Конец теста: noPhone() - вход без ввода номера телефона");
    }

    @Test
    @DisplayName("тест: вход с некоректным номером телефона")
    public void incorrectPhone() {
        logger.info("Начало теста: incorrectPhone() - вход с некоректным номером телефона");
        ValidatableResponse response = new DominosApi()
                .getResponse(Phone.INCORRECT_PHONE.getLabel());
        logger.info("LoginMessage.LOGIN_INCORRECT_NUMBER_PHONE = " + LoginMessage.LOGIN_INCORRECT_NUMBER_PHONE);
        response
                .statusCode(400)
                .body("phone[0]", equalTo(LoginMessage.LOGIN_INCORRECT_NUMBER_PHONE));
        logger.info("Конец теста: incorrectPhone() - вход с некоректным номером телефона");
    }

    @Test
    @DisplayName("тест: вход с коректным номером телефона")
    public void correctPhone() {
        logger.info("Начало теста: correctPhone() - вход с коректным номером телефона");
        ValidatableResponse response = new DominosApi()
                .getResponse(Phone.CORRECT_PHONE.getLabel());
        logger.info("LoginMessage.LOGIN_CORRECT_NUMBER_PHONE = " + LoginMessage.LOGIN_CORRECT_NUMBER_PHONE);
        response
                .statusCode(200)
                .body("text", equalTo(LoginMessage.LOGIN_CORRECT_NUMBER_PHONE));
        logger.info("Конец теста: correctPhone() - вход с коректным номером телефона");
    }
}
